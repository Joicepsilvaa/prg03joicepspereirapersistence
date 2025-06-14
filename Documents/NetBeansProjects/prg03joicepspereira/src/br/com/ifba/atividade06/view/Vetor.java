/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ifba.atividade06.view;

import java.util.Arrays;
import javax.swing.DefaultListModel;

/**
 *
 * @author Joice
 */
public class Vetor extends javax.swing.JFrame {
    
    // Declara um vetor de 5 posições
    int vetor[] = new int[5];

    // Modelo da lista que será usado na JList para exibir os elementos do vetor
    DefaultListModel lista = new DefaultListModel();

    // Índice atualmente selecionado na lista
    int selecionado = 0;

    // Construtor da classe Vetor
    public Vetor() {
        // Inicializa os componentes gráficos da interface
        initComponents();

        // Preenche a lista com os valores iniciais do vetor (todos zero)
        for (int c = 0; c < vetor.length; c++) {
            lista.addElement(vetor[c]);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAdicionar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstVetor = new javax.swing.JList<>();
        lblSelecionado = new javax.swing.JLabel();
        lblVetor = new javax.swing.JLabel();
        btnOrdenar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        spnVetor = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setForeground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAdicionar.setText("ADCIONAR");
        btnAdicionar.setActionCommand("");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 26, 100, -1));

        lstVetor.setModel(lista);
        lstVetor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstVetorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstVetor);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 55, 99, 186));

        lblSelecionado.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lblSelecionado.setForeground(new java.awt.Color(0, 0, 51));
        lblSelecionado.setText("0");
        jPanel1.add(lblSelecionado, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 29, -1, -1));

        lblVetor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblVetor.setForeground(new java.awt.Color(0, 0, 51));
        lblVetor.setText("Vetor");
        jPanel1.add(lblVetor, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 29, -1, -1));

        btnOrdenar.setText("ORDENAR");
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });
        jPanel1.add(btnOrdenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 64, 100, -1));

        btnRemover.setText("REMOVER");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });
        jPanel1.add(btnRemover, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 105, 100, -1));

        spnVetor.setModel(new javax.swing.SpinnerNumberModel(1, null, null, 1));
        spnVetor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(spnVetor, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 26, 70, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        // TODO add your handling code here:
        // Atualiza o valor na posição selecionada do vetor com o valor do spinner
        vetor[selecionado] = Integer.parseInt(spnVetor.getValue().toString());

        // Limpa e atualiza a lista com os novos valores do vetor
        lista.removeAllElements();
        for (int c = 0; c < vetor.length; c++) {
            lista.addElement(vetor[c]);
        }
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        // TODO add your handling code here:
        // Ordena os elementos do vetor em ordem crescente
        Arrays.sort(vetor);

        // Atualiza a lista com os valores ordenados
        lista.removeAllElements();
        for (int c = 0; c < vetor.length; c++) {
            lista.addElement(vetor[c]);
        }
    }//GEN-LAST:event_btnOrdenarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        // TODO add your handling code here:
        // Zera o valor do vetor na posição selecionada
        vetor[selecionado] = 0;

        // Atualiza a lista com os novos valores
        lista.removeAllElements();
        for (int c = 0; c < vetor.length; c++) {
            lista.addElement(vetor[c]);
        }
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void lstVetorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstVetorMouseClicked
        // TODO add your handling code here:
        // Define o índice selecionado na lista
        selecionado = lstVetor.getSelectedIndex();

        // Atualiza o rótulo com o índice selecionado
        lblSelecionado.setText("[" + selecionado + "]");
    }//GEN-LAST:event_lstVetorMouseClicked

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
            java.util.logging.Logger.getLogger(Vetor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vetor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vetor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vetor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vetor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSelecionado;
    private javax.swing.JLabel lblVetor;
    private javax.swing.JList<String> lstVetor;
    private javax.swing.JSpinner spnVetor;
    // End of variables declaration//GEN-END:variables
}
