import java.util.stream.Stream;

public class AprendendoMap {

    public static void main(String[] args) {

        //Fazendo um map de notas e adicionando +2 e depois tirando -1 em cada nota
        Double[] notas = {5.5, 5.5, 7.3, 7.2};
        Stream.of(notas)
                .map(nota -> nota + 2)
                .map(nota -> nota - 1)
                .forEach(System.out::println);
    }
}
