package empresa;

/**
 *
 * @author Gonçalo Fonseca nº 1150503, Carlos Figueiredo nº 1140317
 */
public class EntidadeComAlojamento extends EntidadeComNIF implements ServicoAlojamento {

    public boolean transfer;

    public EntidadeComAlojamento(String nome, String endereco, int NIF, boolean transfer) {
        super(nome, endereco, NIF);
        this.transfer = transfer;
    }

    public EntidadeComAlojamento() {
        super();
        this.transfer = SERVICO_POR_OMISSAO;
    }

    public EntidadeComAlojamento(EntidadeComAlojamento outra) {
        super(outra.getNome(), outra.getEndereco(), outra.getNIF());
        this.transfer = outra.isTransfer();
    }

    public boolean isTransfer() {
        return transfer;
    }

    public void setTransfer(boolean transfer) {
        this.transfer = transfer;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + (this.transfer ? 1 : 0);
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
        final EntidadeComAlojamento other = (EntidadeComAlojamento) obj;
        if (this.transfer != other.transfer) {
            return false;
        }
        return true;
    }

    @Override
    public boolean validarServicoTransfer() {
        return  isTransfer();
    }

}
