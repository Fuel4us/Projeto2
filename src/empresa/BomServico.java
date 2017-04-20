package empresa;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Gonçalo Fonseca nº 1150503, Carlos Figueiredo nº 1140317
 */
public class BomServico {

    public String nome;
    public String telefone;
    public int NIF;
    public List<Entidade> listaEntidades;

    public static final String NOME_POR_OMISSAO = "Sem nome";
    public static final String TELEFONE_POR_OMISSAO = "Sem telefone";
    public static final int NIF_POR_OMISSAO = 000000000;

    public BomServico(String nome, String telefone, int NIF) {
        this.nome = nome;
        this.telefone = telefone;
        this.NIF = NIF;
        this.listaEntidades = new ArrayList<Entidade>();
    }

    public BomServico() {
        this.nome = NOME_POR_OMISSAO;
        this.telefone = TELEFONE_POR_OMISSAO;
        this.NIF = NIF_POR_OMISSAO;
        this.listaEntidades = new ArrayList<Entidade>();
    }

    public BomServico(BomServico outroBomServico) {
        this.nome = outroBomServico.getNome();
        this.telefone = outroBomServico.getTelefone();
        this.NIF = outroBomServico.getNIF();
        this.listaEntidades = new ArrayList<Entidade>();
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public int getNIF() {
        return NIF;
    }

    public List<Entidade> getListaEntidades() {
        return this.listaEntidades;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setNIF(int NIF) {
        this.NIF = NIF;
    }

    public void inserirEntidadeEmpresa(Entidade entidade) {
        this.listaEntidades.add(entidade);
    }

    public void atualizarAvaliacaoPorObjeto(Entidade entidade, int val) {
        if (listaEntidades.contains(entidade)) {
            listaEntidades.get(listaEntidades.indexOf(entidade)).atualizarAvaliacao(val);
        }

    }

    public float getAvaliacaoPorObjeto(Entidade entidade) {
        if (listaEntidades.contains(entidade)) {
            return listaEntidades.get(listaEntidades.indexOf(entidade)).obterAvaliacao();
        }

        return -1;
    }

}
