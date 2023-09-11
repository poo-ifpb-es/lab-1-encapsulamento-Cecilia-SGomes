public class Estudante {
    public int matricula;
    public String nome;

    public Estudante(String nome, int matricula) {
        this.matricula = matricula;
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }    
}

