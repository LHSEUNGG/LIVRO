package com.kh.livro.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.livro.biz.SearchBiz;
import com.kh.livro.dto.BroadcastDto;
import com.kh.livro.dto.MemberDto;

@Controller
public class SearchController {

	private Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Autowired
	private SearchBiz searchbiz;
	
	@RequestMapping("/search.do")
	public String SearchList(Model model, String keyword) {
		List<BroadcastDto> broadlist = searchbiz.BroadcastList(keyword);
		List<MemberDto> memberlist = searchbiz.MemberList(keyword);
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("broadlist", broadlist);
		map.put("memberlist", memberlist);
		
		
		model.addAttribute("map", map);
		
		
		return "search/search_list";
	}
	
	@RequestMapping("/artist.do")
	public String artist(Model model,String member_id) {
		model.addAttribute("musicdto", searchbiz.selectList(member_id));
		model.addAttribute("musicnickdto", searchbiz.selectOne(member_id));
		return "artist/artist";
	}
	
}
