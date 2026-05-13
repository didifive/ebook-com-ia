package dev.zancanela.javaversions.java25.flexibleconstructors;

public class FlexibleConstructors {

    static class Guerreiro {
        String nome;
        int nivel;

        Guerreiro(String nome, int nivel) {
            this.nome = nome;
            this.nivel = nivel;
        }
    }

    static class Samurai extends Guerreiro {
        String escola;

        // Flexible Constructor Bodies: validação ANTES de super()
        Samurai(String nome, int nivel, String escola) {
            if (nivel < 0 || nivel > 10)
                throw new IllegalArgumentException(
                        "Não foi possível inscrever \"" +
                        nome +
                        "\" - O nível deve estar entre 0 e 10");
            super(nome, nivel);
            this.escola = escola;
        }
    }

    void main() {
        try {
            Samurai musashi = new Samurai("Musashi", 10, "Niten'ichi");
            System.out.println("✓ " + musashi.nome + " (nível " + musashi.nivel + ")");
        } catch (IllegalArgumentException e) {
            System.out.println("❌ " + e.getMessage());
        }

        try {
            new Samurai("Yoshi", 15, "Tenshin");
        } catch (IllegalArgumentException e) {
            System.out.println("❌ " + e.getMessage());
        }
    }
}