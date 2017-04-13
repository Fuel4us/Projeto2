package empresa;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gonçalo Fonseca nº 1150503, Carlos Figueiredo nº 1140317
 */
public interface ServicoAvaliacao {

    public static final int FRACO = 1;
    public static final int RAZOAVEL = 2;
    public static final int BOM = 3;
    public static final int MUITO_BOM = 4;
    public static final int EXCELENTE = 5;

    public abstract float obterAvaliacao();
    public abstract void atualizarAvaliacao(int val);
}
