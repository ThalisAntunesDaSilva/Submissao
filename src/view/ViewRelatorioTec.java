package view;

import Cientifico.RelatorioTecnico;
import Situacao.Situacao;
import Submissoes.SubimissaoDAO;
import javax.swing.table.DefaultTableModel;
import model.dao.RelatorioTecnicoDAO;

public class ViewRelatorioTec extends javax.swing.JFrame {
protected SubimissaoDAO s;
Situacao situacao;
    public ViewRelatorioTec(SubimissaoDAO s) {
        initComponents();
          this.s = s;
          readJTable();
    }
    
     public void readJTable() {
        DefaultTableModel dtmSubimissao = (DefaultTableModel) jTable1.getModel();
dtmSubimissao.setNumRows(0);
      RelatorioTecnicoDAO rtDao = new RelatorioTecnicoDAO();

        for (RelatorioTecnico a : rtDao.readRelatorioTecnico()) {
            dtmSubimissao.addRow(new Object[]{
              
                a.getTitulo(),
                a.getSituacao(),
                a.getAutor(),
                a.getInstituicao(),
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

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JAutor = new javax.swing.JTextField();
        JInstituicao = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        JPalavra_chave = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JTitulo = new javax.swing.JTextField();
        JResumo = new javax.swing.JTextField();
        JAbstracT = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jADD = new javax.swing.JButton();
        JAno = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        JNPaginas = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        JSituacao = new javax.swing.JComboBox<>();
        jButtonEDITAR = new javax.swing.JButton();
        Jexcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relatório Técnico");

        jLabel4.setText("Instituição");

        jLabel5.setText("Palavra-Chave");

        jLabel1.setText("Título");

        jLabel2.setText("Situação");

        jLabel3.setText("Autor");

        jLabel7.setText("Abstract");

        jLabel8.setText("Resumo");

        jADD.setText("Add");
        jADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jADDActionPerformed(evt);
            }
        });

        jLabel10.setText("Ano");

        jLabel11.setText("Nº de páginas");

        JSituacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Situação", "Aprovado", "Reprovado", "SobAvaliação" }));
        JSituacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JSituacaoActionPerformed(evt);
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
                "Titulo", "Situação", "Autor", "Instiuição", "Palavra-chave", "Resumo", "AbstracT", "Ano", "Nº Páginas"
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
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(JInstituicao, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(JAno, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JAutor))
                        .addGap(226, 226, 226)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(13, 13, 13)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JResumo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JAbstracT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(141, 141, 141)
                                .addComponent(jButtonEDITAR))
                            .addComponent(Jexcluir))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(JSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(JPalavra_chave))
                            .addComponent(JNPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jADD)
                        .addGap(33, 33, 33))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 898, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(JNPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(JPalavra_chave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jADD)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(Jexcluir)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(JResumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(JAbstracT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jButtonEDITAR)))
                        .addGap(44, 44, 44))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(JSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(JInstituicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(JAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jADDActionPerformed
      RelatorioTecnico a = new RelatorioTecnico();
      RelatorioTecnicoDAO DAO = new  RelatorioTecnicoDAO();

        a.setTitulo(JTitulo.getText());
        a.setSituacao((String) JSituacao.getSelectedItem());
        a.setAutor(JAutor.getText());
        a.setInstituicao(JInstituicao.getText());
        a.setAno(JAno.getText());
        a.setN_paginas(JNPaginas.getText());
        a.setP_chave(JPalavra_chave.getText());
        a.setResumo(JResumo.getText());
        a.setResumo(JResumo.getText());
        a.setAbstracT(JAbstracT.getText());
        
         DAO.cadastrar(a);
        
    }//GEN-LAST:event_jADDActionPerformed

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

        if(jTable1.getSelectedRow() != -1){
 RelatorioTecnico a = new RelatorioTecnico();
      RelatorioTecnicoDAO DAO = new  RelatorioTecnicoDAO();

        a.setTitulo(JTitulo.getText());
        a.setSituacao((String) JSituacao.getSelectedItem());
        a.setAutor(JAutor.getText());
        a.setInstituicao(JInstituicao.getText());
        a.setAno(JAno.getText());
        a.setN_paginas(JNPaginas.getText());
        a.setP_chave(JPalavra_chave.getText());
        a.setResumo(JResumo.getText());
        a.setResumo(JResumo.getText());
        a.setAbstracT(JAbstracT.getText());

            DAO.editar(a);

    }//GEN-LAST:event_jButtonEDITARActionPerformed
    }
    private void JexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JexcluirActionPerformed

        if(jTable1.getSelectedRow() != -1){

            RelatorioTecnico a = new RelatorioTecnico();
            DefaultTableModel dtmSubimissao = (DefaultTableModel) jTable1.getModel();
            RelatorioTecnicoDAO DAO = new RelatorioTecnicoDAO();
            a.setTitulo(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());

            DAO.remover(a);
            dtmSubimissao.removeRow(jTable1.getSelectedRow());

    }//GEN-LAST:event_JexcluirActionPerformed
}
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if(jTable1.getSelectedRow() != -1){
        JTitulo.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());

       }
    }//GEN-LAST:event_jTable1MouseClicked
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JAbstracT;
    private javax.swing.JTextField JAno;
    private javax.swing.JTextField JAutor;
    private javax.swing.JTextField JInstituicao;
    private javax.swing.JTextField JNPaginas;
    private javax.swing.JTextField JPalavra_chave;
    private javax.swing.JTextField JResumo;
    private javax.swing.JComboBox<String> JSituacao;
    private javax.swing.JTextField JTitulo;
    private javax.swing.JButton Jexcluir;
    private javax.swing.JButton jADD;
    private javax.swing.JButton jButtonEDITAR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
