package ar.com.edu.unlam.PB2;

public class Empleado {
	
	protected String nombre;
	protected double salario;
	protected Integer DCumplea�os;
	protected Integer MCumplea�os;
	protected Integer ACumplea�os;
	
	public Empleado(String nombre, double salario, Integer DCumplea�os,Integer MCumplea�os,Integer ACumplea�os) {
		this.nombre = nombre;
		this.salario = salario;
		this.DCumplea�os = DCumplea�os;
		this.MCumplea�os = MCumplea�os;
		this.ACumplea�os = ACumplea�os;

}
	
	public String brindaDetalles(){
		return("El nombre del empleado es: "+nombre+" ,su salario es: "+salario+" y su fecha de cumplea�os es: "
				+DCumplea�os+"/"+MCumplea�os+"/"+ACumplea�os);
		
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}


}
