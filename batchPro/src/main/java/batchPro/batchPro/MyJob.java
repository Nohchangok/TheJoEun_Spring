package batchPro.batchPro;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class MyJob extends QuartzJobBean{

	//스케줄러가 자동으로 호출해주는 메소드
	@Override
	protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
		//일괄처리할 내용을 여기에 작성
		int i = 0;
		System.out.println("디비에서 데이타 조회 "+(i++));
		System.out.println("통합 처리와 연산 "+(i++));
		System.out.println("통계 데이타 삽입 "+(i++));
	}
}
