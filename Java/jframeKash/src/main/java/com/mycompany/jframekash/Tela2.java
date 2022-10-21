/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.jframekash;

import banco.TbUsuario;
import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.sistema.Sistema;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;


public class Tela2 extends javax.swing.JFrame {
    Looca looca = new Looca();
    Sistema sistema = looca.getSistema();
    ImageIcon img = new ImageIcon("src/main/resources/logoWhite.png");
    TbUsuario usuario = new TbUsuario();
    
//    Timer timer = new Timer();
//    TimerTask task = new TimerTask() {
//        @Override
//        public void run() {
//            rodaSo();
//        }
//    }
    public Tela2() {
        initComponents();
        
//        String permissao;        
//        if (sistema.getPermissao() == false) {
//            permissao = "Executando como usuário padrão";
//        }else {
//            permissao = "Executando como administrador";
//        }
//        
//        lblSistema.setText(lblSistema.getText() + sistema.getSistemaOperacional());
//        lblFabricante.setText(lblFabricante.getText() + sistema.getFabricante());
//        lblArquitetura.setText(lblArquitetura.getText() + sistema.getArquitetura().toString() + "bits");
//        lblInicializado.setText(lblInicializado + sistema.getInicializado().toString());
//        lblPermissao.setText(lblPermissao + permissao);
//        
//        Double tempoHoras = Double.valueOf(sistema.getTempoDeAtividade().toString()).doubleValue()/ 60/60;
//        
//        lblTempo.setText(lblTempo + tempoHoras.toString() + "horas");
        
        lblNomeUX.setText("cu "+usuario.getNome());
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblLogo = new javax.swing.JLabel();
        lblNomeUX = new javax.swing.JLabel();
        btnCPU = new javax.swing.JButton();
        btnDisco = new javax.swing.JButton();
        btnMemo = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 255, 153));
        setMaximumSize(new java.awt.Dimension(915, 585));
        setPreferredSize(new java.awt.Dimension(950, 430));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoWhite.png"))); // NOI18N
        lblLogo.setAlignmentX(-18.0F);
        lblLogo.setAlignmentY(-200.0F);

        lblNomeUX.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        lblNomeUX.setText("Nome UX");

        btnCPU.setFont(new java.awt.Font("Consolas", 0, 15)); // NOI18N
        btnCPU.setText("CPU");
        btnCPU.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        btnDisco.setFont(new java.awt.Font("Consolas", 0, 15)); // NOI18N
        btnDisco.setText("Disco");
        btnDisco.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        btnMemo.setFont(new java.awt.Font("Consolas", 0, 15)); // NOI18N
        btnMemo.setText("Memória");
        btnMemo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        lblTitulo.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        lblTitulo.setText("Sistema Operacional");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(lblNomeUX))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(138, 138, 138)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblTitulo)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDisco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(308, 308, 308))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(408, 408, 408)
                        .addComponent(btnCPU, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(392, 392, 392)
                        .addComponent(btnMemo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(151, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(lblTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addComponent(lblNomeUX)
                .addGap(33, 33, 33)
                .addComponent(btnCPU)
                .addGap(33, 33, 33)
                .addComponent(btnDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMemo)
                .addContainerGap(157, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCPU;
    private javax.swing.JButton btnDisco;
    private javax.swing.JButton btnMemo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNomeUX;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
