/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.util;

import com.mycompany.cdp.Pizza;

/**
 *
 * @author Ricardo
 */
public abstract class BuilderAbstrato implements Builder {

    Pizza pizza;
    protected Fabrica fabrica;
    
    @Override
    public void prepararMassa() {
        pizza.setMassa(fabrica.criarMassa());
    }

    @Override
    public void prepararRecheio() {
        pizza.setRecheio(fabrica.criarRecheio());
    }

    @Override
    public void prepararMolho() {
        pizza.setMolho(fabrica.criarMolho());
    
    }

    @Override
    public Pizza colocarForno() {
        return pizza;
    }
    
}
