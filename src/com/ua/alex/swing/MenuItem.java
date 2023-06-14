
package com.ua.alex.swing;

import com.ua.alex.model.ModelMenu;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class MenuItem extends javax.swing.JPanel {
    
    private boolean selected;

    public MenuItem(ModelMenu data) {
        initComponents();
        setOpaque(false);
        if (null == data.getType()) {
            IbIcon.setText(" ");
        }else switch (data.getType()) {
            case MENU -> {
                IbIcon.setIcon(data.toIcon());
                IbName.setText(data.getName());
            }
            case TITLE -> {
                IbIcon.setText(data.getName());
                IbIcon.setFont(new Font("sansserif", 1, 12));
                IbName.setVisible(false);
            }
            case EMPTY -> {
                IbIcon.setText(data.getName());
                IbName.setVisible(false);
            }
            default -> IbIcon.setText(" ");
        }
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
        repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        IbIcon = new javax.swing.JLabel();
        IbName = new javax.swing.JLabel();

        IbIcon.setForeground(new java.awt.Color(255, 255, 255));

        IbName.setForeground(new java.awt.Color(255, 255, 255));
        IbName.setText("Menu Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(IbIcon)
                .addGap(18, 18, 18)
                .addComponent(IbName)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(IbIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(IbName, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics g) {
        if (selected) {
            Graphics2D d2 = (Graphics2D) g;
            d2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            d2.setColor(new Color(255, 255, 255, 80));
            d2.fillRoundRect(0, 0, getWidth(), getHeight(), 5, 5);
        }
        super.paintComponent(g);
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IbIcon;
    private javax.swing.JLabel IbName;
    // End of variables declaration//GEN-END:variables
}
