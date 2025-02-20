import java.util.*;
import javax.swing.JOptionPane;

public class TelaCadastrarLivro extends javax.swing.JFrame {

    CadastrarLivroDAO livrobanco = new CadastrarLivroDAO();
    CadastrarExemplarDAO exemplarbanco = new CadastrarExemplarDAO();

    /**
     * Creates new form TelaCadastrarLivro
     */
    public TelaCadastrarLivro() {
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
        isbn = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        aux1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        aux2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        aux3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        aux4 = new javax.swing.JTextField();
        FinalizarCadastroLivro = new javax.swing.JButton();
        CadastrarExemplar = new javax.swing.JButton();
        ExibirLivros = new javax.swing.JButton();
        SairDaTelaCadastrarLivro = new javax.swing.JButton();
        BoataoRemoverLivro = new javax.swing.JButton();
        BotaoExibirExemplar = new javax.swing.JButton();
        BotaoRemoverExemplar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        isbn.setBackground(new java.awt.Color(255, 204, 255));

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jLabel1.setText("Cadastrar Livro ");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("ISBN:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Título: ");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Autor: ");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Gênero:");

        FinalizarCadastroLivro.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        FinalizarCadastroLivro.setText("Cadastrar");
        FinalizarCadastroLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinalizarCadastroLivroActionPerformed(evt);
            }
        });

        CadastrarExemplar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        CadastrarExemplar.setText("Cadastrar Exemplar");
        CadastrarExemplar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarExemplarActionPerformed(evt);
            }
        });

        ExibirLivros.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        ExibirLivros.setText("Exibir Livro");
        ExibirLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExibirLivrosActionPerformed(evt);
            }
        });

        SairDaTelaCadastrarLivro.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        SairDaTelaCadastrarLivro.setText("Sair");
        SairDaTelaCadastrarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairDaTelaCadastrarLivroActionPerformed(evt);
            }
        });

        BoataoRemoverLivro.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BoataoRemoverLivro.setText("Remover Livro");
        BoataoRemoverLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoataoRemoverLivroActionPerformed(evt);
            }
        });

        BotaoExibirExemplar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BotaoExibirExemplar.setText("Exibir exemplar");
        BotaoExibirExemplar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoExibirExemplarActionPerformed(evt);
            }
        });

        BotaoRemoverExemplar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BotaoRemoverExemplar.setText("Remover exemplar");
        BotaoRemoverExemplar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoRemoverExemplarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout isbnLayout = new javax.swing.GroupLayout(isbn);
        isbn.setLayout(isbnLayout);
        isbnLayout.setHorizontalGroup(
            isbnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(isbnLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(isbnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(isbnLayout.createSequentialGroup()
                        .addGroup(isbnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(isbnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aux2)
                            .addComponent(aux1)))
                    .addGroup(isbnLayout.createSequentialGroup()
                        .addGroup(isbnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(isbnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aux3)
                            .addGroup(isbnLayout.createSequentialGroup()
                                .addComponent(aux4)
                                .addGap(153, 153, 153))))
                    .addGroup(isbnLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BotaoExibirExemplar)
                        .addGap(36, 36, 36)
                        .addComponent(BotaoRemoverExemplar)))
                .addContainerGap())
            .addGroup(isbnLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(isbnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(isbnLayout.createSequentialGroup()
                        .addComponent(CadastrarExemplar)
                        .addContainerGap(341, Short.MAX_VALUE))
                    .addGroup(isbnLayout.createSequentialGroup()
                        .addComponent(FinalizarCadastroLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(ExibirLivros)
                        .addGap(41, 41, 41)
                        .addComponent(BoataoRemoverLivro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SairDaTelaCadastrarLivro)
                        .addGap(20, 20, 20))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, isbnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(162, 162, 162))
        );
        isbnLayout.setVerticalGroup(
            isbnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(isbnLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(isbnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(aux1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(isbnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(aux2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(isbnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(aux3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(isbnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(aux4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(isbnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FinalizarCadastroLivro)
                    .addComponent(ExibirLivros)
                    .addComponent(BoataoRemoverLivro)
                    .addComponent(SairDaTelaCadastrarLivro))
                .addGap(32, 32, 32)
                .addGroup(isbnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoExibirExemplar)
                    .addComponent(BotaoRemoverExemplar)
                    .addComponent(CadastrarExemplar))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(isbn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(isbn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void FinalizarCadastroLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinalizarCadastroLivroActionPerformed
        // TODO add your handling code here:
        try {
            //Transferindo as informações para variáveis:
            String isbn = aux1.getText();
            String titulo = aux2.getText();
            String autor = aux3.getText();
            String genero = aux4.getText();
            
            //Verificando se já existe algum livro com o ISBN digitado:
            if (livrobanco.getIsbn(isbn).equalsIgnoreCase(isbn)){
                //Se sim, cadastro de livro não realizado:
                JOptionPane.showMessageDialog(null, "Já existe um livro cadastrado com este ISBN!");
            } 
            else {
                //Se não, cadastro realizado:
                CadastrarLivro livro = new CadastrarLivro(isbn, titulo, autor, genero);
                livrobanco.inserirLivro(livro);
            }
        } catch (Exception erro) {
            System.out.println("ERRO: " + erro);
        }
    }//GEN-LAST:event_FinalizarCadastroLivroActionPerformed

    private void CadastrarExemplarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarExemplarActionPerformed
        // TODO add your handling code here:
        try {
            //Lendo as informações do exemplar:
            String isbnChecagem;
            String codigoExemplar;
            isbnChecagem = JOptionPane.showInputDialog("Informe o ISBN do livro para cadastrar exemplar deste livro: ");
            codigoExemplar = JOptionPane.showInputDialog("Informe o código do exemplar que deseja cadastrar: ");
            
            //Verificando se já existe algum exemplar com o código ou ISBN digitado:
            boolean verificarisbn = livrobanco.verificarisbn(isbnChecagem);
            boolean verificarcodigo = exemplarbanco.verificarCodigo(codigoExemplar);
            if (verificarisbn == true) {
                if (verificarcodigo == true) {
                    //Se já existe, cadastro não realizado:
                    JOptionPane.showMessageDialog(null, "Código inválido! Já há um exemplar cadastrado com este código!");
                } 
                else {
                    //Se não existe, cadastro realizado:
                    CadastrarExemplar cadastrarExemplar = new CadastrarExemplar(isbnChecagem, codigoExemplar);
                    exemplarbanco.inserirExemplar(cadastrarExemplar);
                    JOptionPane.showMessageDialog(null, "\n Exemplar inserido com sucesso!");
                }
            } 
            else {
                //Mensagem de ISBN inválido:
                JOptionPane.showMessageDialog(null, "ISBN inválido!");
            }
        } catch (Exception erro) {
            System.out.println("ERRO: " + erro);
        }
    }//GEN-LAST:event_CadastrarExemplarActionPerformed

    private void SairDaTelaCadastrarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairDaTelaCadastrarLivroActionPerformed
        // TODO add your handling code here:
        try {
            //Fechando a tela de cadastrar livro:
            dispose();
        } catch (Exception erro) {
            System.out.println("ERRO: " + erro);
        }
    }//GEN-LAST:event_SairDaTelaCadastrarLivroActionPerformed

    private void ExibirLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExibirLivrosActionPerformed
        //Tratamento de exceção:
        try {
            //Exibindo todos os livros separadamente:
            livrobanco.consultarTudo();
        } catch (Exception erro) {
            System.out.println("ERRO: " + erro);
        }
    }//GEN-LAST:event_ExibirLivrosActionPerformed

    private void BoataoRemoverLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoataoRemoverLivroActionPerformed
        //Lendo as informações para remoção:
        String isbnParaRemocao;
        isbnParaRemocao = JOptionPane.showInputDialog("Informe o ISBN do livro para a remoção: ");
        try {
            //Verificando se o ISBN é válido:
            if (livrobanco.getIsbn(isbnParaRemocao).equalsIgnoreCase(isbnParaRemocao)) {
                //Se sim, livro removido:
                livrobanco.remover(isbnParaRemocao);
                JOptionPane.showMessageDialog(null, "Livro removido com sucesso!");
            } else {
                //Se não, mensagem de ISBN inválido e remoção não realizada:
                JOptionPane.showMessageDialog(null, "ISBN inválido!");
            }
        } catch (Exception erro) {
            System.out.println("ERRO: " + erro);
        }
    }//GEN-LAST:event_BoataoRemoverLivroActionPerformed

    private void BotaoExibirExemplarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoExibirExemplarActionPerformed
        //Exibir todos os exemplares separadamente:
        exemplarbanco.consultarTudo();
    }//GEN-LAST:event_BotaoExibirExemplarActionPerformed

    private void BotaoRemoverExemplarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoRemoverExemplarActionPerformed
        //Tratamente de exceção:
        try {
            //Lendo as informações para remoção:
            String codigoParaRemocao;
            codigoParaRemocao = JOptionPane.showInputDialog("Informe o código do exemplar para remover: ");
            //Verificando se o código é válido:
            boolean verificarcodigo = exemplarbanco.verificarCodigo(codigoParaRemocao);
            //Verificando se o código é válido:
            if(verificarcodigo == true){
                //Se sim, removendo exemplar:
                 exemplarbanco.remover(codigoParaRemocao);
                 JOptionPane.showMessageDialog(null, "Exemplar removido com sucesso!");
            }
            else{
                //Se não, remoção não realizada e mensagem de código inválido:
                JOptionPane.showMessageDialog(null, "Código inválido!");
            }
        } catch (Exception erro) {
            System.out.println("ERRO: " + erro);
        }
    }//GEN-LAST:event_BotaoRemoverExemplarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastrarLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrarLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrarLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrarLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastrarLivro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BoataoRemoverLivro;
    private javax.swing.JButton BotaoExibirExemplar;
    private javax.swing.JButton BotaoRemoverExemplar;
    private javax.swing.JButton CadastrarExemplar;
    private javax.swing.JButton ExibirLivros;
    private javax.swing.JButton FinalizarCadastroLivro;
    private javax.swing.JButton SairDaTelaCadastrarLivro;
    private javax.swing.JTextField aux1;
    private javax.swing.JTextField aux2;
    private javax.swing.JTextField aux3;
    private javax.swing.JTextField aux4;
    private javax.swing.JPanel isbn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}