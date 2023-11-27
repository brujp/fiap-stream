import java.util.stream.Stream;

public class AprendendoMinEMax {

    public static void main(String[] args) {

        Double[] notas = {5.5, 5.2, 7.3, 7.2};

        //Filtrando pela maior nota no Array
        var max = Stream.of(notas).max((nota1, nota2) -> {
            if(nota1 < nota2) return -1;
            if(nota2 > nota1) return 1;
            return 0;
        }).get();

        System.out.println("Maior nota: " + max);

        //Filtrando pela menor nota no Array
        var min = Stream.of(notas).min((nota1, nota2) -> {
            if(nota1 < nota2) return -1;
            if(nota2 < nota1) return 1;
            return 0;
        }).get();

        System.out.println("Maior nota: " + min);
    }
    
}
