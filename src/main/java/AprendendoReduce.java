import java.util.stream.Stream;

public class AprendendoReduce {

    public static void main(String[] args) {

        //Reduce é para modificar a Stream de diversas formas
        //Calcular a média das notas com Reduce

        Double[] notas = {5.5, 5.5, 7.3, 7.2};

        var aprovado = Stream.of(notas).reduce((acumulador, nota) -> acumulador + nota)
                .map(somaDasNotas -> somaDasNotas / notas.length)
                .filter(nota -> nota > 5)
                .isPresent();

        System.out.println("Você foi aprovado? " + (aprovado ? "Sim": "Não"));
    }
}
