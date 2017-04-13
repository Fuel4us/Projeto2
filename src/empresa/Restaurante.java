package empresa;

import java.util.Objects;

/**
 *
 * @author Gonçalo Fonseca nº 1150503, Carlos Figueiredo nº 1140317
 */
public class Restaurante extends EntidadeComNIF {

    public int precoMedioPorPessoa;
    public String categoria;

    public static final String COZINHA_TRADICIONAL = "Cozinha tradicional Portuguesa";
    public static final String COZINHA_ITALIANA = "Cozinha Italiana";
    public static final String COZINHA_CHINESA = "Cozinha chinesa";
    public static final String OUTRA = COZINHA_TRADICIONAL;

    public Restaurante(String nome, String endereco, int NIF, int categoria, int precoMedioPorPessoa) {
        super(nome, endereco, NIF);

        if (categoria == 3) {
            this.categoria = OUTRA;
        } else if (categoria == 2) {
            this.categoria = COZINHA_CHINESA;
        } else if (categoria == 1) {
            this.categoria = COZINHA_ITALIANA;
        } else if (categoria == 0) {
            this.categoria = COZINHA_TRADICIONAL;

        }

        this.precoMedioPorPessoa = precoMedioPorPessoa;
    }

    public Restaurante() {
        super();
        this.categoria = OUTRA;
        this.precoMedioPorPessoa = 0;
    }

    public Restaurante(Restaurante outra) {
        super(outra.getNome(), outra.getEndereco(), outra.getNIF());
        this.categoria = outra.getCategoria();
        this.precoMedioPorPessoa = outra.getPrecoMedioPorPessoa();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getPrecoMedioPorPessoa() {
        return precoMedioPorPessoa;
    }

    public void setPrecoMedioPorPessoa(int precoMedioPorPessoa) {
        this.precoMedioPorPessoa = precoMedioPorPessoa;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.precoMedioPorPessoa;
        hash = 97 * hash + Objects.hashCode(this.categoria);
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
        final Restaurante other = (Restaurante) obj;
        if (this.precoMedioPorPessoa != other.precoMedioPorPessoa) {
            return false;
        }
        if (!Objects.equals(this.categoria, other.categoria)) {
            return false;
        }
        return true;
    }

}
