package dev.zancanela.javaversions.java17.pminstanceof;

public class PatternMatchingInstanceOf {

	sealed interface Guerreiro permits SamuraiAtaque, SamuraiDefesa {}
	record SamuraiAtaque(String nome, int dano) implements Guerreiro {}
	record SamuraiDefesa(String nome, int armadura) implements Guerreiro {}

	public static void main(String[] args) {
		// Diferentes tipos de guerreiros, tratados com instanceof pattern matching
		Guerreiro combatente = new SamuraiAtaque("Hattori", 8);

		if (combatente instanceof SamuraiAtaque samurai) {
			System.out.println("⚔️ " + samurai.nome() +
                    " ataca com poder " + samurai.dano());
		} else if (combatente instanceof SamuraiDefesa samurai) {
			System.out.println("🛡️ " + samurai.nome() +
                    " defende com armadura " + samurai.armadura());
		} else {
			System.out.println("🥷 Guerreiro desconhecido.");
		}

		System.out.println();
		System.out.println(
                "💡 Pattern matching funde verificação de tipo e cast em uma única expressão."
        );
	}
}
