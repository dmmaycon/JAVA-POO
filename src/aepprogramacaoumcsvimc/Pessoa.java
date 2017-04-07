/**
 *
 * @author Maycon de Moraes
 */
package aepprogramacaoumcsvimc;


public class Pessoa {
    // Atributos da pessoa
    private int id;
    private String sexo;
    private String nome;
    private String sobrenome;
    private int idade;
    private float peso;
    private float altura;
    
    // Construtor da Pessoa

    public Pessoa(int id, String sexo, String nome, String sobrenome, int idade, float peso, float altura) {
        this.id = id;
        this.sexo = sexo;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }
    
    public Float CalculaImc(float peso, float altura){
        float imc = peso /(altura * altura);
        return imc*10000;
    }
    
    public String ClassificaImc(float imc){
        return null;
    }
    
    // Acessores e Mutantes

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    
}
