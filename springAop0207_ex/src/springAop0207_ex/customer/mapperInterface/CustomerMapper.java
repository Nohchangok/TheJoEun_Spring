package springAop0207_ex.customer.mapperInterface;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import springAop0207_ex.customer.dto.CustomerDto;

public interface CustomerMapper {

	public CustomerDto selectOneCustomer(@Param("customer") CustomerDto customer, @Param("customerId") Integer customerId);
	
	public int updateReviewCnt(@Param("cnt") Integer cnt, @Param("customerId") Integer customerId);
	

	
	//@Insert("insert into customer values(#{customerId},#{userId},#{name},#{birth},#{regDate})")
//	public void insertCustomer(@Param("customerId") Integer customerId, @Param("userId") String userId,
//			@Param("name") String name, @Param("birth") LocalDate birth, @Param("regDate") LocalDateTime regDate);
//
//	@Select("select * from customer limit #{start}, #{end}")
//	public List<CustomerDto> selectList(@Param("start") Integer start, @Param("end") Integer end);
//
//	//@Select("select * from customer where customer_id=#{customerId}")
//	public CustomerDto selectOne(Map<String, Integer> customerMap);
//	
//	@Update("update customer set user_id=#{user_id},name=#{name}, birth=#{birth}, regDate=#{regDate} where customer_id=#{customer_id}")
//	public void updateCustomer(Map<String, Object> customerMap);
//	
//	@Delete("delete from customer where customer_id=#{customerId}")
//	public void deleteCustomer(@Param("customerId")Integer customerId);
//	
}
