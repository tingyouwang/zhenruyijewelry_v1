package tw.zhenruyijewelry.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import tw.zhenruyijewelry.model.Users;
import tw.zhenruyijewelry.model.UsersService;

@RestController
public class UsersController {
	@Autowired
	private UsersService us;
	
	@GetMapping(value="/users/findusers.controller")
	public List<Users> doFindUsers(){
		return us.findUsers("er");
		
	}
	
	@GetMapping(value="/users/findusers2.controller")
	public List<Users> doFindUsers2(){
		return us.findByNameLike("%er%");
		
	}
} 
