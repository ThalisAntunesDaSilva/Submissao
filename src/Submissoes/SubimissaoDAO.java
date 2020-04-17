package Submissoes;

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
import model.dao.ArtigoDAO;



public class SubimissaoDAO   {

    private Connection connection;

    private ArrayList<Submissao> submissoes = new ArrayList<Submissao>();

public SubimissaoDAO(){
    this.connection = new ConnectionFactory().getConnection();
}



    
    public boolean incluir(Submissao submissao) throws SQLException {
    System.out.print("Subimissoes - " +submissao.toString());
    
    String sql = "INSERT INTO submissao(titulo,situacao,autor,max_autores) values (?,?,?,?)";

    try{
PreparedStatement stmt = connection.prepareStatement(sql);

stmt.setString(1, submissao.getTitulo());
stmt.setObject(2, submissao.getSituacao());
stmt.setString(3, submissao.getAutor());
stmt.setString(4, submissao.getMax_autor());

stmt.execute();
stmt.close();
    
JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
} catch (SQLException u) {
            throw new RuntimeException(u);
        }

return false;


    }


    
    public String consultarTitulo(String titulo) {
        
            String info;
            for (Submissao s : submissoes) {
                if (titulo.equals(s.getTitulo())) {
                    info = s.toString();
               
                   return info;    
                    
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Titulo não encontrado");
                }
            }
       
           return null; 
            
        }
    
 public List<Submissao> consultarAutor(String autor){
   
     Connection con =  ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       ResultSet rs = null;
       
       List<Submissao> submissoes = new ArrayList <> ();
       
       
       
    
    ArrayList listaAutor = new ArrayList();

    try {
      stmt = connection.prepareStatement("SELECT * FROM submissoes WHERE titulo LIKE ? ");
      stmt.setString(1, "%"+autor+"%");
      rs = stmt.executeQuery();

        while (rs.next()) {
            Submissao submissao = new Submissao();

            submissao.setTitulo(rs.getString("Titulo")); 
           
          

            submissoes.add(submissao);
        }
 
    } catch (SQLException u) {
        throw new RuntimeException(u);
    }

    return submissoes;
  
        
        }
    

  
    public boolean excluir(String titulo) {
        for (Submissao s : submissoes) {
            if (titulo.equals(s.getTitulo())) {
                return true;
            }
        }
        return false;
    }     
    
     public List<Artigo> read(){
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
    
    

    }
    

