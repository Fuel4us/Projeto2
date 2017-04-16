package empresa;

import java.util.Objects;

/**
 *
 * @author Gonçalo Fonseca nº 1150503, Carlos Figueiredo nº 1140317
 */
public class Entidade implements ServicoAvaliacao {

    private String nome;
    private String endereco;
    private int avaliacao;
    private int contA = 0;

    public static final String NOME_POR_OMISSAO = "SemNome";
    public static final String ENDERECO_POR_OMISSAO = "SemEndereco";

    public Entidade(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;

    }

    public Entidade() {
        this.nome = NOME_POR_OMISSAO;
        this.endereco = ENDERECO_POR_OMISSAO;
    }

    public Entidade(Entidade outraEntidade) {
        this(outraEntidade.nome, outraEntidade.endereco);
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

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

    @Override
    public float obterAvaliacao() {
        float aval;
        aval = avaliacao;
        return (float) (aval / contA);
    }

    @Override
    public void atualizarAvaliacao(int val) {
        avaliacao += val;
        contA++;
    }

}
