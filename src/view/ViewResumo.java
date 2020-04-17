package view;

import Cientifico.Resumo;
import Situacao.Situacao;
import Submissoes.SubimissaoDAO;
import javax.swing.table.DefaultTableModel;
import model.dao.ResumoDAO;

public class ViewResumo extends javax.swing.JFrame {
 protected SubimissaoDAO s;
 Situacao situacao;
    
 public ViewResumo(SubimissaoDAO s) {
        initComponents();
        this.s = s;
        readJTable();
    }
  
      public void readJTable() {
        DefaultTableModel dtmSubimissao = (DefaultTableModel) jTable5.getModel();
dtmSubimissao.setNumRows(0);
 
       ResumoDAO rDao = new ResumoDAO();

        for (Resumo a : rDao.readResumo()) {
            dtmSubimissao.addRow(new Object[]{
              
                a.getTitulo(),
                a.getSituacao(),
                a.getAutor(),
                a.getInstituicao(),
               a.getP_chave()
             
            });
          }
      }
      
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JAutor = new javax.swing.JTextField();
        JInstituicao = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        JPalavra_chave = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JTitulo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        JSituacao = new javax.swing.JComboBox<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jButtonEDITAR = new javax.swing.JButton();
        Jexcluir = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Titulo", "Situação", "Autor", "Instiuição", "Palavra-chave", "Resumo", "AbstracT", "Duração", "Currículo", "Recursos", "Metodologia", "Tipo", "Orientador", "Curso", "Anol", "Nº Páginasl"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Titulo", "Situação", "Autor", "Instiuição", "Palavra-chave", "Resumo", "AbstracT", "Duração", "Currículo", "Recursos", "Metodologia", "Tipo", "Orientador", "Curso", "Anol", "Nº Páginasl"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Titulo", "Situação", "Autor", "Instiuição", "Palavra-chave", "Resumo", "AbstracT", "Duração", "Currículo", "Recursos", "Metodologia", "Tipo", "Orientador", "Curso", "Anol", "Nº Páginasl"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Titulo", "Situação", "Autor", "Instiuição", "Palavra-chave", "Resumo", "AbstracT", "Duração", "Currículo", "Recursos", "Metodologia", "Tipo", "Orientador", "Curso", "Anol", "Nº Páginasl"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Resumo");

        jLabel4.setText("Instituição");

        jLabel5.setText("Palavra-Chave");

        jLabel1.setText("Título");

        jLabel2.setText("Situação");

        jLabel3.setText("Autor");

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        JSituacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Situação", "Aprovado", "Reprovado", "SobAvaliação" }));
        JSituacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JSituacaoActionPerformed(evt);
            }
        });

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Titulo", "Situação", "Autor", "Instiuição", "Palavra-chave"
            }
        ));
        jTable5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable5MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTable5);

        jButtonEDITAR.setText("Editar");
        jButtonEDITAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEDITARActionPerformed(evt);
            }
        });

        Jexcluir.setText("Excluir");
        Jexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JexcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(JAutor)
                        .addComponent(JPalavra_chave, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(JInstituicao, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Jexcluir)
                        .addComponent(jButtonEDITAR)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 921, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(JSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(JInstituicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addComponent(JPalavra_chave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel5)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(JAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)
                                .addComponent(jButton1))
                            .addGap(18, 18, 18)
                            .addComponent(Jexcluir)
                            .addGap(32, 32, 32)
                            .addComponent(jButtonEDITAR))))
                .addGap(67, 67, 67)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                .addGap(61, 61, 61))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       Resumo a = new Resumo();
        ResumoDAO DAO = new ResumoDAO();
        
        
        a.setTitulo(JTitulo.getText());
        a.setSituacao((String) JSituacao.getSelectedItem());
        a.setAutor(JAutor.getText());
        a.setInstituicao(JInstituicao.getText());
        a.setPalavraChave(JPalavra_chave.getText());
        
        
         DAO.cadastrar(a);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void JSituacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JSituacaoActionPerformed
        String selecionado = (String) JSituacao.getSelectedItem();
        if (selecionado == "Aprovado"){
            Situacao Aprovado = situacao.Aprovado;
    }//GEN-LAST:event_JSituacaoActionPerformed
else if(selecionado == "Reprovado"){
        Situacao Aprovado = situacao.Reprovado;
    } else if(selecionado == "SobAvaliação"){
        Situacao Aprovado = situacao.SobAvaliacao;
    }
        
    }   
        
    private void jButtonEDITARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEDITARActionPerformed

        if(jTable5.getSelectedRow() != -1){

           Resumo a = new Resumo();
        ResumoDAO DAO = new ResumoDAO();
        
        
        a.setTitulo(JTitulo.getText());
        a.setSituacao((String) JSituacao.getSelectedItem());
        a.setAutor(JAutor.getText());
        a.setInstituicao(JInstituicao.getText());
        a.setPalavraChave(JPalavra_chave.getText());

            DAO.editar(a);
        }
    }//GEN-LAST:event_jButtonEDITARActionPerformed

    private void JexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JexcluirActionPerformed

        if(jTable1.getSelectedRow() != -1){

           Resumo a = new Resumo();
            DefaultTableModel dtmSubimissao = (DefaultTableModel) jTable1.getModel();
            ResumoDAO DAO = new ResumoDAO();
            a.setTitulo(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());

            DAO.remover(a);
            dtmSubimissao.removeRow(jTable1.getSelectedRow());

    }//GEN-LAST:event_JexcluirActionPerformed
   }
    private void jTable5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable5MouseClicked
  if(jTable5.getSelectedRow() != -1){
        JTitulo.setText(jTable5.getValueAt(jTable5.getSelectedRow(), 0).toString());

       }
    }//GEN-LAST:event_jTable5MouseClicked

 
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JAutor;
    private javax.swing.JTextField JInstituicao;
    private javax.swing.JTextField JPalavra_chave;
    private javax.swing.JComboBox<String> JSituacao;
    private javax.swing.JTextField JTitulo;
    private javax.swing.JButton Jexcluir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonEDITAR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    // End of variables declaration//GEN-END:variables

}
