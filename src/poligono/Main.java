/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ro_ss
 */
package poligono;

import java.util.Scanner;


public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        short opcao;
        Scanner entrada = new Scanner(System.in);
        
        do {
             System.out.println("Selecione uma forma geométrica para calcular a área:");
             System.out.println("  1. Triângulo");      
             System.out.println("  2. Retângulo");      
             System.out.println("  0. Sair");
             System.out.print("Operação: ");
             opcao = entrada.nextShort();
              
            if (!OperacaoExiste(opcao)) {
            	 continue;
            }

            if (opcao == 0) {
            	 System.out.println("Programa Encerrado!");
            	 break;
            }
            
            switch (opcao){
                case 1:             
                    Triangulo formaT = new Triangulo();
                    formaT.calcularArea();
                    formaT.imprimir();
                    break;
                case 2:
                    Retangulo formaP = new Retangulo();
                    formaP.calcularArea();
                    formaP.imprimir();
                    break;
            }
            
        } while (opcao != 0);
    }
    
    static boolean OperacaoExiste (short opcao) {
       	boolean retorno = true;
    	if (opcao > 2) {
            System.out.println("ERRO: Operação escolhida é invalida.\n");
            retorno = false;
       	}
    	return retorno;
    }   
}
