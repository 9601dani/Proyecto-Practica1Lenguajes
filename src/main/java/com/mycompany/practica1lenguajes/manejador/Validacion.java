package com.mycompany.practica1lenguajes.manejador;

import com.mycompany.practica1lenguajes.vista.PaginaPrincipa;
import static com.mycompany.practica1lenguajes.vista.PaginaPrincipa.areatext;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JFrame;


/**
 *
 * @author daniel
 */
public class Validacion extends JFrame {
public static PaginaPrincipa pagina;
    
    public void SubirArchivo() {
        JFileChooser archivosubir = new JFileChooser();
        int seleccion = archivosubir.showOpenDialog(pagina);

        if (seleccion == JFileChooser.APPROVE_OPTION) {

            File fichero = archivosubir.getSelectedFile();
            String path=fichero.getAbsolutePath();
            try ( FileReader fr = new FileReader(fichero)) {
                String cadena = "";
                int valor = fr.read();
                while (valor != -1) {
                    cadena = cadena + (char)valor;
                    valor = fr.read();
                }
                areatext.setText(cadena);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }
    
}
