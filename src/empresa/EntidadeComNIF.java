package empresa;

/**
 *
 * @author Gonçalo Fonseca nº 1150503, Carlos Figueiredo nº 1140317
 */
public class EntidadeComNIF extends Entidade {
    
    /**
     * variavel referente ao NIF
     */
    public int NIF;
    
    public final int NIF_POR_OMISSAO = 00000000;
    
    /**
     * construtor com parametros :
     * 
     * @param nome
     * @param endereco
     * @param NIF 
     */
    public EntidadeComNIF (String nome, String endereco, int NIF) {
        super(nome, endereco);
        this.NIF = NIF;
    }
    
    /**
     * construtor sem parametros
     * 
     */
    public EntidadeComNIF () {
        super();
        this.NIF = NIF_POR_OMISSAO;
    }
    
    /**
     * 
     * @param outra 
     */
    public EntidadeComNIF (EntidadeComNIF outra) {
        this(outra.getNome(), outra.getEndereco(), outra.NIF);
    }

    /**
     * get do NIF
     * 
     * @return 
     */
    public int getNIF() {
        return NIF;
    }

    /**
     * modificador do nif
     * 
     * @param NIF 
     */
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

    /**
     * metodo equals 
     * 
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
        final EntidadeComNIF other = (EntidadeComNIF) obj;
        if (this.NIF != other.NIF) {
            return false;
        }
        if (this.NIF_POR_OMISSAO != other.NIF_POR_OMISSAO) {
            return false;
        }
        return true;
    }
    
    @Override
         public String toString(){
        return super.toString() + " , de NIF "+NIF  ;
    }
    
}
