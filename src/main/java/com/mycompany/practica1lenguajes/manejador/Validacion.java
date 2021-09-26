package com.mycompany.practica1lenguajes.manejador;

import com.mycompany.practica1lenguajes.ejecutable.Main;
import static com.mycompany.practica1lenguajes.ejecutable.Main.metodos;
import static com.mycompany.practica1lenguajes.manejador.ValidacionTokens.tokensA;
import static com.mycompany.practica1lenguajes.manejador.ValidacionTokens.tokensE;
import com.mycompany.practica1lenguajes.vista.PaginaPrincipa;
import static com.mycompany.practica1lenguajes.vista.PaginaPrincipa.areatext;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

 
/**
 *
 * @author daniel
 */
public class Validacion extends JFrame {
public static PaginaPrincipa pagina;
public SobreescrituraMetodos metod;
public ValidacionTokens val;
    
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
    
    public void mostrarLineas(char[] linea){
       val= new ValidacionTokens(linea);
       val.getToken();
    }
    
    public static String descripcionMatriz(int a , int b){
        String matriz[][] = new String[8][6];
        matriz[0][0] = "Identificador";
        matriz[0][1] = "Entero";
        matriz[0][2] = "Operador";
        matriz[0][3] = "Signo Agrupacion";
        matriz[0][4] = "Signo Puntuacion";
        matriz[0][5] = "No se esperaba el punto";
        matriz[1][0] = "Identificador";
        matriz[1][1] = "Identificador";
        matriz[1][2] = "No se esperaba Operador";
        matriz[1][3] = "No se esperaba Signo de Agrupacion";
        matriz[1][4] = "No se esperaba Signo de Puntuacion";
        matriz[1][5] = "No se esperaba Signo de Puntuacion";
        matriz[2][0] = "No se esperaba Letra";
        matriz[2][1] = "Entero";
        matriz[2][2] = "No se esperaba Operador";
        matriz[2][3] = "No se esperaba Signo de Agrupacion";
        matriz[2][4] = "No se esperaba Signo de Puntuacion ";
        matriz[2][5] = "Se necesita un digito";
        matriz[3][0] = "No se esperaba una letra";
        matriz[3][1] = "Decimal";
        matriz[3][2] = "No se esperaba Operador";
        matriz[3][3] = "No se esperaba Signo de Agrupacion";
        matriz[3][4] = "No se esperaba Signo de Puntuacion ";
        matriz[3][5] = "No se esperaba Signo de Puntuacion ";
        matriz[4][0] = "No se esperaba Letra ";
        matriz[4][1] = "Decimal";
        matriz[4][2] = "No se esperaba Operador";
        matriz[4][3] = "No se esperaba Signo de Agrupacion";
        matriz[4][4] = "No se esperaba Signo de Puntuacion ";
        matriz[4][5] = "No se esperaba Signo de Puntuacion ";
        matriz[5][0] = "No se esperaba Letra ";
        matriz[5][1] = "No se esperaba Digito";
        matriz[5][2] = "No se esperaba Operador";
        matriz[5][3] = "No se esperaba Signo de Agrupacion";
        matriz[5][4] = "No se esperaba Signo de Puntuacion ";
        matriz[5][5] = "No se esperaba Signo de Puntuacion ";
        matriz[6][0] = "No se esperaba Letra ";
        matriz[6][1] = "No se esperaba Digito";
        matriz[6][2] = "No se esperaba Operador";
        matriz[6][3] = "No se esperaba Signo de Agrupacion";
        matriz[6][4] = "No se esperaba Signo de Puntuacion ";
        matriz[6][5] = "No se esperaba Signo de Puntuacion ";
        matriz[7][0] = "No se esperaba Letra ";
        matriz[7][1] = "No se esperaba Digito";
        matriz[7][2] = "No se esperaba Operador";
        matriz[7][3] =  "No se esperaba Signo de Agrupacion";
        matriz[7][4] = "No se esperaba Signo de Puntuacion ";
        matriz[7][5] = "No se esperaba Signo de Puntuacion ";
        
        String descripcion= matriz[a][b];
        return descripcion;
    }
    
    public static String Rep(){
        String datos="";
        for (String tokens : tokensA) {
            datos+=tokens+"\n";
        }
        return datos;
    }
    
    public static String Rep1(){
        String datos="";
        for (String tokens : tokensE) {
            datos+=tokens+"\n";
        }
        return datos;
    }
}
