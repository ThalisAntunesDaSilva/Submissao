package model.dao;

import Cientifico.Artigo;
import Cientifico.Monografia;
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

/**
 *
 * @author Thalis Antunes (thalisantunes@hotmail.com)
 */
public class MonografiaDAO {
    private Connection connection;

    private ArrayList<Monografia> monografias = new ArrayList<Monografia>();

    public MonografiaDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void cadastrar(Monografia monografia) {
        System.out.print("ArtigoDAO - " + monografia.toString());
        String sql = "INSERT INTO monografia (titulo,situacao,tipo,autor,instituicao,orientador,curso,ano,nPaginas,p_chave,resumo,abstracT)VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, monografia.getTitulo());
            stmt.setString(2, monografia.getSituacao());
            stmt.setString(3, monografia.getTipo());
            stmt.setString(4, monografia.getAutor());
            stmt.setString(5, monografia.getInstituicao());
            stmt.setString(6, monografia.getOrientador());
            stmt.setString(7, monografia.getCurso());
           stmt.setString(8, monografia.getAno());
            stmt.setString(9,monografia.getN_paginas());
            stmt.setString(10, monografia.getPalavraChave());
            stmt.setString(11, monografia.getResumo());
            stmt.setString(12, monografia.getAbstracT());

            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "erro ao salvar" + u);
            throw new RuntimeException(u);

        }

        monografias.add(monografia);
    }

    public void editar(Monografia monografia) {

        System.out.print("ArtigoDAO - " + monografia.toString());
        String sql = "UPDATE monografia SET titulo = ?,situacao = ?,tipo = ?,autor = ?,instituicao = ?,orientador = ?,curso = ?,ano = ?,nPaginas = ?,p_chave = ?,resumo = ?,abstracT = ? WHERE titulo like ? ";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
             stmt.setString(13,"%" +monografia.getTitulo()+"%");
           
            stmt.setString(1, monografia.getTitulo());
            stmt.setString(2, monografia.getSituacao());
            stmt.setString(3, monografia.getTipo());
            stmt.setString(4, monografia.getAutor());
            stmt.setString(5, monografia.getInstituicao());
            stmt.setString(6, monografia.getOrientador());
            stmt.setString(7, monografia.getCurso());
           stmt.setString(8, monografia.getAno());
            stmt.setString(9,monografia.getN_paginas());
            stmt.setString(10, monografia.getPalavraChave());
            stmt.setString(11, monografia.getResumo());
            stmt.setString(12, monografia.getAbstracT());


            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "erro ao salvar" + u);
            throw new RuntimeException(u);

        }

        monografias.add(monografia);
    }

        
        
        
        
        

    public void delete(Monografia monografia) {

        String sql = "DELETE FROM monografia WHERE titulo = ?";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(1, monografia.getTitulo());
            stmt.execute();

         JOptionPane.showMessageDialog(null, "Removido com sucesso!");
        } catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "erro ao excluir" + u);
            throw new RuntimeException(u);

        }

        monografias.add(monografia);
    }

 
   
    
    public List<Monografia> readMonografia(){
        ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        List<Monografia>monografias = new ArrayList<>();
        
        try {
            stmt = connection.prepareStatement("SELECT * FROM monografia");
             rs = stmt.executeQuery();
             
             while(rs.next()){
                 Monografia monografia = new Monografia();
                 
                 monografia.setTitulo(rs.getString("titulo"));
                 monografia.setSituacao(rs.getString("situacao"));
                 monografia.setAutor(rs.getString("autor"));
                 monografia.setInstituicao(rs.getString("instituicao"));
                 monografia.setOrientador(rs.getString("orientador"));
                 monografia.setCurso(rs.getString("curso"));
                 monografia.setAno(rs.getString("ano"));
                 monografia.setN_paginas(rs.getString("nPaginas"));
                 monografia.setPalavraChave(rs.getString("p_chave"));
                 monografia.setResumo(rs.getString("resumo"));
                 monografia.setAbstracT(rs.getString("abstracT"));
                 
                 monografias.add(monografia);
        
             }
        } catch (SQLException ex) {
            Logger.getLogger(ArtigoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.encerrarConexao(connection, stmt, rs);
        }
    return monografias;
    }
    
    public List<Monografia> readMonografiaAprovado(){
        ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        List<Monografia>monografias = new ArrayList<>();
        
        try {
              stmt = connection.prepareStatement("SELECT * FROM monografia WHERE situacao = 'Aprovado'");
           
            rs = stmt.executeQuery();
             
             while(rs.next()){
                 Monografia monografia = new Monografia();
                 
                 monografia.setTitulo(rs.getString("titulo"));
                 monografia.setSituacao(rs.getString("situacao"));
                 monografia.setAutor(rs.getString("autor"));
                 monografia.setInstituicao(rs.getString("instituicao"));
                 monografia.setOrientador(rs.getString("orientador"));
                 monografia.setCurso(rs.getString("curso"));
                 monografia.setAno(rs.getString("ano"));
                 monografia.setN_paginas(rs.getString("nPaginas"));
                 monografia.setPalavraChave(rs.getString("p_chave"));
                 monografia.setResumo(rs.getString("resumo"));
                 monografia.setAbstracT(rs.getString("abstracT"));
                 
                 monografias.add(monografia);
        
             }
        } catch (SQLException ex) {
            Logger.getLogger(ArtigoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.encerrarConexao(connection, stmt, rs);
        }
    return monografias;
    }
    
    
    
    public List<Monografia> readMonografiaReprovado(){
        ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        List<Monografia>monografias = new ArrayList<>();
        
        try {
              stmt = connection.prepareStatement("SELECT * FROM monografia WHERE situacao = 'Reprovado'");
           
            rs = stmt.executeQuery();
             
             while(rs.next()){
                 Monografia monografia = new Monografia();
                 
                 monografia.setTitulo(rs.getString("titulo"));
                 monografia.setSituacao(rs.getString("situacao"));
                 monografia.setAutor(rs.getString("autor"));
                 monografia.setInstituicao(rs.getString("instituicao"));
                 monografia.setOrientador(rs.getString("orientador"));
                 monografia.setCurso(rs.getString("curso"));
                 monografia.setAno(rs.getString("ano"));
                 monografia.setN_paginas(rs.getString("nPaginas"));
                 monografia.setPalavraChave(rs.getString("p_chave"));
                 monografia.setResumo(rs.getString("resumo"));
                 monografia.setAbstracT(rs.getString("abstracT"));
                 
                 monografias.add(monografia);
        
             }
        } catch (SQLException ex) {
            Logger.getLogger(ArtigoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.encerrarConexao(connection, stmt, rs);
        }
    return monografias;
    }
    
    public List<Monografia> readMonografiaSobAvaliação(){
        ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        List<Monografia>monografias = new ArrayList<>();
        
        try {
              stmt = connection.prepareStatement("SELECT * FROM monografia WHERE situacao = 'SobAvaliação'");
           
            rs = stmt.executeQuery();
             
             while(rs.next()){
                 Monografia monografia = new Monografia();
                 
                 monografia.setTitulo(rs.getString("titulo"));
                 monografia.setSituacao(rs.getString("situacao"));
                 monografia.setAutor(rs.getString("autor"));
                 monografia.setInstituicao(rs.getString("instituicao"));
                 monografia.setOrientador(rs.getString("orientador"));
                 monografia.setCurso(rs.getString("curso"));
                 monografia.setAno(rs.getString("ano"));
                 monografia.setN_paginas(rs.getString("nPaginas"));
                 monografia.setPalavraChave(rs.getString("p_chave"));
                 monografia.setResumo(rs.getString("resumo"));
                 monografia.setAbstracT(rs.getString("abstracT"));
                 
                 monografias.add(monografia);
        
             }
        } catch (SQLException ex) {
            Logger.getLogger(ArtigoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.encerrarConexao(connection, stmt, rs);
        }
    return monografias;
    }
    
    
    
    
     public List<Monografia> readMonografiaPorAutor(String autor){
        ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        List<Monografia>monografias = new ArrayList<>();
        
        try {
             stmt = connection.prepareStatement("SELECT * FROM monografia WHERE autor like ?");
            stmt.setString(1,"%" +autor+"%");
             rs = stmt.executeQuery();

            while(rs.next()){
                 Monografia monografia = new Monografia();
                 
                 monografia.setTitulo(rs.getString("titulo"));
                 monografia.setSituacao(rs.getString("situacao"));
                 monografia.setAutor(rs.getString("autor"));
                 monografia.setInstituicao(rs.getString("instituicao"));
                 monografia.setOrientador(rs.getString("orientador"));
                 monografia.setCurso(rs.getString("curso"));
                 monografia.setAno(rs.getString("ano"));
                 monografia.setN_paginas(rs.getString("nPaginas"));
                 monografia.setPalavraChave(rs.getString("p_chave"));
                 monografia.setResumo(rs.getString("resumo"));
                 monografia.setAbstracT(rs.getString("abstracT"));
                 
                 monografias.add(monografia);
        
             }
        } catch (SQLException ex) {
            Logger.getLogger(ArtigoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.encerrarConexao(connection, stmt, rs);
        }
    return monografias;
    }
    
}
