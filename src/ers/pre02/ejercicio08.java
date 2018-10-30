package ers.pre02;
import java.util.Scanner;

public class ejercicio08
{
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        double megarandom = Math.random() * 10;
        int random = (int) megarandom;
        System.out.println("introduzca un numero");
        int numeroIntroducido = 0;
        while(numeroIntroducido != random)
        {
            numeroIntroducido = keyboard.nextInt();
            if(numeroIntroducido > random)
            {
                System.out.println("El numero introducido es mayor");
            }
            else if(numeroIntroducido < random )
            {
                System.out.println("El numero introducido es menor");
            }
        }
        System.out.println("El numero es "+random);
    }
}