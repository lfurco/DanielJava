package classeassociacao;
// Objeto parte
public class Passageiro {
    private String cpf, nome;


    public Passageiro() {   //  Const
    }

    public Passageiro(String cpf, String nome) {    // Const
        this.cpf = cpf;
        this.nome = nome;
    }


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Passageiro{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}


// Prova = Por que no construtor passageiro ta usando "this.taltal" e nao "setters"
// Resposta = pq nao tem validacao, nao tem IF (entao nao precisa usar)