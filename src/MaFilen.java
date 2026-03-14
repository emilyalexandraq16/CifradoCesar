import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        Scanner sc = new Scanner (System.in);
        int desplazamiento;
        do{
            System.out.print("Introduzca numero de desplazamiento(-25 a 25): ");
            desplazamiento = sc.nextInt();
            if (desplazamiento>25 || desplazamiento<-25) {
                System.out.println("Error, el desplazamiento debe ser entre 25 y -25.")
            }
        } while (desplazamiento>25|| desplazamiento<-25);
        File fEntrada;
        do{
            System.out.print("Introduzca el nombre del fichero de entrada");
            String nombre= sc.nextLine();
            fEntrada= new File("src/ficheros/" + nombre);
            if(fEntrada.exists()) {
                System.out.print("Error, no existe.")
            }
        } while(!fEntrada.exists());

        File fSalida;
        do{
            System.out.print("Introduce la ruta ABSOLUTA del fichero de salida");
            fSalida= new File(sc.nextLine());
            if(fSalida.exists()){
                System.out.println("Error, el fichero ya existe.")
            }
        }while(fSalida.exists());

        try{
            CifradoCesar.procesar
        } catch();
    }
}
