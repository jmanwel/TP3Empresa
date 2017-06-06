package ar.com.edu.unlam.PB2;

import org.junit.Assert;
import org.junit.Test;

public class EmpresaTest {

		@Test
		public void Ingenierostest(){
			
			Empleado emple1 = new Ingeniero("Jaime", 39000.00, 1, 10, 1981);
			
			ServicioImpuesto ImpServ = new ServicioImpuesto();

			Double netoEsperado = 37050.0;
			Double netoActual = ImpServ.obtenerImpuestos(emple1);
			
	        Assert.assertEquals(netoEsperado, netoActual);
			
			System.out.println(emple1.brindaDetalles());
			System.out.println("El sueldo neto es: "+ImpServ.obtenerImpuestos(emple1));								
			
	}
		
		@Test
        public void Gerentetest(){
			
			Empleado emple2 = new Gerente("Oscar", 49000, 1, 11, 1958, 2);
			
			ServicioImpuesto ImpServ = new ServicioImpuesto();

			Double netoEsperado = 45570.00;
			Double netoActual = ImpServ.obtenerImpuestos(emple2);
			
	        Assert.assertEquals(netoEsperado, netoActual);
			
			System.out.println(emple2.brindaDetalles());
			System.out.println("El sueldo neto es: "+ImpServ.obtenerImpuestos(emple2));								
			
	}
	
	@Test
    public void Secretariatest(){
		Empleado emple3 = new Secretaria("Rosa", 27000, 20, 3, 1969);
		ServicioImpuesto ImpServ = new ServicioImpuesto();

		Double netoEsperado = 27000.00;
		Double netoActual = ImpServ.obtenerImpuestos(emple3);
		
        Assert.assertEquals(netoEsperado, netoActual);
		
		System.out.println(emple3.brindaDetalles());
		System.out.println("El sueldo neto es: "+ImpServ.obtenerImpuestos(emple3));								

	}
	
	@Test
    public void DirectorTest(){
		Gerente emple4 = new Director("Fernando", 86000, 12, 8, 1958, 1, 4000.00);
		ServicioImpuesto ImpServ = new ServicioImpuesto();

		Double netoEsperado = 80100.00;
		Double netoActual = ImpServ.obtenerImpuestos(emple4);
		
        Assert.assertEquals(netoEsperado, netoActual);
		
		System.out.println(emple4.brindaDetalles());
		System.out.println("El sueldo neto es: "+ImpServ.obtenerImpuestos(emple4));								

	}
		

}
	
