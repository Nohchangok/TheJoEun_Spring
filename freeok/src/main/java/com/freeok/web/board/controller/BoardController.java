package com.freeok.web.board.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.freeok.web.board.model.BoardVO;
import com.freeok.web.board.service.BoardService;

@Controller
@RequestMapping(value="/board")
public class BoardController {

	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);

	@Inject
	private BoardService boardService;
	
	@RequestMapping(value="/getBoardList", method = RequestMethod.GET)
	public String getBoardList(Model model) throws Exception{
		
		model.addAttribute("boardList",boardService.getBoardList());
		logger.info("BoardList화면으로 고고고고");
		return "board/index"; 
	}
	
	@RequestMapping(value="/boardForm", method = RequestMethod.GET)
	public String boardForm() {
		
		logger.warn("BoardForm화면으로 고고고고고");
		return "board/boardForm";
	}
	
	//글을 쓰고 저장할 때 호출 부
	//redirectAtrributes를 사용하는 이유는 뒤로가기 버튼에 대한 대응책이다.
	//글쓰기 -> 저장단계(서버) -> 리스트 화면
	//뒤로가기 클릭시 저장하기 단계로 가게되어 게시물 도배 여지를 남겨둘 수 있다.
	//redirectAtrrib utes를 사용하여 저장단계를 지나 글쓰기 폼으로 돌아가게 한다.
	@RequestMapping(value="/saveBoard", method = RequestMethod.POST)
	public String saveBoard(@ModelAttribute("BoardVO")BoardVO boardVO, RedirectAttributes rttr) throws Exception {
		return "redirect:/board/getBoardList";
	}
	
	@RequestMapping(value="/getBoardContent", method = RequestMethod.GET)
	public String getBoardContent(Model model, @RequestParam("bid") int bid) throws Exception{
		model.addAttribute("boardContent", boardService.getBoardContent(bid));
		return "board/boardContent";
	}

}
