package springMybatis0204.mapper;

import java.util.List;

import springMybatis0204.dto.EmployeeDto;

public interface EmployeeMapper {
	
	//��������Ʈ �������� �޼ҵ�.
	public List<EmployeeDto> selectList();

}
