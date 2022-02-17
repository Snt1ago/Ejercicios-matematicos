package paquete;

import java.util.Scanner;
public class Main 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner entrada = new Scanner (System.in);
        
      
        System.out.println("Ejercico a)");
        float base;  
        float altura;
        float area;
        //area de un triangulo
        System.out.println("Ingrese base del triangulo.");
        base = entrada.nextFloat ();
        System.out.println("Ingrese altura del triangulo.");
        altura = entrada.nextFloat ();
        area = (base * altura)/2;
        System.out.println("El area del triangulo es: " + area);
       
        System.out.println("");
        
        System.out.println("Ejercico b)");
        //area y perimetro de un rectangulo
        System.out.println("Area de un rectangulo:");
        base = 10;
        altura = 8;
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        area = (base * altura);
        System.out.println("El area es: " + area);
        
        System.out.println("");
        float perimetro;
        
        System.out.println("Perimetro de un rectangulo:");
        base = 5;
        altura = 4;
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        perimetro = (base + altura)*2;
        System.out.println("El perimetro es: " + perimetro);
        
        System.out.println("");
        
        System.out.println("Ejercicio c)");
        
        double nota1, nota2, nota3, promedio;
        System.out.println("Ingrese primer nota.");
        nota1 = entrada.nextDouble ();
        System.out.println("Ingrese segunda nota.");
        nota2 = entrada.nextDouble ();
        System.out.println("Ingrese tercer nota.");
        nota3 = entrada.nextDouble ();
        promedio = (nota1 + nota2 + nota3)/3;
        System.out.println("El promedio de las tres notas es: " + promedio);
        
        
        
         
          
	}

}
