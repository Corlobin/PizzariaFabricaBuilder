/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cdp;

/**
 *
 * @author Ricardo
 */
public class Pizza {
    private Massa massa;
    private Recheio recheio;
    private Molho molho;

    public Massa getMassa() {
        return massa;
    }

    public void setMassa(Massa massa) {
        this.massa = massa;
    }

    public Recheio getRecheio() {
        return recheio;
    }

    public void setRecheio(Recheio recheio) {
        this.recheio = recheio;
    }

    public Molho getMolho() {
        return molho;
    }

    public void setMolho(Molho molho) {
        this.molho = molho;
    }
    @Override
    public String toString() {
        return "(Massa: "+ this.massa + " Molho: " + this.molho + " Recheio: " + this.recheio + ")";
    }
}
