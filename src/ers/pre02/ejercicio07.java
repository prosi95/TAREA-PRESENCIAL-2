package ers.pre02;
import java.util.Scanner;

public class ejercicio07
{
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introduzca un numero");
        int numero = keyboard.nextInt();
        int contador = 0;
        while(numero >= 3)
        {
            numero -= 3;
            contador ++;
        }
        System.out.println("Cociente = "+contador+", Resto = "+numero );
    }
}