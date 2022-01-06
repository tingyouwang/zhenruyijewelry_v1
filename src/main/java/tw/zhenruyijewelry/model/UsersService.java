package tw.zhenruyijewelry.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UsersService {
	@Autowired
	private UsersRepository urepo;
	
	public List<Users> findUsers(String name){
		return urepo.findUsers(name);
	}
	public List<Users> findByNameLike(String name){
		return urepo.findByNameLike(name);
	}
	
}
