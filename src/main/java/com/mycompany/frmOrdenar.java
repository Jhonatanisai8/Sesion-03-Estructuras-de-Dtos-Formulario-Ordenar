package com.mycompany;

import java.awt.Color;
import javax.swing.DefaultListModel;

/**
 *
 * @author Jhonatan
 */
public class frmOrdenar extends javax.swing.JFrame {

    int num[] = {45, 67, 55, 23, 3, -6, 9, 1, 0, 3, 2, 34, 66, 2, 88, 100, 1230};
    DefaultListModel model = new DefaultListModel();

    public frmOrdenar() {
        initComponents();
        ltsNumeros.setModel(model);
        this.setTitle("Ordenando Arreglo");
        this.setLocationRelativeTo(null);
        // definir();
    }

    public void arregloBurbuja(int num[]) {

        int total = num.length;
        int contador = 0;

        for (int i = 0; i < total; i++) {
            for (int j = 0; j < total - 1; j++) {
                //aqui se le puede cambiar el signo
                if (num[j] < num[j + 1]) {
                    int auxiliar = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = auxiliar;
                }
                contador++;
            }
        }
        txtIteracion1.setText(String.valueOf(contador));
        mostrar();
    }

    public void ordenarMetodoClaseAscendente(int arreglo[]) {
        int longitud = arreglo.length;
        int mayor, pos;
        int contador = 0;
        for (int j = 0; j < longitud; j++) {
            mayor = arreglo[j];
            pos = j;
            for (int i = j + 1; i < longitud; i++) {
                //aqui se le puede cambiar el signo
                if (arreglo[i] > mayor) {
                    mayor = arreglo[i];
                    pos = i;
                }
                contador++;
            }
            arreglo[pos] = arreglo[j];
            arreglo[j] = mayor;
        }

        txtIteracion2.setText(contador + "");
        mostrar();
    }

    public void mostrar() {
        model.removeAllElements();
        int tam = num.length;
        System.out.println("Tamaño del arreglo; " + tam);
        for (int i = 0; i < tam; i++) {
            model.addElement(num[i] + "\t");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtIteracion1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtIteracion2 = new javax.swing.JTextField();
        txtIteracion3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ltsNumeros = new javax.swing.JList<>();
        btnMostrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 153));
        jButton1.setText("Burbuja");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 153));
        jButton2.setText("Seleccion");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 153));
        jButton3.setText("QuickShort");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        txtIteracion1.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        txtIteracion1.setForeground(new java.awt.Color(0, 0, 153));

        jLabel1.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Iteraciones:");

        txtIteracion2.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        txtIteracion2.setForeground(new java.awt.Color(0, 0, 153));

        txtIteracion3.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        txtIteracion3.setForeground(new java.awt.Color(0, 0, 153));

        ltsNumeros.setFont(new java.awt.Font("Cascadia Code", 1, 18)); // NOI18N
        ltsNumeros.setForeground(new java.awt.Color(204, 0, 0));
        jScrollPane1.setViewportView(ltsNumeros);

        btnMostrar.setText("Limpiar Lista");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIteracion1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtIteracion2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtIteracion3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(jScrollPane1)
                .addGap(212, 212, 212))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(95, 95, 95)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(134, 134, 134)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(55, 55, 55))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtIteracion1)
                    .addComponent(txtIteracion2)
                    .addComponent(txtIteracion3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMostrar)
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        arregloBurbuja(num);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        // TODO add your handling code here:
        limpiat();

    }//GEN-LAST:event_btnMostrarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ordenarMetodoClaseAscendente(num);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int numero = num.length - 1;
        quikShort(num, 0, numero);
        mostrar();
    }//GEN-LAST:event_jButton3ActionPerformed

    int contador = 0;

    public void quikShort(int num[], int izq, int der) {

        int pivote = num[izq];
        int i = izq;
        int j = der;
        int aux;

        while (i < j) {
            //buscamos los valores menores
            while (num[i] >= pivote && i < j) {
                i++;
            }
            while (num[j] < pivote) {
                j--;
            }
            if (i < j) {
                aux = num[i];
                num[i] = num[j];
                num[j] = aux;
            }
        }
        contador++;

        num[izq] = num[j];
        num[j] = pivote;

        //empleamos recursividad
        if (izq < j - 1) {
            quikShort(num, izq, j - 1);
        }
        if (j + 1 < der) {
            quikShort(num, j + 1, der);
        }
        txtIteracion3.setText(contador + "");

    }

    public void limpiat() {
        model.removeAllElements();
        txtIteracion1.setText(null);
        txtIteracion2.setText(null);
        txtIteracion3.setText(null);
    }

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
            java.util.logging.Logger.getLogger(frmOrdenar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmOrdenar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmOrdenar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmOrdenar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmOrdenar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> ltsNumeros;
    private javax.swing.JTextField txtIteracion1;
    private javax.swing.JTextField txtIteracion2;
    private javax.swing.JTextField txtIteracion3;
    // End of variables declaration//GEN-END:variables
}
