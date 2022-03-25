package converter;

import converter.converters.CSVConverter;
import converter.converters.Converter;
import converter.converters.JsonConverter;
import converter.employeer.Employeer;
import converter.employeer.ITGuy;
import converter.employeer.ProjectManager;

public class Client {

	public static void main(String[] args) {
		Employeer emp = null;
		Converter converter = null;
		
		
		emp = new ITGuy("Carlinhos da ti", 45, 3400.00);
		converter = new JsonConverter();
		System.out.println(converter.getEmployeeFormated(emp));
		converter = new CSVConverter();
		System.out.println(converter.getEmployeeFormated(emp));
		
		
		emp = new ProjectManager("Renata Da Silva", 26, 5000.00);
		converter = new JsonConverter();
		System.out.println(converter.getEmployeeFormated(emp));
		converter = new CSVConverter();
		System.out.println(converter.getEmployeeFormated(emp));
		
		
		

	}

}
