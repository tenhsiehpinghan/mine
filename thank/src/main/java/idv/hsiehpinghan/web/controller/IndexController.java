package idv.hsiehpinghan.web.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	@RequestMapping(value = "/index.htm")
	public String indexPage(@RequestHeader Map<String, String> map) {
		System.out.println(map);
		return "index";
	}
	// @RequestMapping(value = "/index.htm")
	// public ModelAndView indexPage() {
	// ModelAndView mv = new ModelAndView();
	// mv.addObject("message", "Hello World!");
	// mv.setViewName("hello");
	// return mv;
	// }
}
