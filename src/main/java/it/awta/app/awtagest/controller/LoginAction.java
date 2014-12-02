package it.awta.app.awtagest.controller;

import it.awta.app.awtagest.entity.User;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class LoginAction extends ActionSupport implements SessionAware, ModelDriven<User>{

	private static final long serialVersionUID = -3369875299120377549L;

	@Override
	public String execute(){
		System.out.println("inside execute");
		if("admin".equals(user.getUser()) && "admin".equals(user.getPassword())){
			user.setUserName("Administrator");
			sessionAttributes.put("USER", user);
			return SUCCESS;
		}
		addActionMessage("Nome utente o password errati");
		return INPUT;
	}

	public String logout(){
		sessionAttributes.clear();
		return SUCCESS;
	}

	private User user = new User();
	private Map<String, Object> sessionAttributes = null;

	@Override
	public void setSession(Map<String, Object> sessionAttributes) {
		this.sessionAttributes = sessionAttributes;
	}

	@Override
	public User getModel() {
		return user;
	}

}