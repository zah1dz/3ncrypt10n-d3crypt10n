package main;
import java.util.Base64;
import javax.swing.JOptionPane;

/**
 * @author zah1dz
 */
public class TextEncryptionDecryption extends javax.swing.JFrame {

    public TextEncryptionDecryption() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rot13EncrpytionDecryption = new javax.swing.JLabel();
        cryptoDropDown = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        inputTextField = new javax.swing.JTextField();
        outputTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textEncryptButton = new javax.swing.JButton();
        textDecryptButton = new javax.swing.JButton();
        textResetButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        keyShiftValue = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        goBackButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Text Encrypt/Decrypt");

        rot13EncrpytionDecryption.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        rot13EncrpytionDecryption.setText("Text Encryption/Decryption");

        cryptoDropDown.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        cryptoDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ROT13", "Base64", "Ceaser" }));

        inputTextField.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N

        outputTextField.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Input Text Field:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Output Text Field:");

        textEncryptButton.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        textEncryptButton.setText("Encrypt");
        textEncryptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textEncryptButtonActionPerformed(evt);
            }
        });

        textDecryptButton.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        textDecryptButton.setText("Decrypt");
        textDecryptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDecryptButtonActionPerformed(evt);
            }
        });

        textResetButton.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        textResetButton.setText("Reset");
        textResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textResetButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Select type:");

        keyShiftValue.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N

        jLabel4.setText("Key/Shift value:");

        goBackButton.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        goBackButton.setText("Go Back");
        goBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(inputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(outputTextField))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(textResetButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(textDecryptButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                                .addComponent(keyShiftValue, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(cryptoDropDown, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(textEncryptButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rot13EncrpytionDecryption))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(goBackButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rot13EncrpytionDecryption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(inputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(outputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cryptoDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(keyShiftValue, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(textEncryptButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textDecryptButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textResetButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(goBackButton)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    String text;
    String cryptoType;
    String key;
    //int k;
    
    public void cryptoTypeEncrypt() {
        switch(cryptoType)
        {
            case "ROT13" :  rot13EncryptDecrypt(); break;
                
            case "Base64":  base64Encrypt(); break;
            
            case "Ceaser":  {
                                if(key.isEmpty()) {
                                    JOptionPane.showMessageDialog(null, "Please, provide a key/shift value"); break;
                                }
                                else {
                                    //k = Integer.parseInt(key);
                                    ceaserEncryption();
                                    break;
                                }
            }
        }
    }
    public void cryptoTypeDecrypt() {
        switch(cryptoType) 
        {
            case "ROT13":   rot13EncryptDecrypt(); break;
            
            case "Base64":  base64Decrypt(); break;
            
            case "Ceaser":  {
                                if(key.isEmpty()) {
                                    JOptionPane.showMessageDialog(null, "Please, provide a key/shift value"); break;
                                }
                                else {
                                    //k = Integer.parseInt(key);
                                    ceaserDecryption();
                                    break;
                                }
            }
            
        }
    }
    public void ceaserEncryption() {
        String e = "";
        int k = Integer.parseInt(key);
        //outputTextField.setText(k+"");
        k %= 26;
        char c;
        
        for(int i = 0; i < text.length(); i++) {
            c = text.charAt(i);
            if(c >= 'a' && c <= 'z') {
                c = (char) (c+k);
                
                if(c > 'z') {
                    c -= 26;
                }
                
                //e += c;
            }
            else if(c >= 'A' && c <= 'Z') {
                c = (char) (c+k);
                
                if(c > 'Z') {
                    c -= 26;
                }
                
                //e += c;
            }
            
            e += c;
        }
        
        outputTextField.setText(e);
        
        key = null;
        k = 0;
        
    }
    public void ceaserDecryption() {
        String e = "";
        int k = Integer.parseInt(key);
        //outputTextField.setText(k + "");
        k %= 26;
        char c;

        for (int i = 0; i < text.length(); i++) {
            c = text.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c = (char) (c - k);

                if (c < 'a') {
                    c += 26;
                }

                //e += c;
                
            } else if (c >= 'A' && c <= 'Z') {
                c = (char) (c - k);

                if (c < 'A') {
                    c += 26;
                }

                //e += c;
            }
            
            e += c;
        }

        outputTextField.setText(e);
        // 
        key = null;
        k = 0;
    }
    public void base64Encrypt() {
        Base64.Encoder enc = Base64.getEncoder();
        outputTextField.setText(enc.encodeToString(text.getBytes()));
    }
    public void base64Decrypt() {
        Base64.Decoder dec = Base64.getDecoder();
        String d = new String(dec.decode(text));
        outputTextField.setText(d);
    }
    public void rot13EncryptDecrypt() {
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if      (c >= 'a' && c <= 'm') c += 13;
            else if (c >= 'A' && c <= 'M') c += 13;
            else if (c >= 'n' && c <= 'z') c -= 13;
            else if (c >= 'N' && c <= 'Z') c -= 13;
            
            sb.append(c);
        }
        
        outputTextField.setText(sb.toString());
    }
    
    private void textResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textResetButtonActionPerformed
        // TODO add your handling code here:
        inputTextField.setText("");
        outputTextField.setText("");
        keyShiftValue.setText("");
    }//GEN-LAST:event_textResetButtonActionPerformed

    private void textEncryptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textEncryptButtonActionPerformed
        // TODO add your handling code here:
        text = inputTextField.getText();
        key =  keyShiftValue.getText();
        //System.out.println(key);
        cryptoType = cryptoDropDown.getSelectedItem().toString();
        cryptoTypeEncrypt();
    }//GEN-LAST:event_textEncryptButtonActionPerformed

    private void textDecryptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textDecryptButtonActionPerformed
        // TODO add your handling code here:
        text = inputTextField.getText();
        key = keyShiftValue.getText();
        cryptoType = cryptoDropDown.getSelectedItem().toString();
        cryptoTypeDecrypt();
    }//GEN-LAST:event_textDecryptButtonActionPerformed

    private void goBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackButtonActionPerformed
        // TODO add your handling code here:
        EncryptionDecryption ed = new EncryptionDecryption();
        ed.setVisible(true);
        dispose();
    }//GEN-LAST:event_goBackButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TextEncryptionDecryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TextEncryptionDecryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TextEncryptionDecryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TextEncryptionDecryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TextEncryptionDecryption().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cryptoDropDown;
    private javax.swing.JButton goBackButton;
    private javax.swing.JTextField inputTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField keyShiftValue;
    private javax.swing.JTextField outputTextField;
    private javax.swing.JLabel rot13EncrpytionDecryption;
    private javax.swing.JButton textDecryptButton;
    private javax.swing.JButton textEncryptButton;
    private javax.swing.JButton textResetButton;
    // End of variables declaration//GEN-END:variables
}
