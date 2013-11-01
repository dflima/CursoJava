
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TechSchool
 */
public class Observador {
    ArrayList<Phantom> lista;
    
    public Observador() {
        lista = new ArrayList<>();
    }
    
    public void adicionar(Phantom p) {
        lista.add(p);
    }
    
    public void notifica() {
        for(Phantom p : lista) {
            p.mudaEstado();
        }
    }
}
