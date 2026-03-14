import java.io.*;

public class CifradoCesar {
    public static void cifrado(String entrada, String salida, int desplazamiento) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(entrada));
            BufferedWriter writer= new BufferedWriter(new FileWriter(salida))) {
        int c;
        while ((c= reader.read()) !=-1) {
            char caracter = (char) c;
            
            if(caracter >='!') {
                writer.write(caracter + desplazamiento);
            } else {
                writer.write(caracter);
            }
        }
      }
    }
}
