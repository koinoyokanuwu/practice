import java.util.Scanner;

public class Codeabbey001 {
    public static void main(String[] args) {
        //Datos
        float dato1= 0;
        float dato2 = 0;
        float producto = 0;
        //Lectura
        Scanner usuario = new Scanner(System.in);
        //Recolección
        System.out.println("Digite el primer número:");
        dato1 = usuario.nextFloat();
        System.out.println("Digite el segundo número");
        dato2 = usuario.nextFloat();
        //Cálculo
        producto = dato1 + dato2;
        //Respuesta
        System.out.println("El valor de la suma es: "+ producto);




    }
}