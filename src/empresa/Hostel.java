package empresa;

import java.util.Objects;


/**
 *
 * @author Gonçalo Fonseca nº 1150503, Carlos Figueiredo nº 1140317
 */
public class Hostel extends EntidadeComAlojamento implements ServicoAlojamento {
    
    public Tempo HoraAbertura;
    public Tempo HoraEncerramento;
    
    private Tempo HORA_ABERTURA_POR_OMISSAO = new Tempo (8, 0 ,0);
    private Tempo HORA_ENCERRAMENTO_POR_OMISSAO = new Tempo(22, 0, 0);
    
    public Hostel (String nome, String endereco, int NIF, boolean transfer, Tempo HoraAbertura, Tempo HoraEncerramento) {
        super(nome, endereco, NIF, transfer);
        this.HoraAbertura = HoraAbertura;
        this.HoraEncerramento = HoraEncerramento;
    }
    
    public Hostel () {
        super();
        this.HoraAbertura = HORA_ABERTURA_POR_OMISSAO;
        this.HoraEncerramento = HORA_ENCERRAMENTO_POR_OMISSAO;
    }
    
    public Hostel (Hostel outroHostel) {
        super(outroHostel.getNome(), outroHostel.getEndereco(), outroHostel.getNIF(), outroHostel.isTransfer());
        this.HoraAbertura = outroHostel.getHoraAbertura();
        this.HoraEncerramento = outroHostel.getHoraEncerramento();
    }

    public Tempo getHoraAbertura() {
        return HoraAbertura;
    }

    public void setHoraAbertura(Tempo HoraAbertura) {
        this.HoraAbertura = HoraAbertura;
    }

    public Tempo getHoraEncerramento() {
        return HoraEncerramento;
    }

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
    
    @Override
    public boolean validarServicoTransfer() {
        return  isTransfer();
    }
    
}
