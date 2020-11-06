/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119069.latihan38.perhitunganlingkaran;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA     : TRI NOVAREL RAHMADHANI
 * KELAS    : PBOIF2
 * NIM      : 10119069
 */
public class Lingkaran {
    Scanner scanner = new Scanner(System.in);
    String filterAngka;
    double diameter;
    boolean kondisi = true;
    
    public double inputDiameter() {
        do {
            System.out.print("Masukkan nilai diameter lingkaran : ");
            filterAngka = scanner.nextLine();
            if(filterAngka.matches("[0-9]*")) {
                diameter = Integer.parseInt(filterAngka);
                kondisi = true;
            } else {
                System.out.println("Nilai Diameter Tidak Sesuai!");
                System.out.println("");
                kondisi = false;
            }
        } while (!kondisi);
        return diameter;
    }
        
        public double hitungJariJari() {
            return diameter/2;
        }
        
        public double hitungLuas() {
            return 3.14 * hitungJariJari() * hitungJariJari();
        }
        
        public double hitungKeliling() {
            return 2 * 3.14 * hitungJariJari();
        }
}
