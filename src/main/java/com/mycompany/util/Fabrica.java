/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.util;

import com.mycompany.cdp.*;

/**
 *
 * @author Ricardo
 */
public interface Fabrica {
    public Massa criarMassa();
    public Recheio criarRecheio();
    public Molho criarMolho();
    public Pizza criarPizza();
}
