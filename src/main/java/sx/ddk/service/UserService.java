package sx.ddk.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sx.ddk.dao.UserDao;
import sx.ddk.entity.User;

@Service
public class UserService {

	@Autowired
	
	private UserDao userDao;
	
	public Set<String> getRole(String username) {
		// TODO Auto-generated method stub
		return userDao.getRole(username);
	}

	public User getUserByUserName(String username) {
		// TODO Auto-generated method stub
		return userDao.getUserByUserName(username);
	}

}
