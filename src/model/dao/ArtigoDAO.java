
package model.dao;

import Cientifico.Artigo;
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

public class ArtigoDAO {

    private Connection connection;

    private ArrayList<Artigo> artigos = new ArrayList<Artigo>();

    public ArtigoDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void cadastrar(Artigo artigo) {
        System.out.print("ArtigoDAO - " + artigo.toString());
        String sql = "INSERT INTO artigo(titulo,situacao,autor,instituicao,pChave,resumo,abstracT)VALUES(?,?,?,?,?,?,?)";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, artigo.getTitulo());
            stmt.setString(2, artigo.getSituacao());
            stmt.setString(3, artigo.getAutor());
            stmt.setString(4, artigo.getInstituicao());
            stmt.setString(5, artigo.getPalavraChave());
            stmt.setString(6, artigo.getResumo());
            stmt.setString(7, artigo.getAbstracT());

            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "erro ao salvar" + u);
            throw new RuntimeException(u);

        }

        artigos.add(artigo);
    }
    
    public void editar(Artigo artigo) {
        System.out.print("ArtigoDAO - " + artigo.toString());
        String sql = "UPDATE artigo set titulo = ?,situacao = ?,autor = ?,instituicao = ?,pChave = ?,resumo = ?,abstracT = ?  WHERE titulo like ? ";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
             stmt.setString(8,"%" +artigo.getTitulo()+"%");
            
            stmt.setString(1, artigo.getTitulo());
            stmt.setString(2, artigo.getSituacao());
            stmt.setString(3, artigo.getAutor());
            stmt.setString(4, artigo.getInstituicao());
            stmt.setString(5, artigo.getPalavraChave());
            stmt.setString(6, artigo.getResumo());
            stmt.setString(7, artigo.getAbstracT());

            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "erro ao salvar" + u);
            throw new RuntimeException(u);

        }

        artigos.add(artigo);
    }

      
    
    
    
    public void delete(Artigo artigo) {
         

        String sql = "DELETE FROM artigo WHERE titulo = ?";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(1, artigo.getTitulo());
            stmt.execute();

            JOptionPane.showMessageDialog(null, "Removido com sucesso!");
        } catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "erro ao excluir" + u);
            throw new RuntimeException(u);

        }

        artigos.add(artigo);
    }

     
     
    
    
    
    public List<Artigo> readArtigo(){
        ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        List<Artigo>artigos = new ArrayList<>();
        
        try {
            stmt = connection.prepareStatement("SELECT * FROM artigo");
             rs = stmt.executeQuery();
             
             while(rs.next()){
                 Artigo artigo = new Artigo();
                 
                 artigo.setTitulo(rs.getString("titulo"));
                 artigo.setSituacao(rs.getString("situacao"));
                 artigo.setAutor(rs.getString("autor"));
                 artigo.setInstituicao(rs.getString("instituicao"));
                 artigo.setPalavraChave(rs.getString("pChave"));
                 artigo.setResumo(rs.getString("resumo"));
                 artigo.setAbstracT(rs.getString("abstracT"));
                 
                 artigos.add(artigo);
                 
             }
        } catch (SQLException ex) {
            Logger.getLogger(ArtigoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.encerrarConexao(connection, stmt, rs);
        }
    return artigos;
    }
    
     
    
    
    
    public List<Artigo> readArtigoPorAutor(String autor){
        ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        List<Artigo>artigos = new ArrayList<>();
        
        try {
            stmt = connection.prepareStatement("SELECT * FROM artigo WHERE autor like ?");
            stmt.setString(1,"%" +autor+"%");
            rs = stmt.executeQuery();
             
             while(rs.next()){
                 Artigo artigo = new Artigo();
                 
                 artigo.setTitulo(rs.getString("titulo"));
                 artigo.setSituacao(rs.getString("situacao"));
                 artigo.setAutor(rs.getString("autor"));
                 artigo.setInstituicao(rs.getString("instituicao"));
                 artigo.setPalavraChave(rs.getString("pChave"));
                 artigo.setResumo(rs.getString("resumo"));
                 artigo.setAbstracT(rs.getString("abstracT"));
                 
                 artigos.add(artigo);
                 
             }
        } catch (SQLException ex) {
            Logger.getLogger(ArtigoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.encerrarConexao(connection, stmt, rs);
        }
    return artigos;
    }
    
         
    
    
    
    
    public List<Artigo> readAprovadosArtigo(){
        ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        List<Artigo>artigos = new ArrayList<>();
        
        try {
            stmt = connection.prepareStatement("SELECT * FROM artigo WHERE situacao = 'Aprovado'");
           
            rs = stmt.executeQuery();
             
             while(rs.next()){
                 Artigo artigo = new Artigo();
                 
                 artigo.setTitulo(rs.getString("titulo"));
                 artigo.setSituacao(rs.getString("situacao"));
                 artigo.setAutor(rs.getString("autor"));
                 artigo.setInstituicao(rs.getString("instituicao"));
                 artigo.setPalavraChave(rs.getString("pChave"));
                 artigo.setResumo(rs.getString("resumo"));
                 artigo.setAbstracT(rs.getString("abstracT"));
                 
                 artigos.add(artigo);
                 
             }
        } catch (SQLException ex) {
            Logger.getLogger(ArtigoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.encerrarConexao(connection, stmt, rs);
        }
    return artigos;
    }
          
          
         
    
    
    
    
    
    public List<Artigo> readArtigoReprovados(){
        ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        List<Artigo>artigos = new ArrayList<>();
        
        try {
            stmt = connection.prepareStatement("SELECT * FROM artigo WHERE situacao = 'Reprovado'");
           
            rs = stmt.executeQuery();
             
             while(rs.next()){
                 Artigo artigo = new Artigo();
                 
                 artigo.setTitulo(rs.getString("titulo"));
                 artigo.setSituacao(rs.getString("situacao"));
                 artigo.setAutor(rs.getString("autor"));
                 artigo.setInstituicao(rs.getString("instituicao"));
                 artigo.setPalavraChave(rs.getString("pChave"));
                 artigo.setResumo(rs.getString("resumo"));
                 artigo.setAbstracT(rs.getString("abstracT"));
                 
                 artigos.add(artigo);
                 
             }
        } catch (SQLException ex) {
            Logger.getLogger(ArtigoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.encerrarConexao(connection, stmt, rs);
        }
    return artigos;
    }
           
          
    
    
    
    
    public List<Artigo> readArtigoSobAvaliação(){
        ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        List<Artigo>artigos = new ArrayList<>();
        
        try {
            stmt = connection.prepareStatement("SELECT * FROM artigo WHERE situacao = 'SobAvaliação'");
           
            rs = stmt.executeQuery();
             
             while(rs.next()){
                 Artigo artigo = new Artigo();
                 
                 artigo.setTitulo(rs.getString("titulo"));
                 artigo.setSituacao(rs.getString("situacao"));
                 artigo.setAutor(rs.getString("autor"));
                 artigo.setInstituicao(rs.getString("instituicao"));
                 artigo.setPalavraChave(rs.getString("pChave"));
                 artigo.setResumo(rs.getString("resumo"));
                 artigo.setAbstracT(rs.getString("abstracT"));
                 
                 artigos.add(artigo);
                 
             }
        } catch (SQLException ex) {
            Logger.getLogger(ArtigoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.encerrarConexao(connection, stmt, rs);
        }
    return artigos;
    }
     
   

}
