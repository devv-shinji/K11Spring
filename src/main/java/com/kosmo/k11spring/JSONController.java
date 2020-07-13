package com.kosmo.k11spring;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JSONController {
	
	@RequestMapping("/jsonUse/jsonView.do")
	@ResponseBody
	public Map<String, Object> responseBodyView() {
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("String", "나는 문자열이다");
		map.put("Number", 1004);
		map.put("Message", "JSON은 Jackson의존설정이 필요하다");
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Collection");
		list.add("편합니다");
		list.add("배열보다 좋습니다");
		
		map.put("Collection", list);
		
		return map;
	}
}
