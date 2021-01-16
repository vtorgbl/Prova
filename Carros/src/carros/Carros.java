/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carros;
import java.util.Scanner;

/**
 *
 * @author vitor
 */
public class Carros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Atividade: Criar a classe Carro
    Atributos, marca, modelo, ano de fabricação, Km rodada, preço
    Métodos inicializa, atribui valores, exibe dados do carro
    Atributo cor
    */
        Scanner input = new Scanner(System.in);
        Carro veiculo1 = new Carro();
        System.out.println(veiculo1.ExibirCarro());
        
         System.out.println("--------------------------------------------------");
        
        Carro veiculo2 = new Carro(2020,50.000, 60.5, "Wolks", "Opala", "Vermelho");
        System.out.println(veiculo2.ExibirCarro());
        
         System.out.println("--------------------------------------------------");
        
        int Ano;
        double Km, Preco;
        String Marca, Modelo, Cor;
        System.out.print("Escolha seu carro!");
        System.out.print("Escolha o ano: ");
        Ano = input.nextInt();
        System.out.print("Escolha o preço: ");
        Km = input.nextDouble();
        System.out.print("Escolha a kilometragem: ");
        Preco=input.nextDouble();
        System.out.print("Escolha a marca: ");
        Marca=input.next();
        System.out.print("Escolha o modelo: ");
        Modelo=input.next();
        System.out.print("Escolha a cor: ");
        Cor=input.next();
        
        Carro veiculo3 = new Carro(2020,50.000, 60.5, "Wolks", "Opala", "Vermelho");
        System.out.println(veiculo3.ExibirCarro());
        
        System.out.println("--------------------------------------------------");
        
        
    }
    
}
