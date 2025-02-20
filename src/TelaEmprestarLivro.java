import java.util.*;
import javax.swing.JOptionPane;

public class TelaEmprestarLivro extends javax.swing.JFrame {
   
    public TelaEmprestarLivro() {
        initComponents();
    }
        EmprestarLivroDAO emprestimosbanco = new EmprestarLivroDAO();
        CadastrarExemplarDAO exemplarbanco = new CadastrarExemplarDAO();
        CadastrarUsuarioDAO usuariosbanco = new CadastrarUsuarioDAO();
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        aux1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        aux2 = new javax.swing.JTextField();
        BotaoConsultar = new javax.swing.JButton();
        BotaoEmprestar = new javax.swing.JButton();
        BotaoSair = new javax.swing.JButton();
        BotaoDevolver = new javax.swing.JButton();
        BotaoRemover = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jLabel1.setText("Emprestar Livro");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Digite os dados do empréstimo para continuar:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Código do exemplar:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Nome do usuário:");

        aux2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aux2ActionPerformed(evt);
            }
        });

        BotaoConsultar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BotaoConsultar.setText("Consultar");
        BotaoConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoConsultarActionPerformed(evt);
            }
        });

        BotaoEmprestar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BotaoEmprestar.setText("Emprestar");
        BotaoEmprestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoEmprestarActionPerformed(evt);
            }
        });

        BotaoSair.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BotaoSair.setText("Sair");
        BotaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSairActionPerformed(evt);
            }
        });

        BotaoDevolver.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BotaoDevolver.setText("Devolver");
        BotaoDevolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoDevolverActionPerformed(evt);
            }
        });

        BotaoRemover.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BotaoRemover.setText("Remover");
        BotaoRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoRemoverActionPerformed(evt);
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
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(aux1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(BotaoConsultar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(aux2)
                                .addContainerGap())
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addComponent(BotaoRemover)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                                .addComponent(BotaoSair)
                                .addGap(15, 15, 15))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BotaoEmprestar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BotaoDevolver)
                                .addGap(90, 90, 90))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(156, 156, 156))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(111, 111, 111))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(aux1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(aux2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotaoEmprestar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BotaoDevolver))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoSair)
                    .addComponent(BotaoConsultar)
                    .addComponent(BotaoRemover))
                .addContainerGap())
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
    }// </editor-fold>//GEN-END:initComponents

    private void aux2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aux2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aux2ActionPerformed

    private void BotaoConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoConsultarActionPerformed
        // TODO add your handling code here:
        emprestimosbanco.exibirEmprestimos();
    }//GEN-LAST:event_BotaoConsultarActionPerformed

    private void BotaoEmprestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoEmprestarActionPerformed
        // Tratamento de exceção:
        try {
            //Transferindo as informações digitadas para variáveis:
            String codigoExemplar = aux1.getText();
            String nomeUsuario = aux2.getText();
            
            //Verificando se o nome de usuário existe:
            boolean verificarNome = usuariosbanco.verificarNome(nomeUsuario);
            if (verificarNome == true) {
                //Verificando se este exemplar já foi emprestado:
                if (emprestimosbanco.getCodigo(codigoExemplar).equalsIgnoreCase(codigoExemplar)) {
                    //Se sim, mensagem informando que o empréstimo já foi realizado:
                    JOptionPane.showMessageDialog(null, "Este exemplar já foi emprestado!");
                } 
                else {
                    //Verificando se o código do exemplar digitado existe:
                    if (exemplarbanco.verificarCodigo(codigoExemplar) == true) {
                        //Se sim, realizando o empréstimo:
                        EmprestarLivro emprestarLivro = new EmprestarLivro(codigoExemplar, nomeUsuario);
                        //Verificar se a senha digitada está correta:
                        if (emprestarLivro.getSenha().equalsIgnoreCase(usuariosbanco.retornarSenhaNomeUsuario(nomeUsuario))) {
                            //Se sim, empréstimo cadastrado:
                            emprestimosbanco.inserirEmprestimo(emprestarLivro);
                        }
                        else{
                            //Se não, mensagem de 'erro':
                            JOptionPane.showMessageDialog(null, "Senha inválida! Empréstimo não realizado");
                        }
                    } else {
                        //Se não, empréstimo não realizado:
                        JOptionPane.showMessageDialog(null, "Empréstimo não realizado!");
                    }
                }
            }
            //Mensagem de não há usuário cadastrado com o nome digitado:
            else{
                JOptionPane.showMessageDialog(null, "Não há um usuário cadastrado com esse nome!");
            }
        } catch (Exception erro) {
            System.out.println("ERRO: " + erro);
        }
    }//GEN-LAST:event_BotaoEmprestarActionPerformed

    private void BotaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSairActionPerformed
        // TODO add your handling code here:
       try{
           //Fechando a tela do empréstimo:
        dispose();
       } catch (Exception erro){
           System.out.println("ERRO: "+erro);
       }
    }//GEN-LAST:event_BotaoSairActionPerformed

    private void BotaoDevolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoDevolverActionPerformed
        //Lendo as informações para devolver o exemplar emprestado:
        String codigo;
        codigo = JOptionPane.showInputDialog("Informe o código do exemplar para devolvê-lo: ");
        String senha = JOptionPane.showInputDialog("Informe a senha para remoção: ");
        //Verificando se há algum empréstimo com o código digitado:
        if(codigo.equalsIgnoreCase(emprestimosbanco.getCodigo(codigo))){
            if(senha.equalsIgnoreCase(emprestimosbanco.getSenha(senha))){
            emprestimosbanco.devolverLivro(codigo);
            }
            else{
                JOptionPane.showMessageDialog(null, "Senha inválida!");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Código inválido!");
        }
    }//GEN-LAST:event_BotaoDevolverActionPerformed

    private void BotaoRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoRemoverActionPerformed
        //Lendo as informações para remover empréstimo:
        String codigoParaRemocao;
        codigoParaRemocao = JOptionPane.showInputDialog("Informe o código para remoção: ");
        String senha = JOptionPane.showInputDialog("Informe a senha para remoção: ");
        if (codigoParaRemocao.equalsIgnoreCase(emprestimosbanco.getCodigo(codigoParaRemocao))) {
            if (senha.equalsIgnoreCase(emprestimosbanco.getSenha(senha))) {
                emprestimosbanco.remover(codigoParaRemocao);
                JOptionPane.showMessageDialog(null, "Empréstimo revomido!");
            } else {
                JOptionPane.showMessageDialog(null, "Senha inválida! Empréstimo não removido!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Código inválido! Empréstimo não removido!");
        }
    }//GEN-LAST:event_BotaoRemoverActionPerformed

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
            java.util.logging.Logger.getLogger(TelaEmprestarLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEmprestarLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEmprestarLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEmprestarLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEmprestarLivro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoConsultar;
    private javax.swing.JButton BotaoDevolver;
    private javax.swing.JButton BotaoEmprestar;
    private javax.swing.JButton BotaoRemover;
    private javax.swing.JButton BotaoSair;
    private javax.swing.JTextField aux1;
    private javax.swing.JTextField aux2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
