package dev.zancanela.javaversions.java21.virtualthreads;

import java.util.concurrent.Executors;

public class VirtualThreads {

	public static void main(String[] args) {
		// Treinar samurais em paralelo sem sofrimento com virtual threads
		long inicio = System.currentTimeMillis();

		try (var dojo = Executors.newVirtualThreadPerTaskExecutor()) {
			for (int i = 1; i <= 10_000; i++) {
				int id = i;
				dojo.submit(() -> {
					String resultado = treinarSamurai("Samurai-" + id);
					System.out.println("✓ " + resultado);
				});
			}
		} // ThreadPool fecha automaticamente ao final do bloco

		long fim = System.currentTimeMillis();
		long duracao = fim - inicio;

		System.out.println();
		System.out.println("⏱️ Tempo de execução: " + duracao + " ms");
		System.out.println("💡 Virtual threads: milhares de tasks leves gerenciadas pela JVM.");
	}

	private static String treinarSamurai(String nome) {
		try {
			Thread.sleep(10); // simula treino rápido
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		return nome + " completou o treino";
	}
}
