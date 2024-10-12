package telran.appl;

import telran.dto.Employee;
import telran.dto.Manager;
import telran.dto.SaleManager;
import telran.dto.WageEmployee;
import telran.model.Company;

public class PersonAppl {

	public static void main(String[] args) {
		Employee[] emps = { new Manager("Max1", 21, false, "Roga", "Manag", 10000, 1),
				new Manager("Max2", 22, true, "Roga", "Manag1", 12000, 2),
				new Manager("Max3", 23, false, "Roga", "Manag2", 13000, 3),
				new WageEmployee("Wag1", 45, true, "Koni1", "Wage1", 7000, 12, 40),
				new WageEmployee("Wag2", 46, true, "Koni2", "Wage2", 17000, 13, 41),
				new WageEmployee("Wag3", 47, true, "Koni3", "Wage3", 9000, 14, 42),
				new WageEmployee("Wag4", 48, false, "Koni4", "Wage4", 8000, 15, 43),
				new SaleManager("Salon1", 25, false, "Poni", "Sales1", 5000, 10000, 3),
				new SaleManager("Salon2", 26, true, "Poni", "Sales2", 5000, 11000, 5),
				new SaleManager("Salon3", 27, false, "Poni", "Sales3", 5000, 110000, 4) };
		Company company = new Company("Israel, Ierusalim str., b.1", "Roga i kopyta", 5);
		
		company.addEmployee(emps[0]);
		System.out.println(company.addEmployee(emps[0]));
		company.addEmployee(emps[1]);
		company.addEmployee(emps[2]);
		company.addEmployee(emps[3]);
		company.addEmployee(emps[4]);
		System.out.println(company.addEmployee(emps[5]));
		boolean res = company.removeEmployee(new Manager("Max1", 21, false, "Roga i kopyta", "Manag", 10000, 1));
		System.out.println(res);
		company.display();
	}

}
