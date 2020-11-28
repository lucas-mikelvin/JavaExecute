package mikelvin.projeto.ac3.programas;

import mikelvin.projeto.ac3.modelos.Astralis;
import mikelvin.projeto.ac3.modelos.Furia;
import mikelvin.projeto.ac3.modelos.Mibr;
import mikelvin.projeto.ac3.modelos.Organizacao;

public class TelaCS extends javax.swing.JFrame {
    
    public TelaCS() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbFraseGrito = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btMibr = new javax.swing.JButton();
        btAstralis = new javax.swing.JButton();
        btFuria = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btSair = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jLabel4.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel4.setText("a organização que deseja acessar");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel1.setText("Clique no botão que corresponde ao time que ");

        lbFraseGrito.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel3.setText("deseja ver as informações mais atuais!");

        btMibr.setText("MIBR");
        btMibr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMibrActionPerformed(evt);
            }
        });

        btAstralis.setText("ASTRALIS");
        btAstralis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAstralisActionPerformed(evt);
            }
        });

        btFuria.setText("FURIA");
        btFuria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFuriaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Calibri Light", 1, 36)); // NOI18N
        jLabel7.setText("CSGO NOTÍCIAS");

        jLabel8.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel8.setText("    Aqui você estará sempre atualizado (a) sobre o mundo");

        btSair.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel6.setText("do Counter Strike Global Offensive");

        jLabel9.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel9.setText("Frase que todos estão comentando: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(btFuria, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btAstralis, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addComponent(btMibr, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel1)))
                .addContainerGap(95, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(169, 169, 169))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(179, 179, 179))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbFraseGrito, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btSair)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAstralis, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btMibr, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btFuria, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbFraseGrito, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btMibrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMibrActionPerformed
        dispose();
        Mibr mibr = new Mibr("MIBR", "Brasil", 52, 13, "Nuke", "Overpass");
        mibr.setDataFund("2003");

        TelaTime telaTime = new TelaTime();
        telaTime.lbNomeTime.setText(mibr.getNome());
        telaTime.lbVitorias.setText(String.valueOf(mibr.getVitorias()));
        telaTime.lbDerrotas.setText(String.valueOf(mibr.getDerrotas()));
        telaTime.lbMajor.setText(mibr.preparamentoMajor());
        telaTime.lbMapaPreferido.setText(mibr.getMapaPreferido());
        telaTime.lbMapaOdiado.setText(mibr.getMapaOdiado());
        telaTime.lbPais.setText(mibr.getPais());
        telaTime.lbAnoFund.setText(mibr.getDataFund());
        telaTime.setVisible(true);
    }//GEN-LAST:event_btMibrActionPerformed

    private void btFuriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFuriaActionPerformed
        dispose();
        Furia furia = new Furia("FURIA", "Brasil", 62, 9, "Vertigo", "Dust 2");
        furia.setDataFund("2017");
        TelaTime telaTime = new TelaTime();
        telaTime.lbNomeTime.setText(furia.getNome());
        telaTime.lbVitorias.setText(String.valueOf(furia.getVitorias()));
        telaTime.lbDerrotas.setText(String.valueOf(furia.getDerrotas()));
        telaTime.lbMajor.setText(furia.preparamentoMajor());
        telaTime.lbMapaPreferido.setText(furia.getMapaPreferido());
        telaTime.lbMapaOdiado.setText(furia.getMapaOdiado());
        telaTime.lbPais.setText(furia.getPais());
        telaTime.lbAnoFund.setText(furia.getDataFund());
        telaTime.setVisible(true);
    }//GEN-LAST:event_btFuriaActionPerformed

    private void btAstralisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAstralisActionPerformed
        dispose();
        Astralis astralis = new Astralis("Astralis", "Dinamarca", 49, 14, "Inferno", "Mirage");
        astralis.setDataFund("2016");
        TelaTime telaTime = new TelaTime();
        telaTime.lbNomeTime.setText(astralis.getNome());
        telaTime.lbVitorias.setText(String.valueOf(astralis.getVitorias()));
        telaTime.lbDerrotas.setText(String.valueOf(astralis.getDerrotas()));
        telaTime.lbMajor.setText(astralis.preparamentoMajor());    
        telaTime.lbMapaPreferido.setText(astralis.getMapaPreferido());
        telaTime.lbMapaOdiado.setText(astralis.getMapaOdiado());
        telaTime.lbPais.setText(astralis.getPais());
        telaTime.lbAnoFund.setText(astralis.getDataFund());
        telaTime.setVisible(true);
    }//GEN-LAST:event_btAstralisActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        dispose();
        TelaLogin telaLogin = new TelaLogin();
        telaLogin.setVisible(true);
    }//GEN-LAST:event_btSairActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(TelaCS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAstralis;
    private javax.swing.JButton btFuria;
    private javax.swing.JButton btMibr;
    private javax.swing.JButton btSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    protected javax.swing.JLabel lbFraseGrito;
    // End of variables declaration//GEN-END:variables
}
