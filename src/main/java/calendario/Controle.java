package calendario;

public class Controle {

	public Data proximoDia(Data diaAtual) {
		Data proximoDia = new Data();
		proximoDia.setDia(diaAtual.getDia()+1);
		if(diaAtual.getMes() % 2 != 0 && diaAtual.getDia()==31) {
			proximoDia.setMes(diaAtual.getMes() + 1);
		}
		else {
			proximoDia.setMes(diaAtual.getMes());
		}
		proximoDia.setMes(diaAtual.getMes());
		proximoDia.setAno(diaAtual.getAno());
		return proximoDia;
	}
}
