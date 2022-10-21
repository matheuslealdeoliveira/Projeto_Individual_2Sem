/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.jframekash;

import banco.TbUsuario;
import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.memoria.Memoria;
import java.util.Date;
import javax.swing.ImageIcon;

/**
 *
 * @author User
 */
public class TelaMemoria extends javax.swing.JFrame {
    Looca looca = new Looca();
    Memoria memoria = looca.getMemoria();
    ImageIcon img = new ImageIcon("src/main/resources/logoWhite.png");
    TbUsuario usuario = new TbUsuario();
    /**
     * Creates new form TelaMemoria
     */
    public TelaMemoria() {
        initComponents();
        
        Double usoByte = memoria.getEmUso().doubleValue();
        Double usoConvertido = usoByte / 1024 / 1024 / 1024;
        Double uso = Math.round(usoConvertido * 10.0) / 10.0;
        
        Double disponivelByte = memoria.getDisponivel().doubleValue();
        Double disponivelConvertido = disponivelByte / 1024 / 1024 /1024;
        Double disponivel = Math.round(disponivelConvertido * 10.0) / 10.0;
        
        Double totalByte = memoria.getTotal().doubleValue();
        Double totalConvertido = totalByte / 1024 / 1024 / 1024;
        Double total = Math.round(totalConvertido * 10.0) / 10.0;
        
        lblUso.setText(lblUso.getText() + uso.toString() + "GB");
        lblDisponivel.setText(lblDisponivel.getText() + disponivel + "GB");
        lblTotal.setText(lblTotal.getText() + total + "GB");
        
        img.setImage(img.getImage().getScaledInstance(lblLogo.getWidth(), lblLogo.getHeight(), 1));
        lblLogo.setIcon(img);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLogo = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        btnSO = new javax.swing.JButton();
        btnDisco = new javax.swing.JButton();
        btnCPU = new javax.swing.JButton();
        lblUso = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblDisponivel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoWhite.png"))); // NOI18N
        lblLogo.setAlignmentX(-18.0F);
        lblLogo.setAlignmentY(-200.0F);

        lblTitulo.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        lblTitulo.setText("Memória");

        btnSO.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        btnSO.setText("Sistema");
        btnSO.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnSO.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSO.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSOActionPerformed(evt);
            }
        });

        btnDisco.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        btnDisco.setText("Disco");
        btnDisco.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnCPU.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        btnCPU.setText("CPU");
        btnCPU.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnCPU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCPUActionPerformed(evt);
            }
        });

        lblUso.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblUso.setText("Em Uso: ");

        lblTotal.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblTotal.setText("Total: ");

        lblDisponivel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblDisponivel.setText("Disponível: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(btnDisco))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(btnCPU))
                            .addComponent(btnSO))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(lblTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(lblUso))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(lblDisponivel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(lblTotal)))
                .addContainerGap(280, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(lblTitulo)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(lblUso)
                        .addGap(44, 44, 44)
                        .addComponent(lblDisponivel)
                        .addGap(46, 46, 46)
                        .addComponent(lblTotal))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(btnCPU)
                        .addGap(39, 39, 39)
                        .addComponent(btnDisco)
                        .addGap(36, 36, 36)
                        .addComponent(btnSO)))
                .addContainerGap(121, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSOActionPerformed
        TelaSO in = new TelaSO();
        in.setLocationRelativeTo(null);
        in.setVisible(true);
        in.setResizable(false);
        this.dispose();
    }//GEN-LAST:event_btnSOActionPerformed

    private void btnCPUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCPUActionPerformed
        TelaCPU in = new TelaCPU();
        in.setLocationRelativeTo(null);
        in.setVisible(true);
        in.setResizable(false);
        this.dispose();
    }//GEN-LAST:event_btnCPUActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaMemoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMemoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMemoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMemoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMemoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCPU;
    private javax.swing.JButton btnDisco;
    private javax.swing.JButton btnSO;
    private javax.swing.JLabel lblDisponivel;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblUso;
    // End of variables declaration//GEN-END:variables
}
