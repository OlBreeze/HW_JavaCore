package telran.dto;

public class SaleManager extends Employee {
	double totalSales;
	double bonus;

	public SaleManager() {
	}

	public SaleManager(String name, int age, boolean married, String company, String position, double baseSalary,
			double totalSales, double bonus) {
		super(name, age, married, company, position, baseSalary);
		if (totalSales >= 0.)
			this.totalSales = totalSales;
		else
			this.totalSales = -1.;
		if (bonus >= 0. && bonus < 100.)
			this.bonus = bonus;
		else
			this.bonus = -1.;
	}

	public double getTotalSales() {
		return totalSales;
	}

	public void setTotalSales(double totalSales) {
		if (totalSales >= 0.)
			this.totalSales = totalSales;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		if (bonus >= 0. && bonus < 100.)
			this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "SaleManager [company=" + company + ", position=" + position + ", baseSalary=" + baseSalary + ", name="
				+ name + ", age=" + age + ", married=" + married + ", totalSales=" + totalSales + ", bonus=" + bonus
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(bonus);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(totalSales);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof SaleManager))
			return false;
		SaleManager other = (SaleManager) obj;
		if (Double.doubleToLongBits(bonus) != Double.doubleToLongBits(other.bonus))
			return false;
		if (Double.doubleToLongBits(totalSales) != Double.doubleToLongBits(other.totalSales))
			return false;
		return true;
	}

//	public void display() {
//		System.out.println(toString());
//	}

	public double calculateSalary() {
		if (bonus == -1. || totalSales == -1) {
			System.out.println("Wrong bonus or totalSales");
			return -1.;
		}
		return baseSalary + totalSales * bonus / 100;
	}

}
