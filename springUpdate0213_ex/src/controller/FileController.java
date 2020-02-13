package controller;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;



@Controller
@RequestMapping("/File")
public class FileController {
	
	@GetMapping("/fileUpload")
	public String FileUploadView() {
		return "FileUpload";
	}
	
	@PostMapping("/fileUploadOk")
	public String uploadAction(MultipartFile[] uploadFile){
		
		LocalDate now = LocalDate.now();
		int year = now.getYear();
		int month = now.getMonthValue();
		int day = now.getDayOfMonth();
		
		String Folder="C:\\Users\\oo756\\Documents\\"+year+"\\"+month+"\\"+day;
		
		for (MultipartFile multipartFile : uploadFile) {
			
			//위치값+이름으로 파일 생성 
			//File file = new File(Folder,multipartFile.getOriginalFilename());
			File file = new File(Folder);
			
			if(!file.exists()) {
				file.mkdirs();
				System.out.println("폴더생성");
			}else if(file.exists()){
				System.out.println("폴더 안생성");
			}
			
			try {
				multipartFile.transferTo(file);
				System.out.println("파일 들어갔다.");
						
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("파일이 안들어갔다.");
			}
			
		}
		return "Success";
	}
	
	@GetMapping("/fileUploadAjax")
	public String FileUploadAjaxView() {
		return "FileUploadAjax";
	}
	
	
	@PostMapping(value="/uploadAjax", produces = "application/text; charset=utf8")
	public @ResponseBody String uploadAjax(MultipartFile[] File) {
		String Folder="C:\\Users\\oo756\\Documents\\TheJoEun_Spring\\uploadImages";
		
		
		for (MultipartFile multipartFile : File) {
			
			//(위치값,이름)세팅하여 파일 생성 
			File file = new File(Folder,multipartFile.getOriginalFilename());
			
			//생성된 파일에 저장.
			try {
				multipartFile.transferTo(file);
				System.out.println("파일 들어갔다.");
						
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("파일이 안들어갔다.");
			}
		}
		return "완료";
	}
}
