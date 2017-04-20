package empresa;

import java.util.Objects;

/**
 *
 * @author Gonçalo Fonseca nº 1150503, Carlos Figueiredo nº 1140317
 */
public class Hostel extends EntidadeComAlojamento implements ServicoAlojamento {

    /**
     * variavel da classe tempo ( hora de abertura )
     */
    public Tempo HoraAbertura;

    /**
     * variavel da classe tempo , (hora de encerramento)
     */
    public Tempo HoraEncerramento;

    private Tempo HORA_ABERTURA_POR_OMISSAO = new Tempo(8, 0, 0);
    private Tempo HORA_ENCERRAMENTO_POR_OMISSAO = new Tempo(22, 0, 0);

    /**
     * construtor com parametros :
     *
     * @param nome
     * @param endereco
     * @param NIF
     * @param transfer
     * @param HoraAbertura
     * @param HoraEncerramento
     */
    public Hostel(String nome, String endereco, int NIF, boolean transfer, Tempo HoraAbertura, Tempo HoraEncerramento) {
        super(nome, endereco, NIF, transfer);
        this.HoraAbertura = HoraAbertura;
        this.HoraEncerramento = HoraEncerramento;
    }

    /**
     * construtor sem parametros
     *
     */
    public Hostel() {
        super();
        this.HoraAbertura = HORA_ABERTURA_POR_OMISSAO;
        this.HoraEncerramento = HORA_ENCERRAMENTO_POR_OMISSAO;
    }

    /**
     *
     * @param outroHostel
     */
    public Hostel(Hostel outroHostel) {
        super(outroHostel.getNome(), outroHostel.getEndereco(), outroHostel.getNIF(), outroHostel.isTransfer());
        this.HoraAbertura = outroHostel.getHoraAbertura();
        this.HoraEncerramento = outroHostel.getHoraEncerramento();
    }

    /**
     * get da hora de abertura
     *
     * @return
     */
    public Tempo getHoraAbertura() {
        return HoraAbertura;
    }

    /**
     * get da hora de encerramento
     *
     * @return
     */
    public Tempo getHoraEncerramento() {
        return HoraEncerramento;
    }

    /**
     * modificador da hora de abertura
     *
     * @param HoraAbertura
     */
    public void setHoraAbertura(Tempo HoraAbertura) {
        this.HoraAbertura = HoraAbertura;
    }

    /**
     * modificador da hora de encerramento
     *
     * @param HoraEncerramento
     */
    public void setHoraEncerramento(Tempo HoraEncerramento) {
        this.HoraEncerramento = HoraEncerramento;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.HoraAbertura);
        hash = 79 * hash + Objects.hashCode(this.HoraEncerramento);
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
        final Hostel other = (Hostel) obj;
        if (!Objects.equals(this.HoraAbertura, other.HoraAbertura)) {
            return false;
        }
        if (!Objects.equals(this.HoraEncerramento, other.HoraEncerramento)) {
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
        return " hora de abertura " + HoraAbertura + " e hora de encerramento" + HoraEncerramento;
    }
}
