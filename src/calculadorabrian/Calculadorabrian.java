
package calculadorabrian;
 import java.util.*;
import java.util.Scanner;
/**
 *
 * @author Brian
 */
public class Calculadorabrian {

    /**
     *
     * @param args  
     * esta aplicacion es una calculadora basica de sumas, restas divisiones y multiplicaciones
     * 
     * basicamente pedimos al usuario 2 numeros  (num 1 y num 2 y luego le pedimos que elija que quiere hacer con ellos, 
     * el usuario hara su eleccion pulsando un numero del 1 al 4, en ordern suma, resta, multiplicar y dividir , 
     * si pone otro numero saldra el mensaje "illegal operation"
     */
    public static void main(String[] args)
    {
        System.out.println("Enter first and second number:");
        Scanner inp= new Scanner(System.in);
        int num1,num2;
        num1 = inp.nextInt();
        num2 = inp.nextInt();
        int ans;
        System.out.println("Enter your selection: 1 for Addition, 2 for substraction 3 for Multiplication and 4 for division:");
        int choose;
        choose = inp.nextInt();
        switch (choose){
        case 1:
            System.out.println(add( num1,num2));
            break;
        case 2:
            System.out.println(sub( num1,num2));
            break;     
        case 3:
            System.out.println(mult( num1,num2));
            break;
        case 4:
            System.out.println(div( num1,num2));
            break;
            default:
                System.out.println("Illigal Operation");


        }



    }

    /**
     * suma
     * @param x primer numero de la operacion
     * @param y  segundo numero de la operacion
     * @return  resultado de la operacion
     */
    public static int add(int x, int y)
    {
        int result = x + y;
        return result;
    }

    /**
     * resta
     * @param x primer numero de la operacion
     * @param y segundo numero de la operacion
     * @return  resultado de la operacion
     */
    public static int sub(int x, int y)
    {
        int result = x-y;
        return result;
    }

    /**
     *multiplicacion
     * @param x primer numero de la operacion
     * @param y segundo numero de la operacion
     * @return  resultado de la operacion
     */
    public static int mult(int x, int y)
    {
        int result = x*y;
        return result;
    }

    /**
     *division 
     * @param x primer numero de la operacion
     * @param y segundo numero de la operacion
     * @return  resultado de la operacion
     */
    public static int div(int x, int y)
    {
        int result = x/y;
        return result;
    }

}