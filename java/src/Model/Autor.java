package Model;

public class Autor {
    private int idAutor;
    private String nome;
    private Integer idade;
    private  Double valorHora;

    public Autor(int idAutor, String nome, Integer idade, Double valorHora) {
        this.idAutor = idAutor;
        this.nome = nome;
        this.idade = idade;
        this.valorHora = valorHora;
    }

    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

}
