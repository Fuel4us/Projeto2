package empresa;

import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Gonçalo Fonseca nº 1150503, Carlos Figueiredo nº 1140317
 */
public class ClasseTestes {

    private static Scanner ler = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Lista
        BomServico bomServico = new BomServico();
        
        // Hoteis
        Hotel h1= new Hotel("Palacio","Rua um",250250250,true,2,false,true);
        bomServico.inserirEntidadeEmpresa(h1);
        Hotel h2= new Hotel("Castelo","Rua dois",251251251,false,4,true,false);
        bomServico.inserirEntidadeEmpresa(h2);
        Hotel h3= new Hotel("Casa do Povo","rua tres",252525252,true,5,true,true);
        bomServico.inserirEntidadeEmpresa(h3);
        
        // Hostel
        Hostel hs1= new Hostel("barraco","morro um",123456789,false,new Tempo(8,0,0),new Tempo(22,0,0));
        bomServico.inserirEntidadeEmpresa(hs1);
        Hostel hs2= new Hostel("favela","morro 2",123456780,true,new Tempo(7,0,0),new Tempo(23,0,0));
        bomServico.inserirEntidadeEmpresa(hs2);
        
        // Restaurantes
        Restaurante r1= new Restaurante("Petisqueira dos petiscos 2","rua dos petiscos",989898987,1,10);
        bomServico.inserirEntidadeEmpresa(r1);
        Restaurante r2= new Restaurante("Peixe top","rua do peixe top",123321123,2,15);
        bomServico.inserirEntidadeEmpresa(r2);
        Restaurante r3= new Restaurante("Rodizio de carne brasileira","Rua dos zucas",123454321,3,20);
        bomServico.inserirEntidadeEmpresa(r3);
                
        // Pontos de interesse
        PontosInteresse p1= new PontosInteresse("Estatua da cera de ouvido","rua das estatuas",1);
        p1.atualizarAvaliacao(4);
        bomServico.inserirEntidadeEmpresa(p1);
        PontosInteresse p2= new PontosInteresse("Os cabelos do avô careca","rua dos pentes",2);
        p2.atualizarAvaliacao(2);
        bomServico.inserirEntidadeEmpresa(p2);
        PontosInteresse p3= new PontosInteresse("Praça das praças","avenida central",3);
        p2.atualizarAvaliacao(5);
        bomServico.inserirEntidadeEmpresa(p3);
        PontosInteresse p4= new PontosInteresse("Museu das coisas inuteis","rua dos museus",4);
        p4.atualizarAvaliacao(4);
        bomServico.inserirEntidadeEmpresa(p4);
        
        // Alineas
        listarRestaurantesPorTipoCozinha(bomServico);
        listarHoteisPorCategoria(bomServico);
        listarPontosdeinteresse(bomServico);
        ordenarAlfabeticamenteImprirmir(bomServico);
        
    }
    
        // Metodos de resoluçao de alienas
    
        private static void listarPontosdeinteresse(BomServico bs) {

        System.out.println("Digita o grau de satisfacao para os Pontos de Interesse\n"
                + "1-Fraco \n"
                + "2-Razoavel \n"
                + "3-Bom \n"
                + "4-Muito Bom \n"
                + "5-Excelente \n");
        int i = ler.nextInt();
        for (Entidade ent : bs.getListaEntidades()) {
            if (ent instanceof PontosInteresse) {
                PontosInteresse pdi = (PontosInteresse) ent;
                if (pdi.obterAvaliacao() >= i) {
                    System.out.println(pdi);
                }
            }
        }
    }

    private static void listarRestaurantesPorTipoCozinha(BomServico bomServico) {
        System.out.println("Digita o Tipo de Cozinha do Restaurante\n"
                + "1-Cozinha Tradicional Portuguesa \n"
                + "2-Cozinha Italiana \n"
                + "3-Cozinha Chinesa \n"
                + "4-Outra \n"
        );
        int i = ler.nextInt();
        for (Entidade ent : bomServico.getListaEntidades()) {
            if (ent instanceof Restaurante) {
                Restaurante r = (Restaurante) ent;
                if (i == 1 && r.getCategoria().equalsIgnoreCase("cozinha tradicional portuguesa")) {
                    System.out.println("Nome : " + r.getNome() + ", Preço Médio Por Pessoa: " + r.getPrecoMedioPorPessoa());
                } else if (i == 2 && r.getCategoria().equalsIgnoreCase("cozinha italiana")) {
                    System.out.println("Nome : " + r.getNome() + ", Preço Médio Por Pessoa: " + r.getPrecoMedioPorPessoa());
                } else if (i == 3 && r.getCategoria().equalsIgnoreCase("cozinha chinesa")) {
                    System.out.println("Nome : " + r.getNome() + ", Preço Médio Por Pessoa: " + r.getPrecoMedioPorPessoa());
                } else if (i == 4 && r.getCategoria().equalsIgnoreCase("outra")) {
                    System.out.println("Nome : " + r.getNome() + ", Preço Médio Por Pessoa: " + r.getPrecoMedioPorPessoa());
                }
            }

        }
    }

    
    private static void listarHoteisPorCategoria(BomServico bomServico){
        System.out.println("Digita a Categoria do Hotel\n"
                + "1-* \n"
                + "2-** \n"
                + "3-*** \n"
                + "4-**** \n"
                + "5-***** \n"
        );
        int i = ler.nextInt();
        for (Entidade ent : bomServico.getListaEntidades()) {
            if (ent instanceof Hotel) {
                Hotel h = (Hotel) ent;
                if(i==1&&h.validarServicoTransfer()&&h.getCategoria().equalsIgnoreCase("*")){
                    System.out.println("Nome: "+h.getNome()+", Categoria: "+h.getCategoria());
                }else if(i==2&&h.validarServicoTransfer()&&h.getCategoria().equalsIgnoreCase("**")){
                    System.out.println("Nome: "+h.getNome()+", Categoria: "+h.getCategoria());
                }else if(i==3&&h.validarServicoTransfer()&&h.getCategoria().equalsIgnoreCase("***")){
                    System.out.println("Nome: "+h.getNome()+", Categoria: "+h.getCategoria());
                }else if(i==4&&h.validarServicoTransfer()&&h.getCategoria().equalsIgnoreCase("****")){
                    System.out.println("Nome: "+h.getNome()+", Categoria: "+h.getCategoria());
                }else if(i==5&&h.validarServicoTransfer()&&h.getCategoria().equalsIgnoreCase("*****")){
                    System.out.println("Nome: "+h.getNome()+", Categoria: "+h.getCategoria());
                }
            }
        }
        
        
            
    }
    
    private static void ordenarAlfabeticamenteImprirmir(BomServico bomServico){
        Collections.sort(bomServico.getListaEntidades());
        imprimirHosteis(bomServico);
        imprimirHoteis(bomServico);
        imprimirPontosDeInteresse(bomServico);
        imprimirRestaurantes(bomServico);
        
    }
    
    private static void imprimirHoteis(BomServico bomServico){
        System.out.println("Hotéis:");
        for (Entidade entidade : bomServico.getListaEntidades()) {
            if(entidade instanceof Hotel){
                System.out.println("Nome: "+entidade.getNome()+", Endereço: "+entidade.getEndereco());
            }
        }
    }
    
    private static void imprimirHosteis(BomServico bomServico){
        System.out.println("Hostis:");
        for (Entidade entidade : bomServico.getListaEntidades()) {
            if(entidade instanceof Hostel){
                System.out.println("Nome: "+entidade.getNome()+", Endereço: "+entidade.getEndereco());
            }
        }
    }
    
    private static void imprimirRestaurantes(BomServico bomServico){
        System.out.println("Restaurantes:");
        for (Entidade entidade : bomServico.getListaEntidades()) {
            if(entidade instanceof Restaurante){
                System.out.println("Nome: "+entidade.getNome()+", Endereço: "+entidade.getEndereco());
            }
        }
    }
    
    private static void imprimirPontosDeInteresse(BomServico bomServico){
        System.out.println("Pontos de Interesse:");
        for (Entidade entidade : bomServico.getListaEntidades()) {
            if(entidade instanceof PontosInteresse){
                System.out.println("Nome: "+entidade.getNome()+", Endereço: "+entidade.getEndereco());
            }
        }
    }
        
                

   
    }

    
    
