package calendario;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ControleTest {
	
	@Test
	public void verificaProximoDiaDentroDoMesmoMes() {
		Controle controle = new Controle();
		Data data = new Data(3,1,2020);
		Data proximoDiaRetornado;
		proximoDiaRetornado = controle.proximoDia(data);
		Data proximoDiaEsperado = new Data(4,1,2020);
		assertEquals(proximoDiaEsperado, proximoDiaRetornado);
	}
	
	@Test
	public void verificaProximoDiaDeMesesDiferenteComMesDe31Dias() {
		Controle controle = new Controle();
		Data data = new Data(31,5,2020);
		Data proximoDiaRetornado;
		proximoDiaRetornado = controle.proximoDia(data);
		Data proximoDiaEsperado = new Data(1,6,2020);
		assertEquals(proximoDiaEsperado, proximoDiaRetornado);
	}
	@Test
	public void verificaProximoDiaDeMesesDiferenteComMesDe30Dias() {
		Controle controle = new Controle();
		Data data = new Data(30,4,2020);
		Data proximoDiaRetornado;
		proximoDiaRetornado = controle.proximoDia(data);
		Data proximoDiaEsperado = new Data(1,5,2020);
		assertEquals(proximoDiaEsperado, proximoDiaRetornado);
	}
	
	@Test
	public void verificaProximoDiaDoMesAno2019() {
		Controle controle = new Controle();
		Data data = new Data(28,2,2020);
		Data proximoDiaRetornado;
		proximoDiaRetornado = controle.proximoDia(data);
		Data proximoDiaEsperado = new Data(29,2,2020);
		assertEquals(proximoDiaEsperado, proximoDiaRetornado);
	}
	
	@Test
	public void verificaProximoDiaDoMesAnoBisexto2020() {
		Controle controle = new Controle();
		Data data = new Data(29,2,2020);
		Data proximoDiaRetornado;
		proximoDiaRetornado = controle.proximoDia(data);
		Data proximoDiaEsperado = new Data(1,3,2020);
		assertEquals(proximoDiaEsperado, proximoDiaRetornado);
	}
}
