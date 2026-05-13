package dev.zancanela.javaversions.java21.sequenced;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.SequencedCollection;

public class SequencedCollections {

	public static void main(String[] args) {
		// Sequência de ataques em um duelo — ordem importa
		SequencedCollection<String> ataques =
				new LinkedList<>();
		ataques.addAll(Arrays.asList(
				"Saque rápido",
				"Corte horizontal",
				"Contra-ataque",
				"Golpe final"
		));

		System.out.println("Primeiro ataque: " +
				ataques.getFirst());
		System.out.println("Golpe final: " +
				ataques.getLast());
		System.out.println("Sequência reversa: " +
				ataques.reversed().stream().toList());
	}
}
