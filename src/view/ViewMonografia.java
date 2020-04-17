package view;

import Cientifico.Artigo;
import Cientifico.Monografia;
import Situacao.Situacao;
import Submissoes.SubimissaoDAO;
import javax.swing.table.DefaultTableModel;
import model.dao.ArtigoDAO;
import model.dao.MonografiaDAO;

/**
 *
 * @author Thalis Antunes
 */
public class ViewMonografia extends javax.swing.JFrame {
  protected SubimissaoDAO s;
  Situacao situacao;

    public ViewMonografia(SubimissaoDAO  s) {
        this.s = s;
        initComponents();
       readJTable(); 
    }
 public void readJTable() {
        DefaultTableModel dtmSubimissao = (DefaultTableModel) jTable1.getModel();
dtmSubimissao.setNumRows(0);
  MonografiaDAO mDao = new MonografiaDAO();

        for (Monografia a : mDao.readMonografia()) {
            dtmSubimissao.addRow(new Object[]{
                a.getTitulo(),
                a.getSituacao(),
                a.getAutor(),
                 a.getInstituicao(),
                a.getOrientador(),
                a.getCurso(),
                a.getAno(),
                a.getN_paginas(),
                 a.getP_chave(),
                 a.getResumo(),
                 a.getAbstracT()
                
            });
          }
 }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JOrientador = new javax.swing.JTextField();
        JCurso = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JResumo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JAbstracT = new javax.swing.JTextField();
        JTitulo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JAutor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        JInstituicao = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        JP_chave = new javax.swing.JTextField();
        JADD = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        JTipo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        JAno = new javax.swing.JTextField();
        JNPaginas = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jComboBoxSituacao = new javax.swing.JComboBox<>();
        jButtonEDITAR = new javax.swing.JButton();
        Jexcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Monografia");

        JOrientador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JOrientadorActionPerformed(evt);
            }
        });

        jLabel8.setText("Orientador");

        jLabel9.setText("Curso");

        jLabel2.setText("Situação");

        jLabel3.setText("Autor");

        jLabel4.setText("Instituição");

        jLabel5.setText("Palavra-Chave");

        jLabel6.setText("Abstract");

        jLabel7.setText("Resumo");

        JADD.setText("Add");
        JADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JADDActionPerformed(evt);
            }
        });

        jLabel1.setText("Título");

        jLabel10.setText("Tipo");

        jLabel11.setText("Número de Páginas");

        JAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JAnoActionPerformed(evt);
            }
        });

        jLabel12.setText("Ano");

        jComboBoxSituacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Situação", "Aprovado", "Reprovado", "SobAvaliação" }));
        jComboBoxSituacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSituacaoActionPerformed(evt);
            }
        });

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

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Titulo", "Situação", "Autor", "Instiuição", "Palavra-chave", "Resumo", "AbstracT", "Orientador", "Curso"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(JTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(JInstituicao))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addGap(18, 18, 18)
                                    .addComponent(JTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(JAutor)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JOrientador)
                                    .addComponent(JCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel11))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JAno)
                                    .addComponent(JNPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(JResumo)
                            .addComponent(JP_chave)
                            .addComponent(JAbstracT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(JADD)
                        .addGap(58, 58, 58)
                        .addComponent(Jexcluir)
                        .addGap(66, 66, 66)
                        .addComponent(jButtonEDITAR)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1058, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JP_chave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JResumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JAbstracT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(74, 74, 74))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jComboBoxSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JInstituicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(27, 27, 27)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 21, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Jexcluir)
                        .addComponent(jButtonEDITAR))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(JOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(JCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(JAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12)
                                .addComponent(JADD))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(JNPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11)))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JADDActionPerformed
        Monografia a = new Monografia ();
        MonografiaDAO DAO = new MonografiaDAO();
        
          a.setTitulo(JTitulo.getText());
        a.setSituacao((String) jComboBoxSituacao.getSelectedItem());
        a.setTipo(JTipo.getText());
        a.setAutor(JAutor.getText());
        a.setInstituicao(JInstituicao.getText()); 
  a.setOrientador(JOrientador.getText());
         a.setCurso(JCurso.getText());
a.setAno(JAno.getText());
a.setN_paginas(JNPaginas.getText());
 a.setPalavraChave(JP_chave.getText());
  a.setResumo(JResumo.getText());
        a.setAbstracT(JAbstracT.getText());

        DAO.cadastrar(a);
    }//GEN-LAST:event_JADDActionPerformed

    private void JAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JAnoActionPerformed

    private void jComboBoxSituacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSituacaoActionPerformed
        String selecionado = (String) jComboBoxSituacao.getSelectedItem();
        if (selecionado == "Aprovado"){
            Situacao Aprovado = situacao.Aprovado;
    }//GEN-LAST:event_jComboBoxSituacaoActionPerformed
 else if(selecionado == "Reprovado"){
        Situacao Aprovado = situacao.Reprovado;
    } else if(selecionado == "SobAvaliação"){
        Situacao Aprovado = situacao.SobAvaliacao;
    }
    }
    private void JOrientadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JOrientadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JOrientadorActionPerformed

    private void jButtonEDITARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEDITARActionPerformed

        if(jTable1.getSelectedRow() != -1){

            Monografia a = new Monografia ();
        MonografiaDAO DAO = new MonografiaDAO();

            a.setTitulo(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
            a.setSituacao((String)jComboBoxSituacao.getSelectedItem());
   a.setTipo(JTipo.getText());
        a.setAutor(JAutor.getText());
        a.setInstituicao(JInstituicao.getText()); 
  a.setOrientador(JOrientador.getText());
         a.setCurso(JCurso.getText());
a.setAno(JAno.getText());
a.setN_paginas(JNPaginas.getText());
 a.setPalavraChave(JP_chave.getText());
  a.setResumo(JResumo.getText());
        a.setAbstracT(JAbstracT.getText());
            
         

            DAO.editar(a);

    }//GEN-LAST:event_jButtonEDITARActionPerformed
    }
    
    
    
    private void JexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JexcluirActionPerformed

        if(jTable1.getSelectedRow() != -1){

            Monografia a = new Monografia();
           
            DefaultTableModel dtmSubimissao = (DefaultTableModel) jTable1.getModel();
            MonografiaDAO DAO = new MonografiaDAO();
           
            a.setTitulo(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());

            DAO.delete(a);
            dtmSubimissao.removeRow(jTable1.getSelectedRow());

    }//GEN-LAST:event_JexcluirActionPerformed
    }
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
         if(jTable1.getSelectedRow() != -1){
        JTitulo.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
         }
    }//GEN-LAST:event_jTable1MouseClicked
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JADD;
    private javax.swing.JTextField JAbstracT;
    private javax.swing.JTextField JAno;
    private javax.swing.JTextField JAutor;
    private javax.swing.JTextField JCurso;
    private javax.swing.JTextField JInstituicao;
    private javax.swing.JTextField JNPaginas;
    private javax.swing.JTextField JOrientador;
    private javax.swing.JTextField JP_chave;
    private javax.swing.JTextField JResumo;
    private javax.swing.JTextField JTipo;
    private javax.swing.JTextField JTitulo;
    private javax.swing.JButton Jexcluir;
    private javax.swing.JButton jButtonEDITAR;
    private javax.swing.JComboBox<String> jComboBoxSituacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
