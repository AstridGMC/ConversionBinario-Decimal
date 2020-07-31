package Backend;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author astridmc
 */
public class Simbolo {
    double valor;
    double multiplicador;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getMultiplicador() {
        return multiplicador;
    }

    public void setMultiplicador(double multiplicador) {
        this.multiplicador = multiplicador;
    }

    public Simbolo(double valor, double multiplicador) {
        this.valor = valor;
        this.multiplicador = multiplicador;
    }
    
     
}
