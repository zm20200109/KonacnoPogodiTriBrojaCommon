/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Korisnik
 */
public class SkriveniBroj implements Serializable{

    private int kolona;
    private int red;
    private int vrednost;

    public SkriveniBroj() {
    }

    public SkriveniBroj(int kolona, int red, int vrednost) {
        this.kolona = kolona;
        this.red = red;
        this.vrednost = vrednost;
    }

    public int getKolona() {
        return kolona;
    }

    public void setKolona(int kolona) {
        this.kolona = kolona;
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public int getVrednost() {
        return vrednost;
    }

    public void setVrednost(int vrednost) {
        this.vrednost = vrednost;
    }

   
    @Override
    public String toString() {
        return "SkriveniBroj{" + "kolona=" + kolona + ", red=" + red + ", vrednost=" + vrednost + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SkriveniBroj other = (SkriveniBroj) obj;
        return this.vrednost == other.vrednost;
    }
    
    
    
}
