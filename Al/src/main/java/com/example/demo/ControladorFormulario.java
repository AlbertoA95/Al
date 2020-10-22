package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

import java.util.Date;

import org.springframework.stereotype.Controller;

@Controller
public class ControladorFormulario {
	
	@RequestMapping(value ="/formulario", method=RequestMethod.GET)
	public String getFormulario() {
		return "formulario";	//Cargamos el formulario
	}
	
	@RequestMapping(value ="/formulario", method=RequestMethod.POST)
	public String hola_post(Model modelo,
			@RequestParam String nombre,
			@RequestParam String apellidoPri,
			@RequestParam String apellidoSeg,
			@RequestParam String email,
			@RequestParam int nacidoDia,
			@RequestParam int nacidoMes,
			@RequestParam int nacidoAnio,
			@RequestParam String password,
			@RequestParam String hm, 
			@RequestParam String direccion,
			@RequestParam String estudios,
			@RequestParam String temas)

									{
		
		modelo.addAttribute("nombre_formulario", nombre);
		modelo.addAttribute("apellidoPri_formulario", apellidoPri);
		modelo.addAttribute("apellidoSeg_formulario", apellidoSeg);
		modelo.addAttribute("email_formulario", email);
		modelo.addAttribute("nacido_formulario_Dia", nacidoDia);
		modelo.addAttribute("nacido_formulario_Mes", nacidoMes);
		modelo.addAttribute("nacido_formulario_Anio", nacidoAnio);
		modelo.addAttribute("password_formulario", password);
		modelo.addAttribute("hm_formulario", hm);
		modelo.addAttribute("direccion_formulario", direccion);
		modelo.addAttribute("estudios_formulario", estudios);
		modelo.addAttribute("temas_formulario", temas);
		
		return "datosFormulario";
	}
	
	
}