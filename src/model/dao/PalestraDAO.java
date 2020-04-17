package model.dao;

import Apresentações.Palestra;
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

public class PalestraDAO {
     private Connection connection;

    private ArrayList<Palestra> palestras = new ArrayList<Palestra>();

    public PalestraDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void cadastrar(Palestra palestra) {
        System.out.print("PalestraDAO - " + palestra.toString());
        String sql = "INSERT INTO palestra (titulo,situacao,autor,instituicao,p_chave,resumo,abstracT,duracao,curriculo)VALUES(?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, palestra.getTitulo());
            stmt.setString(2, palestra.getSituacao());
            stmt.setString(3, palestra.getAutor());
            stmt.setString(4, palestra.getInstituicao());
            stmt.setString(5, palestra. getP_chave());
            stmt.setString(6, palestra.getResumo());
            stmt.setString(7, palestra.getAbstracT());
            stmt.setString(8, palestra.getDuracao());
            stmt.setString(9, palestra.getCurriculo());

            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "erro ao salvar" + u);
            throw new RuntimeException(u);

        }

        palestras.add(palestra);
    }

    public void editar(Palestra palestra) {

        String sql = "UPDATE palestra SET titulo = ?,situacao= ?,autor= ?,instituicao= ?,p_chave= ?,resumo= ?,abstracT= ?,duracao= ?,curriculo= ? WHERE titulo = ?";


        try {
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(10, palestra.getTitulo());
            
            stmt.setString(1, palestra.getTitulo());
            stmt.setString(2, palestra.getSituacao());
            stmt.setString(3, palestra.getAutor());
            stmt.setString(4, palestra.getInstituicao());
            stmt.setString(5, palestra. getP_chave());
            stmt.setString(6, palestra.getResumo());
            stmt.setString(7, palestra.getAbstracT());
            stmt.setString(8, palestra.getDuracao());
            stmt.setString(9, palestra.getCurriculo());     
            
              stmt.execute();
            stmt.close();
            

          JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "erro ao salvar" + u);
            throw new RuntimeException(u);

        }

        palestras.add(palestra);
    }


    public void remover(Palestra palestra) {
 String sql = "DELETE FROM palestra WHERE titulo = ?";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(1, palestra.getTitulo());
            stmt.execute();

            JOptionPane.showMessageDialog(null, "Removido com sucesso!");
        } catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "erro ao excluir" + u);
            throw new RuntimeException(u);

        }

        palestras.add(palestra);
     
    }

    
  
   
    
      public List<Palestra> readPalestra(){
        ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        List<Palestra>palestras = new ArrayList<>();
        
        try {
            stmt = connection.prepareStatement("SELECT * FROM palestra");
             rs = stmt.executeQuery();
             
             while(rs.next()){
                 Palestra palestra = new Palestra();
                 
                 palestra.setTitulo(rs.getString("titulo"));
                 palestra.setSituacao(rs.getString("situacao"));
                 palestra.setAutor(rs.getString("autor"));
                 palestra.setInstituicao(rs.getString("instituicao"));
                 palestra.setP_chave(rs.getString("p_chave"));
                 palestra.setResumo(rs.getString("resumo"));
                 palestra.setAbstracT(rs.getString("abstracT"));
                 palestra.setDuracao(rs.getString("duracao"));
                 palestra.setCurriculo(rs.getString("curriculo"));
                 
                 palestras.add(palestra);
                 
             }
        } catch (SQLException ex) {
            Logger.getLogger(ArtigoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.encerrarConexao(connection, stmt, rs);
        }
    return palestras;
    }
     
      public List<Palestra> readPalestraAprovado(){
        ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        List<Palestra>palestras = new ArrayList<>();
        
        try {
           stmt = connection.prepareStatement("SELECT * FROM palestra WHERE situacao = 'Aprovado'");
           
            rs = stmt.executeQuery();
             
             
             while(rs.next()){
                 Palestra palestra = new Palestra();
                 
                 palestra.setTitulo(rs.getString("titulo"));
                 palestra.setSituacao(rs.getString("situacao"));
                 palestra.setAutor(rs.getString("autor"));
                 palestra.setInstituicao(rs.getString("instituicao"));
                 palestra.setP_chave(rs.getString("p_chave"));
                 palestra.setResumo(rs.getString("resumo"));
                 palestra.setAbstracT(rs.getString("abstracT"));
                 palestra.setDuracao(rs.getString("duracao"));
                 palestra.setCurriculo(rs.getString("curriculo"));
                 
                 palestras.add(palestra);
                 
             }
        } catch (SQLException ex) {
            Logger.getLogger(ArtigoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.encerrarConexao(connection, stmt, rs);
        }
    return palestras;
    }
      
      
      public List<Palestra> readPalestraReprovado(){
        ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        List<Palestra>palestras = new ArrayList<>();
        
        try {
           stmt = connection.prepareStatement("SELECT * FROM palestra WHERE situacao = 'Reprovado'");
           
            rs = stmt.executeQuery();
             
             
             while(rs.next()){
                 Palestra palestra = new Palestra();
                 
                 palestra.setTitulo(rs.getString("titulo"));
                 palestra.setSituacao(rs.getString("situacao"));
                 palestra.setAutor(rs.getString("autor"));
                 palestra.setInstituicao(rs.getString("instituicao"));
                 palestra.setP_chave(rs.getString("p_chave"));
                 palestra.setResumo(rs.getString("resumo"));
                 palestra.setAbstracT(rs.getString("abstracT"));
                 palestra.setDuracao(rs.getString("duracao"));
                 palestra.setCurriculo(rs.getString("curriculo"));
                 
                 palestras.add(palestra);
                 
             }
        } catch (SQLException ex) {
            Logger.getLogger(ArtigoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.encerrarConexao(connection, stmt, rs);
        }
    return palestras;
    }
      
      
      public List<Palestra> readPalestraSobAvaliação(){
        ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        List<Palestra>palestras = new ArrayList<>();
        
        try {
           stmt = connection.prepareStatement("SELECT * FROM palestra WHERE situacao = 'SobAvaliação'");
           
            rs = stmt.executeQuery();
             
             
             while(rs.next()){
                 Palestra palestra = new Palestra();
                 
                 palestra.setTitulo(rs.getString("titulo"));
                 palestra.setSituacao(rs.getString("situacao"));
                 palestra.setAutor(rs.getString("autor"));
                 palestra.setInstituicao(rs.getString("instituicao"));
                 palestra.setP_chave(rs.getString("p_chave"));
                 palestra.setResumo(rs.getString("resumo"));
                 palestra.setAbstracT(rs.getString("abstracT"));
                 palestra.setDuracao(rs.getString("duracao"));
                 palestra.setCurriculo(rs.getString("curriculo"));
                 
                 palestras.add(palestra);
                 
             }
        } catch (SQLException ex) {
            Logger.getLogger(ArtigoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.encerrarConexao(connection, stmt, rs);
        }
    return palestras;
    }
      
      
      
      public List<Palestra> readPalestraPorAutor(String autor){
        ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        List<Palestra>palestras = new ArrayList<>();
        
        try {
              stmt = connection.prepareStatement("SELECT * FROM palestra WHERE autor like ?");
            stmt.setString(1,"%" +autor+"%");
            rs = stmt.executeQuery();
            while(rs.next()){
                 Palestra palestra = new Palestra();
                 
                 palestra.setTitulo(rs.getString("titulo"));
                 palestra.setSituacao(rs.getString("situacao"));
                 palestra.setAutor(rs.getString("autor"));
                 palestra.setInstituicao(rs.getString("instituicao"));
                 palestra.setP_chave(rs.getString("p_chave"));
                 palestra.setResumo(rs.getString("resumo"));
                 palestra.setAbstracT(rs.getString("abstracT"));
                 palestra.setDuracao(rs.getString("duracao"));
                 palestra.setCurriculo(rs.getString("curriculo"));
                 
                 palestras.add(palestra);
                 
             }
        } catch (SQLException ex) {
            Logger.getLogger(ArtigoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.encerrarConexao(connection, stmt, rs);
        }
    return palestras;
    }
}
