/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package oo.Exercicios_Java;

/*Exercício 03:  Fazer um programa que faça uma pesquisa com 100 pessoas.
Ele fará a seguinte pergunta:

Qual é o melhor lanche?

1 - Pizza Hut
2 - McDonalds
3 - Burguer King

Ao final retornar a porcentagem de pessoas que votou para cada tipo de lanche.*/

/**
 *
 * @author hugo
 */

// Importar a biblioteca Scanner:
import java.util.Scanner;
// Importar a biblioteca DecimalFormat:
import java.text.DecimalFormat;
public class Exercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // Criar o scanner:
        Scanner leia = new Scanner(System.in);
        
        // 
        DecimalFormat formatador = new DecimalFormat("0.0");
        
        // Declarar as variáveis:
        String nome;
        float opcao, cont1=0, cont2=0, cont3=0;
        float convert1 = 0, convert2=0, convert3=0, contTotal=0;
        int alt;
        boolean flag = true;
        
        // Criar a estrutura while:
        while(flag){
            System.out.println("Escolha uma das opções: ");
            System.out.println("1 - Pizza Hut ");
            System.out.println("2 - MC Donald's");
            System.out.println("3 - Burger King  ");
            opcao = leia.nextInt();
            
            // Realizando a contagem de votos:
            if( opcao == 1){
                cont1 = cont1 + 1;
            }if(opcao == 2){
                cont2 = cont2 + 1;
            }if(opcao == 3){
                cont3 = cont3 + 1;
            }
            
            contTotal = contTotal +1;
            
            // Realizar a converção para porcentagem:
             convert1 = (cont1 * 100 / contTotal);
             convert2 = (cont2 * 100/ contTotal);
             convert3 = (cont3 * 100/ contTotal);
             
            //Saindo do laço While:
            System.out.println("Deseja o sair do programa ? se SIM  digite 0 se não digite -1");
            alt = leia.nextInt();
            
            if(alt == -1){
                flag = false;
            }else{
                flag = true;
            }
            
        }
        
        System.out.println("Quantidade total de votos: "+ contTotal);
        System.out.println();
        System.out.println("A quantidade de votos da opção 1: " + cont1);
        System.out.println("A pocentagem de votos: " + formatador.format(convert1)+"%");
        System.out.println();
        System.out.println("A quantidade de votos de opção 2: " + cont2);
        System.out.println("A procentagem de votos: "+ formatador.format(convert2)+"%");
        System.out.println();
        System.out.println("A quantidade de votos da oção 3: "+ cont3);
        System.out.println("A porcentagem de votos: "+ formatador.format(convert3)+"%");
        
    }
}
