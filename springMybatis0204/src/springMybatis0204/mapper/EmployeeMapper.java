package springMybatis0204.mapper;

import java.util.List;

import springMybatis0204.dto.EmployeeDto;

public interface EmployeeMapper {
	
	//직원리스트 가져오는 메소드.
	public List<EmployeeDto> selectList();

}
