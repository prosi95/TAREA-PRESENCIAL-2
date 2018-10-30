package ers.pre02;
import java.util.Scanner;

public class ejercicio05
{
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);  
        System.out.println("Introduzca el primer numero");
        int numero1 = keyboard.nextInt();
        System.out.println("Introduzca el segundo numero");
        int numero2 = keyboard.nextInt();
        System.out.println("Introduzca el tercer numero");
        int numero3 = keyboard.nextInt();
        System.out.println("Introduzca el cuarto numero");
        int numero4 = keyboard.nextInt();
        System.out.println("Introduzca el quinto numero");
        int numero5 = keyboard.nextInt();
        double media = (numero1+numero2+numero3+numero4+numero5)/5;
        System.out.println(media);
    }
}