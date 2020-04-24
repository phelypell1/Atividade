package ClasseModel;
public class diretor_model {
    private String nome;
    private boolean oscar;
    private String filme;

    public diretor_model() {
    }

    public diretor_model(String nome, boolean oscar, String filme) {
        this.nome = nome;
        this.oscar = oscar;
        this.filme = filme;
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
     * @return the oscar
     */
    public boolean isOscar() {
        return oscar;
    }

    /**
     * @param oscar the oscar to set
     */
    public void setOscar(boolean oscar) {
        this.oscar = oscar;
    }

    /**
     * @return the filme
     */
    public String getFilme() {
        return filme;
    }

    /**
     * @param filme the filme to set
     */
    public void setFilme(String filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "diretor_model{" + "nome=" + nome + ", oscar=" + oscar + ", filme=" + filme + '}';
    }
    
    
}
