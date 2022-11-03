/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package oo.projetocalculoimc;

/**
 *
 * @author hugo
 */

// Importar a biblioteca JOptionPane:
import javax.swing.JOptionPane;
// Importar a biblioteca DecimalFormat para definir casas decimais:
import java.text.DecimalFormat;

public class ProjetoCalculoIMC {

    public static void main(String[] args) {
        // Pedindo ao usuário para inserir as informações:
        String peso= JOptionPane.showInputDialog("Digite o seu peso: ");
        String altura = JOptionPane.showInputDialog("Digite a sua altura: ");
        
        // Variável auxiliar que vai receber a converção de String para Double :
        double p= Double.parseDouble(peso);
        double a = Double.parseDouble(altura);
        
        // Variável que vai receber as variáveis auxiliares para realizar o cacu
        //lo do IMC:
        double IMC = p / (a * a);
        
        // Utilizando DecimalFormat para Definir a quantidade de casas decimais:
        DecimalFormat Formatador = new DecimalFormat("0.00");
        
        // Realizar a converção do IMC para String:
        String resultado = String.valueOf(Formatador.format(IMC));
        
        // Realizando as condicionais:
        if (IMC < 17){
             JOptionPane.showMessageDialog(null, "O seu IMC é "+resultado+" Você está muito abaixo do peso.");
        }if (IMC <= 17 && IMC <= 18.49 ){
            JOptionPane.showMessageDialog(null, "O seu IMC é "+resultado+" Você está abaixo do peso.");
        }if  (IMC <= 18.55 && IMC <= 24.99){
            JOptionPane.showMessageDialog(null, "O seu IMC é "+resultado+" Você está com peso Normal.");
        }if (IMC <= 25 && IMC <= 29.99){
            JOptionPane.showMessageDialog(null, "O seu IMC é "+resultado+" Você está Acima do Peso.");
        }if (IMC <= 30 && IMC <= 34.99){
            JOptionPane.showMessageDialog(null, "O seu IMC é "+resultado+" Você está com Obesidade Nível I");
        }if (IMC <= 35 && IMC <= 39.99){
            JOptionPane.showMessageDialog(null, "O seu IMC é "+resultado+" Você está com Obesidade Nível II(Severa)");
        }if (IMC > 40 ){
            JOptionPane.showMessageDialog(null, "O seu IMC é "+resultado+" Você está com Obesidade Nível III(Mórbida)");
        }else{
            JOptionPane.showMessageDialog(null, "Por favor insira dados válidos.");
        }
        
        
    }
}
