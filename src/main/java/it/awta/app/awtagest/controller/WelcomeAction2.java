package it.awta.app.awtagest.controller;

import it.awta.app.awtagest.entity.User;
import it.awta.app.awtagest.interceptors.UnknownUser;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
 
public class WelcomeAction2 extends ActionSupport implements ModelDriven<User>, UnknownUser {
 
    private static final long serialVersionUID = 8111120314704779336L;
    private User user;
    
    @Override
    public String execute(){
        return SUCCESS;
    }
 
    public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}//master

	@Override
    public User getModel() {
        return this.user;
    }
}