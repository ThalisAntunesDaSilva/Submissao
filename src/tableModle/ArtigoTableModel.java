package tableModle;

import Cientifico.Artigo;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Thalis Antunes
 */
public class ArtigoTableModel extends AbstractTableModel {

    private String colunas[] = {"Titulo", "Autor"};
    private List<Artigo> dados;

    @Override
    public int getRowCount() {
        if(dados == null){
            return 0;
        }
        return dados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int l, int c) {
        Artigo artigo = dados.get(l);
        switch (c) {
            case 0:
                return artigo.getTitulo();
            case 1:
                return artigo.getAutor();
            default:
                throw new IndexOutOfBoundsException("Coluna inexistente!");
        }
    }

    @Override
    public String getColumnName(int c) {
        return colunas[c];
    }

    @Override
    public boolean isCellEditable(int l, int c) {
        return false;
    }

    public void setDados(List<Artigo> dados) {
        this.dados = dados;
        fireTableDataChanged();
    }

    public Artigo getRowValue(int l) {
        return dados.get(l);
    }
}

