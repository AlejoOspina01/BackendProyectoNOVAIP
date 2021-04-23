package com.proyecto.novaip.controllers;

import com.proyecto.novaip.modelos.ProyectoModel;
import com.proyecto.novaip.services.ProyectoService;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Alejandro
 */
@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/proyecto")
public class ProyectoController {
	@Autowired
	ProyectoService proyectoService;

	@GetMapping()
	public ArrayList<ProyectoModel> obtenerProyectos(){
		return proyectoService.obtenerProyectos();
	}
        
        @GetMapping(path = "/{id}")
        public Optional<ProyectoModel> obtenerProyectoPorId(@PathVariable("id") int id){
            return this.proyectoService.obtenerPorId(id);
        }

	@PostMapping()
	public ProyectoModel guardarProyecto(@RequestBody ProyectoModel proyecto){
		return this.proyectoService.guardarProyecto(proyecto);
	}
  

}
