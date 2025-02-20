import javax.swing.JOptionPane;
import java.util.*;

public class TelaCadastrarUsuario extends javax.swing.JFrame {
    CadastrarUsuarioDAO usuariobanco = new CadastrarUsuarioDAO();

    public TelaCadastrarUsuario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        aux1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        aux2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        aux3 = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        aux4 = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        aux5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        aux6 = new javax.swing.JPasswordField();
        BoataoCadastrar = new javax.swing.JButton();
        BotaoExibir = new javax.swing.JButton();
        Sair = new javax.swing.JButton();
        BotaoRemoverUsuario = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        aux7 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel1.setText("Cadastrar Usuário");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Nome: ");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("E-mail: ");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Telefone:");

        try {
            aux3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Data de Nascimento: ");

        try {
            aux4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Endereço: ");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Senha:");

        BoataoCadastrar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BoataoCadastrar.setText("Cadastrar");
        BoataoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoataoCadastrarActionPerformed(evt);
            }
        });

        BotaoExibir.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BotaoExibir.setText("Exibir");
        BotaoExibir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoExibirActionPerformed(evt);
            }
        });

        Sair.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });

        BotaoRemoverUsuario.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BotaoRemoverUsuario.setText("Remover Usuário");
        BotaoRemoverUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoRemoverUsuarioActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Tipo de usuário: ");

        aux7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bibliotecário", "Usuário normal" }));
        aux7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aux7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(aux1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BoataoCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(BotaoRemoverUsuario)
                        .addGap(34, 34, 34)
                        .addComponent(BotaoExibir)
                        .addGap(38, 38, 38)
                        .addComponent(Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(aux6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(aux2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(aux3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(aux4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(aux5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(aux7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aux1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aux2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(aux3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(aux4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(aux5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(aux7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(aux6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoExibir)
                    .addComponent(Sair)
                    .addComponent(BotaoRemoverUsuario)
                    .addComponent(BoataoCadastrar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BoataoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoataoCadastrarActionPerformed
        //Tratamento de exceção:
        try {
            //Transferindo as informações digitadas para variáveis:
            String nome = aux1.getText();
            String email = aux2.getText();
            String telefone = aux3.getText();
            String dataNascimento = aux4.getText();
            String endereco = aux5.getText();
            String senha = new String(aux6.getPassword());
            String tipoUsuario = aux7.getSelectedItem().toString();
            
            //Verificação se já existe algum usuário com este nome:
            if (usuariobanco.retornarNome(nome).equalsIgnoreCase(nome)){
                //Se sim, exibindo mensagem de usuário já cadastrado e cadastro não efetuado.
                JOptionPane.showMessageDialog(null, "Este usuário já possui um cadastro!");
            }
            else{
                //Se não, cadastrando o usuário:
            CadastrarUsuario cadastrarUsuario = new CadastrarUsuario(nome, email, telefone, dataNascimento, endereco, tipoUsuario, senha);
            usuariobanco.inserirUsuario(cadastrarUsuario);
            }
        } catch (Exception erro) {
            System.out.println("ERRO: " + erro);
        }
    }//GEN-LAST:event_BoataoCadastrarActionPerformed

    private void BotaoExibirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoExibirActionPerformed
        //Tratamento de exceção:
        try {
            //Exibindo os dados dos usuários cadastrados separadamente:
            usuariobanco.consultarTudo();
        } catch (Exception erro) {
            System.out.println("ERRO: " + erro);
        }
    }//GEN-LAST:event_BotaoExibirActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        //Tratamento de exceção:
        try {
            //Fechando a tela de cadastro de usuário:
            dispose();
        } catch (Exception erro) {
            System.out.println("ERRO: " + erro);
        }
    }//GEN-LAST:event_SairActionPerformed

    private void BotaoRemoverUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoRemoverUsuarioActionPerformed
        //Tratamento de exceção:
        try {
            //Pedindo as informações para a remoção do usuário:
            String nomeParaRemocao;
            String senhaParaRemocao;
            nomeParaRemocao = JOptionPane.showInputDialog("Informe o nome do usuário que deseja remover: ");
            senhaParaRemocao = JOptionPane.showInputDialog("Informe a senha para remoção: ");
            if (usuariobanco.verificarNome(nomeParaRemocao)==true){
                if (usuariobanco.verificarSenha(senhaParaRemocao)) {
                    //Removendo usuário:
                    usuariobanco.remover(nomeParaRemocao);
                } 
                else {
                    //Mensagem de senha inválida:
                    JOptionPane.showMessageDialog(null, "Senha inválida!");
                }
            } 
            else {
                //Mensagem de nome de usuário inválido:
                JOptionPane.showMessageDialog(null, "Nome de usuário inválido!");
            }
        } catch (Exception erro) {
            System.out.println("ERRO: " + erro);
        }
    }//GEN-LAST:event_BotaoRemoverUsuarioActionPerformed

    private void aux7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aux7ActionPerformed

    }//GEN-LAST:event_aux7ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastrarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BoataoCadastrar;
    private javax.swing.JButton BotaoExibir;
    private javax.swing.JButton BotaoRemoverUsuario;
    private javax.swing.JButton Sair;
    private javax.swing.JTextField aux1;
    private javax.swing.JTextField aux2;
    private javax.swing.JFormattedTextField aux3;
    private javax.swing.JFormattedTextField aux4;
    private javax.swing.JTextField aux5;
    private javax.swing.JPasswordField aux6;
    private javax.swing.JComboBox<String> aux7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}