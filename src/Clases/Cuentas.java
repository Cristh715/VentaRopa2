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
public class Cuentas {
    public static String u;
    public static String c;
    public Cuentas(){
        
    }
    public void setDatos(String correo, String contraseña){
        u = correo;
        c = contraseña;
        salvar();
    }

    public static void salvar(){
        try{
            File f = new File("Cuentas.txt");
            FileWriter fw;
            BufferedWriter bw;
            fw = new FileWriter(f, true);
            bw = new BufferedWriter(fw);
            bw.write(u + ";" + c + ";");
            bw.newLine();
            bw.close();
            fw.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
    
}
