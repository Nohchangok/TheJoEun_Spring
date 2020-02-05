package springMybatis0204.dto;

//lombok
//@data 
public class DepartmentDto {
	
	private int id;
	private String deptName;
	private String deptLoc;
	
	public DepartmentDto() {
		super();
	}

	public DepartmentDto(int id, String deptName, String deptLoc) {
		super();
		this.id = id;
		this.deptName = deptName;
		this.deptLoc = deptLoc;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptLoc() {
		return deptLoc;
	}

	public void setDeptLoc(String deptLoc) {
		this.deptLoc = deptLoc;
	}

	@Override
	public String toString() {
		return "DepartmentDto [id=" + id + ", deptName=" + deptName + ", deptLoc=" + deptLoc + "]";
	}

}
