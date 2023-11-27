import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Startup {

    public static void main(String[] args) {

        //Inicializando uma lista
        List<String> estudantes = Arrays.asList("Bruno", "Andreia", "Claudemir", "Debora");

        //Percorrer a lista utilizando foreach
        System.out.println("** Foreach ** ");
        for (String nome: estudantes) {
            System.out.println("Estudantes: " + nome);
        }

        //Percorrer a lista utilizando Iterator
        System.out.println("** Iterator **");
        Iterator<String> iterator = estudantes.iterator();

        while (iterator.hasNext()) {
            System.out.println("Estudantes: " + iterator.next());
        }

        //Percorrer a lista utilizando Stream
        System.out.println("** Stream **");

        Stream<String> stream = estudantes.stream();
        stream.forEach(System.out::println);

    }

}
