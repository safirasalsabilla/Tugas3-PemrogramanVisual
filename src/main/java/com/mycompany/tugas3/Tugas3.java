/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tugas3;

import java.util.Scanner;

/**
 *
 * @author safir
 */
public class Tugas3 {

    public static void main(String[] args) {
        int angka;
        
        Scanner i = new Scanner (System.in);
        System.out.print("Masukan Angka : ");
        
        if (i.hasNextInt()){
           angka = i.nextInt();
            if (angka < 6){
                System.out.println("Angka harus lebih dari 6");
            } else if (angka > 100){
                System.out.println("Angka harus kurang dari 100");
            } else if (angka % 2 == 0){
                System.out.println("Anda Menginput Bilangan Genap");
            } else {
                System.out.println("Anda Menginputkan Bilangan Ganjil");
            }
        }else{
              System.out.println("Anda harus menginputkan angka");  
            }
    }
}   

