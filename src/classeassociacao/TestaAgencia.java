package classeassociacao;

import java.sql.SQLOutput;
import java.time.LocalDateTime;

public class TestaAgencia {
    public static void main(String [] args){
        Passageiro pas1 = new Passageiro("123", "Fulano");


        // LocalDateTime ja vem configurado, imoportado, com as configuracoes de apoio
        LocalDateTime data = LocalDateTime.of(2026, 4, 18, 8, 15);
        Voo vo1 = new Voo(777, "Ribeirao Preto", "Brasilia", data);


        Reserva re1 = new Reserva(912, LocalDateTime.now(), 10, pas1, vo1);
        System.out.println(re1.toString());


        // PROVA = Usando o objeto re1, exiba o destino do voo da reserva
        System.out.println("Destino do Passageiro: " + vo1.getDestino());

        // PROVA = Usando o objeto re1, exiba o nome do passageiro da reserva
        System.out.println("Nome do Passageiro: " + pas1.getNome());
    }
}
