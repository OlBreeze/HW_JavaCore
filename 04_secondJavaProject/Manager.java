package telran.dto;

public class Manager extends Employee {
	int grade;

	public Manager() {
	}

	public Manager(String name, int age, boolean married, String company, String position, double baseSalary,
			int grade) {
		super(name, age, married, company, position, baseSalary);
		setGrade(grade);
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		if (grade > 0 && grade < 7)
			this.grade = grade;
	}

	@Override
	public String toString() {
		return "Manager [company=" + company + ", position=" + position + ", baseSalary=" + baseSalary + ", name="
				+ name + ", age=" + age + ", married=" + married + ", grade=" + grade + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + grade;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Manager))
			return false;
		Manager other = (Manager) obj;
		if (grade != other.grade)
			return false;
		return true;
	}	
	
//	public void display() {
//		System.out.println(toString());
//	}
	
	public double calculateSalary() {
		return baseSalary * grade;
	}

}
