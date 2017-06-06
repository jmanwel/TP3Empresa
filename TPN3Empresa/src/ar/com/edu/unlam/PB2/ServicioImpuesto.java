package ar.com.edu.unlam.PB2;

public class ServicioImpuesto {
		
		
		public Double obtenerImpuestos(Empleado emple){
			if(emple.getSalario()>0){
				
				if(emple.getSalario()<=37000){
					Double salarioConImpuesto=emple.getSalario();
					return salarioConImpuesto;
				}
			if(emple.getSalario()>37000&&emple.getSalario()<=42000){
				Double Impuesto = emple.getSalario()*5/100;
				Double salarioConImpuesto=emple.getSalario()-Impuesto;
				return salarioConImpuesto;
			}
			if(emple.getSalario()>42000&&emple.getSalario()<=50000){
				Double Impuesto = emple.getSalario()*7/100;
				Double salarioConImpuesto=emple.getSalario()-Impuesto;
				return salarioConImpuesto;
			}
			if(emple.getSalario()>50000){
				Double Impuesto = emple.getSalario()*11/100;
				Double salarioConImpuesto=emple.getSalario()-Impuesto;
				return salarioConImpuesto;
	}
			}
		
return 0.0;
}
}
