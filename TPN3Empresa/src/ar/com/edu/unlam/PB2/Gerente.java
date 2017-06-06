package ar.com.edu.unlam.PB2;

public class Gerente extends Empleado {
	
	protected Integer cochera;

	public Gerente(String nombre, double salario, Integer DCumpleaños, Integer MCumpleaños, Integer ACumpleaños, Integer cochera) {
		super(nombre, salario, DCumpleaños, MCumpleaños, ACumpleaños);
		this.cochera=cochera;
		
	}
	
	public Integer getCochera() {
		return cochera;
	}

	public void setCochera(Integer cochera) {
		this.cochera = cochera;
	}

	@Override
	public String brindaDetalles(){
		return("El nombre del Gerente es: "+nombre+" ,su salario es: "+salario+" ,su fecha de cumpleaños es: "
				+DCumpleaños+"/"+MCumpleaños+"/"+ACumpleaños+" y tiene asignada la cochera Nº: "+cochera);
	}

}
