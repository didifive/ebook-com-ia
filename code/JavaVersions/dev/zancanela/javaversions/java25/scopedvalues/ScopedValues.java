package dev.zancanela.javaversions.java25.scopedvalues;

public class ScopedValues {

	static final ScopedValue<String> MISSION = ScopedValue.newInstance();
	static final ScopedValue<String> DOJO = ScopedValue.newInstance();

	void main() {
		System.out.println("⚔️ Mensagens do dojo:");

		ScopedValue.where(DOJO, "Kyoto Dojo")
				.where(MISSION, "Proteger o pergaminho")
				.run(ScopedValues::executarMissao);

		System.out.println();

		ScopedValue.where(DOJO, "Tokyo Dojo")
				.where(MISSION, "Recuperar a espada sagrada")
				.run(ScopedValues::executarMissao);

		System.out.println();
		System.out.println("💡 Scoped Values: contexto por escopo, sem ThreadLocal.");
	}

	private static void executarMissao() {
		System.out.println("Dojo: " + DOJO.get());
		System.out.println("Missão: " + MISSION.get());
		System.out.println("→ Ação executada com contexto isolado");
	}
}