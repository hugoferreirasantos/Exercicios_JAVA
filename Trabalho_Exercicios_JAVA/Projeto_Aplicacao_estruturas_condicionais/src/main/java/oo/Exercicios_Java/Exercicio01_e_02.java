/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package oo.Exercicios_Java;

/*Exercício 01: Fazer um programa que solicite (sexo e idade) de 100 pessoas. Retornar ao final
quantas pessoas foram cadastradas, quantas são do sexo masculino e quantas são do sexo
feminino.*/

/*Exercício 02:  Usando o programa anterior, agora vamos retornar a média das idades das mulheres e
a média das idades dos homens. */



/**
 *
 * @author hugo
 */

// Importando a biblioteca Scanner:
import java.util.Scanner;
// Importando a biblioteca DecimalFormat:
import java.text.DecimalFormat;
public class Exercicio01_e_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        
        // Declarando uma Variável que vai formatar números flutuantes:
        DecimalFormat formatador = new DecimalFormat("0.0");
        
        // Declarar as variáveis:
        String nome;
        String sexo;
        int idade, opcao;
        float contM=0,contF=0,mediaF = 0,mediaM = 0, contTotal=0,mediaIM=0,mediaIF=0,somaIM=0,somaIF=0;
        boolean flag = true;
        
        // Estrutura While:
        while(flag){
            // Pedindo informações ao usuário:
            System.out.println("Informe o nome: ");
            scanner2.nextLine();
            
            System.out.println("Informe a idade: ");
            idade = scanner.nextInt();
            
            System.out.println("Informe o sexo: ");
            sexo = scanner2.nextLine();
            
            System.out.println();
            
            contTotal = contTotal + 1;
            
            // Contabilizar a quantidade de homens e mulheres:
            if("F".equals(sexo)){
                 contF = contF + 1;
                 somaIF = somaIF + idade;
            }if ("M".equals(sexo)){
                 contM = contM + 1;
                 somaIM = somaIM + idade;
            }
            
            
            
            // realizar a média de homens e mulheres:
            mediaF = contF / contTotal;
            mediaM = contM / contTotal;
            
            // realizar a média de idade entre homens e mulheres:
            mediaIF = somaIF / contF;
            mediaIM = somaIM / contM;
            
            System.out.println("Deseja continuar fazendo o cadastro ? Se sim  digite 0 se não digite -1: ");
            opcao = scanner.nextInt();
            // Condicional para finalizar o laço while:
            if(opcao == -1){
                flag = false;
            }else{
                flag = true;
            }
            
    
        }
        // Exibindo os resultados:
        System.out.println("A quantidade total pessoas cadastradas: " + contTotal);
        System.out.println();
        System.out.println("Quantidade de Homens: " + contM);
        System.out.println("A média de Homens é: "+ formatador.format(mediaM));
        System.out.println("A média de idade entre os Homens: "+formatador.format(mediaIM)+"\n");
        System.out.println("Quantidade de Mulheres: "+ contF);
        System.out.println("A média de Mulheres é: "+ formatador.format(mediaF));
        System.out.println("A media de idade entre as Mulheres: "+ formatador.format(mediaIF));
        
    }
}
