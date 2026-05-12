package dev.zancanela.javaversions.java17.sealedclasses;

import java.util.ArrayList;
import java.util.List;

public class SealedClasses {
	// Tipos de técnicas permitidas no Bushidō - nunca expandir além disso
	public sealed interface TecnicaDeCombate permits Iaijutsu, Kendo, Jujutsu {
		String executar();
	}
	public static final class Iaijutsu implements TecnicaDeCombate {
		@Override
		public String executar() {
			return "💨 Saque rápido e corte";
		}
	}
	public static final class Kendo implements TecnicaDeCombate {
		@Override
		public String executar() {
			return "🗡️ Combate com espada";
		}
	}
	public static final class Jujutsu implements TecnicaDeCombate {
		@Override
		public String executar() {
			return "🤼 Luta corpo a corpo";
		}
	}

	public static void main(String[] args) {
		List<TecnicaDeCombate> tecnicas = new ArrayList<>();
        tecnicas.add(new Iaijutsu());
        tecnicas.add(new Kendo());
        tecnicas.add(new Jujutsu());

		System.out.println("⚔️ Técnicas permitidas pelo Bushidō:");
		tecnicas.forEach(t -> System.out.println("  • " + t.executar()));
	}
}
