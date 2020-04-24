/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasseModel;

/**
 *
 * @author Phelype
 */
public class filmes_model {
    private String titulo;
    private diretor_model nomeDiretor;
    private Ator_model nomeAtor;

    public filmes_model(String titulo, diretor_model nomeDiretor, Ator_model nomeAtor) {
        this.titulo = titulo;
        this.nomeDiretor = nomeDiretor;
        this.nomeAtor = nomeAtor;
    }

    public filmes_model() {
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the nomeDiretor
     */
    public diretor_model getNomeDiretor() {
        return nomeDiretor;
    }

    /**
     * @param nomeDiretor the nomeDiretor to set
     */
    public void setNomeDiretor(diretor_model nomeDiretor) {
        this.nomeDiretor = nomeDiretor;
    }

    /**
     * @return the nomeAtor
     */
    public Ator_model getNomeAtor() {
        return nomeAtor;
    }

    /**
     * @param nomeAtor the nomeAtor to set
     */
    public void setNomeAtor(Ator_model nomeAtor) {
        this.nomeAtor = nomeAtor;
    }

    @Override
    public String toString() {
        return "filmes_model{" + "titulo=" + titulo + ", nomeDiretor=" + nomeDiretor + ", nomeAtor=" + nomeAtor + '}';
    }
}
