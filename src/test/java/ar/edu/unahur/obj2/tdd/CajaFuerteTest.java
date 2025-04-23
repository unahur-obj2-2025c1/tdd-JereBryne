package ar.edu.unahur.obj2.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CajaFuerteTest {
	@Test
	public void laCajaFuertaEstaAbiertaAlCrearse() {
		CajaFuerte caja = new CajaFuerte();
		assertTrue(caja.estaAbierta());
	}
	
	@Test
	public void queSeAbreLaCajaFuerteConElCodigoCorrecto() {
		CajaFuerte caja = new CajaFuerte();
		caja.cerrar(1234);
		caja.abrir(1234);
		assertTrue(caja.estaAbierta());
	}
	
	@Test
	public void sePuedeCerrarEstableciendoUnCodigoNuevo() {
		CajaFuerte caja = new CajaFuerte();
		caja.cerrar(1234);
		assertEquals(caja.codigo(),1234);
	}
	
	@Test
	public void queLanceErrorAlAbrirConUnCodigoIncorrecto() {
		CajaFuerte caja = new CajaFuerte();
		caja.cerrar(1234);
		assertThrows(RuntimeException.class, () -> {
            caja.abrir(4321);});
	}
}
