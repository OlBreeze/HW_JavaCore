package telran.dto;

public class Employee extends Person {
	String company;
	String position;// (должность)
	double baseSalary;

	public Employee() {
	}

	public Employee(String name, int age, boolean married, String company, String position, double baseSalary) {
		super(name, age, married);
		if (company != null && !company.isBlank())
			this.company = company;
		else
			this.company = "No company";
		if (position != null && !position.isBlank())
			this.position = position;
		else
			this.position = "No position";
		setBaseSalary(baseSalary);
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		if (company != null && !company.isBlank())
			this.company = company;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		if (position != null && !position.isBlank())
			this.position = position;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		if (baseSalary > 0.)
			this.baseSalary = baseSalary;
	}

	@Override
	public String toString() {
		return "Employee [company=" + company + ", position=" + position + ", baseSalary=" + baseSalary + ", name="
				+ name + ", age=" + age + ", married=" + married + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(baseSalary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + ((position == null) ? 0 : position.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Employee))
			return false;
		Employee other = (Employee) obj;
		if (Double.doubleToLongBits(baseSalary) != Double.doubleToLongBits(other.baseSalary))
			return false;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (position == null) {
			if (other.position != null)
				return false;
		} else if (!position.equals(other.position))
			return false;
		return true;
	}

//	public void display() {
//		System.out.println(toString());
//	}

	public double calculateSalary() {
		return 0.;
	}

}
