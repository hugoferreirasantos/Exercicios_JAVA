/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author hugo
 */
import java.util.Scanner;

public class OlaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       Scanner texto = new Scanner(System.in);
       String str;
       System.out.println("Entre com o seu nome:");
       str = texto.nextLine();
       System.out.println("Bem vindo " + str);
       
       texto.close();
    }
}
