package com.raven.component;

import com.raven.model.Model_Card;
import com.raven.swing.PanelShadow;

public class Card extends PanelShadow {

    public Card() {
        initComponents();
        init();
    }

    public void setData(Model_Card data) {
        lbIcon.setIcon(data.getIcon());
        lbName.setText(data.getTitle());
        lbValues.setText(data.getValues());
    }

    private void init() {
        setRadius(25);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelShadow1 = new com.raven.swing.PanelShadow();
        lbIcon = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();
        lbValues = new javax.swing.JLabel();

        panelShadow1.setShadowType(com.raven.shadow.ShadowBorder.ShadowType.IN_SHADOW);

        lbIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelShadow1Layout = new javax.swing.GroupLayout(panelShadow1);
        panelShadow1.setLayout(panelShadow1Layout);
        panelShadow1Layout.setHorizontalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
        );
        panelShadow1Layout.setVerticalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
        );

        lbName.setFont(new java.awt.Font("sansserif", 1, 15)); // NOI18N
        lbName.setForeground(new java.awt.Color(140, 110, 207));
        lbName.setText("Name");

        lbValues.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        lbValues.setForeground(new java.awt.Color(140, 110, 207));
        lbValues.setText("Values");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelShadow1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbName))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(lbValues)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelShadow1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lbName)
                .addGap(0, 0, 0)
                .addComponent(lbValues))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbIcon;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbValues;
    private com.raven.swing.PanelShadow panelShadow1;
    // End of variables declaration//GEN-END:variables
}
