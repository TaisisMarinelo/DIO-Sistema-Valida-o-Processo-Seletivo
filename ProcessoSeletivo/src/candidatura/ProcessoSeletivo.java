package candidatura;

public class ProcessoSeletivo {

	public static void main(String[] args) {
		
		analisarCandidati(1900.0);
		analisarCandidati(2200.0);
		analisarCandidati(2000.0);

	}


	
	static void analisarCandidati(double salarioPretendido) {
		double salarioBase= 2000.0;
		
		if (salarioBase > salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO.");
		} else if(salarioBase == salarioPretendido){
			System.out.println("LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA.");
		}else {
			System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS.");
		}
		
	}

}
