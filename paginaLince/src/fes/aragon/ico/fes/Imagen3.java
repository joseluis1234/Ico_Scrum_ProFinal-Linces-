/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.ico.fes;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Imagen3 extends javax.swing.JPanel {
    int x, y;

    public Imagen3(JPanel jPanel3) {
        this.x = jPanel3.getWidth();
        this.y = jPanel3.getHeight();
        this.setSize(x, y);
    }

    @Override
    public void paint(Graphics g) {
        ImageIcon Img = new ImageIcon(getClass().getResource("ch.jpg"));
        g.drawImage(Img.getImage(), 0, 0, x, y, null);
    }    
    
}