/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculatorC;

import javax.swing.JTextArea;

/**
 *
 * @author jasimjuwel
 */
public class Calculators extends javax.swing.JFrame {
    
    double firstnum;
    double secondnum;
    double result;
    String operations;
    String answer;

    /**
     * Creates new form Calculators
     */
    public Calculators() {
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

        jTxtDisplay = new javax.swing.JTextField();
        jBtn1 = new javax.swing.JButton();
        jBtn2 = new javax.swing.JButton();
        jBtn3 = new javax.swing.JButton();
        jBtn4 = new javax.swing.JButton();
        jBtn5 = new javax.swing.JButton();
        jBtn6 = new javax.swing.JButton();
        jBtn7 = new javax.swing.JButton();
        jBtn8 = new javax.swing.JButton();
        jBtn9 = new javax.swing.JButton();
        jBtn10 = new javax.swing.JButton();
        jBtn11 = new javax.swing.JButton();
        jBtn12 = new javax.swing.JButton();
        jBtn13 = new javax.swing.JButton();
        jBtn14 = new javax.swing.JButton();
        jBtn15 = new javax.swing.JButton();
        jBtn16 = new javax.swing.JButton();
        jBtn17 = new javax.swing.JButton();
        jBtn18 = new javax.swing.JButton();
        jBtn19 = new javax.swing.JButton();
        jBtn20 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Java Calculator By Jasim");
        setLocation(new java.awt.Point(500, 250));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jTxtDisplay.setEditable(false);
        jTxtDisplay.setFont(new java.awt.Font("Tahoma", 1, 23)); // NOI18N
        jTxtDisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTxtDisplay.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTxtDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtDisplayActionPerformed(evt);
            }
        });

        jBtn1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtn1.setText("<--");
        jBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn1ActionPerformed(evt);
            }
        });

        jBtn2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtn2.setText("C");
        jBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn2ActionPerformed(evt);
            }
        });

        jBtn3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtn3.setText("%");
        jBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn3ActionPerformed(evt);
            }
        });

        jBtn4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtn4.setText("/");
        jBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn4ActionPerformed(evt);
            }
        });

        jBtn5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtn5.setText("7");
        jBtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn5ActionPerformed(evt);
            }
        });

        jBtn6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtn6.setText("8");
        jBtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn6ActionPerformed(evt);
            }
        });

        jBtn7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtn7.setText("9");
        jBtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn7ActionPerformed(evt);
            }
        });

        jBtn8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtn8.setText("-");
        jBtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn8ActionPerformed(evt);
            }
        });

        jBtn9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtn9.setText("4");
        jBtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn9ActionPerformed(evt);
            }
        });

        jBtn10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtn10.setText("*");
        jBtn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn10ActionPerformed(evt);
            }
        });

        jBtn11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtn11.setText("6");
        jBtn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn11ActionPerformed(evt);
            }
        });

        jBtn12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtn12.setText("5");
        jBtn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn12ActionPerformed(evt);
            }
        });

        jBtn13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtn13.setText("2");
        jBtn13.setToolTipText("");
        jBtn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn13ActionPerformed(evt);
            }
        });

        jBtn14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtn14.setText("3");
        jBtn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn14ActionPerformed(evt);
            }
        });

        jBtn15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtn15.setText("+");
        jBtn15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn15ActionPerformed(evt);
            }
        });

        jBtn16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtn16.setText("1");
        jBtn16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn16ActionPerformed(evt);
            }
        });

        jBtn17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtn17.setText("+/-");
        jBtn17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn17ActionPerformed(evt);
            }
        });

        jBtn18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtn18.setText(".");
        jBtn18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn18ActionPerformed(evt);
            }
        });

        jBtn19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtn19.setText("=");
        jBtn19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn19ActionPerformed(evt);
            }
        });

        jBtn20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtn20.setText("0");
        jBtn20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn20ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jTxtDisplay)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtn8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtn20, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtn18, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtn17, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtn19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBtn16, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtn13, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtn14, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBtn12, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtn11, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBtn15)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jBtn10, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTxtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn15, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtn10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtn20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn1ActionPerformed
        String backspace = null;
        if(jTxtDisplay.getText().length() > 0){
            StringBuilder strB = new StringBuilder(jTxtDisplay.getText());
            strB.deleteCharAt(jTxtDisplay.getText().length() - 1);
            backspace = strB.toString();
            jTxtDisplay.setText(backspace);
        }
    }//GEN-LAST:event_jBtn1ActionPerformed

    private void jBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn2ActionPerformed
        jTxtDisplay.setText("");
    }//GEN-LAST:event_jBtn2ActionPerformed

    private void jBtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn5ActionPerformed
        String enterNumber = jTxtDisplay.getText() + jBtn5.getText();
        jTxtDisplay.setText(enterNumber);
    }//GEN-LAST:event_jBtn5ActionPerformed

    private void jBtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn6ActionPerformed
       String enterNumber = jTxtDisplay.getText() + jBtn6.getText();
        jTxtDisplay.setText(enterNumber);
    }//GEN-LAST:event_jBtn6ActionPerformed

    private void jBtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn7ActionPerformed
        String enterNumber = jTxtDisplay.getText() + jBtn7.getText();
        jTxtDisplay.setText(enterNumber);
    }//GEN-LAST:event_jBtn7ActionPerformed

    private void jBtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn9ActionPerformed
        String enterNumber = jTxtDisplay.getText() + jBtn9.getText();
        jTxtDisplay.setText(enterNumber);
    }//GEN-LAST:event_jBtn9ActionPerformed

    private void jBtn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn12ActionPerformed
        String enterNumber = jTxtDisplay.getText() + jBtn12.getText();
        jTxtDisplay.setText(enterNumber);
    }//GEN-LAST:event_jBtn12ActionPerformed

    private void jBtn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn11ActionPerformed
        String enterNumber = jTxtDisplay.getText() + jBtn11.getText();
        jTxtDisplay.setText(enterNumber);
    }//GEN-LAST:event_jBtn11ActionPerformed

    private void jBtn16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn16ActionPerformed
        String enterNumber = jTxtDisplay.getText() + jBtn16.getText();
        jTxtDisplay.setText(enterNumber);
    }//GEN-LAST:event_jBtn16ActionPerformed

    private void jBtn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn13ActionPerformed
        String enterNumber = jTxtDisplay.getText() + jBtn13.getText();
        jTxtDisplay.setText(enterNumber);
    }//GEN-LAST:event_jBtn13ActionPerformed

    private void jBtn14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn14ActionPerformed
        String enterNumber = jTxtDisplay.getText() + jBtn14.getText();
        jTxtDisplay.setText(enterNumber);
    }//GEN-LAST:event_jBtn14ActionPerformed

    private void jBtn18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn18ActionPerformed
        String enterNumber = jTxtDisplay.getText() + jBtn18.getText();
        jTxtDisplay.setText(enterNumber);
    }//GEN-LAST:event_jBtn18ActionPerformed

    private void jBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn3ActionPerformed
        firstnum = Double.parseDouble(jTxtDisplay.getText());
        jTxtDisplay.setText("");
        operations = "%";
        
        
    }//GEN-LAST:event_jBtn3ActionPerformed

    private void jBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn4ActionPerformed
        firstnum = Double.parseDouble(jTxtDisplay.getText());
        jTxtDisplay.setText("");
        operations = "/";
    }//GEN-LAST:event_jBtn4ActionPerformed

    private void jBtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn8ActionPerformed
        firstnum = Double.parseDouble(jTxtDisplay.getText());
        jTxtDisplay.setText("");
        operations = "-";
    }//GEN-LAST:event_jBtn8ActionPerformed

    private void jBtn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn10ActionPerformed
        firstnum = Double.parseDouble(jTxtDisplay.getText());
        jTxtDisplay.setText("");
        operations = "*";
    }//GEN-LAST:event_jBtn10ActionPerformed

    private void jBtn15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn15ActionPerformed
        firstnum = Double.parseDouble(jTxtDisplay.getText());
        jTxtDisplay.setText("");
        operations = "+";
    }//GEN-LAST:event_jBtn15ActionPerformed

    private void jBtn17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn17ActionPerformed
      double ops = Double.parseDouble(String.valueOf(jTxtDisplay.getText()));
      ops = ops * (-1);
      jTxtDisplay.setText(String.valueOf(ops));
      
    }//GEN-LAST:event_jBtn17ActionPerformed

    private void jBtn20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn20ActionPerformed
        String enterNumber = jTxtDisplay.getText() + jBtn20.getText();
        jTxtDisplay.setText(enterNumber);
    }//GEN-LAST:event_jBtn20ActionPerformed

    private void jBtn19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn19ActionPerformed
          String answer;
          secondnum = Double.parseDouble(jTxtDisplay.getText());
          
          if(operations == "+"){
              result = firstnum + secondnum;
              answer = String.format("%.0f", result);
              jTxtDisplay.setText(answer);
          }
          else if(operations == "-"){
              result = firstnum - secondnum;
              answer = String.format("%.0f", result);
              jTxtDisplay.setText(answer);
          }
          else if(operations == "*"){
              result = firstnum * secondnum;
              answer = String.format("%.0f", result);
              jTxtDisplay.setText(answer);
          }
          else if(operations == "/"){
              result = firstnum / secondnum;
              answer = String.format("%.0f", result);
              jTxtDisplay.setText(answer);
          }
          
          else if(operations == "%"){
              result = firstnum % secondnum;
              answer = String.format("%.0f", result);
              jTxtDisplay.setText(answer);
          }
    }//GEN-LAST:event_jBtn19ActionPerformed

    private void jTxtDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtDisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtDisplayActionPerformed

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
            java.util.logging.Logger.getLogger(Calculators.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculators.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculators.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculators.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculators().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtn1;
    private javax.swing.JButton jBtn10;
    private javax.swing.JButton jBtn11;
    private javax.swing.JButton jBtn12;
    private javax.swing.JButton jBtn13;
    private javax.swing.JButton jBtn14;
    private javax.swing.JButton jBtn15;
    private javax.swing.JButton jBtn16;
    private javax.swing.JButton jBtn17;
    private javax.swing.JButton jBtn18;
    private javax.swing.JButton jBtn19;
    private javax.swing.JButton jBtn2;
    private javax.swing.JButton jBtn20;
    private javax.swing.JButton jBtn3;
    private javax.swing.JButton jBtn4;
    private javax.swing.JButton jBtn5;
    private javax.swing.JButton jBtn6;
    private javax.swing.JButton jBtn7;
    private javax.swing.JButton jBtn8;
    private javax.swing.JButton jBtn9;
    private javax.swing.JTextField jTxtDisplay;
    // End of variables declaration//GEN-END:variables
}
