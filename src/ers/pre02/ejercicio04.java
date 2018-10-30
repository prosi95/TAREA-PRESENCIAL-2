package ers.pre02;
import java.util.Scanner;

public class ejercicio04
{
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);   
        int factorial = 1;
        System.out.println("Introduzca un numero");
        int numero = keyboard.nextInt();
        while(numero > 1)
        {
            factorial = factorial*numero;
            numero--;
        }
        System.out.println("El factorial del numero introducido es "+factorial);
    }
}