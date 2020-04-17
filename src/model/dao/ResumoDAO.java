
package model.dao;

import Apresentações.MiniCurso;
import Cientifico.Monografia;
import Cientifico.RelatorioTecnico;
import Cientifico.Resumo;
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

public class ResumoDAO {
  
    
   
private Connection connection;

    private ArrayList<Resumo> resumos = new ArrayList<Resumo>();



    public ResumoDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void cadastrar(Resumo resumo) {
        System.out.print("ArtigoDAO - " + resumo.toString());
        String sql = "INSERT INTO resumo (titulo,situacao,autor,instituicao,p_chave)VALUES(?,?,?,?,?)";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, resumo.getTitulo());
            stmt.setString(2, resumo.getSituacao());
            stmt.setString(3, resumo.getAutor());
            stmt.setString(4, resumo.getInstituicao());
            stmt.setString(5, resumo.getPalavraChave());
          
            
          
            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "erro ao salvar" + u);
            throw new RuntimeException(u);

        }

        resumos.add(resumo);
    }

    public void editar(Resumo resumo) {

      String sql =  "UPDATE resumo SET titulo = ? ,situacao = ?,autor = ? ,instituicao = ? ,p_chave = ? WHERE titulo LIKE ?";

        
        
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
           
             
                   stmt.setString(6,"%" +resumo.getTitulo()+"%");
             stmt.setString(1, resumo.getTitulo());
            stmt.setString(2, resumo.getSituacao());
             stmt.setString(3, resumo.getAutor());
            stmt.setString(4, resumo.getInstituicao());
            stmt.setString(5, resumo.getPalavraChave());
          
            
          
            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
        } catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "erro ao salvar" + u);
            throw new RuntimeException(u);

        }

        resumos.add(resumo);
    }


    public void remover(Resumo resumo) {

        String sql = "DELETE FROM resumo WHERE titulo = ?";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(1, resumo.getTitulo());
            stmt.execute();

        JOptionPane.showMessageDialog(null, "Removido com sucesso!");
        } catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "erro ao excluir" + u);
            throw new RuntimeException(u);

        }

        resumos.add(resumo);
    }
 
    
     public List<Resumo> readResumo(){
        ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        List<Resumo>resumos = new ArrayList<>();
        
        try {
            stmt = connection.prepareStatement("SELECT * FROM resumo");
             rs = stmt.executeQuery();
             
             while(rs.next()){
                 Resumo resumo = new Resumo();
                 
                 resumo.setTitulo(rs.getString("titulo"));
                 resumo.setSituacao(rs.getString("situacao"));
                 resumo.setAutor(rs.getString("autor"));
                 resumo.setInstituicao(rs.getString("instituicao"));
                 resumo.setPalavraChave(rs.getString("p_chave"));
                
                
                 resumos.add(resumo);
                 
             
             }
        } catch (SQLException ex) {
            Logger.getLogger(ArtigoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.encerrarConexao(connection, stmt, rs);
        }
    return resumos;
    }
     
     
     public List<Resumo> readResumoAprovado(){
        ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        List<Resumo>resumos = new ArrayList<>();
        
        try {
          stmt = connection.prepareStatement("SELECT * FROM resumo WHERE situacao = 'Aprovado'");
           
            rs = stmt.executeQuery();
             
             while(rs.next()){
                 Resumo resumo = new Resumo();
                 
                 resumo.setTitulo(rs.getString("titulo"));
                 resumo.setSituacao(rs.getString("situacao"));
                 resumo.setAutor(rs.getString("autor"));
                 resumo.setInstituicao(rs.getString("instituicao"));
                 resumo.setPalavraChave(rs.getString("p_chave"));
                
                
                 resumos.add(resumo);
                 
             
             }
        } catch (SQLException ex) {
            Logger.getLogger(ArtigoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.encerrarConexao(connection, stmt, rs);
        }
    return resumos;
    }
     
     public List<Resumo> readResumoReprovado(){
        ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        List<Resumo>resumos = new ArrayList<>();
        
        try {
          stmt = connection.prepareStatement("SELECT * FROM resumo WHERE situacao = 'Reprovado'");
           
            rs = stmt.executeQuery();
             
             while(rs.next()){
                 Resumo resumo = new Resumo();
                 
                 resumo.setTitulo(rs.getString("titulo"));
                 resumo.setSituacao(rs.getString("situacao"));
                 resumo.setAutor(rs.getString("autor"));
                 resumo.setInstituicao(rs.getString("instituicao"));
                 resumo.setPalavraChave(rs.getString("p_chave"));
                
                
                 resumos.add(resumo);
                 
             
             }
        } catch (SQLException ex) {
            Logger.getLogger(ArtigoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.encerrarConexao(connection, stmt, rs);
        }
    return resumos;
    }
     
     
     public List<Resumo> readResumoSobAvaliação(){
        ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        List<Resumo>resumos = new ArrayList<>();
        
        try {
          stmt = connection.prepareStatement("SELECT * FROM resumo WHERE situacao = 'SobAvaliação'");
           
            rs = stmt.executeQuery();
             
             while(rs.next()){
                 Resumo resumo = new Resumo();
                 
                 resumo.setTitulo(rs.getString("titulo"));
                 resumo.setSituacao(rs.getString("situacao"));
                 resumo.setAutor(rs.getString("autor"));
                 resumo.setInstituicao(rs.getString("instituicao"));
                 resumo.setPalavraChave(rs.getString("p_chave"));
                
                
                 resumos.add(resumo);
                 
             
             }
        } catch (SQLException ex) {
            Logger.getLogger(ArtigoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.encerrarConexao(connection, stmt, rs);
        }
    return resumos;
    }
     
     
     public List<Resumo> readResumoPorAutor(String autor){
        ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        List<Resumo>resumos = new ArrayList<>();
        
        try {
              stmt = connection.prepareStatement("SELECT * FROM resumo WHERE autor like ?");
            stmt.setString(1,"%" +autor+"%");
             rs = stmt.executeQuery();
             while(rs.next()){
                 Resumo resumo = new Resumo();
                 
                 resumo.setTitulo(rs.getString("titulo"));
                 resumo.setSituacao(rs.getString("situacao"));
                 resumo.setAutor(rs.getString("autor"));
                 resumo.setInstituicao(rs.getString("instituicao"));
                 resumo.setPalavraChave(rs.getString("p_chave"));
                
                
                 resumos.add(resumo);
                 
             
             }
        } catch (SQLException ex) {
            Logger.getLogger(ArtigoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.encerrarConexao(connection, stmt, rs);
        }
    return resumos;
    }
}
