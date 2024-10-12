package telran.model;

import telran.dto.Employee;

public class Company {
	String companyAddress;
	String companyName;
	private Employee[] emps;
	private int count = 0;

	public Company(String companyAddress, String companyName, int capacity) {
		this.companyAddress = companyAddress;
		this.companyName = companyName;
		emps = new Employee[capacity];
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getCount() {
		return count;
	}

	public boolean addEmployee(Employee emp) {
		if (emp == null)
			return false;
		if(searchIndEmployee(emp)!=-1)
			return false;
		if (count < emps.length) {
			emp.setCompany(companyName);
			emps[count] = emp;
			count++;
			return true;
		}
		return false;
	}

	public boolean removeEmployee(Employee emp) {
		if (emp == null)
			return false;
		int indexEmp = searchIndEmployee(emp);
		System.out.println(indexEmp);
		if (indexEmp == -1)
			return false;
		emps[indexEmp] = emps[count - 1];
		emps[count - 1] = null;
		count--;
		return true;
	}

	private int searchIndEmployee(Employee emp) {
		for (int i = 0; i < count; i++) {
			if (emp.equals(emps[i]))
				return i;
		}
		return -1;
	}

	public boolean searchEmployee(Employee emp) {
		if (emp == null)
			return false;
		return searchIndEmployee(emp) == -1 ? false : true;
	}

	public void display() {
		String res = "Company name: " + companyName + "\nCompany address: " + companyAddress
				+ "\n==============================\n";
		for (int i = 0; i < count; i++) {
			res += emps[i].toString() + "\n";
		}
		System.out.println(res);
	}

}
