package view;

import Apresentações.MiniCurso;
import Apresentações.Palestra;
import Cientifico.Artigo;
import Cientifico.Monografia;
import Cientifico.RelatorioTecnico;
import Cientifico.Resumo;
import Situacao.Situacao;
import Submissoes.SubimissaoDAO;
import javax.swing.table.DefaultTableModel;
import model.dao.ArtigoDAO;
import model.dao.MiniCursoDAO;
import model.dao.MonografiaDAO;
import model.dao.PalestraDAO;
import model.dao.RelatorioTecnicoDAO;
import model.dao.ResumoDAO;

/**
 *
 * @author thali
 */
public class TelaInicial extends javax.swing.JFrame {

    SubimissaoDAO s;
    DefaultTableModel dtmArtigo;
    Situacao situacao;

    public TelaInicial() {
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

    public void readJTablePorAutor(String autor) {
        DefaultTableModel dtmSubimissao = (DefaultTableModel) jTable1.getModel();
        dtmSubimissao.setNumRows(0);
        ArtigoDAO aDao = new ArtigoDAO();

        for (Artigo a : aDao.readArtigoPorAutor(autor)) {
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

        MonografiaDAO mDao = new MonografiaDAO();

        for (Monografia a : mDao.readMonografiaPorAutor(autor)) {
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

        PalestraDAO pDao = new PalestraDAO();

        for (Palestra a : pDao.readPalestraPorAutor(autor)) {
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

        MiniCursoDAO mnDao = new MiniCursoDAO();

        for (MiniCurso a : mnDao.readMiniCursoPorAutor(autor)) {
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

        RelatorioTecnicoDAO rtDao = new RelatorioTecnicoDAO();

        for (RelatorioTecnico a : rtDao.readRelatorioTecnicoPorAutor(autor)) {
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

        ResumoDAO rDao = new ResumoDAO();

        for (Resumo a : rDao.readResumoPorAutor(autor)) {
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
        jComboBoxCategoria = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxSituacao = new javax.swing.JComboBox<>();
        jTProcura = new javax.swing.JTextField();
        JPesquisa = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Titulo", "Situação", "Autor", "Instiuição", "Palavra-chave", "Resumo", "AbstracT", "Duração", "Currículo", "Recursos", "Metodologia", "Tipo", "Orientador", "Curso", "Ano", "Nº Páginas"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jComboBoxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Categoria", "Artigo", "Monografia", "Palestra", "MiniCurso", "Relatório Técnico", "Resumo" }));
        jComboBoxCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCategoriaActionPerformed(evt);
            }
        });

        jLabel3.setText("Autor");

        jComboBoxSituacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Situação", "Aprovado", "Reprovado", "SobAvaliação" }));
        jComboBoxSituacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSituacaoActionPerformed(evt);
            }
        });

        JPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons8-search-24 (1).png"))); // NOI18N
        JPesquisa.setText("Pesquisar");
        JPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JPesquisaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Bem vindo!");

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel2.setText("Escolha uma opção para realizar a pesquisa");

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons8-upload-24.png"))); // NOI18N
        jMenu3.setText("Submissões");

        jMenuItem3.setText("Artigo");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem6.setText("Monografia");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuItem1.setText("Relatório Técnico");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem2.setText("Resumo");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuItem4.setText("Mini Curso");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuItem5.setText("Palestra");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1233, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTProcura, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(462, 462, 462))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(535, 535, 535)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(428, 428, 428)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBoxSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(546, 546, 546)
                        .addComponent(JPesquisa)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTProcura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(27, 27, 27)
                .addComponent(JPesquisa)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCategoriaActionPerformed

        DefaultTableModel dtmSubimissao = (DefaultTableModel) jTable1.getModel();
        dtmSubimissao.setNumRows(0);
        String selecionado = (String) jComboBoxCategoria.getSelectedItem();
        if (selecionado == "Artigo") {
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
        } else if (selecionado == "Monografia") {
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
        } else if (selecionado == "Palestra") {
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
        } else if (selecionado == "MiniCurso") {
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
        } else if (selecionado == "Relatório Técnico") {
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
        } else if (selecionado == "Resumo") {
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
    }//GEN-LAST:event_jComboBoxCategoriaActionPerformed

    private void jComboBoxSituacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSituacaoActionPerformed
        DefaultTableModel dtmSubimissao = (DefaultTableModel) jTable1.getModel();
        String selecionado = (String) jComboBoxSituacao.getSelectedItem();
        if (selecionado == "Aprovado") {

            dtmSubimissao.setNumRows(0);
            ArtigoDAO aDao = new ArtigoDAO();

            for (Artigo a : aDao.readAprovadosArtigo()) {
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
            MonografiaDAO mDao = new MonografiaDAO();

            for (Monografia a : mDao.readMonografiaAprovado()) {
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

            PalestraDAO pDao = new PalestraDAO();

            for (Palestra a : pDao.readPalestraAprovado()) {
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

            MiniCursoDAO mnDao = new MiniCursoDAO();

            for (MiniCurso a : mnDao.readMiniCursoAprovado()) {
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

            RelatorioTecnicoDAO rtDao = new RelatorioTecnicoDAO();

            for (RelatorioTecnico a : rtDao.readRelatorioTecnicoAprovado()) {
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

            ResumoDAO rDao = new ResumoDAO();

            for (Resumo a : rDao.readResumoAprovado()) {
                dtmSubimissao.addRow(new Object[]{
                    a.getTitulo(),
                    a.getSituacao(),
                    a.getAutor(),
                    a.getInstituicao(),
                    a.getP_chave()

                });
            }
        } else if (selecionado == "Reprovado") {
            dtmSubimissao.setNumRows(0);
            ArtigoDAO aDao = new ArtigoDAO();

            for (Artigo a : aDao.readArtigoReprovados()) {
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
            MonografiaDAO mDao = new MonografiaDAO();

            for (Monografia a : mDao.readMonografiaReprovado()) {
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

            PalestraDAO pDao = new PalestraDAO();

            for (Palestra a : pDao.readPalestraReprovado()) {
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

            MiniCursoDAO mnDao = new MiniCursoDAO();

            for (MiniCurso a : mnDao.readMiniCursoReprovado()) {
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

            RelatorioTecnicoDAO rtDao = new RelatorioTecnicoDAO();

            for (RelatorioTecnico a : rtDao.readRelatorioTecnicoReprovado()) {
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

            ResumoDAO rDao = new ResumoDAO();

            for (Resumo a : rDao.readResumoReprovado()) {
                dtmSubimissao.addRow(new Object[]{
                    a.getTitulo(),
                    a.getSituacao(),
                    a.getAutor(),
                    a.getInstituicao(),
                    a.getP_chave()

                });
            }

        } else if (selecionado == "SobAvaliação") {
            dtmSubimissao.setNumRows(0);
            ArtigoDAO aDao = new ArtigoDAO();

            for (Artigo a : aDao.readArtigoSobAvaliação()) {
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
            MonografiaDAO mDao = new MonografiaDAO();

            for (Monografia a : mDao.readMonografiaSobAvaliação()) {
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

            PalestraDAO pDao = new PalestraDAO();

            for (Palestra a : pDao.readPalestraSobAvaliação()) {
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

            MiniCursoDAO mnDao = new MiniCursoDAO();

            for (MiniCurso a : mnDao.readMiniCursoSobAvaliação()) {
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

            RelatorioTecnicoDAO rtDao = new RelatorioTecnicoDAO();

            for (RelatorioTecnico a : rtDao.readRelatorioTecnicoSobAvaliação()) {
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

            ResumoDAO rDao = new ResumoDAO();

            for (Resumo a : rDao.readResumoSobAvaliação()) {
                dtmSubimissao.addRow(new Object[]{
                    a.getTitulo(),
                    a.getSituacao(),
                    a.getAutor(),
                    a.getInstituicao(),
                    a.getP_chave()

                });
            }
        }
    }//GEN-LAST:event_jComboBoxSituacaoActionPerformed

    private void JPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JPesquisaActionPerformed
        readJTablePorAutor(jTProcura.getText());
    }//GEN-LAST:event_JPesquisaActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        ViewArtigo e = new ViewArtigo(s);
        e.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        ViewMonografia a = new ViewMonografia(s);
        a.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        ViewRelatorioTec e = new ViewRelatorioTec(s);
        e.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        ViewResumo a = new ViewResumo(s);
        a.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        ViewMiniCurso e = new ViewMiniCurso(s);
        e.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        ViewPalestra e = new ViewPalestra(s);
        e.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JPesquisa;
    private javax.swing.JComboBox<String> jComboBoxCategoria;
    private javax.swing.JComboBox<String> jComboBoxSituacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTProcura;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
