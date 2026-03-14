import java.io.*;

public class CifradoCesar {
    public static void Procesar(String rutaEntrada, String rutaSalida, int desplazamiento) throws IOException{
        try(BufferedReader reader= new BufferedReader(new FileReader(rutaEntrada));
            BufferedWriter writer= new BufferedWriter (new FileWriter(rutaSalida))) {

             int codigo;
             while((codigo= reader.read())!=-1) {
                char caracterOriginal = (char) codigo;

                if(codigo >='!') {
                char caracterCifrado= (char) (caracterOriginal+desplazamiento);
                writer.write(codigo+desplazamiento);
                } else {
                    writer.write(codigo);
                }
            }
        }  
    }
}