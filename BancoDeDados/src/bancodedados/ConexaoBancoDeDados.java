package bancodedados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class ConexaoBancoDeDados {

    private Connection conexao;

    public boolean Conectar() {
        try {
            String url = "jdbc:sqlite:banco01.db";
            this.conexao = DriverManager.getConnection(url);
        } catch (SQLException erro01) {
            System.err.println(erro01.getMessage());
            return false;
        }
        System.out.println("--Conectou ao Banco--");
        return true;
    }

    public boolean Desconectar() {
        try {
            if (this.conexao.isClosed() == false) {
                this.conexao.close();
            }
        } catch (SQLException erro02) {
            System.err.println(erro02.getMessage());
            return false;
        }
        System.out.println("--Desconectou do Banco--");
        return true;
    }
    
    public boolean Inserir(String nome, double preco){
        final String SQL = "INSERT INTO PRODUTOS("
                +"nome, preço"
                +"VALUES(?,?)";     
        try{
        this.Conectar();
        PreparedStatement pstmt = conexao.prepareStatement(SQL);
        
        pstmt.setString(1,nome);
        pstmt.setDouble(2,preco);
        pstmt.execute();
        pstmt.close();
        this.Desconectar();
        return true;
        } catch (SQLException erro03) {
            throw new RuntimeException("Erro ao salvar os dados: "+erro03);
            //System.err.println(erro03.getMessage());
            //return false;
           }
    }
}
