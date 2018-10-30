package ers.pre02;
import java.util.Scanner;

public class ejercicio02 
{
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);   
        System.out.println("Introduzca un numero");
        int numero = keyboard.nextInt();
        if (numero % 2 == 0)
        System.out.println("El número es par");
        else
        System.out.println("El número es impar");
    }
}