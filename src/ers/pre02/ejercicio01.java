package ers.pre02;
import java.util.Scanner;

public class ejercicio01 
{
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introduzca su edad");
        int edad = keyboard.nextInt();
        if(edad >= 18)
            System.out.println("Eres mayor de edad");
        else System.out.println("Eres menor de edad");
    }
}
