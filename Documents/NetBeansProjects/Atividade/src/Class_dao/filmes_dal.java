/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_dao;

import ClasseModel.diretor_model;
import ClasseModel.filmes_model;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Phelype
 */
public class filmes_dal {
     ArrayList<filmes_model> list = new ArrayList<filmes_model>();

    public void Cadastrar(filmes_model filmes) {
        list.add(filmes);
        JOptionPane.showMessageDialog(null, list.size());
    }
}
