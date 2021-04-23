package com.proyecto.novaip.controllers;


import com.proyecto.novaip.services.UsuarioService;
import com.proyecto.novaip.modelos.UsuarioModel;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	@Autowired
	UsuarioService usuarioService;

	@GetMapping()
	public ArrayList<UsuarioModel> obtenerUsuarios(){
		return this.usuarioService.obtenerUsuarios();
	}

	@GetMapping("/query")
	public ArrayList<UsuarioModel> obtenerUsuarioByEmail(@RequestParam("email") String email){
		return this.usuarioService.obtenerPorEmail(email);
	}	

	@PostMapping()
	public UsuarioModel guardarUsuario(@RequestBody UsuarioModel usuario){
		return this.usuarioService.guardarUsuario(usuario);
	}
  

}