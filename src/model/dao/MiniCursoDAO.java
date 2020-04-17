package model.dao;

import Apresentações.MiniCurso;
import Apresentações.Palestra;
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

public class MiniCursoDAO {
     private Connection connection;

    private ArrayList<MiniCurso> miniCursos = new ArrayList<MiniCurso>();

    public MiniCursoDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void cadastrar(MiniCurso minicurso) {
        System.out.print("MiniCursoDAO - " + minicurso.toString());
        String sql = "INSERT INTO miniCurso (titulo,situacao,autor,resumo,abstracT,duracao,curriculo,recursos,metodologia)VALUES(?,?,?,?,?,?,?,?,?)";

     
        
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, minicurso.getTitulo());
            stmt.setString(2, minicurso.getSituacao());
            stmt.setString(3, minicurso.getAutor());
            stmt.setString(4, minicurso.getResumo());
            stmt.setString(5, minicurso.getAbstracT());
            stmt.setString(6, minicurso.getDuracao());
            stmt.setString(7, minicurso.getCurriculo());
             stmt.setString(8, minicurso.getRecursos());
            stmt.setString(9, minicurso.getMetodologia());

            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "erro ao salvar" + u);
            throw new RuntimeException(u);

        }

        miniCursos.add(minicurso);
    }

    public void editar(MiniCurso minicurso) {

        String sql = "UPDATE minicurso SET titulo = ? ,situacao = ?,autor = ?,resumo = ?,abstracT = ?,duracao = ?,curriculo = ?,recursos = ? ,metodologia = ? WHERE titulo like ? ";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
             stmt.setString(10,"%" +minicurso.getTitulo()+"%");
            stmt.setString(1, minicurso.getTitulo());
            stmt.setString(2, minicurso.getSituacao());
            stmt.setString(3, minicurso.getAutor());
            stmt.setString(4, minicurso.getResumo());
            stmt.setString(5, minicurso.getAbstracT());
            stmt.setString(6, minicurso.getDuracao());
            stmt.setString(7, minicurso.getCurriculo());
             stmt.setString(8, minicurso.getRecursos());
            stmt.setString(9, minicurso.getMetodologia());

            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
        } catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "erro ao salvar" + u);
            throw new RuntimeException(u);

        }

        miniCursos.add(minicurso);
    }


    public void remover(MiniCurso minicurso) {

       String sql = "DELETE FROM minicurso WHERE titulo LIKE ?";

       
try {
            PreparedStatement stmt = connection.prepareStatement(sql);
             stmt.setString(1,"%" +minicurso.getTitulo()+"%");
            
            stmt.execute();

            JOptionPane.showMessageDialog(null, "Removido com sucesso!");
        } catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "erro ao excluir" + u);
            throw new RuntimeException(u);

        }

        miniCursos.add(minicurso);
    }

  
    
    public List<MiniCurso> readMiniCurso(){
        ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        List<MiniCurso>miniCursos = new ArrayList<>();
        
        try {
            stmt = connection.prepareStatement("SELECT * FROM miniCurso");
             rs = stmt.executeQuery();
             
             while(rs.next()){
                 MiniCurso miniCurso = new MiniCurso();
                 
                 miniCurso.setTitulo(rs.getString("titulo"));
                 miniCurso.setSituacao(rs.getString("situacao"));
                 miniCurso.setAutor(rs.getString("autor"));
                 miniCurso.setResumo(rs.getString("resumo"));
                 miniCurso.setAbstracT(rs.getString("abstracT"));
                 miniCurso.setDuracao(rs.getString("duracao"));
                 miniCurso.setCurriculo(rs.getString("curriculo"));
                 miniCurso.setRecursos(rs.getString("recursos"));
                 miniCurso.setMetodologia(rs.getString("metodologia"));
                
                 miniCursos.add(miniCurso);
                 
             }
        } catch (SQLException ex) {
            Logger.getLogger(ArtigoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.encerrarConexao(connection, stmt, rs);
        }
    return miniCursos;
    }
    
    
    public List<MiniCurso> readMiniCursoAprovado(){
        ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        List<MiniCurso>miniCursos = new ArrayList<>();
        
        try {
             stmt = connection.prepareStatement("SELECT * FROM minicurso WHERE situacao = 'Aprovado'");
           
            rs = stmt.executeQuery();
             
             while(rs.next()){
                 MiniCurso miniCurso = new MiniCurso();
                 
                 miniCurso.setTitulo(rs.getString("titulo"));
                 miniCurso.setSituacao(rs.getString("situacao"));
                 miniCurso.setAutor(rs.getString("autor"));
                 miniCurso.setResumo(rs.getString("resumo"));
                 miniCurso.setAbstracT(rs.getString("abstracT"));
                 miniCurso.setDuracao(rs.getString("duracao"));
                 miniCurso.setCurriculo(rs.getString("curriculo"));
                 miniCurso.setRecursos(rs.getString("recursos"));
                 miniCurso.setMetodologia(rs.getString("metodologia"));
                
                 miniCursos.add(miniCurso);
                 
             }
        } catch (SQLException ex) {
            Logger.getLogger(ArtigoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.encerrarConexao(connection, stmt, rs);
        }
    return miniCursos;
    }
    
    
    public List<MiniCurso> readMiniCursoReprovado(){
        ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        List<MiniCurso>miniCursos = new ArrayList<>();
        
        try {
             stmt = connection.prepareStatement("SELECT * FROM minicurso WHERE situacao = 'Reprovado'");
           
            rs = stmt.executeQuery();
             
             while(rs.next()){
                 MiniCurso miniCurso = new MiniCurso();
                 
                 miniCurso.setTitulo(rs.getString("titulo"));
                 miniCurso.setSituacao(rs.getString("situacao"));
                 miniCurso.setAutor(rs.getString("autor"));
                 miniCurso.setResumo(rs.getString("resumo"));
                 miniCurso.setAbstracT(rs.getString("abstracT"));
                 miniCurso.setDuracao(rs.getString("duracao"));
                 miniCurso.setCurriculo(rs.getString("curriculo"));
                 miniCurso.setRecursos(rs.getString("recursos"));
                 miniCurso.setMetodologia(rs.getString("metodologia"));
                
                 miniCursos.add(miniCurso);
                 
             }
        } catch (SQLException ex) {
            Logger.getLogger(ArtigoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.encerrarConexao(connection, stmt, rs);
        }
    return miniCursos;
    }
    
    
      public List<MiniCurso> readMiniCursoSobAvaliação(){
        ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        List<MiniCurso>miniCursos = new ArrayList<>();
        
        try {
             stmt = connection.prepareStatement("SELECT * FROM minicurso WHERE situacao = 'SobAvaliação'");
           
            rs = stmt.executeQuery();
             
             while(rs.next()){
                 MiniCurso miniCurso = new MiniCurso();
                 
                 miniCurso.setTitulo(rs.getString("titulo"));
                 miniCurso.setSituacao(rs.getString("situacao"));
                 miniCurso.setAutor(rs.getString("autor"));
                 miniCurso.setResumo(rs.getString("resumo"));
                 miniCurso.setAbstracT(rs.getString("abstracT"));
                 miniCurso.setDuracao(rs.getString("duracao"));
                 miniCurso.setCurriculo(rs.getString("curriculo"));
                 miniCurso.setRecursos(rs.getString("recursos"));
                 miniCurso.setMetodologia(rs.getString("metodologia"));
                
                 miniCursos.add(miniCurso);
                 
             }
        } catch (SQLException ex) {
            Logger.getLogger(ArtigoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.encerrarConexao(connection, stmt, rs);
        }
    return miniCursos;
    }
    
    
    
      public List<MiniCurso> readMiniCursoPorAutor(String autor){
        ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        List<MiniCurso>miniCursos = new ArrayList<>();
        
        try {
             stmt = connection.prepareStatement("SELECT * FROM minicurso WHERE autor like ?");
            stmt.setString(1,"%" +autor+"%");
            rs = stmt.executeQuery();
            
             while(rs.next()){
                 MiniCurso miniCurso = new MiniCurso();
                 
                 miniCurso.setTitulo(rs.getString("titulo"));
                 miniCurso.setSituacao(rs.getString("situacao"));
                 miniCurso.setAutor(rs.getString("autor"));
                 miniCurso.setResumo(rs.getString("resumo"));
                 miniCurso.setAbstracT(rs.getString("abstracT"));
                 miniCurso.setDuracao(rs.getString("duracao"));
                 miniCurso.setCurriculo(rs.getString("curriculo"));
                 miniCurso.setRecursos(rs.getString("recursos"));
                 miniCurso.setMetodologia(rs.getString("metodologia"));
                
                 miniCursos.add(miniCurso);
                 
             }
        } catch (SQLException ex) {
            Logger.getLogger(ArtigoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.encerrarConexao(connection, stmt, rs);
        }
    return miniCursos;
    }
    
}
