package com.codingdojo.cynthia.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class RepasoControlador {
	//GET POST PUT DELETE
	
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	// localhost:8080/numero/10
	//n = 10
	@GetMapping("/numero/{num}")
	public String numero(@PathVariable("num") int n,
						 Model model) {
		model.addAttribute("nombre", "Elena de Troya"); //JSP -> nombre = "Elena de Troya"
		model.addAttribute("numero", n); //JSP -> numero = 10
		
		String frutas[] = {"fresas", "platano", "mango", "papaya"};
		model.addAttribute("frutas", frutas);
		
		return "numero.jsp";
	}
	
	
	
}
