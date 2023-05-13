/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientereproductormp3;

import ArbolGrafico.DibujoArbol;
import Controlador.Controlador;
import arboles.Arbol;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import javax.swing.JFrame;

/**
 *
 * @author dcace
 */
public class ClienteReproductorMP3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Arbol objArbol = new Arbol();
        DibujoArbol objDibujo = new DibujoArbol();
        Controlador objControlador = new Controlador(objDibujo, objArbol);

        objArbol.insertar(7);
        objArbol.insertar(2);
        objArbol.insertar(9);
        objArbol.insertar(5);
        objArbol.insertar(0);
        objArbol.insertar(10);
        objControlador.iniciar();

        JFrame ventana = new JFrame();
        ventana.getContentPane().add(objDibujo);
        ventana.setDefaultCloseOperation(3);
        ventana.setSize(600, 600);
        ventana.setVisible(true);
    }

    /*public void getUsers(){
        try {
            URL url = new URL("");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            int resCode = connection.getResponseCode();
            if(resCode != 200){
                throw RuntimeException("Error: " + resCode);
            }else{
                StringBuilder data = new StringBuilder();
                Scanner scanner = new Scanner(url.openStream());
                while(scanner.hasNext()){
                    data.append(scanner.nextLine());
                }
                scanner.close();
                System.out.println(data.toString());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    private Exception RuntimeException(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
}
