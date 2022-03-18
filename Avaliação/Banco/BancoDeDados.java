import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class BancoDeDados {
    

    public static String status = "Não conectou...";

    public BancoDeDados() {
    }
    public static java.sql.Connection getConexaoPostgres() {

        Connection connection = null;
        try {
            System.out.println("Iniciando conexão!");
            String driverName = "org.postgresql.Driver";
            Class.forName(driverName);
            String serverName = "localhost:5432";    
            String mydatabase ="postgres";        
            String url = "jdbc:postgresql://" + serverName + "/" + mydatabase;
            String username = "postgres";        
            String password = "Dev@xxt007";      
            connection = DriverManager.getConnection(url, username, password);

            
            if (connection != null) {
                status = ("STATUS--->Conectado com sucesso!");
            } else {
                status = ("STATUS--->Não foi possivel realizar conexão");
            }
            return connection;
        } catch (ClassNotFoundException e) {  
            System.out.println("O driver expecificado nao foi encontrado." + e);
            return null;
        } catch (SQLException e) {
            
            System.out.println("Nao foi possivel conectar ao Banco de Dados." + e);
            e.printStackTrace();
            return null;
        }
    }

    
    public static String statusConection() {
        return status;
    }
    
    public static boolean FecharConexao() {
        try {
            BancoDeDados.getConexaoPostgres().close();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    
    public static java.sql.Connection ReiniciarConexao() {
        FecharConexao();
        return BancoDeDados.getConexaoPostgres();
    }

    public static boolean salvaBanco(Banco banco) {
        try {
            Statement stmt = BancoDeDados.getConexaoPostgres().createStatement();

            
            String sql = "INSERT INTO banco (nome) VALUES(\'"+ banco.getNome() +"\')";
            
            stmt.executeUpdate(sql);
            return true;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }

    public static  List<Banco> getBancos(){
        try {
            Statement stmt = BancoDeDados.getConexaoPostgres().createStatement();

            
            String sql = "SELECT * FROM Banco";
            
            ResultSet rs = stmt.executeQuery(sql);
            List<Banco> bancos=new ArrayList<Banco>();
            while(rs.next()) {
                Banco banco = new Banco(Integer.parseInt(rs.getString("idBanco")), rs.getString("nome"));
                bancos.add(banco);
            }

            return bancos;
        } catch (SQLException e) {
            System.out.println(e);
            return new ArrayList<>();
        }
    }


    public static  List<Historico> getHistorico(Integer contaId){
        try {
            Statement stmt = BancoDeDados.getConexaoPostgres().createStatement();

            
            String sql = "SELECT * FROM Historico WHERE conta = " + contaId +"";
            
            ResultSet rs = stmt.executeQuery(sql);
            List<Historico> historicos = new ArrayList<Historico>();
            while(rs.next()) {
                Historico historico = new Historico(rs.getString("operacao"),
                                                    rs.getString("data"),
                                                    Double.parseDouble(rs.getString("valor")));
                historicos.add(historico);
            }

            return historicos;
        } catch (SQLException e) {
            System.out.println(e);
            return new ArrayList<>();
        }
    }


    public static boolean salvaConta(SistemaConta conta, Integer banco) {
        try {
            Statement stmt = BancoDeDados.getConexaoPostgres().createStatement();

            String sql = "INSERT INTO " +
                    "conta (numero, agencia,  cliente, tipo, ativa,  saldo, limite, banco) " +
                    "VALUES(\'"+
                    conta.getNumero()   + "\',\'" +
                    conta.getAgencia()  + "\',\'"+
                    conta.getCliente()  + "\',\'"+
                    conta.getTipo()     + "\',"+
                    conta.getAtiva()    + ","+
                    conta.getSaldo()    + ","+
                    conta.getLimit()    + ","+
                    banco + ")";
            
            stmt.executeUpdate(sql);
            return true;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }

    public static  List<SistemaConta> getContas(){
        try {
            Statement stmt = BancoDeDados.getConexaoPostgres().createStatement();

            
            String sql = "SELECT * FROM Conta";
            
            ResultSet rs = stmt.executeQuery(sql);
            List<SistemaConta> contas=new ArrayList<>();
            while(rs.next()) {
                SistemaConta conta = null;
                if(rs.getString(  "tipo").equals("CONTA CORRENTE")){
                    conta = new ContaCorrente();
                }else if(rs.getString(  "tipo").equals("CONTA ESPECIAL")){
                    conta = new ContaEspecial();
                }else{
                    conta = new ContaPoupanca();
                }
                conta.setId(Integer.parseInt(rs.getString( "id")));
                conta.setNumero(rs.getString(  "cliente"));
                conta.setAgencia(rs.getString( "agencia"));
                conta.setAtiva(Integer.parseInt(rs.getString( "ativa")));
                conta.setSaldo(Double.parseDouble(rs.getString( "saldo")));
                conta.setTipo(rs.getString(  "tipo"));
                conta.setLimit(Double.parseDouble(rs.getString(  "limite")));
                contas.add(conta);
            }

            return contas;
        } catch (SQLException e) {
            System.out.println(e);
            return new ArrayList<>();
        }
    }

    public static boolean atualizarSaldo(Integer idConta, Double saldo){

        try {
            Statement stmt = BancoDeDados.getConexaoPostgres().createStatement();

           
            String sql ="UPDATE conta SET saldo="+saldo+" WHERE idConta = "+ idConta +";";
            
            stmt.executeUpdate(sql);
            return true;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }

    }

    public static  SistemaConta getUmaConta(Integer codigoBanco, String numero, String agencia){
        try {
            Statement stmt = BancoDeDados.getConexaoPostgres().createStatement();

            
            String sql = "SELECT * FROM conta WHERE banco = " + codigoBanco + " && numero LIKE \'"+ numero +"\' && agencia LIKE \'"+ agencia +"\';";
            
            ResultSet rs = stmt.executeQuery(sql);
            rs.next();
            SistemaConta conta = null;
            if(rs.getString(  "tipo").equals("CONTA CORRENTE")){
                conta = new ContaCorrente();
            }else if(rs.getString(  "tipo").equals("CONTA ESPECIAL")){
                conta = new ContaEspecial();
            }else{
                conta = new ContaPoupanca();
            }
            conta.setId(Integer.parseInt(rs.getString( "idConta")));
            conta.setNumero(rs.getString(  "numero"));
            conta.setCliente(rs.getString(  "cliente"));
            conta.setAgencia(rs.getString( "agencia"));
            conta.setAtiva(Integer.parseInt(rs.getString( "ativa")));
            conta.setSaldo(Double.parseDouble(rs.getString( "saldo")));
            conta.setTipo(rs.getString(  "tipo"));
            conta.setLimit(Double.parseDouble(rs.getString(  "limite")));

            return conta;

        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }
    }

    public static boolean atualizarStatus(Integer idConta, Integer status){

        try {
            Statement stmt = BancoDeDados.getConexaoPostgres().createStatement();

            
            String sql ="UPDATE conta SET ativa="+ status +" WHERE idConta = "+ idConta +";";
            
            stmt.executeUpdate(sql);
            return true;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }

    }

    public static boolean salvaHistorico(Historico historico) {
        try {
            Statement stmt = BancoDeDados.getConexaoPostgres().createStatement();

            String sql = "INSERT INTO " +
                    "historico (operacao, data, valor,  conta) " +
                    "VALUES(\'"+
                    historico.getTipoMoveimento()   + "\',\'" +
                    historico.getData()  + "\',"+
                    historico.getValor() + ","+
                    historico.getConta() + ")";
            
            stmt.executeUpdate(sql);
            return true;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }


}