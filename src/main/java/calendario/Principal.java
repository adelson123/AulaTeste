package calendario;

public class Principal {
	public static void main(String[] args) {
		Controle controle = new Controle();
		Data diaAtual = new Data(3,1,2020);
		Data proximoDia = controle.proximoDia(diaAtual);
		System.out.println(proximoDia);
	}
}
