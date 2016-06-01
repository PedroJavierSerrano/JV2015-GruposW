package util;

import static org.junit.Assert.*;

import java.util.Calendar;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import modelo.Usuario;

/** Realiza un test sobre la clase Fecha del modelo.
 * 
 * 
 * @author Pedro Javier Serrano Balsalobre
 * 31/05/2016
 */

public class FechaTest {
	 private Fecha fecha1;
	 private Fecha fecha2;
	 private Fecha fecha3;
	 
	 private static Calendar calendario;
	
	 @Before
		public void crearObjetosPrueba(){
			 fecha1 = new Fecha();
			 fecha2 = new Fecha("03/06/2016");
			 fecha3 = new Fecha(fecha2);
		}
		
		@After 
		public void borrarObjetosPrueba(){
			fecha1 = null;
			fecha2 = null;
			fecha3 = null;
			}
	 
	
	 
	@Test
	public void testFechaIntIntInt() {
		assertTrue(fecha2 != null);
	}

	@Test
	public void testFecha() {
		assertTrue(fecha2 != null);
	}

	@Test
	public void testFechaFecha() {
		assertTrue(fecha1 != null);
	}

	@Test
	public void testGetAño() {
		assertTrue(fecha3 != null);
	}

	@Test
	public void testGetMes() {
		assertTrue(fecha2 != null);
	}

	@Test
	public void testGetDia() {
		assertTrue(fecha2 != null);
	}

	@Test
	public void testSetAño() {
		Año año = new Año();
		año.setAño("2016");
		fecha2.setAño(año);
		assertequals(fecha2.getAño(), año);
	}

	private void assertequals(int año, Año año2) {
		
	}

	@Test
	public void testSetMes() {
		Mes mes = new Mes();
		mes.setMes("05");
		fecha2.setMes(mes);
		assertequals(fecha2.getMes(), mes);
	}

	private void assertequals(int mes, Mes mes2) {
		
	}

	@Test
	public void testSetDia() {
		fail("Not yet implemented");
	}

	@Test
	public long testDifSegundos() {
		return ((calendario.getTimeInMillis() 
				- FechaTest.calendario.getTimeInMillis()) / 1000);
	}

	@Test
	public long testDifMinutos() {
		return (long)((calendario.getTimeInMillis() 
				- FechaTest.calendario.getTimeInMillis()) /60*1000);
	}

	@Test
	public long testDifHoras() {
		return (long) (calendario.getTimeInMillis() 
				- FechaTest.calendario.getTimeInMillis()) / (60*60*1000);
	}

	@Test
	public int testDifDias() {
		return (int)(calendario.getTimeInMillis() 
				- FechaTest.calendario.getTimeInMillis()) / (24*60*60*1000);
	}

	@Test
	public int testDifSemanas() {
		return (int) (calendario.getTimeInMillis() 
				- FechaTest.calendario.getTimeInMillis()) / (7*60*60*1000);
	}

	@Test
	public int testDifMeses() {
		return (int) (calendario.getTimeInMillis() 
				- FechaTest.calendario.getTimeInMillis()) / (30*60*60*1000);
	}

	@Test
	public int testDifAños() {
		return (int) (calendario.getTimeInMillis() 
				- FechaTest.calendario.getTimeInMillis()) / (365*60*60*1000);
	}

	@Test
	public void testAddSegundos() {
		int segundos = 10;
		calendario.add(Calendar.SECOND, segundos);
	}

	@Test
	public void testAddMinutos() {
		int minutos = 5;
		calendario.add(Calendar.MINUTE, minutos);
	}

	@Test
	public void testAddHoras() {
		int horas = 1;
		calendario.add(Calendar.HOUR, horas);
	}

	@Test
	public void testAddDias() {
		int dias = 1;
		calendario.add(Calendar.DAY_OF_MONTH, dias);
	}

	@Test
	public void testAddSemanas() {
		int semanas = 2;
		calendario.add(Calendar.WEEK_OF_MONTH, semanas);
	}

	@Test
	public void testAddMeses() {
		int meses = 1;
		calendario.add(Calendar.MONTH,meses);
	}

	@Test
	public void testAddAños() {
		int años = 1;
		calendario.add(Calendar.YEAR,años);
	}

	

	@Test
	public int testCompareTo() {
		
		return calendario.compareTo(FechaTest.calendario);
	}
	
}
	

