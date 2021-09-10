package com.mycompany.practica1lenguajes.clases;

import com.mycompany.practica1lenguajes.manejador.Validacion;

/**
 *
 * @author daniel
 */
public class ObjetoValidacion extends Validacion{

    private String opcion;

    public ObjetoValidacion(String opcion) {
        this.opcion = opcion;
    }

    public String getOpcion() {
        return opcion;
    }

    public void setOpcion(String opcion) {
        this.opcion = opcion;
    }
}
