package com.web.actions.inscription;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import com.bo.Utilisateur;
import com.services.UserService;
import com.web.actions.BaseAction;

public class InscriptionAction extends BaseAction{
	
	private Utilisateur user;
	
	@Autowired
	private UserService utilisateur;
	
	
	@Action(value = "/addUser", results = { @Result(name = "success", location = "/public/inscription.jsp") })
	public String addUser()
	{
		utilisateur.addUtilisateur(user);
		return SUCCESS;
	}
	
	
              ////getters && setters///////
	public Utilisateur getUser() {
		return user;
	}

	public void setUser(Utilisateur user) {
		this.user = user;
	}

	public UserService getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(UserService utilisateur) {
		this.utilisateur = utilisateur;
	}
	

}
