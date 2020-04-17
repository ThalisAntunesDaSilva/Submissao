
package model.dao;

import Cientifico.Monografia;
import Cientifico.RelatorioTecnico;
import ConnectionFactory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class RelatorioTecnicoDAO {
    
   
private Connection connection;

    private ArrayList<RelatorioTecnico> Rts = new ArrayList<RelatorioTecnico>();



    public RelatorioTecnicoDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void cadastrar(RelatorioTecnico RT) {
        System.out.print("ArtigoDAO - " + RT.toString());
        String sql = "INSERT INTO relatoriotecnico (titulo,situacao,autor,instituicao,ano,nPaginas,p_chave,resumo,abstracT)VALUES(?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, RT.getTitulo());
            stmt.setString(2, RT.getSituacao());
            stmt.setString(3, RT.getAutor());
            stmt.setString(4, RT.getInstituicao());
            stmt.setString(5, RT.getAno());
            stmt.setString(6,RT.getN_paginas());
            stmt.setString(7, RT.getPalavraChave());
            stmt.setString(8, RT.getResumo());
            stmt.setString(9, RT.getAbstracT());
            
          
            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "erro ao salvar" + u);
            throw new RuntimeException(u);

        }

        Rts.add(RT);
    }

    public void editar(RelatorioTecnico RT) {

        String sql = "UPDATE relatoriotecnico SET titulo = ?,situacao = ?,autor = ?,instituicao = ?,ano = ?,nPaginas = ?,p_chave = ?,resumo =?, abstracT = ? WHERE titulo LIKE ?";

        
            try {
            PreparedStatement stmt = connection.prepareStatement(sql);
             stmt.setString(10,"%" +RT.getTitulo()+"%");
            
             stmt.setString(1, RT.getTitulo());
            stmt.setString(2, RT.getSituacao());
            stmt.setString(3, RT.getAutor());
            stmt.setString(4, RT.getInstituicao());
            stmt.setString(5, RT.getAno());
            stmt.setString(6,RT.getN_paginas());
            stmt.setString(7, RT.getPalavraChave());
            stmt.setString(8, RT.getResumo());
            stmt.setString(9, RT.getAbstracT());

            stmt.execute();
            stmt.close();
        JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
        } catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "erro ao salvar" + u);
            throw new RuntimeException(u);

        }

        Rts.add(RT);
    }

    public void remover(RelatorioTecnico RT) {

        String sql = "DELETE FROM relatoriotecnico WHERE titulo = ?";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(1, RT.getTitulo());
            stmt.execute();

       JOptionPane.showMessageDialog(null, "Removido com sucesso!");
        } catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "erro ao excluir" + u);
            throw new RuntimeException(u);

        }

        Rts.add(RT);
    }
 
    
   
    
    public List<RelatorioTecnico> readRelatorioTecnico(){
        ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        List<RelatorioTecnico>relatorioTecnicos = new ArrayList<>();
        
        try {
            stmt = connection.prepareStatement("SELECT * FROM relatorioTecnico");
             rs = stmt.executeQuery();
             
             while(rs.next()){
                 RelatorioTecnico relatorioTecnico = new RelatorioTecnico();
                 
                 relatorioTecnico.setTitulo(rs.getString("titulo"));
                 relatorioTecnico.setSituacao(rs.getString("situacao"));
                 relatorioTecnico.setAutor(rs.getString("autor"));
                 relatorioTecnico.setInstituicao(rs.getString("instituicao"));
                 relatorioTecnico.setAno(rs.getString("ano"));
                 relatorioTecnico.setN_paginas(rs.getString("nPaginas"));
                 relatorioTecnico.setPalavraChave(rs.getString("p_chave"));
                 relatorioTecnico.setResumo(rs.getString("resumo"));
                 relatorioTecnico.setAbstracT(rs.getString("abstracT"));
                 
                 relatorioTecnicos.add(relatorioTecnico);
                
        
             }
        } catch (SQLException ex) {
            Logger.getLogger(ArtigoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.encerrarConexao(connection, stmt, rs);
        }
    return relatorioTecnicos;
    }
    
    
    public List<RelatorioTecnico> readRelatorioTecnicoAprovado(){
        ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        List<RelatorioTecnico>relatorioTecnicos = new ArrayList<>();
        
        try {
              stmt = connection.prepareStatement("SELECT * FROM relatoriotecnico WHERE situacao = 'Aprovado'");
           
            rs = stmt.executeQuery();
             
             
             while(rs.next()){
                 RelatorioTecnico relatorioTecnico = new RelatorioTecnico();
                 
                 relatorioTecnico.setTitulo(rs.getString("titulo"));
                 relatorioTecnico.setSituacao(rs.getString("situacao"));
                 relatorioTecnico.setAutor(rs.getString("autor"));
                 relatorioTecnico.setInstituicao(rs.getString("instituicao"));
                 relatorioTecnico.setAno(rs.getString("ano"));
                 relatorioTecnico.setN_paginas(rs.getString("nPaginas"));
                 relatorioTecnico.setPalavraChave(rs.getString("p_chave"));
                 relatorioTecnico.setResumo(rs.getString("resumo"));
                 relatorioTecnico.setAbstracT(rs.getString("abstracT"));
                 
                 relatorioTecnicos.add(relatorioTecnico);
                
        
             }
        } catch (SQLException ex) {
            Logger.getLogger(ArtigoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.encerrarConexao(connection, stmt, rs);
        }
    return relatorioTecnicos;
    }
    
    public List<RelatorioTecnico> readRelatorioTecnicoReprovado(){
        ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        List<RelatorioTecnico>relatorioTecnicos = new ArrayList<>();
        
        try {
              stmt = connection.prepareStatement("SELECT * FROM relatoriotecnico WHERE situacao = 'Reprovado'");
           
            rs = stmt.executeQuery();
             
             
             while(rs.next()){
                 RelatorioTecnico relatorioTecnico = new RelatorioTecnico();
                 
                 relatorioTecnico.setTitulo(rs.getString("titulo"));
                 relatorioTecnico.setSituacao(rs.getString("situacao"));
                 relatorioTecnico.setAutor(rs.getString("autor"));
                 relatorioTecnico.setInstituicao(rs.getString("instituicao"));
                 relatorioTecnico.setAno(rs.getString("ano"));
                 relatorioTecnico.setN_paginas(rs.getString("nPaginas"));
                 relatorioTecnico.setPalavraChave(rs.getString("p_chave"));
                 relatorioTecnico.setResumo(rs.getString("resumo"));
                 relatorioTecnico.setAbstracT(rs.getString("abstracT"));
                 
                 relatorioTecnicos.add(relatorioTecnico);
                
        
             }
        } catch (SQLException ex) {
            Logger.getLogger(ArtigoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.encerrarConexao(connection, stmt, rs);
        }
    return relatorioTecnicos;
    }
    
    public List<RelatorioTecnico> readRelatorioTecnicoSobAvaliação(){
        ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        List<RelatorioTecnico>relatorioTecnicos = new ArrayList<>();
        
        try {
              stmt = connection.prepareStatement("SELECT * FROM relatoriotecnico WHERE situacao = 'SobAvaliação'");
           
            rs = stmt.executeQuery();
             
             
             while(rs.next()){
                 RelatorioTecnico relatorioTecnico = new RelatorioTecnico();
                 
                 relatorioTecnico.setTitulo(rs.getString("titulo"));
                 relatorioTecnico.setSituacao(rs.getString("situacao"));
                 relatorioTecnico.setAutor(rs.getString("autor"));
                 relatorioTecnico.setInstituicao(rs.getString("instituicao"));
                 relatorioTecnico.setAno(rs.getString("ano"));
                 relatorioTecnico.setN_paginas(rs.getString("nPaginas"));
                 relatorioTecnico.setPalavraChave(rs.getString("p_chave"));
                 relatorioTecnico.setResumo(rs.getString("resumo"));
                 relatorioTecnico.setAbstracT(rs.getString("abstracT"));
                 
                 relatorioTecnicos.add(relatorioTecnico);
                
        
             }
        } catch (SQLException ex) {
            Logger.getLogger(ArtigoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.encerrarConexao(connection, stmt, rs);
        }
    return relatorioTecnicos;
    }
    
    
    
    
    
    public List<RelatorioTecnico> readRelatorioTecnicoPorAutor(String autor){
        ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        List<RelatorioTecnico>relatorioTecnicos = new ArrayList<>();
        
        try {
            stmt = connection.prepareStatement("SELECT * FROM relatoriotecnico WHERE autor like ?");
            stmt.setString(1,"%" +autor+"%");
             rs = stmt.executeQuery();
             while(rs.next()){
                 RelatorioTecnico relatorioTecnico = new RelatorioTecnico();
                 
                 relatorioTecnico.setTitulo(rs.getString("titulo"));
                 relatorioTecnico.setSituacao(rs.getString("situacao"));
                 relatorioTecnico.setAutor(rs.getString("autor"));
                 relatorioTecnico.setInstituicao(rs.getString("instituicao"));
                 relatorioTecnico.setAno(rs.getString("ano"));
                 relatorioTecnico.setN_paginas(rs.getString("nPaginas"));
                 relatorioTecnico.setPalavraChave(rs.getString("p_chave"));
                 relatorioTecnico.setResumo(rs.getString("resumo"));
                 relatorioTecnico.setAbstracT(rs.getString("abstracT"));
                 
                 relatorioTecnicos.add(relatorioTecnico);
                
        
             }
        } catch (SQLException ex) {
            Logger.getLogger(ArtigoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.encerrarConexao(connection, stmt, rs);
        }
    return relatorioTecnicos;
    }
}


