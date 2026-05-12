package dev.zancanela.javaversions.java8.javatime;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class JavaTime {

	public static void main(String[] args) {
		// Data de hoje no treino do samurai
		LocalDate hoje = LocalDate.now();
		LocalDate inicioTreino = hoje;
		LocalDate fimTreino = inicioTreino.plusDays(90);

		// Dias até a próxima promoção
		LocalDate dataProvaDePromocao = LocalDate.of(2026, 5, 31);
		long diasParaPromocao = ChronoUnit.DAYS.between(hoje, dataProvaDePromocao);

		System.out.println("📅 Hoje: " + hoje);
		System.out.println("📅 Início do treino: " + inicioTreino);
		System.out.println("📅 Fim do treino em 90 dias: " + fimTreino);
		System.out.println("⏳ Dias até a promoção: " + diasParaPromocao);

		// Horário preciso com fuso do Japão
		ZonedDateTime treinoNoJapao = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
		System.out.println("🌅 Treino em Tokyo: " + treinoNoJapao);
	}
}
