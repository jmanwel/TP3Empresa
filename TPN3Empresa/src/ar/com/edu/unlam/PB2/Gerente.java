package ar.com.edu.unlam.PB2;

public class Gerente extends Empleado {
	
	protected Integer cochera;

	public Gerente(String nombre, double salario, Integer DCumplea�os, Integer MCumplea�os, Integer ACumplea�os, Integer cochera) {
		super(nombre, salario, DCumplea�os, MCumplea�os, ACumplea�os);
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
		return("El nombre del Gerente es: "+nombre+" ,su salario es: "+salario+" ,su fecha de cumplea�os es: "
				+DCumplea�os+"/"+MCumplea�os+"/"+ACumplea�os+" y tiene asignada la cochera N�: "+cochera);
	}

}
