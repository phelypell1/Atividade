/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_dao;

import ClasseModel.diretor_model;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Phelype
 */
public class diretor_dal {
    ArrayList<diretor_model> list = new ArrayList<diretor_model>();

    public void Cadastrar(diretor_model director) {
        list.add(director);
        JOptionPane.showMessageDialog(null, list);
    }
}
