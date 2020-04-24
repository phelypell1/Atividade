
package ClasseModel;

import java.util.ArrayList;

public class Ator_model {
    private String nome;
    private int idade;
    private int nOscar;

    public ArrayList<Ator_model> getList() {
        return list;
    }
    
    private ArrayList<Ator_model> list = new ArrayList<Ator_model>();
    public Ator_model(String nome, int idade, int nOscar) {
        this.nome = nome;
        this.idade = idade;
        this.nOscar = nOscar;
    }
    public Ator_model() {
    }
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the nOscar
     */
    public int getnOscar() {
        return nOscar;
    }

    /**
     * @param nOscar the nOscar to set
     */
    public void setnOscar(int nOscar) {
        this.nOscar = nOscar;
    }

    @Override
    public String toString() {
        return getNome();
    }

    public void setList(ArrayList<Ator_model> list) {
        this.list = list;
    }
    
    
    
}
