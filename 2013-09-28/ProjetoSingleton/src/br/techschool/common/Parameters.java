/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.techschool.common;

import br.techschool.model.Pessoa;
import java.util.ArrayList;

/**
 *
 * @author Danilo
 */
public class Parameters {
    private ArrayList<Pessoa> listaPessoas;
    private String nomeUsuario = "Danilo";
    
    public Parameters() {
        this.listaPessoas = new ArrayList<Pessoa>();
    }

    /**
     * @return the listaPessoas
     */
    public ArrayList<Pessoa> getListaPessoas() {
        return listaPessoas;
    }

    /**
     * @param listaPessoas the listaPessoas to set
     */
    public void setListaPessoas(ArrayList<Pessoa> listaPessoas) {
        this.listaPessoas = listaPessoas;
    }

    /**
     * @return the nomeUsuario
     */
    public String getNomeUsuario() {
        return nomeUsuario;
    }

    /**
     * @param nomeUsuario the nomeUsuario to set
     */
    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }
}
