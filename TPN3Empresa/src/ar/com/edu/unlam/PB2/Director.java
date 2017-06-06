package ar.com.edu.unlam.PB2;

public class Director extends Gerente {
	
	private Double plus;

	public Director(String nombre, double salario, Integer DCumpleaños, Integer MCumpleaños, Integer ACumpleaños,Integer cochera,Double plus) {
		super(nombre, salario, DCumpleaños, MCumpleaños, ACumpleaños, cochera);
		this.plus=plus;
		
	}
	
	public Double getPlus() {
		return plus;
	}

	public void setPlus(Double plus) {
		this.plus = plus;
	}
	@Override
	public double getSalario() {
		return salario+plus;
	}

	@Override
	public String brindaDetalles(){
		return("El nombre del Director es: "+nombre+" ,su salario es: "+(salario+plus)+" ,su fecha de cumpleaños es: "
				+DCumpleaños+"/"+MCumpleaños+"/"+ACumpleaños+" y tiene asignada la cochera Nº: "+cochera);
	}

}
