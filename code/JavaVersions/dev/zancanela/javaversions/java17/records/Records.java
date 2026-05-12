package dev.zancanela.javaversions.java17.records;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class Records {

	// Um Samurai é imutável: seus atributos essenciais não mudam
	public record Samurai(String nome, int nivel, String escola, LocalDate dataEntrada) {
		public Samurai { // construtor compacto com validação
			if (nivel < 0 || nivel > 10) {
				throw new IllegalArgumentException("Nível deve estar entre 0 e 10");
			}
		}
		public int anosDeServico() {
			return (int) ChronoUnit.YEARS.between(dataEntrada, LocalDate.now());
		}
	}

	public static void main(String[] args) {
		Samurai musashi =
				new Samurai("Musashi", 10, "Niten'ichi",
						LocalDate.of(2010, 1, 1)
				);
		Samurai yoshi =
				new Samurai("Yoshi", 7, "Tenshin",
						LocalDate.of(2018, 6, 15)
				);

		System.out.println("⚔️ Samurais (record - imutáveis):");
		List.of(musashi, yoshi).forEach(System.out::println);

		System.out.println();
		System.out.println("💡 Records: concisos, imutáveis e com validação no construtor compacto.");
	}
}
