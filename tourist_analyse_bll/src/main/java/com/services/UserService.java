package com.services;

import com.bo.Utilisateur;


public interface UserService 
{
		
	public void addUtilisateur(Utilisateur user);
	
	public String GetUser(String email,String password);


}