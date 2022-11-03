/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo.Exercicios_Java;

/**
 *
 * @author hugo
 */

/* Exercício 05: Foi feita uma pesquisa entre os habitantes de uma região. Foram coletados os dados de idade,
sexo (M/F) e salário. Faça um programa que calcule e mostre:

a) A média dos salários do grupo;
b) A maior e a menor idade do grupo;
c) A quantidade de mulheres na região;
d) A idade e o sexo da pessoa que possui o menor salário;

Finalize a entrada de dados ao ser digitada uma idade negativa. */


// Importando a biblioteca Scanner:
import java.util.Scanner;
// Importando a biblioteca DecimalFormat:
import java.text.DecimalFormat;
public class Exercicio05 {
    public static void main(String[] args){
        Scanner scanner1 = new Scanner(System.in); // declarando o Scanner
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
       
        // Declarando as variáveis:
        String nome, sexo, regiao;
        int cont = 0,idade=0, somaIdade=0, mediaIdade=0, contF=0,somaF=0, mediaF=0, contM = 0, somaM = 0, MediaM=0, idadeMaior=0, idadeMenor=0;
        int contFN = 0, contFND=0,contFCO=0,contFSUD=0,contFSUL=0, contMN=0,contMND=0,contMCO=0,contMSUD=0,contMSUL=0, idadeMaiorS=0,idadeMenorS=0;
        int somaSalarioN=0, somaSalarioND=0,somaSalarioCO=0,somaSalarioSUD=0,somaSalarioSUL=0,mediaSN=0,mediaSND=0,mediaCO=0,mediaSSUD = 0,mediaSSUL=0;
        int idadeMenorN=0,idadeMenorND=0,idadeMenorCO=0,idadeMenorSUD=0,idadeMenorSUL=0,idadeMaiorN=0,idadeMaiorND=0,idadeMaiorCO=0,idadeMaiorSUD=0,idadeMaiorSUL=0;
        int contN=0, contND=0,contCO=0,contSUD=0,contSUL=0;
        float salario, somaSalario=0, mediaSalario=0;
        float menorSalario=0, maiorSalario=0;
        boolean flag = true;
        int i = 0, opicao, i2 = 0,i3=0,i4=0,i5=0,i6=0; // contador de idades:
        
        // Estrutura While:
        while(flag){
            // Pedindo dados ao Usuário:
            System.out.println("DIGITE O NOME DA PESSOA: ");
            nome = scanner1.nextLine();
            System.out.println("DIGITE O SEXO DA PESSOA: ");
            sexo = scanner1.nextLine();
            System.out.println("INFORME A IDADE DA PESSOA: ");
            idade = scanner2.nextInt();
            System.out.println("INFORME O SALARIO DA PESSOA: ");
            salario = scanner3.nextFloat();
            System.out.println("INFORME A REGIÃO ONDE A PESSOA MORA: ");
            regiao = scanner1.nextLine();
            System.out.println();
            
            // Contabilizando o número de pessoas cadastradas:
            cont = cont + 1;
            
            // a) Fazer a média dos Salarios do  Grupo:
            if("norte".equals(regiao) ){
                contN+=1;
                somaSalarioN+=salario;
                mediaSN = (somaSalarioN / contN);
            }else if("nordeste".equals(regiao)){
                contND+=1;
                somaSalarioND+=salario;
                mediaSND = (somaSalarioND / contND);
            }else if("centro-oeste".equals(regiao)){
                contCO+=1;
                somaSalarioCO+=salario;
                mediaCO = (somaSalarioCO / contCO);
            }else if("sudeste".equals(regiao)){
                contSUD+=1;
                somaSalarioSUD+=salario;
                mediaSSUD = (somaSalarioSUD / contSUD);
            }else if("sul".equals(regiao)){
                contSUL+=1;
                somaSalarioSUL+=salario;
                mediaSSUL = (somaSalarioSUL / contSUL);
            }
            
            
            
            // b) A maior e a menor idade do grupo;
            if(i == 0){
                idadeMaiorN = idade;
                idadeMenorN = idade;
                i++;
            }else if(idade > idadeMaiorN && "norte".equals(regiao)){
               idadeMaiorN = idade; 
            }else if(idade < idadeMenorN && "norte".equals(regiao)){
               idadeMenorN = idade;
            }
            
            if(i3 == 0){
                idadeMaiorND = idade;
                idadeMenorND = idade;
                i3++;
            }else if(idade > idadeMaiorND && "nordeste".equals(regiao)){
                idadeMaiorND = idade;
            }else if(idade < idadeMenorND && "nordeste".equals(regiao)){
                idadeMenorND = idade;
            }
            
            if(i4 == 0){
                idadeMaiorCO = idade;
                idadeMenorCO = idade;
                i4++;
            }else if(idade > idadeMaiorCO && "centro-oeste".equals(regiao)){
                idadeMaiorCO = idade;
            }else if(idade < idadeMenorCO && "centro-oeste".equals(regiao)){
                idadeMenorCO = idade;
            }
            
            if(i5 == 0){
                idadeMaiorSUD = idade;
                idadeMenorSUD = idade;
                i5++;
            }else if(idade > idadeMaiorSUD && "sudeste".equals(regiao)){
                idadeMaiorSUD = idade;
            }else if(idade < idadeMenorSUD && "sudeste".equals(regiao)){
                idadeMenorSUD = idade;
            }
            
            if(i6 == 0){
                idadeMaiorSUL = idade;
                idadeMaiorSUL = idade;
                i6++;
            }else if(idade > idadeMaiorSUL && "sul".equals(regiao)){
                idadeMaiorSUL = idade;
            }else if(idade < idadeMenorSUL && "sul".equals(regiao)){
                idadeMenorSUL = idade;
            }
            
       
            
            
            
            
            // c) A quantidade de mulheres e homens por região:
            sexo = sexo.toUpperCase();
            if("F".equals(sexo) && "norte".equals(regiao)){
                contFN+=1;  
            }else if("F".equals(sexo) && "nordeste".equals(regiao)){
                contFND+=1;
            }else if("F".equals(sexo) && "centro-oeste".equals(regiao)){
                contFCO+=1;
            }else if("F".equals(sexo) && "sudeste".equals(regiao)){
                contFSUD+=1;
            }else if("F" .equals(sexo) && "sul".equals(regiao)){
                contFSUL+=1;
            }
            
            if("M".equals(sexo) && "norte".equals(regiao)){
                contMN+=1;
            }else if( "M".equals(sexo) && "nordeste".equals(regiao)){
                contMND+=1;
            }else if("M".equals(sexo) && "centro-oeste".equals(regiao)){
                contMCO+=1;
            }else if("M".equals(sexo) && "sudeste".equals(regiao)){
                contMSUD+=1;
            }else if("M".equals(sexo) && "sul".equals(regiao)){
                contMSUL+=1;
            }
            
            // d) Idade e o sexo da passoa que possui o menor salario:
            if(i2 == 0){
                menorSalario = salario;
                maiorSalario = salario;
                idadeMaiorS = idade;
                idadeMenorS = idade;
                i2++;
            }else if(idade > idadeMaiorS && salario > maiorSalario){
                maiorSalario = salario;
                idadeMaiorS = idade;
            }else if(idade < idadeMenorS && salario < menorSalario){
                menorSalario = salario;
                idadeMenorS = idade;
            }
            
            
            
            
            System.out.println("Deseja continuar o cadastro se sim Digite 0, se não Digite -1: ");
            opicao = scanner2.nextInt();
            
            switch(opicao){
                case 0:
                    flag = true;
                    break;
                case -1:
                    flag = false;
                    break;
                    
            }
            
            
        }
        
        System.out.println("A média de Salário da Região Norte: "+mediaSN);
        System.out.println("A média de Salário da Região Nordeste: "+mediaSND);
        System.out.println("A média de Salário da Região Centro-Oeste: "+mediaCO);
        System.out.println("A média de Salário da Região Sudeste: "+mediaSSUD);
        System.out.println("A média de Salário da Região Sul: "+mediaSSUL);
        System.out.println();
        System.out.println("A maior Idade da Região Norte: "+idadeMaiorN);
        System.out.println("A menor Idade da Região Norte: "+idadeMenorN);
        System.out.println("A maior Idade da Região Nordeste: "+idadeMaiorND);
        System.out.println("A menor Idade da Região Nordeste: "+idadeMenorND);
        System.out.println("A maior Idade da Região Centro-Oeste: "+idadeMaiorCO);
        System.out.println("A menor Idade da Região Centro-Oeste: "+idadeMenorCO);
        System.out.println("A maior Idade da Região Sudeste: "+idadeMaiorSUD);
        System.out.println("A menor Idade da Região Sudeste: "+idadeMenorSUD);
        System.out.println("A maior Idade da Região Sul: "+idadeMaiorSUL);
        System.out.println("A menor Idade da Região Sul: "+idadeMenorSUL);
        System.out.println();
        System.out.println("A quantidade de Mulheres na Região Norte: "+contFN);
        System.out.println("A quantidade de Homens na Região Norte: "+contMN);
        System.out.println("A quantidade de Mulheres na Região Nordeste: "+contFND);
        System.out.println("A quantidade de Homens na Região Nordeste: "+contMND);
        System.out.println("A quantidade de Mulheres na Região Centro-Oeste: "+contFCO);
        System.out.println("A quantidade de Homens na Região Centro-Oeste: "+contMCO);
        System.out.println("A quantidade de Mulheres na Região Sudeste: "+contFSUD);
        System.out.println("A quantidade de Homens na Região Sudeste: "+contMSUD);
        System.out.println("A quantidade de Mulheres na Região Sul: "+contFSUL);
        System.out.println("A quantidade de Homens na Região Sul: "+contMSUL);
        System.out.println();
        
        
        System.out.println();
        System.out.println("Maior Salario: "+maiorSalario);
        System.out.println("Idade da pessoa com Maior Salario: "+ idadeMaiorS);
        System.out.println("Menor Salario: "+menorSalario);
        System.out.println("Idade da pessoa com Menor Salario: "+idadeMenorS);
      
        
        
        
        
    }
    
}
