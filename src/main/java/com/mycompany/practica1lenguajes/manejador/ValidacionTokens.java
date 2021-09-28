package com.mycompany.practica1lenguajes.manejador;

import static com.mycompany.practica1lenguajes.vista.PaginaPrincipa.areatext;
import static com.mycompany.practica1lenguajes.vista.PaginaPrincipa.ls;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author daniel
 */
public class ValidacionTokens {
    String error; 
    String g;
    boolean seguirLeyendo = true;
    boolean err=false;
    int posicion = 0;
    int columna=1;
    int fila=1;
    char[] cadena;
    int matriz[][] = new int[8][7];
    int estadosFinalizacion[] = new int[6];
    String descripcionFinalizacion[] = new String[6];
   public static ArrayList<String> tokensA= new ArrayList();
   public static ArrayList<String> tokensE= new ArrayList();
   public static ArrayList<String> transicion= new ArrayList();
   public static ArrayList<String> nB= new ArrayList();
    public ValidacionTokens(char[] cadena){
        this.cadena=cadena;
        
       //numero entero
        estadosFinalizacion[0]=2;
        descripcionFinalizacion[0]="Entero";
        //identificador
        estadosFinalizacion[1]=1;
        descripcionFinalizacion[1]="Identificador";
        //decimal
        estadosFinalizacion[2]=4;
        descripcionFinalizacion[2]="Decimal";
        //SA
        estadosFinalizacion[3]=6;
        descripcionFinalizacion[3]="Signo Agrupacion";
        //SP
        estadosFinalizacion[4]=5;
        descripcionFinalizacion[4]="Signo Puntuacion";
        //OP
        estadosFinalizacion[5]=7;
        descripcionFinalizacion[5]="Operador";
        
        int estadosFinalizacion[] = new int[6];
        matriz[0][0] = 1; matriz[0][1] = 2; matriz[0][2] = 7; matriz[0][3] = 6; matriz[0][4] = 5; matriz[0][5] = 5; matriz[0][6] = -1; 
        matriz[1][0] = 1; matriz[1][1] = 1; matriz[1][2] = -1; matriz[1][3] = -1; matriz[1][4] = -1; matriz[1][5] = -1;matriz[0][6] = -1; 
        matriz[2][0] = -1; matriz[2][1] = 2; matriz[2][2] = -1; matriz[2][3] = -1; matriz[2][4] = -1; matriz[2][5] =3 ;matriz[0][6] = -1; 
        matriz[3][0] = -1; matriz[3][1] = 4; matriz[3][2] = -1;  matriz[3][3] = -1;  matriz[3][4] = -1;  matriz[3][5] = -1;matriz[0][6] = -1; 
        matriz[4][0] = -1; matriz[4][1] = 4;   matriz[4][2] = -1;    matriz[4][3] = -1;  matriz[4][4] = -1; matriz[4][5] = -1;matriz[0][6] = -1; 
        matriz[5][0] = -1; matriz[5][1] = -1;  matriz[5][2] = -1;  matriz[5][3] = -1;   matriz[5][4] = -1;   matriz[5][5] = -1;matriz[0][6] = -1; 
        matriz[6][0] = -1;  matriz[6][1] = -1;  matriz[6][2] = -1;  matriz[6][3] = -1; matriz[6][4] = -1; matriz[6][5] = -1;matriz[0][6] = -1; 
        matriz[7][0] = -1; matriz[7][1] = -1;  matriz[7][2] = -1;  matriz[7][3] = -1; matriz[7][4] = -1; matriz[7][5] = -1;matriz[0][6] = -1; 
        

    }
    public int getSiguienteEstado(int estadoActual, int caracter) {
       int resultado=0;
        if (caracter >= 0 && caracter <= 6) {
            resultado = matriz[estadoActual][caracter];
            System.out.println(estadoActual+"--"+caracter);
            if (resultado == -1) {
                error = Validacion.descripcionMatriz(estadoActual, caracter);
                System.out.println(error);
                seguirLeyendo=false;
                err=true;

            }
        }else{
                error = Validacion.descripcionMatriz(estadoActual, caracter);
                System.out.println(error);
                seguirLeyendo=false;
                err=true;
        }
        return resultado;
    }
    public int getIntCaracter(char caracter) {
        int resultado = -1;
        SobreescrituraMetodos verificar = new SobreescrituraMetodos();
        if (verificar.signoPuntuacion(caracter).equalsIgnoreCase("Numero")) {
            resultado = 1;
            return resultado;
        } else {
            if (verificar.signoPuntuacion(caracter).equalsIgnoreCase("letraM")) {
                resultado = 0;
                return resultado;
            } else {
                if (verificar.signoPuntuacion(caracter).equalsIgnoreCase("letra")) {
                    resultado = 0;
                    return resultado;
                } else {
                    if (verificar.signoPuntuacion(caracter).equalsIgnoreCase("Operador")) {
                        resultado = 2;
                        return resultado;
                    } else {
                        if (verificar.signoPuntuacion(caracter).equalsIgnoreCase("Agrupacion")) {
                            resultado = 3;
                            return resultado;
                        } else {
                            if (caracter == '.') {
                                return 5;
                            } else {
                                if (verificar.signoPuntuacion(caracter).equalsIgnoreCase("Puntuacion")) {
                                    resultado = 4;
                                    return resultado;
                                } else {
                                    resultado = 6;
                                    return resultado;
                                }
                            }

                        }
                    }
                }

            }
        }

    }
    
    public String getEstadoAceptacion(int i){
        String res = "Error";
        int indice = 0;
        for (int estadoAceptacion : estadosFinalizacion) {
            if (estadoAceptacion == i){
                res = descripcionFinalizacion[indice];
                break;
            }
            indice++;
        }
        return res;
    }
    
    public void getToken() {
        int estadoActual = 0;
        tokensA.clear();
        tokensE.clear();
        char tmp;
        String token = "";

        while (posicion < cadena.length) {
            while (seguirLeyendo == true && posicion < cadena.length) {

                if (posicion == cadena.length || Character.isSpaceChar(tmp = cadena[posicion])) {
                    if(token==""){
                        
                    }else{
                      tokensA.add("'"+token+"'"+" Es un: "+getEstadoAceptacion(estadoActual) + " columna: " + (columna-1) + " fila: " + (fila));
                      seguirLeyendo = false; 
                      g="espacio";
                    }
                    
                } else if (cadena[posicion] == '\n' || posicion == cadena.length) {
                    if(token==""){
                        
                    }else{
                        tokensA.add("'" + token + "'" + " Es un: " + getEstadoAceptacion(estadoActual) + " columna: " + (columna - 1) + " fila: " + (fila));
                        fila++;
                        columna = 0;
                        seguirLeyendo = false; 
                        g="salto de linea";
                    }
                    
                } else {
                    // para mi automata
                    int estadoTemporal = getSiguienteEstado(estadoActual, getIntCaracter(tmp));
                    System.out.println("Estado actual " + estadoActual + " caracter " + tmp + " transicion a " + estadoTemporal);
                    transicion.add("Me movi del estado " + estadoActual + " al estado " + estadoTemporal+ " con una " + tmp);
                    token += tmp;
                    estadoActual = estadoTemporal;
                    System.out.println(tmp + " columna: " + columna + " fila: " + fila);
                    if(err==true){
                        tokensE.add(token + " columna: " + (columna-1) + " fila: " + (fila)+" ERROR: "+ error);
                        err=false;
                        error="";
                    }

                }
                posicion++;
                columna++;
            }
            if (seguirLeyendo == false) {
                System.out.println("*********Termino en el estado " + getEstadoAceptacion(estadoActual) + " token actual : " + token);
                seguirLeyendo = true;
                token = "";
                estadoActual = 0;
                transicion.add("Me movi al estado " + estadoActual + " por "+g);
            }

        }
        if(token!=""){
            tokensA.add("'"+token+"'"+" Es un: "+getEstadoAceptacion(estadoActual) + " columna: " + (columna-1) + " fila: " + (fila));
        }
        
        System.out.println("*********Termino en el estado " + getEstadoAceptacion(estadoActual) + " token actual : " + token);
    }
     
    
    public static void buscados(String textb) {
        nB.clear();
        int iterador = 0;
        int inicio = 0;
        boolean seguirLeyendo = false;
        if (textb.toCharArray().length == 0) {
            JOptionPane.showMessageDialog(null, "NO HAY TEXTO PARA INGRESAR");
        } else {
            char[] cadenaB = textb.toCharArray();
            char[] cadena = areatext.getText().toCharArray();

            for (int i = 0; i < cadenaB.length; i++) {
                if (!Character.isSpaceChar(cadenaB[i])) {
                    if (cadena[iterador] == cadenaB[i]) {
                        if (iterador == 0) {
                            inicio = i;
                            seguirLeyendo = true;
                        }
                        if (cadena.length - 1 == iterador && seguirLeyendo) {
                            nB.add(Remarcador(textb,inicio,i));
                        }
                        iterador++;
                    } else {
                        seguirLeyendo = false;
                        iterador = 0;
                    }
                }
            }

        }
        System.out.println("-------->"+nB);
    }
    
    public static String Remarcador(String p, int inicio, int fin){
        String nuevaCadena="";
        char[] caracteres= p.toCharArray();
        for(int i=0;i<caracteres.length;i++){
            if(i==inicio) {
                if(i==fin){
                    nuevaCadena+="<u><i><strong style=\"color:red;\">"+caracteres[i]+"</strong></i></u>";
                } else{
                     nuevaCadena+="<u><i><strong style=\"color:red;\">"+caracteres[i];
                }
            }else if(i==fin){
                nuevaCadena+= caracteres[i]+"</strong></i></u>";
            }else{
                nuevaCadena+=caracteres[i];
            }
        }
        
        return nuevaCadena;
        
        
    }
        
    
}
