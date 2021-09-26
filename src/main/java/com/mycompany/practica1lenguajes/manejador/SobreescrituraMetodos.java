package com.mycompany.practica1lenguajes.manejador;

/**
 *
 * @author daniel
 */
public class SobreescrituraMetodos {
    public static final char[] SPUNTUACION = {'.',',',';',':'};
    public static final char[] SAGRUPACION = {'(',')','{','}','[',']'};
    public static final char[] OPERADORES = {'+','-','*','/','%'};
    public static final char[] LETRAM = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    public static final char[] LETRA = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    public static final char[] NUMERO={'0','1','2','3','4','5','6','7','8','9'};
    char datonuevo;
    public SobreescrituraMetodos() {
    }
    
    public String signoPuntuacion(char dato){
        this.datonuevo=dato;
        for(int i=0;i<SPUNTUACION.length;i++){
             if(dato==SPUNTUACION[i]){
                return "Puntuacion";
            }
        }
        return signoAgrupacion();
        
    }
    
    public String signoAgrupacion(){
        for(int i=0;i<SAGRUPACION.length;i++){
             if(datonuevo==SAGRUPACION[i]){
                return "Agrupacion";
            }
        }
        return operador();
    }
    
    public String operador(){
        for(int i=0;i<OPERADORES.length;i++){
             if(datonuevo==OPERADORES[i]){
                return "Operador";
            }
        }
        return letra();
    }
    
    public String letra(){
        for(int i=0;i<LETRA.length;i++){
             if(datonuevo==LETRA[i]){
                return "Letra";
            }
        }
         for(int i=0;i<LETRAM.length;i++){
             if(datonuevo==LETRAM[i]){
                return "LetraM";
            }
        }
        return numero();
    }
    
    public String numero(){
        for(int i=0;i<NUMERO.length;i++){
             if(datonuevo==NUMERO[i]){
                return "Numero";
            }
        }
        return "No Identificado";
    }
    
    
}
