/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author CRISTHIAN
 */
public class Compras {
    public static double precio;
    public static int cantidad;
    public static String producto;
    public static int i;
    public Compras(){
        
    }
    public void setDatos(double p, int c, String s){
        precio = p;
        cantidad = c;
        producto = s;
        salvar();
    }

    public static void salvar(){
        try{
            File f = new File("Compras.txt");
            FileWriter fw;
            BufferedWriter bw;
            fw = new FileWriter(f, true);
            bw = new BufferedWriter(fw);
            bw.write(producto + ";" + cantidad + ";" + precio + ";");
            bw.newLine();
            bw.close();
            fw.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
