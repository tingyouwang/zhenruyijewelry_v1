package tw.zhenruyijewelry.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class test01 {
	@RequestMapping(path="/hello.controller",method = RequestMethod.GET)
	@ResponseBody
	public String hello() {
		return "hi";
	}
}
