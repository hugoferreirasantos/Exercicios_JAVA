/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package oo.trabalho_java;

/**
 *
 * @author hugo
 * 
 * 
 *
 */

/*Codifique um programa que ajude a cadastrar 
doadores de sangue. 
Peça para o usuário informar a idade e tipo 
sanguíneo do doador. 
Fazer a validação dos tipos sanguíneos 
(A, B, O e AB são permitidos), e só 
permitir doadores entre 18 e 67 anos. 
A cada doador cadastrado, 
perguntar também se deseja cadastrar um novo 
doador. 
Quando o usuário desejar encerrar os cadastros, 
pergunte o tipo 
sanguíneo de um paciente que necessita de sangue, 
então mostre quantos 
doadores disponíveis existem para este paciente.*/

//Importando a biblioteca Scanner:
import java.util.Scanner;

public class Trabalho_Java {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        //Declarando variáveis:
        String tipoS;
        int opicao,idade,opicaoS=0;
        int contTotal=0, somaSA= 0, somaSB=0,somaSO=0,somaAB = 0,contA=0,contB=0,contO=0,contAB=0;
        boolean flag = true, a = true;
        
        // Imformando ao usuário:
        System.out.println("Tipos Sanguíneos");
        System.out.println("1 - A");
        System.out.println("2 - B");
        System.out.println("3 - O");
        System.out.println("4 - AB");
        System.out.println();
        
        while(flag){
            //Pedindo informações ao usuário:
            System.out.println("DIGITE A IDADE DO DOADOR: ");
            idade = scanner.nextInt();
            
            if(idade >= 18 && idade <= 67){
                System.out.println("INFORME O TIPO SANGUÍNEO DO DOADOR: ");
                tipoS = scanner2.nextLine();
                System.out.println();
                tipoS = tipoS.toUpperCase();
                // Fazer a validação dos tipos Sanguíneos:
                while(a){
                    if("A+".equals(tipoS) || "A-".equals(tipoS)){
                        System.out.println("Valor inválido, digite um valor Válido: ");
                        tipoS = scanner2.nextLine();
                        a = true;
                    }else if("B+".equals(tipoS) || "B-".equals(tipoS)){
                        System.out.println("Valor inválido, digite um valor Válido: ");
                        tipoS = scanner2.nextLine();
                        a = true;
                    }else if("A".equals(tipoS) || "B".equals(tipoS)){
                        tipoS = scanner2.nextLine();
                        a = false;
                    }else if("O".equals(tipoS) || "AB".equals(tipoS)){
                        tipoS = scanner2.nextLine();
                        a = false;
                    }
                    
                }
                
                
                contTotal+=1;
                 if(null != tipoS){  // Contabilizar O tipo Sanguíneos:
                switch (tipoS) {
                    case "A":
                        contA+=1;
                        somaSA+=contA;
                        break;
                    case "B":
                        contB+=1;
                        somaSB+=contB;
                        break;
                    case "AB":
                        contAB+=1;
                        somaAB+=contAB;
                        break;
                    case "O":
                        contO+=1;
                        somaSO+=contO;
                        break;
                    default:
                        break;
                }
                }
                 
                System.out.println();
                System.out.println("Deseja continuar cadastrando? se SIM digite 0, caso não digite -1");
                opicao = scanner.nextInt();
                if(opicao == 0){
                    flag = true;
                }else if(opicao == -1){
                    System.out.println("Qual o tipo sanguíneo que o paciente precisa ? ");
                    System.out.println("Tipos Sanguíneos");
                    System.out.println("1 - A");
                    System.out.println("2 - B");
                    System.out.println("3 - O");
                    System.out.println("4 - AB");
                    System.out.println("5 - QUANTIDADE TOTAL NO ESTOQUE");
                    System.out.println();
                    opicaoS = scanner.nextInt();
                    
                    System.out.println("Quantidade Total de doadores Cadastrados: "+contTotal);
                    System.out.println();
        
                    switch (opicaoS) {
                        case 1 -> System.out.println("Quantidade de paciente com tipo de Sangue A: "+somaSA);
                        case 2 -> System.out.println("Quantidade de paciente com tipo de Sangue B: "+somaSB);
                        case 3 -> System.out.println("Quantidade de pacientes com tipo de Sangue O: "+somaSO);
                        case 4 -> System.out.println("Quantidade de pacientes com tipo de Sangue AB: "+somaAB);
                        case 5 -> {
                            System.out.println("Quantidade de paciente com tipo de Sangue A: "+somaSA);
                            System.out.println("Quantidade de paciente com tipo de Sangue B: "+somaSB);
                            System.out.println("Quantidade de pacientes com tipo de Sangue O: "+somaSO);
                            System.out.println("Quantidade de pacientes com tipo de Sangue AB: "+somaAB);
                        }
                        default -> {
                        }
                    }
          
                    flag = false;
                }
                
            }else{
                System.out.println("Idade inválida é necessário que o doador tenha entre 18 e 67 anos: ");
                flag = true;
            }
            
            
        }
        
        
        
        
        
    }
}
