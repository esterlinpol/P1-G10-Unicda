import java.util.Scanner;
public class paritgeo {
    
    public static Scanner entrada=new Scanner(System.in);
    public static void main(String args[]){
        
                
        System.out.println("Bienvenido a la calculadora, Seleccione una opción:");
        System.out.println("1 - Cálculo Aritmetica");
        System.out.println("2 - Cálculo Geometría");
        System.out.println("0 - Salir");
                
        int operacion = entrada.nextInt();
                 

        switch(operacion){
   
            case 1 : arit();

            break;

            case 2 : geom();

            break;     
    
            }
    } 
    public static void arit(){

        System.out.println("Bienvenido a la calculadora de Aritmetica, Seleccione una opción:"); 
    
        System.out.println("1-Sumar");
        System.out.println("2-Restar");
        System.out.println("3-multiplicar");
        System.out.println("4-Dividir");
        System.out.println("5-Potencia");
        System.out.println("0-Menú anterior");

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


        }
    }
    
    public static void geom(){

        System.out.println("Bienvenido a la calculadora de Geometría, Seleccione una opción:"); 
    
        System.out.println("Calculo de areas:");
        System.out.println("1-Cuadrado");
        System.out.println("2-Rectángulo");
        System.out.println("3-Triángulo");
        System.out.println("4-Círculo");
        System.out.println("0-Menú anterior");


        int operaciongeom = entrada.nextInt();
        
        switch(operaciongeom){

            case 1 : 

            acuadrado();

            case 2 : 

            arectangulo();

            case 3 : 

            atriangulo();

            case 4 :

            acirculo();

        }



    }
    
    public static void sumar(){
        
        System.out.println("Introduzca el primer número:");
		int num1 = entrada.nextInt();
		System.out.println("Introduzca el segundo número:");
        int num2 = entrada.nextInt();

        int result = num1+num2;
        System.out.println("Suma es igual a "+ result);
    }

    public static void restar(){
        
        System.out.println("Introduzca el primer número:");
		int num1 = entrada.nextInt();
		System.out.println("Introduzca el segundo número:");
        int num2 = entrada.nextInt();
        
        int result = num1-num2;
        System.out.println("Resta es igual a "+ result);
    }

    public static void multiplicar(){
        
        System.out.println("Introduzca el primer número:");
		int num1 = entrada.nextInt();
		System.out.println("Introduzca el segundo número:");
        int num2 = entrada.nextInt();
        
        int result = num1*num2;
        System.out.println("Multiplicación es igual a "+ result);
    }

    public static void dividir(){
        
        System.out.println("Introduzca el primer número:");
		int num1 = entrada.nextInt();
		System.out.println("Introduzca el segundo número:");
        int num2 = entrada.nextInt();
        
        int result = num1/num2;
        System.out.println("Divición es igual a "+ result);
    }

    public static void potencia(){

        int n, base;
        System.out.println("Ingrese la base: ");
        base = tec.nextInt();
        System.out.println("Ingrese el exponente");
        n = tec.nextInt();
        int resultado = (int) Math.pow(base, n);
        System.out.println(base + " elevado a la " + n + " es igual a " + resultado);

    }

    public static void acuadrado(){
        
        System.out.println("Introduzca la base o altura:");
        int base = entrada.nextInt();
        int result = base*base;

        System.out.println("Área del cuadradrado es igual a "+ result);

    }   
    
    public static void arectangulo(){
        
        System.out.println("Introduzca la base:");
        int base = entrada.nextInt();
        System.out.println("Introduzca la altura:");
        int altura = entrada.nextInt();
        int result = base*altura;

        System.out.println("Área del rectangulo es igual a "+ result);

    }   

    public static void atriangulo(){
        
        System.out.println("Introduzca la base:");
        int base = entrada.nextInt();
        System.out.println("Introduzca la altura:");
        int altura = entrada.nextInt();
        int result = base*altura;

        System.out.println("Área del triangulo es igual a "+ result);

    }

    public static void acirculo(){
        
        System.out.println("Introduzca el radio:");
        int radio = entrada.nextInt();
        
        int result = Math.PI*(Math.pow(radio,2));

        System.out.println("Área del circulo es igual a "+ result);

    }


}    