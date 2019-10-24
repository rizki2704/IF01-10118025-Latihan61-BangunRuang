/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118025.latihan61.bangunruang;

/**
 * Nama     : Rizki Restu Illahi
 * Kelas    : IF01
 * NIM      : 10118025
 */
public class IF0110118025Latihan61BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("===Hitung Volume===");
        
        Bola b = new Bola();
        b.setR(7);
        System.out.println("BOLA");
        System.out.println("Jari jari Bola\t : " + b.getR());
        System.out.printf("Volume Bola\t : %.1f%n%n", b.hitungVolume());
        
        Tabung t = new Tabung();
        t.setR(10);
        t.setT(21);
        System.out.println("TABUNG");
        System.out.println("Jari-jari tabung: " + t.getR());
        System.out.println("Tinggi tabung\t: " + t.getT());
        System.out.printf("Volume tabung\t: %.2f%n%n", t.hitungVolume());

        Kerucut k = new Kerucut();
        k.setR(14);
        k.setT(9);
        System.out.println("KERUCUT");
        System.out.println("Jari-jari kerucut\t: " + k.getR());
        System.out.println("Tinggi kerucut\t\t: " + k.getT());
        System.out.printf("Volume kerucut\t\t: %.2f%n", k.hitungVolume());
    }
    
}
