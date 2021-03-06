/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author root
 */
public class MainWindow extends javax.swing.JFrame {
    
    /**
     * Creates new form window
     */
    public MainWindow() {
        initComponents();
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
        currency1 = new javax.swing.JTextField();
        exchangeRate = new javax.swing.JTextField();
        currency2 = new javax.swing.JTextField();
        developers = new javax.swing.JLabel();
        toCurrency2 = new javax.swing.JLabel();
        toCurrency1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Currency Calculator");
        setBackground(new java.awt.Color(12, 2, 86));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(38, 46, 43));

        currency1.setBackground(new java.awt.Color(38, 46, 43));
        currency1.setFont(new java.awt.Font("cmr10", 1, 18)); // NOI18N
        currency1.setText("Currency 1");
        currency1.setBorder(null);
        currency1.setForeground(Color.GRAY);
        currency1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                currency1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                currency1FocusLost(evt);
            }
        });
        currency1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                currency1KeyPressed(evt);
            }
        });

        exchangeRate.setBackground(new java.awt.Color(38, 46, 43));
        exchangeRate.setFont(new java.awt.Font("cmr10", 1, 18)); // NOI18N
        exchangeRate.setText("Rate");
        exchangeRate.setBorder(null);
        exchangeRate.setForeground(Color.GRAY);
        exchangeRate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                exchangeRateFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                exchangeRateFocusLost(evt);
            }
        });
        exchangeRate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                exchangeRateKeyPressed(evt);
            }
        });

        currency2.setBackground(new java.awt.Color(38, 46, 43));
        currency2.setFont(new java.awt.Font("cmr10", 1, 18)); // NOI18N
        currency2.setText("Currency 2");
        currency2.setBorder(null);
        currency2.setForeground(Color.GRAY);
        currency2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                currency2FocusLost(evt);
            }
            public void focusGained(java.awt.event.FocusEvent evt) {
                currency2FocusGained(evt);
            }
        });
        currency2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                currency2KeyPressed(evt);
            }
        });

        developers.setFont(new java.awt.Font("Cantarell", 1, 10)); // NOI18N
        developers.setForeground(new java.awt.Color(226, 226, 226));
        developers.setText("David Medina & Geraldo Rodrigues 2017");

        toCurrency2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/forward.png"))); // NOI18N
        toCurrency2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        toCurrency2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toCurrency2MouseClicked(evt);
            }
        });

        toCurrency1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/back.png"))); // NOI18N
        toCurrency1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        toCurrency1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toCurrency1MouseClicked(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(254, 254, 254));
        jSeparator1.setForeground(new java.awt.Color(254, 254, 254));

        jSeparator2.setBackground(new java.awt.Color(254, 254, 254));
        jSeparator2.setForeground(new java.awt.Color(254, 254, 254));

        jSeparator3.setBackground(new java.awt.Color(254, 254, 254));
        jSeparator3.setForeground(new java.awt.Color(254, 254, 254));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(developers))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(145, 145, 145)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(toCurrency2)
                                    .addComponent(toCurrency1)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator1)
                                    .addComponent(currency1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(51, 51, 51)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(exchangeRate)
                                    .addComponent(jSeparator2))
                                .addGap(60, 60, 60)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(currency2)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 39, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(toCurrency2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(currency1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(currency2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exchangeRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator3)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(toCurrency1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(developers, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void currency2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_currency2FocusGained
        currency2.setCaretPosition(0);
    }//GEN-LAST:event_currency2FocusGained

    private void currency1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_currency1FocusGained
        currency1.setCaretPosition(0);
    }//GEN-LAST:event_currency1FocusGained

    private void exchangeRateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_exchangeRateFocusGained
        exchangeRate.setCaretPosition(0);
    }//GEN-LAST:event_exchangeRateFocusGained

    private void exchangeRateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_exchangeRateFocusLost
        if(exchangeRate.getText().isEmpty()) {
            exchangeRate.setText("Rate");
            exchangeRate.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_exchangeRateFocusLost

    private void currency1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_currency1FocusLost
        if(currency1.getText().isEmpty()) {
            currency1.setText("Currency 1");
            currency1.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_currency1FocusLost

    private void currency2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_currency2FocusLost
        if(currency2.getText().isEmpty()) {
            currency2.setText("Currency 2");
            currency2.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_currency2FocusLost

    private void exchangeRateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_exchangeRateKeyPressed
        if(exchangeRate.getText().equals("Rate") || 
                                    exchangeRate.getForeground() == Color.GRAY){
            exchangeRate.setText("");
            exchangeRate.setForeground(Color.WHITE);
        }
    }//GEN-LAST:event_exchangeRateKeyPressed

    private void currency1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_currency1KeyPressed
        if(currency1.getText().equals("Currency 1") || 
                                    currency1.getForeground() == Color.GRAY){
            currency1.setText("");
            currency1.setForeground(Color.WHITE);
        }
    }//GEN-LAST:event_currency1KeyPressed

    private void currency2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_currency2KeyPressed
        if(currency2.getText().equals("Currency 2") || 
                                    currency2.getForeground() == Color.GRAY){
            currency2.setText("");
            currency2.setForeground(Color.WHITE);
        }
    }//GEN-LAST:event_currency2KeyPressed

    private void toCurrency2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toCurrency2MouseClicked
        try {
            currency2.setText(calculateExchange(currency1));
            currency2.setForeground(Color.GRAY);
        } catch(NumberFormatException e) {
            System.out.println("Error");
        }
    }//GEN-LAST:event_toCurrency2MouseClicked

    private void toCurrency1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toCurrency1MouseClicked
        try {
            currency1.setText(calculateExchange(currency2));
            currency1.setForeground(Color.GRAY);
        } catch(NumberFormatException e) {
            System.out.println("Error");
        }
    }//GEN-LAST:event_toCurrency1MouseClicked

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField currency1;
    private javax.swing.JTextField currency2;
    private javax.swing.JLabel developers;
    private javax.swing.JTextField exchangeRate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel toCurrency1;
    private javax.swing.JLabel toCurrency2;
    // End of variables declaration//GEN-END:variables
    
    private boolean checkInput(javax.swing.JTextField textField) {
        JFrame frame = new JFrame();
        
        if(textField.getText().contains(".")) {
            String[] number = textField.getText().split("\\.");
            
            for (String set : number) {
                if(set.matches(".*[^0-9]+.*")) {
                    JOptionPane.showMessageDialog(frame,
                                            "You introduced a wrong number",
                                            "ERROR",
                                            JOptionPane.WARNING_MESSAGE);
                    textField.setText("");
                    
                    return false;
                }
            }
            
            if(number.length == 2) {
                if(number[1].length() > 2) number[1] = number[1].substring(0, 2);
                textField.setText(number[0] + "." + number[1]);
            }
                
            
        } else {
            if(textField.getText().matches(".*[^0-9]+.*")) {
                JOptionPane.showMessageDialog(frame,
                                            "You introduced a wrong number",
                                            "ERROR",
                                            JOptionPane.WARNING_MESSAGE);
                textField.setText("");
                
                return false;
            }
        }
        
        return true;
    }
    
    private String calculateExchange(javax.swing.JTextField textField) {
        if(this.checkInput(exchangeRate) && this.checkInput(textField)) {
            float rate = Float.parseFloat(exchangeRate.getText());
            float input = Float.parseFloat(textField.getText());
            DecimalFormat df = new DecimalFormat("#.##");
            df.setRoundingMode(RoundingMode.CEILING);
            float result = Float.parseFloat(df.format(rate*input));
            return Float.toString(result);
        }
        
        return "ERROR";
    }
}
