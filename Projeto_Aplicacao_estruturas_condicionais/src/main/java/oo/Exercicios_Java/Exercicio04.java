package oo.Exercicios_Java;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hugo
 */

/*Exercício 04: Fazer um programa que utilize uma "condição de parada", ou seja, pegue informações
de uma quantidade indeterminada de pessoas.
Ele solicitará as seguintes informações:

idade e tipo sanquineo (A+, B+, AB+, O+,A-, B-, AB-, O-), ao sair, mostrar quantos
doadores foram cadastrados para cada tipo.*/


//Importar a biblioteca Scanner:
import java.util.Scanner;
//Importar a biblioteca DecimalFormat:
import java.text.DecimalFormat;

public class Exercicio04 {
    public static void main(String[] args){
        //Declarando o scanner:
        Scanner leia2 = new Scanner(System.in);
        
        //Declarando a variável de converção de valores decimais:
        DecimalFormat formatador = new DecimalFormat("0.0");
        
        // Declarar as variáveis principais:
        
        int contAP=0,contAN=0,contBP=0,contBN=0,contABP=0,contABN=0,contOP=0,contON=0,idade,contTotal=0, tipoS;
        int somaIAP=0,somaIAN=0,somaIBP=0,somaIBN=0,somaIABP=0,somaIABN=0,somaIOP=0,somaION=0;
        int convertAP=0,convertAN=0,convertBP=0,convertBN=0,convertABP=0,convertABN=0,convertOP=0,convertON=0,opicao;
        boolean flag = true;
        
        System.out.println("Tipos de sanguineos");
        System.out.println("1 - A+");
        System.out.println("2 - A-");
        System.out.println("3 - B+");
        System.out.println("4 - B-");
        System.out.println("5 - AB+");
        System.out.println("6 - AB");
        System.out.println("7 - O+");
        System.out.println("8 - O-");
        
        // Estrutura While:
        while(flag){
            //Pedindo informações ao usuário:
            
            System.out.println("Informe a idade do doador: ");
            idade = leia2.nextInt();
            System.out.println("Informe o tipo Sanguineo do paciente: ");
            tipoS = leia2.nextInt();
            
            
            
            contTotal = contTotal + 1;
            
            switch (tipoS) {
                case 1:
                    contAP+=1;
                    somaIAP = somaIAP + idade;
                    break;
                case 2:
                    contAN+=1;
                    somaIAN = somaIAN + idade;
                    break;
                case 3:
                    contBP+=1;
                    somaIBP = somaIBP + idade;
                    break;
                case 4:
                    contBN+=1;
                    somaIBN = somaIBN + idade;
                    break;
                case 5:
                    contABP+=1;
                    somaIABP = somaIABP + idade;
                    break;
                case 6:
                    contABN+=1;
                    somaIABN = somaIABN + idade;
                    break;
                case 7:
                    contOP+=1;
                    somaIOP = somaIOP + idade;
                    break;
                case 8:
                    contON+=1;
                    somaION = somaION + idade;
                    break;
                default:
                    break;
            }
            
            
            
            //Converção de valores para porcentagem:
            convertAP = (contAP * 100 / contTotal);
            convertAN = (contAN * 100 / contTotal);
            convertBP = (contBP * 100 / contTotal);
            convertBN = (contBN * 100 / contTotal);
            convertABP = (contABP * 100 / contTotal);
            convertABN = (contABN * 100 / contTotal);
            convertOP = (contOP * 100 / contTotal);
            convertON = (contON * 100 / contTotal);
            
            
            
            
            // Condição de parada:
            System.out.println("Deseja continuar fazendo o cadastro ? Se sim Digite 0 se não Digite -1");
            opicao = leia2.nextInt();
            if(opicao == - 1){
                flag = false;
            }else{
                flag = true;
            }
             
            
        }
        
        // Exibir o resultado:
        System.out.println("Quantidade total de pessoas cadastradas: "+contTotal);
        System.out.println();
        System.out.println("A porcentagem de pessoas que doaram tipo de sangue A+: "+formatador.format(convertAP)+"%");
        System.out.println("A porcentagem de pessoas que doaram tipo de sangue A-: "+formatador.format(convertAN)+"%");
        System.out.println("A porcentagem de pessoas que doaram tipo de sangue B+: "+formatador.format(convertBP)+"%");
        System.out.println("A porcentagem de pessoas que doaram tipo de sangue B-: "+formatador.format(convertBN)+"%");
        System.out.println("A porcentagem de pessoas que doaram tipo de sangue AB+: "+formatador.format(convertABP)+"%");
        System.out.println("A porcentagem de pessoas que doaram tipo de sangue AB-: "+formatador.format(convertABN)+"%");
        System.out.println("A porcentagem de pessoas que doaram tipo de sangue O+: "+formatador.format(convertOP)+"%");
        System.out.println("A porcentagem de pessoas que doaram tipo de sangue O-: "+formatador.format(convertON)+"%");
        
        
        
        
        
    }
}
