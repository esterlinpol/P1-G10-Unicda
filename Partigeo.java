/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rdelacruz
 * @author Esterlin Polanco
 */
import java.util.*;
public class Calculadoragrupo10v2 {
    
    public static Scanner entrada=new Scanner(System.in);
    public static void main(String args[]){
        
    programa();    
        
    }
    
    public static void programa(){
        
        
        System.out.println("Bienvenido a la calculadora, Seleccione una opcion:");
        System.out.println("1 - Calculo Aritmetica");
        System.out.println("2 - Calculo Geometra­a");
        System.out.println("0 - Salir");
        
        int operacion = entrada.nextInt();
        

        while(true){

        switch(operacion){
   
            case 1 : arit();
            
            break;

            case 2 : geom();

            break;
            
            case 0 : System.exit(0);
                   
    
            }
        }
    } 
    public static void arit(){

        System.out.println("Bienvenido a la calculadora de Aritmetica, Seleccione una opcion:"); 
    
        System.out.println("1-Sumar");
        System.out.println("2-Restar");
        System.out.println("3-multiplicar");
        System.out.println("4-Dividir");
        System.out.println("5-Potencia");
        System.out.println("0-Menu anterior");

        int operacionarit = entrada.nextInt();

        switch(operacionarit){

            case 1 : System.out.println("Sumar:");
          
                sumar();

                break;
            
            case 2 : System.out.println("Restar:");

                restar();

                break;

            case 3 : System.out.println("Multiplicar:");

                multiplicar();

                break;

            case 4 : System.out.println("Dividir:");

                dividir();

                break;

            case 5 : System.out.println("Potencia:");

                potencia();
                
                break;
            
            case 0 : programa();   


        }
    }
    
    public static void geom(){

        System.out.println("Bienvenido a la calculadora de Geometrica, Seleccione una opcion:"); 
    
        System.out.println("Calculo de areas:");
        System.out.println("1-Cuadrado");
        System.out.println("2-Rectangulo");
        System.out.println("3-Triangulo");
        System.out.println("4-Circulo");
        System.out.println("0-Menu anterior");


        int operaciongeom = entrada.nextInt();
        
        switch(operaciongeom){

            case 1 : 

                acuadrado();
                break;

            case 2 : 

                arectangulo();
                break;

            case 3 : 

                atriangulo();
                break;

            case 4 :

                acirculo();
                break;
                
            case 0 : programa();    

        }
    }
    
    public static void sumar(){
        
        System.out.println("Introduzca el primer numero:");
		int num1 = entrada.nextInt();
		System.out.println("Introduzca el segundo numero:");
        int num2 = entrada.nextInt();

        int result = num1+num2;
        System.out.println("Suma es igual a "+ result);
    }

    public static void restar(){
        
        System.out.println("Introduzca el primer numero:");
		int num1 = entrada.nextInt();
		System.out.println("Introduzca el segundo numero:");
        int num2 = entrada.nextInt();
        
        int result = num1-num2;
        System.out.println("Resta es igual a "+ result);
    }

    public static void multiplicar(){
        
        System.out.println("Introduzca el primer numero:");
		int num1 = entrada.nextInt();
		System.out.println("Introduzca el segundo numero:");
        int num2 = entrada.nextInt();
        
        int result = num1*num2;
        System.out.println("Multiplicacion es igual a "+ result);
    }

    public static void dividir(){
        
        System.out.println("Introduzca el primer numero:");
		int num1 = entrada.nextInt();
		System.out.println("Introduzca el segundo numero:");
        int num2 = entrada.nextInt();
        
        int result = num1/num2;
        System.out.println("Divicio es igual a "+ result);
    }

    public static void potencia(){

        int n, base;
        System.out.println("Ingrese la base: ");
        base = entrada.nextInt();
        System.out.println("Ingrese el exponente");
        n = entrada.nextInt();
        int resultado = (int) Math.pow(base, n);
        System.out.println(base + " elevado a la " + n + " es igual a " + resultado);

    }

    public static void acuadrado(){
        
        System.out.println("Introduzca la base o altura:");
        int base = entrada.nextInt();
        int result = base*base;

        System.out.println("Area del cuadradrado es igual a "+ result);

    }   
    
    public static void arectangulo(){
        
        System.out.println("Introduzca la base:");
        int base = entrada.nextInt();
        System.out.println("Introduzca la altura:");
        int altura = entrada.nextInt();
        int result = base*altura;

        System.out.println("Area del rectangulo es igual a "+ result);

    }   

    public static void atriangulo(){
        
        System.out.println("Introduzca la base:");
        int base = entrada.nextInt();
        System.out.println("Introduzca la altura:");
        int altura = entrada.nextInt();
        double result = 0.5*base*altura;

        System.out.println("Area del triangulo es igual a "+ result);

    }

    public static void acirculo(){
        
        System.out.println("Introduzca el radio:");
        int radio = entrada.nextInt();
        
        int result = (int) (Math.PI*(Math.pow(radio,2)));

        System.out.println("Area del circulo es igual a "+ result);
        

    }


}    

