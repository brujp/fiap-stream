import java.util.stream.Stream;

public class ConstrucaoStream {

    public static void main(String[] args) {

        //Stream de números
        Stream<Number> notas = Stream.of(10, 20, 30, 9.8, 6.2, 4.1);
        notas.forEach(System.out::println);

        System.out.println("****");

        //Passando um Array de notas para o Stream
        Number[] maisNotas = {7, 6.5, 7.2, 9};
        Stream.of(maisNotas).forEach(System.out::println);

        
    }
}
