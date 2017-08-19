package exercicio1;

import java.util.Arrays;

public class Apostas {

	private int[] aposta = new int[6];
	private static int[] resultado = new int[6];

	public Apostas(int[] aposta) {
		this.aposta = aposta;

	}

	public int[] getAposta() {
		return aposta;
	}

	public void setAposta(int[] aposta) {
		this.aposta = aposta;
	}

	public static int[] getResultado() {
		return resultado;
	}

	public static void setResultado(int[] resultado) {
		Apostas.resultado = resultado;
	}

	public static void verificaResultado(Apostas aposta) {

		Arrays.sort(aposta.getAposta());
		Arrays.sort(Apostas.resultado);

		boolean acerto = true;

		for (int aux = 0; aux < aposta.getAposta().length; aux++) {

				if (aposta.getAposta()[aux] != Apostas.resultado[aux]) {
					
					acerto = false;
					break;
				}
			}

		if (acerto == true) {
			System.out.println("Aposta vencedora");

		} else {
			System.out.println("Tente na próxima");

		}
	}
}
