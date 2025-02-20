import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class LoginESenha extends javax.swing.JFrame {

    CadastrarUsuarioDAO usuariosBanco = new CadastrarUsuarioDAO();
    EmprestarLivroDAO emprestimosbanco = new EmprestarLivroDAO();
    CadastrarLivroDAO livrosbanco = new CadastrarLivroDAO();
    CadastrarExemplarDAO exemplaresbanco = new CadastrarExemplarDAO();
    private Usuario usuarioLogado;

    public LoginESenha() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        aux1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        aux2 = new javax.swing.JPasswordField();
        BotaoConfirmar = new javax.swing.JButton();
        BotaoSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jLabel1.setText("Sistema Online Biblioteca");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Digite seus dados para continuar: ");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Usuário: ");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Senha:");

        BotaoConfirmar.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        BotaoConfirmar.setText("Confirmar");
        BotaoConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoConfirmarActionPerformed(evt);
            }
        });

        BotaoSair.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        BotaoSair.setText("Sair");
        BotaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aux1)
                            .addComponent(aux2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(BotaoConfirmar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotaoSair)
                        .addGap(36, 36, 36)))
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(114, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(144, 144, 144))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(109, 109, 109))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(aux1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(aux2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoConfirmar)
                    .addComponent(BotaoSair))
                .addGap(42, 42, 42))
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

    private void BotaoConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoConfirmarActionPerformed
        //Exbir menu do usuário:
        this.menuUsuario();
    }//GEN-LAST:event_BotaoConfirmarActionPerformed

    private void BotaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSairActionPerformed
        //Sair do login
        try {
            setVisible(false);
        } catch (Exception erro) {
            System.out.println("ERRO: " + erro);
        }
    }//GEN-LAST:event_BotaoSairActionPerformed

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
            java.util.logging.Logger.getLogger(LoginESenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginESenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginESenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginESenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginESenha().setVisible(true);
            }
        });
    }

    public void menuUsuario() {
        try {
            //Transferindo as informações digitadas para variáveis:
            String usuario = aux1.getText();
            String senha = new String(aux2.getPassword());
            Usuario usuarioEncontrado = null;
            if (getUsuarioLogado() == null) {
                    usuarioEncontrado = usuariosBanco.getUsuario(usuario);
            } else {
                usuarioEncontrado = getUsuarioLogado();
            }
            if (usuarioEncontrado != null) {
                if (usuarioEncontrado.getSenha().equalsIgnoreCase(senha)) {
                    if (getUsuarioLogado() == null) {
                        JOptionPane.showMessageDialog(null, "Login realizado com sucesso!");
                        this.setUsuarioLogado(usuarioEncontrado);
                    }
                    int opcao;
                    String aux;
                    if (usuariosBanco.getTipoUsuario(usuario) == true) {
                        aux = JOptionPane.showInputDialog("Menu"
                                + "\n1- Cadastrar Livro."
                                + "\n2- Notificação por email."
                                + "\n3- Realizar empréstimo."
                                + "\n4- Consultar empréstimos."
                                + "\n5- Consultar acervo de livros."
                                + "\n6- Consultar exemplares."
                                + "\n7- Consultar usuários cadastrados."
                                + "\n8- Consultas específicas (Banco de dados)."
                                + "\n0- Sair."
                                + "\nEscolha uma opção");
                        opcao = Integer.parseInt(aux);
                        if (opcao == 1) {
                            //Direcionando para a tela de cadastrar livro:
                            TelaCadastrarLivro telaCadastrarLivro = new TelaCadastrarLivro();
                            telaCadastrarLivro.setVisible(true);
                            setVisible(false);
                        } else if (opcao == 2) {
                            //Notificação por email
                            if (emprestimosbanco != null) {
                                String nome = JOptionPane.showInputDialog("Informe o nome do usuário para ser notificado: ");
                                boolean verificarNome = emprestimosbanco.verificarNome(nome);
                                String cod = JOptionPane.showInputDialog("Informe o código do exemplar emprestado: ");
                                boolean verificarCodigo = emprestimosbanco.verificarCodigo(cod);
                                boolean verificarStatus = emprestimosbanco.verificarStatus(nome, cod, "Pendente");
                                if (verificarNome == true) {
                                    if (verificarCodigo == true) {
                                        if (verificarStatus == true) {
                                            Calendar calendar2 = Calendar.getInstance();
                                            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                                            Date date = new Date();
                                            String dataAtual = dateFormat.format(date);
                                            String dataPrevistaDevo = emprestimosbanco.getDataDevolucao(cod, nome);
                                            LocalDate dataPrevistaParaDevolucao = null;
                                            LocalDate dataDevolucao = null;
                                            try {
                                                dataPrevistaParaDevolucao = LocalDate.parse(dataPrevistaDevo, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                                                dataDevolucao = LocalDate.parse(dataAtual, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                                            } catch (Exception erro) {
                                                System.out.println("ERRO: " + erro);
                                            }
                                            if (dataDevolucao.isAfter(dataPrevistaParaDevolucao)) {
                                                // Notificando que a devolução está atrasada
                                                NotificacaoAtrasoNaDevolucao telaAtrasoDevolucao = new NotificacaoAtrasoNaDevolucao();
                                                telaAtrasoDevolucao.setVisible(true);
                                                setVisible(false);
                                            } else if (dataDevolucao.isBefore(dataPrevistaParaDevolucao)) {
                                                // Notificando que não há atraso na devolução
                                                NotificacaoNaoChegouADataDaDevolucao telaNaoChegouDataDevolucao = new NotificacaoNaoChegouADataDaDevolucao();
                                                telaNaoChegouDataDevolucao.setVisible(true);
                                                setVisible(false);
                                            } else if (dataPrevistaParaDevolucao.isEqual(dataDevolucao)) {
                                                // Notificando que a data de devolução é hoje
                                                NotificacaoDevolucaoVenceHoje telaNotificacaoVencimentoDevolucao = new NotificacaoDevolucaoVenceHoje();
                                                telaNotificacaoVencimentoDevolucao.setVisible(true);
                                                setVisible(false);
                                            }
                                        } else {
                                            // Notificando que o exemplar foi devolvido
                                            NotificacaoDevolucaoRealizada telaNotificacaoDevolucaoRealizada = new NotificacaoDevolucaoRealizada();
                                            telaNotificacaoDevolucaoRealizada.setVisible(true);
                                            setVisible(false);
                                        }
                                    } else {
                                        //Mensagem de código inválido:
                                        JOptionPane.showMessageDialog(null, "Código de exemplar inválido! Não há nenhum empréstimo com esse exemplar!");
                                    }
                                } else {
                                    //Mensagem de nome de usuário inválido:
                                    JOptionPane.showMessageDialog(null, "Nome de usuário inválido! Não há nenhum empréstimo com esse usuário!");
                                }
                            }
                        } else if (opcao == 3) {
                            //Direcionando para a tela de emprestar livro:
                            TelaEmprestarLivro telaEmprestarLivro = new TelaEmprestarLivro();
                            telaEmprestarLivro.setVisible(true);
                            setVisible(false);
                        } else if (opcao == 4) {
                            //Exibir empréstimos em uma única tela:
                            ExibirEmprestimos exibirEmprestimos = new ExibirEmprestimos();
                            exibirEmprestimos.setVisible(true);
                            setVisible(false);
                        } else if (opcao == 5) {
                            //Exibindo livros em uma única tela:
                            ExibirLivros exibirLivros = new ExibirLivros();
                            exibirLivros.setVisible(true);
                            setVisible(false);
                        } else if (opcao == 6) {
                            //Exibindo exemplares em uma única tela:
                            ExibirExemplares exibirExemplares = new ExibirExemplares();
                            exibirExemplares.setVisible(true);
                            setVisible(false);
                        } else if (opcao == 7) {
                            //Exibindo usuários em uma única tela:
                            ExibirUsuarios exibirUsuarios = new ExibirUsuarios();
                            exibirUsuarios.setVisible(true);
                            setVisible(false);
                        } else if (opcao == 8) {
                            //Consultas pedidas da disciplina de Banco de dados:
                            String aux2;
                            int op;
                            aux2 = JOptionPane.showInputDialog("\nMenu:"
                                    + "\n1- Consultar todos os usuários que tem em alguma parte do nome com um nome específico"
                                    + "\n2- Mostrar todos os empréstimos realizados determinado período de tempo"
                                    + "\n3- Mostrar quantos usuários estão cadastrados."
                                    + "\n4- Mostrar quantos livros estão cadastrados."
                                    + "\n5- Mostrar quantos exemplares estão cadastrados."
                                    + "\n6- Mostrar quantos empréstimos foram realizados."
                                    + "\n7- Mostrar livros de um determinado autor e um determinado gênero."
                                    + "\nEscolha uma opção: ");
                            op = Integer.parseInt(aux2);
                            if (op == 1) {
                                //Consultar usuários de nome específicos:
                                ExibirUsuariosEspecificos telaExibirUsuariosEspecificos = new ExibirUsuariosEspecificos();
                                telaExibirUsuariosEspecificos.setVisible(true);
                            } 
                            else if (op == 2) {
                                //Consultar empréstimos de um determinado período de tempo:
                                ExibirEmprestimosEspecificos telaEmprestimosEspecificos = new ExibirEmprestimosEspecificos();
                                telaEmprestimosEspecificos.setVisible(true);
                            } 
                            else if (op == 3) {
                                //Consultar quantidade usuários cadastrados:
                                JOptionPane.showMessageDialog(null, "A quantidade de usuários cadastrados é: "+usuariosBanco.quantidadeUsuariosCadastrados());
                            } 
                            else if (op == 4) {
                                //Consultar quantidade de livros cadastrados:
                                JOptionPane.showMessageDialog(null, "A quantidade de livros cadastrados é: "+livrosbanco.quantidadeLivrosCadastrados());
                            } 
                            else if (op == 5) {
                                //Consultar quantidade exemplares cadastrados:
                                JOptionPane.showMessageDialog(null, "A quantidade de exemplares cadastrados é: "+exemplaresbanco.quantidadeExemplaresCadastrados());
                            } 
                            else if (op == 6) {
                                //Consultar quantidade de empréstimos cadastrados:
                                JOptionPane.showMessageDialog(null, "A quantidade de empréstimos realizados é: "+emprestimosbanco.quantidadeEmprestimosRealizados());
                            } 
                            else if (op == 7) {
                                //Consultar livros de determinado autor e determinado gênero:
                                ExibirLivrosEspecificos telaExibirLivrosEspecificos = new ExibirLivrosEspecificos();
                                telaExibirLivrosEspecificos.setVisible(true);
                            }
                            else {
                                //Mensagem de opção inválida:
                                JOptionPane.showMessageDialog(null, "Opção inválida!");
                                setVisible(true);
                            }
                        } 
                        else if (opcao == 0) {
                            //Saindo do login:
                            setVisible(false);
                            setUsuarioLogado(null);
                        } else {
                            //Mensagem de opção inválida:
                            JOptionPane.showMessageDialog(null, "Opção inválida!");
                            setVisible(false);
                        }
                    } else if (usuariosBanco.getTipoUsuario(usuario) == false) {
                        aux = JOptionPane.showInputDialog("Menu:"
                                + "\n1- Consultar acervo de livros da biblioteca."
                                + "\n2- Realizar Empréstimo."
                                + "\n3- Consultar empréstimos."
                                + "\n4- Consultar exemplares."
                                + "\n5- Consultas específicas (Banco de dados)."
                                + "\n6- Notificação por email."
                                + "\n0- Sair."
                                + "\nEscolha uma opção: ");
                        opcao = Integer.parseInt(aux);
                        if (opcao == 1) {
                            //Consultar acervo
                            //Consultar livros em uma única tela:
                            ExibirLivros exibirLivros = new ExibirLivros();
                            exibirLivros.setVisible(true);
                            setVisible(false);
                        } else if (opcao == 2) {
                            //Realizar empréstimo
                            TelaEmprestarLivro telaEmprestarLivro = new TelaEmprestarLivro();
                            telaEmprestarLivro.setVisible(true);
                            setVisible(false);
                        } else if (opcao == 3) {
                            //Consultar empréstimos em uma única tela:
                            ExibirEmprestimos exibirEmprestimos = new ExibirEmprestimos();
                            exibirEmprestimos.setVisible(true);
                            setVisible(false);
                        } else if (opcao == 4) {
                            //Consultar exemplares em uma única tela:
                            ExibirExemplares exibirExemplares = new ExibirExemplares();
                            exibirExemplares.setVisible(true);
                            setVisible(false);
                        } else if (opcao == 5) {
                            //Consultas pedidas da disciplina de Banco de dados:
                            String aux2;
                            int op;
                            aux2 = JOptionPane.showInputDialog("\nMenu:"
                                    + "\n1- Mostrar todos os empréstimos realizados entre determinados dias."
                                    + "\n2- Mostrar quantos usuários estão cadastrados."
                                    + "\n3- Mostrar quantos livros estão cadastrados."
                                    + "\n4- Mostrar quantos exemplares estão cadastrados."
                                    + "\n5- Mostrar quantos empréstimos foram realizados."
                                    + "\n6- Mostrar livros de um determinado autor e um determinado gênero."
                                    + "\nEscolha uma opção: ");
                            op = Integer.parseInt(aux2);
                            if (op == 1) {
                                //Consultar empréstimos de um determinado período de tempo:
                                ExibirEmprestimosEspecificos telaexibirEmprestimosEspecificos = new ExibirEmprestimosEspecificos();
                                telaexibirEmprestimosEspecificos.setVisible(true);
                            } else if (op == 2) {
                                //Consultar quantidade usuários cadastrados:
                                JOptionPane.showMessageDialog(null, "A quantidade de usuários cadastrados é: "+usuariosBanco.quantidadeUsuariosCadastrados());
                            } else if (op == 3) {
                                //Consultar quantidade de livros cadastrados:
                                JOptionPane.showMessageDialog(null, "A quantidade de livros cadastrados é: "+livrosbanco.quantidadeLivrosCadastrados());
                            } else if (op == 4) {
                                //Consultar quantidade exemplares cadastrados:
                                JOptionPane.showMessageDialog(null, "A quantidade de exemplares cadastrados é: "+exemplaresbanco.quantidadeExemplaresCadastrados());
                            } else if (op == 5) {
                                //Consultar quantidade de empréstimos cadastrados:
                                JOptionPane.showMessageDialog(null, "A quantidade de empréstimos realizados é: "+emprestimosbanco.quantidadeEmprestimosRealizados());
                            } else if (op == 6) {
                                //Consultar livros de um determinado autor e determinado gênero:
                                ExibirLivrosEspecificos telaExibirLivrosEspecificos = new ExibirLivrosEspecificos();
                                telaExibirLivrosEspecificos.setVisible(true);
                            } 
                            else {
                                //Mensagem de opção inválida:
                                JOptionPane.showMessageDialog(null, "Opção inválida!");
                                setVisible(true);
                            }
                        } 
                        else if (opcao == 6) {
                            //Notificação por email
                            if (emprestimosbanco != null) {
                                String nome = JOptionPane.showInputDialog("Informe o nome do usuário para ser notificado: ");
                                boolean verificarNome = emprestimosbanco.verificarNome(nome);
                                String cod = JOptionPane.showInputDialog("Informe o código do exemplar emprestado: ");
                                boolean verificarCodigo = emprestimosbanco.verificarCodigo(cod);
                                boolean verificarStatus = emprestimosbanco.verificarStatus(nome, cod, "Pendente");
                                if (verificarNome == true) {
                                    if (verificarCodigo == true) {
                                        if (verificarStatus == true) {
                                            // Data de devolução
                                            Calendar calendar2 = Calendar.getInstance();
                                            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                                            Date date = new Date();
                                            String dataAtual = dateFormat.format(date);
                                            String dataPrevistaDevo = emprestimosbanco.getDataDevolucao(cod, nome);
                                            LocalDate dataPrevistaParaDevolucao = null;
                                            LocalDate dataDevolucao = null;
                                            try {
                                                dataPrevistaParaDevolucao = LocalDate.parse(dataPrevistaDevo, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                                                dataDevolucao = LocalDate.parse(dataAtual, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                                            } catch (Exception erro) {
                                                System.out.println("ERRO: " + erro);
                                            }
                                            if (dataDevolucao.isAfter(dataPrevistaParaDevolucao)) {
                                                // Notificando que a devolução está atrasada
                                                NotificacaoAtrasoNaDevolucao telaAtrasoDevolucao = new NotificacaoAtrasoNaDevolucao();
                                                telaAtrasoDevolucao.setVisible(true);
                                                setVisible(false);
                                            } else if (dataDevolucao.isBefore(dataPrevistaParaDevolucao)) {
                                                // Notificando que não há atraso na devolução
                                                NotificacaoNaoChegouADataDaDevolucao telaNaoChegouDataDevolucao = new NotificacaoNaoChegouADataDaDevolucao();
                                                telaNaoChegouDataDevolucao.setVisible(true);
                                                setVisible(false);
                                            } else if (dataPrevistaParaDevolucao.isEqual(dataDevolucao)) {
                                                // Notificando que a data de devolução é hoje
                                                NotificacaoDevolucaoVenceHoje telaNotificacaoVencimentoDevolucao = new NotificacaoDevolucaoVenceHoje();
                                                telaNotificacaoVencimentoDevolucao.setVisible(true);
                                                setVisible(false);
                                            }
                                        } else {
                                            // Notificando que o exemplar foi devolvido
                                            NotificacaoDevolucaoRealizada telaNotificacaoDevolucaoRealizada = new NotificacaoDevolucaoRealizada();
                                            telaNotificacaoDevolucaoRealizada.setVisible(true);
                                            setVisible(false);
                                        }
                                    } else {
                                        //Mensagem de código inválido:
                                        JOptionPane.showMessageDialog(null, "Código de exemplar inválido! Não há nenhum empréstimo com esse exemplar!");
                                    }
                                } else {
                                    //Mensagem de nome de usuário inválido:
                                    JOptionPane.showMessageDialog(null, "Nome de usuário inválido! Não há nenhum empréstimo com esse usuário!");
                                }
                            }
                        } 
                        else if (opcao == 0) {
                            //Saindo do login:
                            setUsuarioLogado(null);
                            setVisible(false);
                        } 
                        else {
                            //Mensagem de opção inválida:
                            JOptionPane.showMessageDialog(null, "Opção inválida!");
                        }
                    }
                } else {
                    //Mensagem de senha inválida:
                    JOptionPane.showMessageDialog(null, "Senha inválida!");
                }
            } else {
                //Mensagem de nome de usuário inválido:
                JOptionPane.showMessageDialog(null, "Usuário inválido!");
            }
        } catch (Exception erro) {
            System.out.println("ERRO: " + erro);
        }
        //dispose();
        setVisible(false);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoConfirmar;
    private javax.swing.JButton BotaoSair;
    private javax.swing.JTextField aux1;
    private javax.swing.JPasswordField aux2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the usuarioLogado
     */
    public Usuario getUsuarioLogado() {
        return usuarioLogado;
    }

    /**
     * @param usuarioLogado the usuarioLogado to set
     */
    public void setUsuarioLogado(Usuario usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
    }
}
