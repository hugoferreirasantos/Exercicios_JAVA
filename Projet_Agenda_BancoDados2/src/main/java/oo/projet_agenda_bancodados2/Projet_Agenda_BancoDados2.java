/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package oo.projet_agenda_bancodados2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author hugo
 */
public class Projet_Agenda_BancoDados2 {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //Iniciar a conexão com valor nulo:
        Connection conexao = null;
        
        //Criar as variáveis:
        String nome = null, descEvento = null, nomeEvento = null, usuario = null;
        String opicao;
        boolean flag = true;
        int opicaoInt, autoIncrement = 0;
        
       
        
        try{
            //Configurar o Driver de Conexão:
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost/Agenda", "root", "88305");
            
             //Parte principal:
            while(flag){
                opicao = JOptionPane.showInputDialog("Escolha uma das Opições: \n"+"1 - Inserir um novo Nome e Eventos: \n"+"2 - Impressão dos Resulatados: \n"+"3 - Pesquisa por Usuário");
                opicaoInt = Integer.parseInt(opicao);
                switch(opicaoInt){
                    case 1 -> {
                        nome = JOptionPane.showInputDialog("Digite o nome da pessoa: ");
                        descEvento = JOptionPane.showInputDialog("Digite a descrição do Evento: ");
                        nomeEvento = JOptionPane.showInputDialog("Digite o nome do Evento:");
                        autoIncrement += 1;
                        //Comando para Inserção de Dados:
                        String sql = "INSERT INTO usuario(Nome) VALUES(?)";
                        String sql2 = "INSERT INTO Evento(evento,DescEvento,ID_usuario) VALUES(?,?,?)";
                        PreparedStatement ps = conexao.prepareStatement(sql);
                        ps.setString(1, nome);
                        ps.executeUpdate();
                        PreparedStatement ps2 = conexao.prepareStatement(sql2);
                        ps2.setString(1,nomeEvento);
                        ps2.setString(2, descEvento);
                        ps2.setInt(3, autoIncrement);
                        ps2.executeUpdate();
                        break;
                    }
                    case 2 -> {
                        // Comando para Impresão dos Resultados:
                        ResultSet rsResultado = conexao.createStatement().executeQuery("SELECT * FROM usuario");
                        ResultSet rsResultado2 = conexao.createStatement().executeQuery("SELECT *FROM Evento");
                        while(rsResultado.next()){
                            System.out.println("NOME: "+rsResultado.getString("Nome"));
                
                        }
                        System.out.println("");
                        while(rsResultado2.next()){
                            System.out.println("Evento: "+rsResultado2.getString("evento")+" - "+"Descrição: "+rsResultado2.getString("DescEvento"));
                            //System.out.println("DATA EVENTO: "+rsResultado.getString("data_Evento"));    
                        }
                        break;
                    }
                    case 3 ->{
                        usuario = JOptionPane.showInputDialog("Digite o nome do Usuário para que ocorra a pesquisa: ");
                        String sqlU = "SELECT Nome 'NOME', evento 'EVENTO', DescEvento 'Decricao Evento' from usuario u, Evento e where u.ID_usuario = e.ID_usuario and u.Nome = ? ";
                        PreparedStatement ps3 = conexao.prepareStatement(sqlU);
                        ps3.setString(1, usuario);
                        ResultSet rs3 = ps3.executeQuery();
                        while(rs3.next()){
                            System.out.println("NOME: "+rs3.getString("Nome") + "- EVENTO: "+rs3.getString("evento")+"- DESCRIÇÃO: "+rs3.getString("DescEvento"));
                            
                        }
                        break;
                        
                       
                    }
                }
            }
        }catch(ClassNotFoundException ex){
            System.out.println("Driver do banco de dados não localizado: "+ex.getMessage());
        }catch(SQLException ex){
            System.out.println("Houve um erro ao acessar o banco de dados: "+ex.getMessage());
        }finally{
            if(conexao != null){
                conexao.close();
            }
        }
    }

 }                 
        

        
                
