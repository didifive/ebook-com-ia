package dev.zancanela.javaversions.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

    static class Samurai {
        private String nome;
        private int nivel;
        private String escola;

        Samurai(String nome, int nivel, String escola) {
            this.nome = nome;
            this.nivel = nivel;
            this.escola = escola;
        }

        public String getNome() { return nome; }
        public int getNivel() { return nivel; }
    }

    public static void main(String[] args) {
        List<Samurai> guerreiros = Arrays.asList(
                new Samurai("Musashi", 10, "Niten'ichi"),
                new Samurai("Yoshi", 7, "Tenshin"),
                new Samurai("Hattori", 9, "Iga")
        );

        // Mestres: os que atingiram nível 8+
        List<String> mestres = guerreiros.stream()
                .filter(s -> s.getNivel() >= 8)
                .map(s -> s.getNome())
                .sorted()
                .collect(Collectors.toList());

        System.out.println("⚔️ Mestres de nível 8+:");
        mestres.forEach(mestre -> System.out.println("  • " + mestre));
    }
}
