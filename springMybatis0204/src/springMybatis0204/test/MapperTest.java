package springMybatis0204.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import springMybatis0204.dto.DepartmentDto;
import springMybatis0204.dto.EmployeeDto;
import springMybatis0204.mapper.DepartmentMapper;
import springMybatis0204.mapper.EmployeeMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/springContext.xml")
public class MapperTest {
	
	@Autowired
	EmployeeMapper employeeMapper;
	
	@Autowired
	DepartmentMapper depMapper;
	
	@Test @Ignore
	public void test() {
		assertNotNull(employeeMapper);
		List<EmployeeDto> list = employeeMapper.selectList();
		for (EmployeeDto employeeDto : list) {
			System.out.println(employeeDto);
		}
	}
	
	@Test
	public void test1() {
		DepartmentDto department = new DepartmentDto();
		department.setDeptName("Ã»¼Ò2ÆÀ");
		department.setDeptLoc("µµºÀ");
		int rs = depMapper.insertDepartment(department);
		System.out.println(rs+"·Î¿ì »ðÀÔ ¼º°ø!");
	}

}
