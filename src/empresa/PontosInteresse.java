package empresa;

import java.util.Objects;

/**
 *
 * @author Gonçalo Fonseca nº 1150503, Carlos Figueiredo nº 1140317
 */
public class PontosInteresse extends Entidade {

    /**
     * variavel da categoria
     */
    public String categoria;

    
    public static final String MONUMENTO_CLASSICO = "Monumento Clássico";
    public static final String MONUMENTO_COMTEMPORANEO = "Monumento Contemporaneo";
    public static final String PRACA = "Praça";
    public static final String OUTRO = "Outro";

    public static final String CATEGORIA_POR_OMISSAO = OUTRO;

    /**
     * construtor com parametros 
     * 
     * @param nome
     * @param endereco
     * @param categoria 
     */
    public PontosInteresse(String nome, String endereco, int categoria) {
        super(nome, endereco);
        
        if (categoria == 4) {
            this.categoria = OUTRO;
        } else if (categoria == 3) {
            this.categoria = PRACA;
        } else if (categoria == 2) {
            this.categoria = MONUMENTO_CLASSICO;
        } else if (categoria == 1){
            this.categoria = MONUMENTO_COMTEMPORANEO;
        } else if (categoria == 0) {
            this.categoria = CATEGORIA_POR_OMISSAO;
        }
    }

    /**
     * construtor sem parametros
     */
    public PontosInteresse() {
        super();
        this.categoria = CATEGORIA_POR_OMISSAO;
    }
    
    /**
     * 
     * @param outra 
     */
    public PontosInteresse(PontosInteresse outra) {
        super(outra.getNome(), outra.getEndereco());
        this.categoria = outra.getCategoria();
    }

    /**
     * get da categoria
     * @return 
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * modificador da categoria
     * @param categoria 
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.categoria);
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
        final PontosInteresse other = (PontosInteresse) obj;
        if (!Objects.equals(this.categoria, other.categoria)) {
            return false;
        }
        return true;
    }
    
    
    @Override
 public String toString(){
     return super.toString() + " e categoria : " + categoria;
 }
}
