import java.util.Scanner;

public class guiaJava0 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        System.out.println("Ingrese un numero de ejercicio: ");
        opcion=teclado.nextInt();
        switch (opcion) {
            case 1:
                ejercicio1();
                break;
            case 2:
                ejercicio2();
                break;

        }
    }

//*1. Realizar un programa Java que realice lo siguiente: declarar una variable
//numN de tipo int, una variable numA de tipo double y una variable numC de
//tipo char y asigna a cada una un valor. A continuación muestra por pantalla:
//El valor de cada variable, la suma de numN + numA, la diferencia de numA -
//numN, el valor numérico correspondiente al carácter que contiene la
//variable numC.*//

    public static void ejercicio1() {
        int numN;
        double numA;
        char numC;
        Scanner teclado= new Scanner(System.in);

        System.out.println("Ingrese un valor para numN:");
        numN = teclado.nextInt();
        System.out.println("Ingrese un valor para numA:");
        numA=teclado.nextDouble();
        System.out.println("Ingrese un CARACTER para numC:");
        numC =teclado.next().charAt(0);

        System.out.println("numN=" +numN+ ", numA="+numA+ ", numC="+numC);
        double suma1= numN+numA;
        System.out.println("La suma de " +numN+ "+"+numA+ " es:"+suma1);
        double resta1= numA-numN;
        System.out.println("La diferencia entre " +numA+ " y "+numN+ " es:"+resta1);
        System.out.println("El valor numerico de numC:" +(int)numC); ///as CASTEO A INT LA VARIABLE numC, Y ASI MMUESTRA EL VALOR DE TABLA ASCII.
    }



    /// 2. Realizar un programa Java que realice lo siguiente: declarar dos variables
    /// numX y numY de tipo int, dos variables numN y numM de tipo double y
    /// asigna a cada una un valor. A continuación mostrar por pantalla una serie
    /// de operaciones entre ellas.

    public static void ejercicio2() {

        int numX, numY;
        double numN, numM;

        Scanner teclado= new Scanner(System.in);

        System.out.println("Ingrese un valor para numX:");
        numX = teclado.nextInt();
        System.out.println("Ingrese un valor para numY:");
        numY = teclado.nextInt();
        System.out.println("Ingrese un valor para numN:");
        numN=teclado.nextDouble();
        System.out.println("Ingrese un valor para numM:");
        numM=teclado.nextDouble();
        double producto= numN*numX;
        System.out.println("El producto de " +numN+ " y "+numX+ " es:"+producto);
        double division= numM/numY;
        System.out.println("El dividendo entre " +numM+ " y "+numY+ " es:"+division);

    }
    /// 3. Realizar un programa Java que declare una variable entera N y se le asigne
    /// un valor elegido por el usuario. A continuación escribe las instrucciones para
    /// que el programa realice lo siguiente: incrementar N en 77, reducir su valor a 3,
    /// duplicar su valor

    public static void ejercicio3 () {
        int N;
        Scanner teclado= new Scanner(System.in);

        System.out.println("Ingrese un valor para numX:");
        N = teclado.nextInt();

        /// n+77
        int N = N+77;

    }
}
