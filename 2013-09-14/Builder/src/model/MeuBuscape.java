/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Danilo
 */
public class MeuBuscape {
    protected ArrayList<MeuProduto> listaProdutos;

    /**
     * @return the listaProdutos
     */
    public ArrayList getListaProdutos() {
        return listaProdutos;
    }

    /**
     * @param listaProdutos the listaProdutos to set
     */
    public void setListaProdutos(ArrayList listaProdutos) {
        this.listaProdutos = listaProdutos;
    }
}
