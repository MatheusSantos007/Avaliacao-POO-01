import java.util.Scanner;
public class Retangulo {
    
    Scanner entrada = new Scanner(System.in);
    double comprimento,largura, area, perimetro;
    
    
    double calcularArea (){
        
        area = comprimento*largura;
        
        return area;
    }
     double calcularPerimetro (){
        
        perimetro = (2*comprimento)+(2*largura);
        
        return perimetro;
    }
     
    public void imprimir(){
        
        System.out.println("O retângulo com: "
                +largura+"\nPossui o Comprimento: "+comprimento+"\nPossui Área: "+calcularArea()
                +"\nPossui o Perimetro: "+calcularPerimetro());
    }
    
    public void construtor(){
        
        System.out.println("Insira o comprimento do retângulo");
        comprimento = entrada.nextDouble();
        System.out.println("Insira a largura do retângulo");
        largura = entrada.nextDouble();
    }
}