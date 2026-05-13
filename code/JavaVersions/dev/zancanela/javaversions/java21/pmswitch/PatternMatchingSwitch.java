package dev.zancanela.javaversions.java21.pmswitch;

public class PatternMatchingSwitch {

	sealed interface Guerreiro permits SamuraiAtaque, SamuraiDefesa {
		String nome();
	}
	record SamuraiAtaque(String nome, int dano) implements Guerreiro {}
	record SamuraiDefesa(String nome, int armadura) implements Guerreiro {}

	public static void main(String[] args) {
		// Decidir próximo movimento de combate com elegância (pattern matching + guards)
		Guerreiro atacante = new SamuraiAtaque("Musashi", 10);
		Guerreiro defensor = new SamuraiDefesa("Takeda", 8);

		System.out.println("Atacante: " + atacante.nome());
		System.out.println("Próximo movimento: " + proximoMovimento(atacante));

		System.out.println();
		System.out.println("Defensor: " + defensor.nome());
		System.out.println("Próximo movimento: " + proximoMovimento(defensor));
	}

	private static String proximoMovimento(Guerreiro guerreiro) {
		return switch (guerreiro) {
			case SamuraiAtaque s when s.dano() >= 8
					-> "Executar ataque supremo";
			case SamuraiAtaque s
					-> "Preparar ataque rápido";
			case SamuraiDefesa s when s.armadura() >= 7
					-> "Manter posição defensiva";
			case SamuraiDefesa s
					-> "Retrair para pontos fracos";
			default -> "Avaliar situação";
		};
	}
}
