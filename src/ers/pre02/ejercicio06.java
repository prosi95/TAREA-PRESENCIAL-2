package ers.pre02;
import java.util.Scanner;

public class ejercicio06
{
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        int numeroBase = 0;
        int numeroIntroducido = 0;
        int contador = 0;
        String cadenaNumeros = "";
        while(numeroBase <= 77)
        {
            System.out.println("Introduzca un numero");
            numeroIntroducido = keyboard.nextInt();
            numeroBase += numeroIntroducido;
            System.out.println(numeroBase);
            contador ++;
            if (numeroBase >= 77)
            {
                cadenaNumeros += numeroIntroducido+" = ";
            }
            else
            {
                cadenaNumeros += numeroIntroducido+" + ";
            }
        }
        System.out.println("Numeros introducidos = "+contador+"\n"+cadenaNumeros+numeroBase);
    }           
}