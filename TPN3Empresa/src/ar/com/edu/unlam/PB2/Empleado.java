package ar.com.edu.unlam.PB2;

public class Empleado {
	
	protected String nombre;
	protected double salario;
	protected Integer DCumpleaños;
	protected Integer MCumpleaños;
	protected Integer ACumpleaños;
	
	public Empleado(String nombre, double salario, Integer DCumpleaños,Integer MCumpleaños,Integer ACumpleaños) {
		this.nombre = nombre;
		this.salario = salario;
		this.DCumpleaños = DCumpleaños;
		this.MCumpleaños = MCumpleaños;
		this.ACumpleaños = ACumpleaños;

}
	
	public String brindaDetalles(){
		return("El nombre del empleado es: "+nombre+" ,su salario es: "+salario+" y su fecha de cumpleaños es: "
				+DCumpleaños+"/"+MCumpleaños+"/"+ACumpleaños);
		
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}


}
