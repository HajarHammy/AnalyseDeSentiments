package com.web.actions.login;

import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.bo.Utilisateur;
import com.services.UserService;
import com.web.actions.BaseAction;


@Results({ @Result(name = "login", location = "/public/Login.jsp") })
public class LoginAction extends BaseAction{
	
	private String email;
	private String password;
	private Map<String, Object> session;
	
	@Autowired
	private UserService userService;
	
	@Action(value = "showLoginPage", results = { @Result(name = "success", location = "/public/Login.jsp") })
	public String showLoginPage() {

		return SUCCESS;
	}
	
	@Action(value = "loginAction", results = { @Result(name = "successAdmin", location = "/public/Login.jsp"),
			@Result(name = "successUser", location = "/public/Login.jsp") })
	public String loginAction()
	{
		String role=userService.GetUser(email, password);
		System.out.println(role);
		
		if(role == "Internaute")
		{
			addActionMessage("User correctement ajoutée");
			return "successUser";
		}
			
		
		
		else if(role == "Administrateur")
		{
			addActionMessage("Admin correctement ajoutée");
			return "successAdmin";
		}
			
		
		return LOGIN;
	}
	
	
}
