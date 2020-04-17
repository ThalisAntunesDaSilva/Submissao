package view;

import Apresentações.Palestra;
import Situacao.Situacao;
import Submissoes.SubimissaoDAO;
import javax.swing.table.DefaultTableModel;
import model.dao.PalestraDAO;


public class ViewPalestra extends javax.swing.JFrame {
protected SubimissaoDAO s; 
Situacao situacao;
       
    public ViewPalestra(SubimissaoDAO s) {
        initComponents();
        this.s = s;
        readJTable();
    }
    
    public void readJTable() {
        DefaultTableModel dtmSubimissao = (DefaultTableModel) jTable1.getModel();
dtmSubimissao.setNumRows(0);
    PalestraDAO pDao = new PalestraDAO();
     for (Palestra a : pDao.readPalestra()) {
            dtmSubimissao.addRow(new Object[]{
                a.getTitulo(),
                a.getSituacao(),
                a.getAutor(),
                 a.getInstituicao(),
                a.getP_chave(),
                 a.getResumo(),
                 a.getAbstracT(),
                 a.getDuracao(),
                 a.getCurriculo()
                
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
        jLabel9 = new javax.swing.JLabel();
        JDuracao = new javax.swing.JTextField();
        JCurriculo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JInstituicao = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JPalavra_chave = new javax.swing.JTextField();
        jADD = new javax.swing.JButton();
        JSituacao = new javax.swing.JComboBox<>();
        jButtonEDITAR = new javax.swing.JButton();
        Jexcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Palestra");

        JAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JAutorActionPerformed(evt);
            }
        });

        jLabel1.setText("Título");

        jLabel2.setText("Situação");

        jLabel3.setText("Autor");

        jLabel7.setText("Abstract");

        jLabel8.setText("Resumo");

        jLabel9.setText("Duração");

        jLabel10.setText("Currículo");

        jLabel4.setText("Instituição");

        jLabel5.setText("Palavra-Chave");

        jADD.setText("Add");
        jADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jADDActionPerformed(evt);
            }
        });

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
                "Titulo", "Situação", "Autor", "Instiuição", "Palavra-chave", "Resumo", "AbstracT", "Duração", "Currículo"
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JPalavra_chave, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JInstituicao))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(JAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(JDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(JCurriculo, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JResumo)
                                    .addComponent(JAbstracT, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Jexcluir, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonEDITAR, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jADD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 906, Short.MAX_VALUE)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(JSituacao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jADD))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel3)
                                .addGap(30, 30, 30))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(JInstituicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(JPalavra_chave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Jexcluir)
                                .addGap(32, 32, 32)
                                .addComponent(jButtonEDITAR))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(JResumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(JAbstracT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(JCurriculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JAutorActionPerformed

    private void jADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jADDActionPerformed
        Palestra a = new Palestra();
         PalestraDAO DAO = new  PalestraDAO();

        a.setTitulo(JTitulo.getText());
        a.setSituacao((String) JSituacao.getSelectedItem());
        a.setAutor(JAutor.getText());
         a.setInstituicao(JInstituicao.getText());
        a.setP_chave(JPalavra_chave.getText());
        a.setResumo(JResumo.getText());
        a.setResumo(JResumo.getText());
        a.setAbstracT(JAbstracT.getText());
         a.setDuracao(JDuracao.getText()); 
        a.setCurriculo(JCurriculo.getText());
      
        
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
Palestra a = new Palestra();
         PalestraDAO DAO = new  PalestraDAO();

        a.setTitulo(JTitulo.getText());
        a.setSituacao((String) JSituacao.getSelectedItem());
        a.setAutor(JAutor.getText());
         a.setInstituicao(JInstituicao.getText());
        a.setP_chave(JPalavra_chave.getText());
        a.setResumo(JResumo.getText());
        a.setResumo(JResumo.getText());
        a.setAbstracT(JAbstracT.getText());
         a.setDuracao(JDuracao.getText()); 
        a.setCurriculo(JCurriculo.getText());
           

            DAO.editar(a);

    }//GEN-LAST:event_jButtonEDITARActionPerformed
    }
    
    
    private void JexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JexcluirActionPerformed

        if(jTable1.getSelectedRow() != -1){

            Palestra a = new Palestra();
            DefaultTableModel dtmSubimissao = (DefaultTableModel) jTable1.getModel();
            PalestraDAO DAO = new PalestraDAO();
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
    private javax.swing.JTextField JAutor;
    private javax.swing.JTextField JCurriculo;
    private javax.swing.JTextField JDuracao;
    private javax.swing.JTextField JInstituicao;
    private javax.swing.JTextField JPalavra_chave;
    private javax.swing.JTextField JResumo;
    private javax.swing.JComboBox<String> JSituacao;
    private javax.swing.JTextField JTitulo;
    private javax.swing.JButton Jexcluir;
    private javax.swing.JButton jADD;
    private javax.swing.JButton jButtonEDITAR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
