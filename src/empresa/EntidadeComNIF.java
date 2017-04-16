package empresa;

/**
 *
 * @author Gonçalo Fonseca nº 1150503, Carlos Figueiredo nº 1140317
 */
public class EntidadeComNIF extends Entidade {
    
    public int NIF;
    
    public final int NIF_POR_OMISSAO = 00000000;
    
    public EntidadeComNIF (String nome, String endereco, int NIF) {
        super(nome, endereco);
        this.NIF = NIF;
    }
    
    public EntidadeComNIF () {
        super();
        this.NIF = NIF_POR_OMISSAO;
    }
    
    public EntidadeComNIF (EntidadeComNIF outra) {
        this(outra.getNome(), outra.getEndereco(), outra.NIF);
    }

    public int getNIF() {
        return NIF;
    }

    public void setNIF(int NIF) {
        this.NIF = NIF;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.NIF;
        hash = 59 * hash + this.NIF_POR_OMISSAO;
        return hash;
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
        final EntidadeComNIF other = (EntidadeComNIF) obj;
        if (this.NIF != other.NIF) {
            return false;
        }
        if (this.NIF_POR_OMISSAO != other.NIF_POR_OMISSAO) {
            return false;
        }
        return true;
    }
    
        
    
}
