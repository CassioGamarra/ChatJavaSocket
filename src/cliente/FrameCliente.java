/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
/**
 *
 * @author Cássio e Frederico
 */
public class FrameCliente extends javax.swing.JFrame {

    /**
     * Creates new form FrameCliente
     */
    public FrameCliente() {
        initComponents();
    }
    
    Cliente cliente = new Cliente();
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCliente = new javax.swing.JPanel();
        fieldPorta = new javax.swing.JTextField();
        fieldEndereco = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaChat = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaMsg = new javax.swing.JTextArea();
        btnEnviar = new javax.swing.JButton();
        fieldApelido = new javax.swing.JTextField();
        btnConectar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CHAT - CLIENTE");
        setResizable(false);

        panelCliente.setBackground(new java.awt.Color(255, 255, 255));
        panelCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "CHAT - CLIENTE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        panelCliente.setMaximumSize(new java.awt.Dimension(800, 600));
        panelCliente.setMinimumSize(new java.awt.Dimension(800, 600));

        fieldPorta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fieldPorta.setForeground(Color.gray);
        fieldPorta.setText("Digite o número da porta...");
        fieldPorta.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Porta:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        fieldPorta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fieldPortaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fieldPortaFocusLost(evt);
            }
        });

        fieldEndereco.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fieldEndereco.setForeground(Color.gray);
        fieldEndereco.setText("Digite o endereço...");
        fieldEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Endereço:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        fieldEndereco.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fieldEnderecoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fieldEnderecoFocusLost(evt);
            }
        });

        txtAreaChat.setEditable(false);
        txtAreaChat.setColumns(20);
        txtAreaChat.setLineWrap(true);
        txtAreaChat.setRows(5);
        txtAreaChat.setWrapStyleWord(true);
        txtAreaChat.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "CHAT:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jScrollPane1.setViewportView(txtAreaChat);

        txtAreaMsg.setColumns(20);
        txtAreaMsg.setForeground(Color.gray);
        txtAreaMsg.setLineWrap(true);
        txtAreaMsg.setRows(5);
        txtAreaMsg.setText("Enviar mensagem...");
        txtAreaMsg.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MENSAGEM:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        txtAreaMsg.setCaretPosition(0);
        txtAreaMsg.setEnabled(false);
        txtAreaMsg.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAreaMsgFocusGained(evt);
            }
        });
        txtAreaMsg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAreaMsgMouseClicked(evt);
            }
        });
        txtAreaMsg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAreaMsgKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(txtAreaMsg);

        btnEnviar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEnviar.setText("ENVIAR");
        btnEnviar.setEnabled(false);
        btnEnviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEnviarMouseClicked(evt);
            }
        });

        fieldApelido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fieldApelido.setForeground(Color.gray);
        fieldApelido.setText("Digite seu apelido...");
        fieldApelido.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Apelido:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        fieldApelido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fieldApelidoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fieldApelidoFocusLost(evt);
            }
        });

        btnConectar.setText("CONECTAR");
        btnConectar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConectarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelClienteLayout = new javax.swing.GroupLayout(panelCliente);
        panelCliente.setLayout(panelClienteLayout);
        panelClienteLayout.setHorizontalGroup(
            panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelClienteLayout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEnviar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelClienteLayout.createSequentialGroup()
                        .addComponent(fieldPorta, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldApelido, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConectar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelClienteLayout.setVerticalGroup(
            panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fieldPorta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fieldApelido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnConectar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEnviar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 780, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public JTextField getFieldApelido() {
        return fieldApelido;
    }

    public JTextField getFieldEndereco() {
        return fieldEndereco;
    }

    public JTextField getFieldPorta() {
        return fieldPorta;
    }

    public JTextArea getTxtAreaChat() {
        return txtAreaChat;
    }

    public JTextArea getTxtAreaMsg() {
        return txtAreaMsg;
    }
    private void txtAreaMsgKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAreaMsgKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            enviar();
        }
    }//GEN-LAST:event_txtAreaMsgKeyPressed

    private void fieldEnderecoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldEnderecoFocusGained
        // TODO add your handling code here:
        fieldEnderecoIn();
    }//GEN-LAST:event_fieldEnderecoFocusGained

    private void fieldEnderecoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldEnderecoFocusLost
        // TODO add your handling code here:
        fieldEnderecoOut();
    }//GEN-LAST:event_fieldEnderecoFocusLost

    private void fieldPortaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldPortaFocusGained
        // TODO add your handling code here:
        fieldPortaIn();
    }//GEN-LAST:event_fieldPortaFocusGained

    private void fieldPortaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldPortaFocusLost
        // TODO add your handling code here:
        fieldPortaOut();
    }//GEN-LAST:event_fieldPortaFocusLost

    private void fieldApelidoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldApelidoFocusGained
        // TODO add your handling code here:
        fieldApelidoIn();
    }//GEN-LAST:event_fieldApelidoFocusGained

    private void fieldApelidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldApelidoFocusLost
        // TODO add your handling code here:
        fieldApelidoOut();
    }//GEN-LAST:event_fieldApelidoFocusLost

    private void txtAreaMsgFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAreaMsgFocusGained
        // TODO add your handling code here:
        txtAreaMsgIn();
    }//GEN-LAST:event_txtAreaMsgFocusGained

    private void btnEnviarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarMouseClicked
        // TODO add your handling code here:
        enviar();
    }//GEN-LAST:event_btnEnviarMouseClicked

    private void btnConectarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConectarMouseClicked
        // TODO add your handling code here:
        if(btnConectar.getText().equals("DESCONECTAR")){
            desconectar();
        }
        else{
            conectar();
        }
    }//GEN-LAST:event_btnConectarMouseClicked

    private void txtAreaMsgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAreaMsgMouseClicked
        // TODO add your handling code here:
        System.out.println(txtAreaMsg.getCaretPosition());
    }//GEN-LAST:event_txtAreaMsgMouseClicked
    
    //Métodos referente aos eventos
    private void conectar(){
        if(fieldPorta.getText().equals("Digite o número da porta...")){
            JOptionPane.showMessageDialog(null, "Digite o número da porta...");
        
        }
        else if(fieldEndereco.getText().equals("Digite o endereço...")){
            JOptionPane.showMessageDialog(null, "Digite o endereço...");
        }
        else if(fieldApelido.getText().equals("Digite seu apelido...")){
            JOptionPane.showMessageDialog(null, "Digite seu apelido...");
        }
        
        else{
            try {
                cliente.cliente(this);
                txtAreaMsg.setEnabled(true);
                btnEnviar.setEnabled(true);
                fieldPorta.setEnabled(false);
                fieldEndereco.setEnabled(false);
                fieldApelido.setEnabled(false);
                btnConectar.setText("DESCONECTAR");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Não foi possível conectar!");
            }
        }
    }
    private void desconectar(){
        fieldPorta.setEnabled(true);
        fieldEndereco.setEnabled(true);
        fieldApelido.setEnabled(true);
        btnConectar.setText("CONECTAR");
    }
    private void enviar(){
        if(!txtAreaMsg.getText().contains("\n")){
            cliente.enviar(fieldApelido.getText(), txtAreaMsg.getText(), this);
            txtAreaMsg.getDocument().putProperty("filterNewlines", Boolean.TRUE);
            txtAreaMsg.setText("");
        }
    }
    private void fieldPortaIn(){
        fieldPorta.setForeground(Color.black);
        fieldPorta.setText("");
    }
    private void fieldPortaOut(){
        if(fieldPorta.getText().equals("")){
            fieldPorta.setForeground(Color.gray);
            fieldPorta.setText("Digite o número da porta...");
        }
    }
    private void fieldEnderecoIn(){
        fieldEndereco.setText("");
        fieldEndereco.setForeground(Color.black);
    }
    private void fieldEnderecoOut(){
        if(fieldEndereco.getText().equals("")){
            fieldEndereco.setForeground(Color.gray);
            fieldEndereco.setText("Digite o endereco...");
        }
    }
    private void fieldApelidoIn(){
        fieldApelido.setForeground(Color.black);
        fieldApelido.setText("");
    }
    private void fieldApelidoOut(){
        if(fieldApelido.getText().equals("")){
            fieldApelido.setForeground(Color.gray);
            fieldApelido.setText("Digite seu apelido...");
        }
    }
    private void txtAreaMsgIn(){
        txtAreaMsg.setForeground(Color.black);
        txtAreaMsg.setText("");
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrameCliente frmCliente = new FrameCliente();
                frmCliente.setLocationRelativeTo(null);
                frmCliente.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConectar;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JTextField fieldApelido;
    private javax.swing.JTextField fieldEndereco;
    private javax.swing.JTextField fieldPorta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelCliente;
    private javax.swing.JTextArea txtAreaChat;
    private javax.swing.JTextArea txtAreaMsg;
    // End of variables declaration//GEN-END:variables
}
