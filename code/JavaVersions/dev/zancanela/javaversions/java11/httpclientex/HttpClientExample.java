package dev.zancanela.javaversions.java11.httpclientex;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HttpClientExample {

	private static final Pattern QUOTE_PATTERN =
			Pattern.compile("\"q\"\\s*:\\s*\"([^\"]*)\"");
	private static final Pattern AUTHOR_PATTERN =
			Pattern.compile("\"a\"\\s*:\\s*\"([^\"]*)\"");

	public static void main(String[] args) {
		// O dojô consulta uma fonte pública de conhecimento
		HttpClient client = HttpClient.newHttpClient();
		try {
			HttpRequest request = HttpRequest.newBuilder()
					.uri(URI.create("https://zenquotes.io/api/random"))
					.header("Accept", "application/json")
					.build();
			HttpResponse<String> response =
					client.send(request, HttpResponse.BodyHandlers.ofString());
			String json = response.body();
			String frase = extrairCampo(json, QUOTE_PATTERN);
			String autor = extrairCampo(json, AUTHOR_PATTERN);

			System.out.println("📚 Conhecimento recebido: \""+
					frase +
					"\" — " +
					autor
			);
		} catch (IOException | InterruptedException e) {
			Thread.currentThread().interrupt();
			System.out.println(
					"⚠️ Não foi possível consultar o conhecimento " +
							e.getMessage()
			);
		}
	}

	private static String extrairCampo(String json, Pattern pattern) {
		Matcher matcher = pattern.matcher(json);
		return matcher.find() ? matcher.group(1) : "desconhecido";
	}
}
