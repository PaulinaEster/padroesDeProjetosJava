package converter.converters;

import java.util.Locale;

import converter.employeer.Employeer;

public class CSVConverter implements Converter{

	@Override
	public String getEmployeeFormated(Employeer emp) {
		 
		return String.format(Locale.US, "%s,%d,%.2f", 
				emp.getName(),
				emp.getAge(),
				emp.getSalary());
	}

}
