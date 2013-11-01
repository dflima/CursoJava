
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TechSchool
 */
public class Phantom {
    public static final int CIMA = 0;
    public static final int BAIXO = 1;
    public static final int ESQUERDA = 2;
    public static final int DIREITA = 3;
    
    private int estado;
    private int posX;
    private int posY;
    private int direcao;
    private ImageIcon imagens[];
    private JLabel elemento;
    
    public Phantom(int posX, int posY, int direcao) {
        this.posX = posX;
        this.posY = posY;
        this.direcao = direcao;
        this.imagens = new ImageIcon[4];
        
        this.imagens[0] = new ImageIcon("fantasma01.png");        
        this.imagens[1] = new ImageIcon("fantasma02.png");
        this.imagens[2] = new ImageIcon("fantasma01_inverso.png");        
        this.imagens[3] = new ImageIcon("fantasma02_inverso.png");
        this.estado = 0;
    }
    
    public void desenhar() {
        elemento.setIcon(imagens[estado]);
        elemento.setBounds(posX, posY, imagens[estado].getIconWidth(), imagens[estado].getIconHeight());
    }
    
    public void mudaEstado() {
        this.estado = (estado == 0) ? 1 : 0;
    }
    
    public void mover() {
        switch(direcao) {
            case DIREITA:
                posX += 5;
                if (posX >= 550) {
                    direcao = BAIXO;
                    estado=2;
                }
                break;
            case ESQUERDA:
                posX -= 5;
                if (posX <= 15) {
                    direcao = CIMA;
                    
                }
                break;
            case CIMA:
                posY -= 5;
                if (posY <= 15) {
                    direcao = DIREITA;
                    estado=0;
                }
                break;
            case BAIXO:
                posY += 5;
                if (posY >= 330) {
                    direcao = ESQUERDA;
                }
                break;
        }
    }

    /**
     * @return the elemento
     */
    public JLabel getElemento() {
        return elemento;
    }

    /**
     * @param elemento the elemento to set
     */
    public void setElemento(JLabel elemento) {
        this.elemento = elemento;
    }
}
