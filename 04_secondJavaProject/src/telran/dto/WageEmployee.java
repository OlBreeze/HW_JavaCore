package telran.dto;

public class WageEmployee extends Employee {
	double hours;
	double wage;

	public WageEmployee() {
	}

	public WageEmployee(String name, int age, boolean married, String company, String position, double baseSalary,
			double hours, double wage) {
		super(name, age, married, company, position, baseSalary);
		if (hours >= 0. && hours < 230.)
			this.hours = hours;
		else
			this.hours = -1.;
		if (wage > 0.)
			this.wage = wage;
		else
			this.wage = -1.;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		if (hours >= 0. && hours < 230.)
			this.hours = hours;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		if (wage > 0.)
			this.wage = wage;
	}

	@Override
	public String toString() {
		return "WageEmployee [company=" + company + ", position=" + position + ", baseSalary=" + baseSalary + ", name="
				+ name + ", age=" + age + ", married=" + married + ", hours=" + hours + ", wage=" + wage + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(hours);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(wage);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof WageEmployee))
			return false;
		WageEmployee other = (WageEmployee) obj;
		if (Double.doubleToLongBits(hours) != Double.doubleToLongBits(other.hours))
			return false;
		if (Double.doubleToLongBits(wage) != Double.doubleToLongBits(other.wage))
			return false;
		return true;
	}

//	public void display() {
//		System.out.println(toString());
//	}

	public double calculateSalary() {
		if (hours == -1. || wage == -1.) {
			System.out.println("Wrong hours or wage");
			return -1.;
		}
		return baseSalary + hours * wage;
	}
}
