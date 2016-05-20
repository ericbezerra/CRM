package br.com.eric.crm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.eric.crm.dao.ClienteDao;

@Controller
public class ClienteController {
	private final ClienteDao dao;
	
	@Autowired
	public ClienteController(ClienteDao dao){
		this.dao = dao;
	}
	
	@RequestMapping("listaCliente")
	public String lista(Model model){
		model.addAttribute("clientes", dao.read());
		return "enter?page=cliente";
	}
	
}
