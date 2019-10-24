/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.pkg10118004.latihan61.bangunruang;

/**
 *
 * @author ASUS A411UF
 */
public class Keruncut {
     private double r;
    private double t;
    private double volume;

    
    public double hitungVolume() {
        volume = (1*Math.PI*Math.pow(r, 2)*t)/3;
        
        return volume;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getT() {
        return t;
    }

    public void setT(double t) {
        this.t = t;
    }
    
    
    
}



