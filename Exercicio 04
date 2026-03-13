
package exercicio.pkg04;
   import java.util.Scanner;


public class Triangulo {
    private int area;
    private int altura;
    private int base;
    private Scanner s;
    
   public Triangulo(){
       //inicializar atributos
       altura=0;
       base=0;
   }
    
    public void entrada(){
        s = new Scanner(System.in);
        System.out.println("\nInforme a altura do triangulo");
        //coleta de altura e base para o calculo
        altura = s.nextInt();
        System.out.println("\nInforme o valor da base do triangulo");
        base = s.nextInt();
    }
    
    public void calcularT(){
        //calculo de area do triangulo tendo como parametros base e altura
        area= base*altura / 2;
    }
    
    public void imprimir(){
        //impressao da area
        System.out.println("\nA area deste triangulo eh igual a: " + area);
    
    
    }
}

public class Exercicio04 {

    public static void main(String[] args) {
        Triangulo novoTriangulo = new Triangulo();
        novoTriangulo.entrada();
        novoTriangulo.calcularT();
        novoTriangulo.imprimir();
    }
    
}






