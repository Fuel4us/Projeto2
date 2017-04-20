package empresa;

import java.util.Objects;

/**
 *
 * @author Gonçalo Fonseca nº 1150503, Carlos Figueiredo nº 1140317
 */
public class Entidade implements ServicoAvaliacao, Comparable<Entidade> {

    /**
     * nome da entidade
     */
    private String nome;
    
    /**
     * endereço da entidade
     */
    private String endereco;
    
    /**
     * media da avaliaçao feita pelo publico
     */
    private int avaliacao;
    
    /**
     * contador de pessoas
     */
    private int contA = 0;

    public static final String NOME_POR_OMISSAO = "SemNome";
    public static final String ENDERECO_POR_OMISSAO = "SemEndereco";

    /**
     * Construtor 
     * 
     * @param nome
     * @param endereco 
     */
    public Entidade(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;

    }
   
    /**
     * Construtor sem parametros
     */
    public Entidade() {
        this.nome = NOME_POR_OMISSAO;
        this.endereco = ENDERECO_POR_OMISSAO;
    }

    /**
     * 
     * @param outraEntidade 
     */
    public Entidade(Entidade outraEntidade) {
        this(outraEntidade.nome, outraEntidade.endereco);
    }

    /**
     * get do nome
     * 
     * @return 
     */
    public String getNome() {
        return nome;
    }
    /**
     * get do endereço
     * @return 
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * modificador do nome
     * @param nome 
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * modificador do endereço
     * @param endereco 
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * metodo equals para verificar a igualdade de 2 objetos
     * @param obj
     * @return 
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Entidade other = (Entidade) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.endereco, other.endereco)) {
            return false;
        }
        return true;
    }

    /**
     * metodo para obter a avaliaçao feita pelos utilizadores
     * @return 
     */
    @Override
    public float obterAvaliacao() {
        float aval;
        aval = avaliacao;
        return (float) (aval / contA);
    }

    /**
     * metodo para atualizar a avaliaçao
     * @param val 
     */
    @Override
    public void atualizarAvaliacao(int val) {
        avaliacao += val;
        contA++;
    }

    
    /**
     * metodo para comparar 2 nomes guardados na List Entidade
     * @param entidade
     * @return 
     */
    @Override
    public int compareTo(Entidade entidade) {
        return this.nome.compareToIgnoreCase(entidade.getNome());
    }

    @Override
    public String toString(){
        return "A entidadede nome " + nome + " tem de endereço " + endereco  ;
    }
}
