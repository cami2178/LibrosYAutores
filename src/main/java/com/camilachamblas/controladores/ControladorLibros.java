package com.camilachamblas.controladores;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControladorLibros {
	
	private static HashMap<String, String> listaLibros = new HashMap<String, String>();

	public ControladorLibros() {
		listaLibros.put("Odisea", "Homero");	
		listaLibros.put("Don Quijote de la Mancha", "Miguel de Cervantes");
		listaLibros.put("El Código Da Vinci", "Dan Brown");		
		listaLibros.put("Alicia en el país de las maravillas", "Lewis Carroll");
		listaLibros.put("El Hobbit", "J.R.R. Tolkien");	
		listaLibros.put("El alquimista", "Paulo Coelho");	
	}
	
	@GetMapping("/libros")
	public String obtenerTodosLosLibros(Model modelo) {
		 modelo.addAttribute("listaLibros", listaLibros);
		 System.out.println("Lista de libros: " + listaLibros);

		return "libro.jsp";
	}
	
	@GetMapping("/libros/{nombre}")
	public String obtenerInformacionDelLibro(@PathVariable String nombre, Model modelo) {
		
	    if (listaLibros.containsKey(nombre)) {
	        ArrayList<String> detallesLibros = new ArrayList<>();
	        detallesLibros.add("Nombre: " + nombre);
	        detallesLibros.add("Autor: " + listaLibros.get(nombre));
	        
	        modelo.addAttribute("detallesLibro", detallesLibros);
	        return "detalleLibro.jsp";
	    } else {
	        modelo.addAttribute("mensajeError", "El libro no se encuentra en nuestra lista.");
	        return "detalleLibro.jsp";
	    }
	}
	
	@GetMapping("/libros/formulario")
	public String formularioLibro(Model modelo) {
		return "formularioLibros.jsp";
	}
	
	@PostMapping("/procesa/libro")
	public String procesaLibro(@RequestParam String nombreLibro, @RequestParam String nombreAutor) {
		listaLibros.put(nombreLibro, nombreAutor);
		 System.out.println("Libro agregado: " + nombreLibro + " por " + nombreAutor);
		return "redirect:/libros";
	}
	
}
