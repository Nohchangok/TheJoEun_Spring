package springMybatis0204.dto;

import java.time.LocalDateTime;

public class EmployeeDto {
	
	private int empId;
	private String name;
	private String gender;
	private String position;
	private int salary;
	private DepartmentDto department;
	private LocalDateTime hireDate;
	private LocalDateTime retireDate;
	
	public EmployeeDto() {
		super();
	}

	public EmployeeDto(int empId, String name, String gender, String position, int salary, DepartmentDto department,
			LocalDateTime hireDate, LocalDateTime retireDate) {
		super();
		this.empId = empId;
		this.name = name;
		this.gender = gender;
		this.position = position;
		this.salary = salary;
		this.department = department;
		this.hireDate = hireDate;
		this.retireDate = retireDate;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public DepartmentDto getDepartment() {
		return department;
	}

	public void setDepartment(DepartmentDto department) {
		this.department = department;
	}

	public LocalDateTime getHireDate() {
		return hireDate;
	}

	public void setHireDate(LocalDateTime hireDate) {
		this.hireDate = hireDate;
	}

	public LocalDateTime getRetireDate() {
		return retireDate;
	}

	public void setRetireDate(LocalDateTime retireDate) {
		this.retireDate = retireDate;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", gender=" + gender + ", position=" + position
				+ ", salary=" + salary + ", department=" + department + ", hireDate=" + hireDate + ", retireDate="
				+ retireDate + "]";
	}
	
}
