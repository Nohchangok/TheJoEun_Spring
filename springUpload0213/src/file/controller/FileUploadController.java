package file.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/file")
public class FileUploadController {

	/*
	 * 파일업로드 클라이언트가 파일을 서버로 보내는것(저장하는것) 일반적으로, zip, sh, exe 파일은 잘 안받음.
	 * 
	 * 이미지-jsp, png, jpeg, gif bmp
	 */

	@GetMapping("/fileUploadForm")
	public String fileUploadForm() {
		return "fileUploadForm";
	}

	@PostMapping("upload")
	public void uploadAction(MultipartFile[] uploadFile) {
		// 파일을 저장할 위치
		String uploadFolder = "C:\\Users\\oo756\\Documents\\TheJoEun_Spring\\uploadImages";

		// 전달 받은 파일을 처리
		for (MultipartFile mFile : uploadFile) {
			System.out.println("파일 원본 이름:" + mFile.getOriginalFilename());
			System.out.println("파일 사이즈:" + mFile.getSize());
			System.out.println("파일 이름:" + mFile.getName());

			// 파일 저장하기 위해 file 자료형 사용
			File file = new File(uploadFolder, mFile.getOriginalFilename());

			// 실제로 저장.
			try {
				mFile.transferTo(file);
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	@GetMapping("/ajaxForm")
	public String fileUploadAjaxForm() {
		return "FileUploadAjax";
	}

	@PostMapping(value = "/uploadAjax", produces = "application/text; charset=utf8")
	public @ResponseBody String uploadAjax(MultipartFile[] uploadFile) {
		
		String uploadFolder = "C:\\Users\\oo756\\Documents\\TheJoEun_Spring\\uploadImages";

		// 전달 받은 파일을 처리
		for (MultipartFile mFile : uploadFile) {
			System.out.println("파일 원본 이름:" + mFile.getOriginalFilename());
			System.out.println("파일 사이즈:" + mFile.getSize());
			System.out.println("파일 이름:" + mFile.getName());

			// 파일 저장하기 위해 file 자료형 사용
			File file = new File(uploadFolder, mFile.getOriginalFilename());

			// 실제로 저장.
			try {
				mFile.transferTo(file);
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return "업로드 컴플리트";

	}
}
