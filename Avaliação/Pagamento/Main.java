public class Main{


    public static void main (String [] args){
        Empregado horista  = new Horista("Luana", "123456-66", 1.500, 20, 160);
        System.out.println("O salário do funcionário horista será: " + horista.calcularSalario());

        Mensalista mensalista  = new Mensalista("Matheus", "229255-32", 12000, 12000);
        System.out.println("O salário do funcionário mensalista será:: " + mensalista.calcularSalario());
        
        Comissionado comissionado = new Comissionado("Jose Barros", "387298-55", 1200, 50, 20);
        System.out.println("O salário do funcionário comissionado será:: " + comissionado.calcularSalario());

}
}