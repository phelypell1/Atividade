package Class_dao;

import ClasseModel.Ator_model;
import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class ator_dal {

   
  public ArrayList<Ator_model> list = new ArrayList<Ator_model>();
    public void Cadastrar(Ator_model actor) {
        list.add(actor);
        JOptionPane.showMessageDialog(null, list.);
    }
}
