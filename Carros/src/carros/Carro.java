/*Atividade: Criar a classe Carro
    Atributos, marca, modelo, ano de fabricação, Km rodada, preço
    Métodos inicializa, atribui valores, exibe dados do carro
    Atributo cor
 */
package carros;

public class Carro {

    private int ano;
    private double km, preco;
    private String marca, modelo, cor;

    public Carro() {
        ano = 2000;
        km = 0;
        preco = 100.000;
        marca = "Wolks";
        modelo = "Sedan";
        cor = "Preto";
    }

    public Carro(int ano, double preco, double km, String marca, String modelo, String cor) {
        this.ano = ano;
        this.cor = cor;
        this.km = km;
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
    }

    public String ExibirCarro() {
        return "A cor é: "+this.getCor() + "\nA marca é: " + this.getMarca() + "\nO modelo é: " + this.getModelo() + "\nO ano é: " + this.getAno() + "\nA kilometragem é: " + this.getKm() + "\nO preço é: " + this.getPreco();
    }

    /**
     * @return the ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * @return the km
     */
    public double getKm() {
        return km;
    }

    /**
     * @param km the km to set
     */
    public void setKm(double km) {
        this.km = km;
    }

    /**
     * @return the preco
     */
    public double getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

}
