package ers.pre02;
import java.util.Scanner;

public class ejercicio03
{
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);   
        System.out.println("Introduzca el numero del mes");
        int numero = keyboard.nextInt();
        switch(numero)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
            System.out.print("Este mes tiene 31 dias");
            break;
            
            case 2:
            System.out.print("Este mes tiene 28 o 29 dias");
            break;
            
            case 4:
            case 6:
            case 8:
            case 10:
            case 12:
            System.out.print("Este mes tiene 30 dias");
        }
        
    }
}