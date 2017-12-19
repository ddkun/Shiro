package sx.ddk.dao;

import java.util.Set;

import sx.ddk.entity.User;

public interface UserDao {

	Set<String> getRole(String username);

	User getUserByUserName(String username);

}
