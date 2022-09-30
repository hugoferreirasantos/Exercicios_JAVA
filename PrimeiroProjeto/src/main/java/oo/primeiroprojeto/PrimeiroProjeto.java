/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package oo.primeiroprojeto;

/**
 *
 * @author hugo
 */
import java.util.Scanner;
public class PrimeiroProjeto {

    public static void main(String[] args) {
        // Importando a função Scanner:
        Scanner scanner = new Scanner(System.in);
        
        // Declarando as variáveis:
        float nota1, nota2, nota3, nota4, media;
        
        // Pedir ao usuário que insira as notas
        System.out.println("Nota 1:");
        nota1 = scanner.nextFloat();
        
        System.out.println("Nota 2:");
        nota2 = scanner.nextFloat();
        
        System.out.println("Nota 3:");
        nota3 = scanner.nextFloat();
        
        System.out.println("Nota 4:");
        nota4 = scanner.nextFloat();
        
        // Fazer a média das notas:
        media = (nota1 + nota2 + nota3 + nota4)/4;
        
       // Imprimir a média;
       System.out.println("Média: " + media);
       
       // Comparação para descubrir quem passou de ano:
       
       if(media >= 6){
           System.out.println("Parabéns você foi aprovado");
       }else{
           System.out.println("Infelizmente você foi reprovado: ");
       }
       
       
      
       
    }
}
