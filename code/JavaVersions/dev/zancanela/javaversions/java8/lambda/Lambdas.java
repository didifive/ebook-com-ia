package dev.zancanela.javaversions.java8.lambda;

import java.util.Arrays;
import java.util.List;

public class Lambdas {

    public static void main(String[] args) {
        List<String> samurais = Arrays
                .asList("Musashi",
                        "Yoshi",
                        "Hattori");

        // Iterando sobre samurais utilizando lambda
        samurais.stream()
                .forEach(nome ->
                        System.out.println(
                                "🗡️ " +
                                nome +
                                " está em treino"
                        ));

        // Usando como callback para execução de técnicas
        Runnable tecnicaDeCorte = () ->
                System.out.println("⚡ Iaijutsu executado!");
        // Executando a técnica
        tecnicaDeCorte.run();
    }
}
