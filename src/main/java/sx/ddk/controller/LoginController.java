package sx.ddk.controller;

import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import sx.ddk.entity.User;

@Controller
public class LoginController {
	
	@RequestMapping("/tologin")
	public String tologin(){
		return "login";
	}

	@RequestMapping("/login")
	public String login(User user,Model model,HttpSession sessiojn){
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken(user.getUsername(), user.getPassword());
		try{
			subject.login(token);
			sessiojn.setAttribute("user_info",user);
			return "main";
		}catch(Exception e){
			/*e.printStackTrace();*/
			model.addAttribute("error_info","密码或用户名错误");
			return "login";
		}
	}

	@RequestMapping("/admin")
	public String goAdmin(Model model){
		model.addAttribute("admin_info","管理员页面。角色验证通过");
		return "admin";
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session){
		session.setAttribute("user_info",null);
		Subject subject = SecurityUtils.getSubject();
		if(subject.isAuthenticated()){
			subject.logout();
		}
		return "login";
	}

}
