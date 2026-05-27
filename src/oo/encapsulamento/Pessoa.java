package oo.encapsulamento;

public class Pessoa {
    private int idade;
    private String nome;

    public Pessoa(String nome, int idade){
        setNome(nome);
        setIdade(idade);
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int novaIdade){
        novaIdade = Math.abs(novaIdade);
        if(novaIdade >= 0 && novaIdade <= 120){
            this.idade = novaIdade;
        }
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String novoNome){
        this.nome = novoNome;
    }

    public String toString(){
        return "Ola, sou o " + getNome() + " e tenho "+ getIdade() + " anos!";
    }
}
