package ar.com.edu.unlam.PB2;

public class Director extends Gerente {
	
	private Double plus;

	public Director(String nombre, double salario, Integer DCumplea�os, Integer MCumplea�os, Integer ACumplea�os,Integer cochera,Double plus) {
		super(nombre, salario, DCumplea�os, MCumplea�os, ACumplea�os, cochera);
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
		return("El nombre del Director es: "+nombre+" ,su salario es: "+(salario+plus)+" ,su fecha de cumplea�os es: "
				+DCumplea�os+"/"+MCumplea�os+"/"+ACumplea�os+" y tiene asignada la cochera N�: "+cochera);
	}

}
