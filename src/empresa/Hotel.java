package empresa;

import java.util.Objects;

/**
 *
 * @author Gonçalo Fonseca nº 1150503, Carlos Figueiredo nº 1140317
 */
public class Hotel extends EntidadeComAlojamento implements ServicoHotel {
    
    /**
     * variavel da categoria
     */
    public String categoria;
    /**
     * variavel serviço guia
     */
    public boolean servicoGuia;
    /**
     * variavel servico spa
     */
    public boolean servicoSPA;
    
    public static final boolean SERVICOGUIA_POR_OMISSAO = false;
    public static final boolean SERVICOSPA_POR_OMISSAO = false;
    
    /**
     * construtor com parametros : 
     * 
     * @param nome
     * @param endereco
     * @param NIF
     * @param transfer
     * @param categoria
     * @param servicoSPA
     * @param servicoGuia 
     */
    public Hotel(String nome, String endereco, int NIF, boolean transfer, int categoria, boolean servicoSPA, boolean servicoGuia) {
        super(nome, endereco, NIF, transfer);
        this.servicoGuia = servicoGuia;
        this.servicoSPA = servicoSPA;
                
        if (categoria == 1) {
            this.categoria = UMA_ESTRELA;
        } else if (categoria == 2) {
            this.categoria = DUAS_ESTRELAS;
        } else if (categoria == 3) {
            this.categoria = TRES_ESTRELAS;
        } else if (categoria == 4) {
            this.categoria = QUATRO_ESTRELAS;
        } else if (categoria == 5) {
            this.categoria = CINCO_ESTRELAS;
        }
    }
    
    /**
     * construtor sem parametros
     */
    public Hotel () {
        super();
        this.categoria = CATEGORIA_POR_OMISSAO;
        this.servicoGuia = SERVICOGUIA_POR_OMISSAO;
        this.servicoSPA = SERVICOSPA_POR_OMISSAO;
    }
    
    /**
     * 
     * @param outra 
     */
    public Hotel (Hotel outra) {
        super(outra.getNome(), outra.getEndereco(), outra.getNIF(), outra.isTransfer());
        this.categoria = outra.getCategoria();
        this.servicoGuia = outra.isServicoGuia();
        this.servicoSPA = outra.isServicoSPA();
    }

    /**
     * get da categoria
     * @return 
     */
    public String getCategoria() {
        return categoria;
    }
    /**
     * get do serviço guia
     * @return 
     */
    public boolean isServicoGuia() {
        return servicoGuia;
    }
    /**
     * get do serviço spa
     * @return 
     */
    public boolean isServicoSPA() {
        return servicoSPA;

    }   
    /**
     * modificador do servico guia
     * @param servicoGuia 
     */
    public void setServicoGuia(boolean servicoGuia) {
        this.servicoGuia = servicoGuia;
    }

    /**
     * modificador da categoria
     * 
     * @param categoria 
     */
        public void setCategoria(String categoria) {
        this.categoria = categoria;
    }


    /**
     * modificador do serviço spa
     * 
     * @param servicoSPA 
     */    
    public void setServicoSPA(boolean servicoSPA) {
        this.servicoSPA = servicoSPA;
    }
    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.categoria);
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
        final Hotel other = (Hotel) obj;
        if (!Objects.equals(this.categoria, other.categoria)) {
            return false;
        }
        return true;
    }
    
    /**
     * 
     * @return 
     */
    @Override
    public boolean validarServicoGuia() {
        return isServicoGuia();
    }

    /**
     * 
     * @return 
     */
    @Override
    public boolean validarServicoSPA() {
        return isServicoSPA();
    }
    
@Override
    public String toString() {
  if(this.servicoGuia){
                if(this.servicoSPA){
                    return super.toString() + " Serviço Guia: tem, Serviço SPA: tem, Categoria: "+this.categoria;
                }else{
                    return super.toString() + " Serviço Guia: tem, Serviço SPA: não tem, Categoria: "+this.categoria;
                }
            }else{
                if(this.servicoSPA){
                    return super.toString() + "Serviço Guia: não tem, Serviço SPA: tem, Categoria: "+this.categoria;
                }else{
                    return super.toString() + "Serviço Guia: não tem, Serviço SPA: não tem, Categoria: "+this.categoria;
                }
            }
    }
    
    
}
