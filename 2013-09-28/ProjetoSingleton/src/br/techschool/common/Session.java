/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.techschool.common;

/**
 *
 * @author Danilo
 */
public class Session {
    private static Parameters parameters;
    
    public static Parameters getInstance() {
        if (parameters == null) {
            parameters = new Parameters();
        }
        return parameters;
    }
}
