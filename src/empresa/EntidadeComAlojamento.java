package empresa;

/**
 *
 * @author Gonçalo Fonseca nº 1150503, Carlos Figueiredo nº 1140317
 */
public class EntidadeComAlojamento extends EntidadeComNIF implements ServicoAlojamento {

    /**
     * variavel transfer
     */
    public boolean transfer;

    /**
     * construtor da entidade com alojamento
     *
     * @param nome
     * @param endereco
     * @param NIF
     * @param transfer
     */
    public EntidadeComAlojamento(String nome, String endereco, int NIF, boolean transfer) {
        super(nome, endereco, NIF);
        this.transfer = transfer;
    }

    /**
     * construtor sem parametros
     *
     */
    public EntidadeComAlojamento() {
        super();
        this.transfer = SERVICO_POR_OMISSAO;
    }

    /**
     *
     * @param outra
     */
    public EntidadeComAlojamento(EntidadeComAlojamento outra) {
        super(outra.getNome(), outra.getEndereco(), outra.getNIF());
        this.transfer = outra.isTransfer();
    }

    /**
     * get do trasfer
     *
     * @return
     */
    public boolean isTransfer() {
        return transfer;
    }

    /**
     * modificador do trasfer
     *
     * @param transfer
     */
    public void setTransfer(boolean transfer) {
        this.transfer = transfer;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + (this.transfer ? 1 : 0);
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
        final EntidadeComAlojamento other = (EntidadeComAlojamento) obj;
        if (this.transfer != other.transfer) {
            return false;
        }
        return true;
    }

    /**
     *
     * @return
     */
    @Override
    public boolean validarServicoTransfer() {
        return isTransfer();
    }

    @Override
    public String toString() {
        if (this.transfer) {
            return super.toString() + "Serviço transfer : tem ";
        } else {
            return super.toString() + "Serviço transfer : não tem ";
        }

    }
}
