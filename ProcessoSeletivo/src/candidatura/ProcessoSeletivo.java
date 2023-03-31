package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

	public static void main(String[] args) {

		//selecaoCandidatos();
		String[] candidatos = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO"};
		for(String cadidato: candidatos) {
			entrandoEmContato(cadidato);
		}
		

	}
	
	static void entrandoEmContato(String candidato) {
		int tentativasRealizadas = 1;
		boolean continuaTentando = true;
		boolean atendeu =  false;
		
		do {
			atendeu = atender();
			continuaTentando = !atendeu;
			if (continuaTentando) {
				tentativasRealizadas++;
			}else {
				System.out.println("Contato Realizado com sucesso");
			}
			
		} while (continuaTentando && tentativasRealizadas < 3);
		
		if (atendeu) {
			System.out.println("Conseguimos contato com "+candidato+ " nas "+ tentativasRealizadas+ " tentativa.");
		} else {
			System.out.println("Não conseguimos contato com "+candidato+ " nas "+ tentativasRealizadas+ " tentativa.");
		}
		
	}
	
	static boolean atender() {
		return new Random().nextInt(3)==1;
	}

	static void imprimirSelecionados(String[] cadidatosAceitos, double[] cadidatosAceitosValores) {

		for (int i = 0; i < cadidatosAceitos.length; i++) {
			System.out.println("O candidato de número " + (i + 1) + " de nome " + cadidatosAceitos[i]
					+ " que tem sálario pretendido de " + cadidatosAceitosValores[i]);

		}

	}

	static void selecaoCandidatos() {
		// Array contendo a lista com os nomes dos candidatos

		String[] candidatos = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRÍCIO", "MIRELA",
				"DANIELA", "JORGE" };
		String[] cadidatosAceitos = new String[5];
		double[] cadidatosAceitosValores = new double[5];
		int candidatosSelecionados = 0;
		int candidatoAtual = 0;
		int index = 0;

		while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
			String candidato = candidatos[candidatoAtual];
			double salarioPretendido = valorPretendido();

			boolean avaliacao = analisarCandidato(salarioPretendido);

			if (avaliacao == true) {
				cadidatosAceitos[index] = candidato;
				cadidatosAceitosValores[index] = salarioPretendido;
				index++;
				candidatosSelecionados++;
			}
			candidatoAtual++;
		}

		imprimirSelecionados(cadidatosAceitos, cadidatosAceitosValores);

	}

	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}

	static boolean analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;

		if (salarioBase > salarioPretendido) {
			return true;
		} else if (salarioBase == salarioPretendido) {
			return true;
		} else {
			return false;
		}

	}

}
