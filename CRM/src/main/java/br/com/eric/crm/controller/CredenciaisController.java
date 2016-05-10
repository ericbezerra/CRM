package br.com.eric.crm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CredenciaisController {

	@RequestMapping("doLogin")
	public String login(){
		
		return "login/loginScreen";
	}
	
	@RequestMapping("enter")
	public String enter(){
		
		return "dashBoard/dashBoard";
	}
}
