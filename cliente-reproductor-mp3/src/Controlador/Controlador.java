/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ArbolGrafico.DibujoArbol;
import arboles.Arbol;

/**
 *
 * @author dcace
 */
public class Controlador {
    private DibujoArbol objDibujo;
    private Arbol objArbol;
    
    public Controlador(DibujoArbol objDibujo, Arbol objArbol){
        this.objDibujo = objDibujo;
        this.objArbol = objArbol;
    }
    
    public void iniciar(){
        objDibujo.setObjArbol(objArbol);
    }
}
