public class Codeabbey002 {
    public static void main(String[] args) {
        //Arreglo a sumar
        int []numeros = {37, 1226, 284, 315, 1264, 293, 22, 143, 483, 1200, 794, 527, 106, 866, 550, 338, 113, 1202, 444, 298, 197, 231, 597, 527, 1159, 862, 780, 1043, 356, 1195, 538, 740, 643, 872, 769, 594, 360, 203};
        //Datos de la suma
        int suma = 0;
        for (int i = 0;i < numeros.length; i++){
            suma = suma + numeros [i];
           }
        System.out.println("La suma del arreglo es: "+ suma);
        }
    }

