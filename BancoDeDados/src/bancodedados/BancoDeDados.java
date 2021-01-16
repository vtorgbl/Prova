
package bancodedados;

public class BancoDeDados {

    public static void main(String[] args) {
       System.out.println("Programa Principal!!");
       
       ConexaoBancoDeDados BD1 = new ConexaoBancoDeDados();
       //BD1.Conectar();
       //BD1.Desconectar();
       
       BD1.Inserir("Vape pen 22", 145);
    }
    
}
