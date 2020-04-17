/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Cientifico.Artigo;
import Situacao.Situacao;
import Submissoes.SubimissaoDAO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.dao.ArtigoDAO;

/**
 *
 * @author Thalis Antunes
 */
public class ViewArtigo extends javax.swing.JFrame {

    protected SubimissaoDAO s;
  Situacao situacao;
  
       
    public ViewArtigo( SubimissaoDAO  s) {
        this.s= s;
        initComponents();
        readJTable();
    }

    public void readJTable() {
        DefaultTableModel dtmSubimissao = (DefaultTableModel) jTable1.getModel();
dtmSubimissao.setNumRows(0);
        ArtigoDAO aDao = new ArtigoDAO();

        for (Artigo a : aDao.readArtigo()) {
            dtmSubimissao.addRow(new Object[]{
                a.getTitulo(),
                a.getSituacao(),
                a.getAutor(),
                 a.getInstituicao(),
                 a.getP_chave(),
                 a.getResumo(),
                 a.getAbstracT()
                
            });
          }
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonADD = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JTitulo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JAutor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        JInstituicao = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        JP_chave = new javax.swing.JTextField();
        JResumo = new javax.swing.JTextField();
        JAbstracT = new javax.swing.JTextField();
        jComboBoxSituacao = new javax.swing.JComboBox<>();
        jButtonEDITAR = new javax.swing.JButton();
        Jexcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Artigo");

        jButtonADD.setText("Add");
        jButtonADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonADDActionPerformed(evt);
            }
        });

        jLabel1.setText("Título");

        jLabel2.setText("Situação");

        jLabel3.setText("Autor");

        jLabel4.setText("Instituição");

        jLabel5.setText("Palavra-Chave");

        jLabel6.setText("Abstract");

        jLabel7.setText("Resumo");

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
                "Titulo", "Situação", "Autor", "Instiuição", "Palavra-chave", "Resumo", "AbstracT"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1)))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JTitulo)
                    .addComponent(JAutor)
                    .addComponent(JInstituicao, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JAbstracT)
                            .addComponent(JP_chave)
                            .addComponent(JResumo, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel6)))
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonADD)
                    .addComponent(Jexcluir)
                    .addComponent(jButtonEDITAR))
                .addContainerGap(405, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jComboBoxSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JInstituicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(JP_chave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonADD)))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(JResumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Jexcluir))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6)
                                .addComponent(JAbstracT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonEDITAR))))
                .addGap(118, 118, 118)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonADDActionPerformed
        Artigo a = new Artigo();
        ArtigoDAO DAO = new ArtigoDAO();

        a.setTitulo(JTitulo.getText());
        a.setSituacao((String)jComboBoxSituacao.getSelectedItem());
        a.setAutor(JAutor.getText());
        a.setInstituicao(JInstituicao.getText());
        a.setPalavraChave(JP_chave.getText());
        a.setResumo(JResumo.getText());
        a.setAbstracT(JAbstracT.getText());
        
        

        DAO.cadastrar(a);
        

    }//GEN-LAST:event_jButtonADDActionPerformed

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
    
    
    private void JexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JexcluirActionPerformed

        
        if(jTable1.getSelectedRow() != -1){
 
 
    Artigo a = new Artigo();
     DefaultTableModel dtmSubimissao = (DefaultTableModel) jTable1.getModel();  
    ArtigoDAO DAO = new ArtigoDAO();
a.setTitulo(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
       
       
        DAO.delete(a);
 dtmSubimissao.removeRow(jTable1.getSelectedRow());
 
    }//GEN-LAST:event_JexcluirActionPerformed
else   { JOptionPane.showMessageDialog(this, "Slecione um produto para exclusão");
}
    }
    
    
    
    
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       if(jTable1.getSelectedRow() != -1){
        JTitulo.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());

       }
    }//GEN-LAST:event_jTable1MouseClicked

    
    
    
    
    
    private void jButtonEDITARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEDITARActionPerformed
    
        if(jTable1.getSelectedRow() != -1){
      
         Artigo a = new Artigo();
        ArtigoDAO DAO = new ArtigoDAO();

        a.setTitulo(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
        a.setSituacao((String)jComboBoxSituacao.getSelectedItem());
        a.setAutor(JAutor.getText());
        a.setInstituicao(JInstituicao.getText());
        a.setPalavraChave(JP_chave.getText());
        a.setResumo(JResumo.getText());
        a.setAbstracT(JAbstracT.getText());
        
        

        DAO.editar(a);
        
    }//GEN-LAST:event_jButtonEDITARActionPerformed
    }
    
    
    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
if(jTable1.getSelectedRow() != -1){
        JTitulo.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
        JAutor.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
      JInstituicao.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());
       JP_chave.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString());
        JResumo.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 5).toString());
        JAbstracT.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 6).toString());
       }                                      
    }//GEN-LAST:event_jTable1KeyReleased
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JAbstracT;
    private javax.swing.JTextField JAutor;
    private javax.swing.JTextField JInstituicao;
    private javax.swing.JTextField JP_chave;
    private javax.swing.JTextField JResumo;
    private javax.swing.JTextField JTitulo;
    private javax.swing.JButton Jexcluir;
    private javax.swing.JButton jButtonADD;
    private javax.swing.JButton jButtonEDITAR;
    private javax.swing.JComboBox<String> jComboBoxSituacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
