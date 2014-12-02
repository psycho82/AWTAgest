package it.awta.app.awtagest.controller;

import java.util.Date;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

@SuppressWarnings({ "rawtypes", "unchecked" })
@Component("loginAction")
@Scope("request")
public class LoginAction2 extends ActionSupport implements Preparable {
	private static final Logger logger = Logger.getLogger(Utente.class);
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private Utente user;

	public String execute() throws Exception {
		logger.info("execute method called");
		
		if ("admin".equals(user.getUsername()) && "password".equals(user.getPassword())) {
			Map session = ActionContext.getContext().getSession();
			session.put("logined","true");
			session.put("context", new Date());
			return SUCCESS;
		}
		return ERROR;
	}

	public String first() {
		return "first";
	}
	
	public String second() {
		return "second";
	}
	
	public String base() {
		return "base";
	}
	
	public String logout() throws Exception {
		Map session = ActionContext.getContext().getSession();
		session.remove("logined");
		session.remove("context");
		return SUCCESS;
	}

	public Utente getUser() {
		return user;
	}

	public void setUser(Utente user) {
		this.user = user;
	}
/*
	public String getUsername() {
		return this.user.getUsername();
	}
	
	public void setUsername(String username) {
		this.user.setUsername(username);
	}
	
	public String getPassword() {
		return this.user.getPassword();
	}
	
	public void setPassword(String password) {
		this.user.setPassword(password);
	}
*/	
	@Override
	public void prepare() throws Exception {
		user = null;
	}
}