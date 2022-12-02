/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author PABLO
 */
public class Carrito1 {
    private static ArrayList<double[]> totalPago = new ArrayList<>();
    private double totalZapatillas; // 0
    private double totalPantalones; // 1
    private double totalCamisas;    // 2
    private double totalAbrigos;    // 3
    private double[] arrayTotales = {totalZapatillas, totalPantalones, totalCamisas, totalAbrigos};

    public Carrito1() {
    }

    public void setSubTotal(double subTotal, int opcion) {
        arrayTotales[opcion] = subTotal;
        totalPago.add(arrayTotales);
    }

    public double getTotal(int opcion) {
        double total = 0;
        for(int i = 0; i < totalPago.size(); i++) {
            total = total + totalPago.get(i)[opcion];
        }

        return total;
    }
    
    public double totalPago() {
        double total = 0;

        for(int i = 0; i < totalPago.size(); i++) {
            for (int j = 0; j < totalPago.get(0).length; j++) {
                total = total + totalPago.get(i)[j];
            }
        }
        
        return total;
    }

    public static void salvar(){
        try{
            File f = new File("Data.txt");
            FileWriter fw;
            BufferedWriter bw;
            fw = new FileWriter(f);
            bw = new BufferedWriter(fw);
            int i=0;
            while(i< totalPago.size()){
                bw.write((int) totalPago.get(i)[0] + ";" + totalPago.get(i)[1] + ";" + totalPago.get(i)[2] + ";" + totalPago.get(i)[3] + ";");
                bw.newLine();
                i++;
            }
            bw.close();
            fw.close();

        }catch(IOException e){
            System.out.println(e);
        }
    
    }

    public static void recuperar(){
        ArrayList<double[]> valor = new ArrayList<>();
        try{
            File f = new File("Data.txt");
            if(f.exists()){
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String linea;
                while((linea = br.readLine()) != null){
                    String[]  rec =  linea.split(";");

                    double valor1 = Double.parseDouble(rec[0]);
                    double valor2 = Double.parseDouble(rec[1]);
                    double valor3 = Double.parseDouble(rec[2]);
                    double valor4 = Double.parseDouble(rec[3]);
                    double[] pagosTotales = {valor1, valor2, valor3, valor4};

                    valor.add(pagosTotales);
                }
                fr.close();
            }
 
            totalPago =  valor;

        }catch(IOException | NumberFormatException e){
            System.out.println(e);
        }
    }
    public static void borrar(){
        File f = new File("Data.txt");
        f.delete();
    }
    
}
