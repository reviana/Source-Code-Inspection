package br.calebe.ticketmachine.core;

import java.util.Iterator;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class Troco {

    protected PapelMoeda[] papeisMoeda;
        private int valor;

    
            
   

    public Troco(int valor) {
        papeisMoeda = new PapelMoeda[7];
        this.valor = valor;
        contaNotas();
    }

    private void contaNotas() {
        while (valor > 0) {
            if (valor / 100 != 0) {
                papeisMoeda[6] = new PapelMoeda(100, valor / 100);
                valor = valor % 100;
            }
            if (valor / 50 != 0) {
                papeisMoeda[5] = new PapelMoeda(50, valor / 50);
                valor = valor % 50;
            }
            if (valor / 20 != 0) {
                papeisMoeda[4] = new PapelMoeda(20, valor / 20);
                valor = valor % 20;
            }
            if (valor / 10 != 0) {
                papeisMoeda[3] = new PapelMoeda(10, valor / 10);
                valor = valor % 10;
            }
            if (valor / 5 != 0) {
                papeisMoeda[2] = new PapelMoeda(10, valor / 5);
                valor = valor % 5;
            }
            if (valor / 2 != 0) {
                papeisMoeda[1] = new PapelMoeda(10, valor / 2);
                valor = valor % 2;
            }
            if (valor / 1 != 0) {
                papeisMoeda[0] = new PapelMoeda(10, valor / 1);
                valor = valor % 1;
            }
        }
    }

    public PapelMoeda[] getPapeisMoeda() {
        return papeisMoeda;
    }

    @Override
    public String toString() {
        return "Troco{" + "papeisMoeda=" + papeisMoeda + ", valor=" + valor + '}';
    }
    
    

}
