/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.latihanukl1no2;

/**
 *
 * @author LOQ
 */
import java.util.Scanner;

public class Latihanukl1no2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Bagian 2: Menentukan Ganjil atau Genap
        System.out.println("=== CEK BILANGAN GANJIL / GENAP ===");
        System.out.print("Masukkan bilangan: ");
        int bilangan = input.nextInt();

        if (bilangan % 2 == 0) {
            System.out.println(bilangan + " adalah bilangan GENAP");
        } else {
            System.out.println(bilangan + " adalah bilangan GANJIL");
        }

        input.close();
    }
}
