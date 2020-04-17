
package view;

import Apresentações.MiniCurso;
import Situacao.Situacao;
import Submissoes.SubimissaoDAO;
import javax.swing.table.DefaultTableModel;
import model.dao.ArtigoDAO;
import model.dao.MiniCursoDAO;


public class ViewMiniCurso extends javax.swing.JFrame {
protected SubimissaoDAO s; 
  Situacao situacao;      
    public ViewMiniCurso(SubimissaoDAO s) {
        initComponents();
        this.s = s;
        readJTable();
    }
    
    public void readJTable() {
        DefaultTableModel dtmSubimissao = (DefaultTableModel) jTable1.getModel();
dtmSubimissao.setNumRows(0);
        ArtigoDAO aDao = new ArtigoDAO();
           MiniCursoDAO mnDao = new MiniCursoDAO();

        for (MiniCurso a : mnDao.readMiniCurso()) {
            dtmSubimissao.addRow(new Object[]{
              
                a.getTitulo(),
                a.getSituacao(),
                a.getAutor(),
                a.getResumo(),
                a.getAbstracT(),
                a.getDuracao(),
                a.getCurriculo(),
                a.getCurriculo(),
                a.getRecursos()
                
            });
          }
    }

    
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JAutor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JTitulo = new javax.swing.JTextField();
        JResumo = new javax.swing.JTextField();
        JAbstracT = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        JRecursos = new javax.swing.JTextField();
        JMetodologia = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jADD = new javax.swing.JButton();
        JDuracao = new javax.swing.JTextField();
        JCurriculo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        JSituacao = new javax.swing.JComboBox<>();
        jButtonEDITAR = new javax.swing.JButton();
        Jexcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MiniCurso");

        jLabel1.setText("Título");

        jLabel2.setText("Situação");

        jLabel3.setText("Autor");

        jLabel7.setText("Abstract");

        jLabel8.setText("Resumo");

        jLabel9.setText("Metodologia");

        jLabel10.setText("Recursos");

        jADD.setText("Add");
        jADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jADDActionPerformed(evt);
            }
        });

        jLabel11.setText("Currículo");

        jLabel12.setText("Duração");

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
                "Titulo", "Situação", "Autor", "Instiuição", "Palavra-chave", "Resumo", "AbstracT", "Duração", "Currículo", "Recursos", "Metodologia"
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                            .addComponent(JAutor)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JResumo, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                            .addComponent(JAbstracT))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(JDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(230, 230, 230))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(14, 14, 14)
                            .addComponent(jLabel11)
                            .addGap(18, 18, 18)
                            .addComponent(JCurriculo))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(JRecursos)
                                .addComponent(JMetodologia, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonEDITAR)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jADD)
                        .addGap(18, 18, 18)
                        .addComponent(Jexcluir)))
                .addGap(27, 27, 27))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1045, Short.MAX_VALUE)
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
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(JSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(JResumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 13, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(JCurriculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(JRecursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(JMetodologia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Jexcluir)
                            .addComponent(jADD))
                        .addGap(32, 32, 32)
                        .addComponent(jButtonEDITAR)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(JAbstracT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jADDActionPerformed
       MiniCurso a = new MiniCurso();
         MiniCursoDAO DAO = new  MiniCursoDAO();

        a.setTitulo(JTitulo.getText());
       a.setSituacao((String) JSituacao.getSelectedItem());
        a.setAutor(JAutor.getText());
        a.setResumo(JResumo.getText());
      a.setAbstracT(JAbstracT.getText());
         a.setDuracao(JDuracao.getText()); 
        a.setCurriculo(JCurriculo.getText());
       a.setRecursos(JRecursos.getText());
        a.setMetodologia(JMetodologia.getText());
        
      

        

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

           MiniCurso a = new MiniCurso();
         MiniCursoDAO DAO = new  MiniCursoDAO();

         a.setTitulo(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
       a.setSituacao((String) JSituacao.getSelectedItem());
        a.setAutor(JAutor.getText());
        a.setResumo(JResumo.getText());
      a.setAbstracT(JAbstracT.getText());
         a.setDuracao(JDuracao.getText()); 
        a.setCurriculo(JCurriculo.getText());
       a.setRecursos(JRecursos.getText());
        a.setMetodologia(JMetodologia.getText());
        
          

            DAO.editar(a);

    }//GEN-LAST:event_jButtonEDITARActionPerformed
    }
    
    private void JexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JexcluirActionPerformed

        if(jTable1.getSelectedRow() != -1){

             MiniCurso a = new MiniCurso();
            DefaultTableModel dtmSubimissao = (DefaultTableModel) jTable1.getModel();
            MiniCursoDAO DAO = new MiniCursoDAO();
            a.setTitulo(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());

            DAO.remover(a);
            dtmSubimissao.removeRow(jTable1.getSelectedRow());
        }
    }//GEN-LAST:event_JexcluirActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
              if(jTable1.getSelectedRow() != -1){
        JTitulo.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());

       }
    }//GEN-LAST:event_jTable1MouseClicked
      
        
    
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JAbstracT;
    private javax.swing.JTextField JAutor;
    private javax.swing.JTextField JCurriculo;
    private javax.swing.JTextField JDuracao;
    private javax.swing.JTextField JMetodologia;
    private javax.swing.JTextField JRecursos;
    private javax.swing.JTextField JResumo;
    private javax.swing.JComboBox<String> JSituacao;
    private javax.swing.JTextField JTitulo;
    private javax.swing.JButton Jexcluir;
    private javax.swing.JButton jADD;
    private javax.swing.JButton jButtonEDITAR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
