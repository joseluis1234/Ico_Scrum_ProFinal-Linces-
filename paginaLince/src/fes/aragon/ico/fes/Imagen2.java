/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.ico.fes;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Imagen2 extends javax.swing.JPanel {
    int x, y;

    public Imagen2(JPanel jPanel2) {
        this.x = jPanel2.getWidth();
        this.y = jPanel2.getHeight();
        this.setSize(x, y);
    }

    @Override
    public void paint(Graphics g) {
        ImageIcon Img = new ImageIcon(getClass().getResource("jl.png"));
        g.drawImage(Img.getImage(), 0, 0, x, y, null);
    }    
    
}