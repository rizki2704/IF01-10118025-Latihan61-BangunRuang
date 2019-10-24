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
public class Tabung extends BangunRuang{
    private int r;
    private int t;

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }

    @Override
    public double hitungVolume() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return Math.PI*r*r*t;
    }
    
    
}
