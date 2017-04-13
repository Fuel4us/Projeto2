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
public interface ServicoHotel {

    public static final String UMA_ESTRELA = "*";
    public static final String DUAS_ESTRELAS = "**";
    public static final String TRES_ESTRELAS = "***";
    public static final String QUATRO_ESTRELAS = "****";
    public static final String CINCO_ESTRELAS = "*****";
    public static final String CATEGORIA_POR_OMISSAO = UMA_ESTRELA;

    public abstract boolean validarServicoGuia();
    public abstract boolean validarServicoSPA();

}
