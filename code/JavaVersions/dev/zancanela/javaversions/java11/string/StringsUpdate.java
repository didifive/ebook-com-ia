package dev.zancanela.javaversions.java11.string;

public class StringsUpdate {

	public static void main(String[] args) {
		// Poema do Bushidô com múltiplas linhas
		String poema = "  Corte sem esforço\nMente como água\nAço afiado  ";

		// Validar se um juramento não está vazio ou contém apenas espaços
		String juramento = "Honra ao dojo";
		if (!juramento.isBlank()) {
			System.out.println("✓ Juramento válido");
		}

		System.out.println();
		// Processar cada linha de sabedoria do samurai
		System.out.println("📖 Ensinamentos do Bushidô:");
		poema.lines()
				.forEach(linha -> System.out.println("  " + linha.trim()));

		System.out.println();
		// O mesmo ataque é praticado 3 vezes para dominar
		String ataque = "🗡️";
		System.out.println("⚔️ Treino de repetição:");
		System.out.println(ataque.repeat(3));
	}
}
