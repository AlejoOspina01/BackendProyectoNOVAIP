/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.novaip.controllers;

import com.proyecto.novaip.modelos.ProyectoModel;
import com.proyecto.novaip.modelos.TareaModel;
import com.proyecto.novaip.modelos.UsuarioModel;
import com.proyecto.novaip.services.TareaService;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Alejandro
 */
@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/tarea")
public class TareaController {
	@Autowired
	TareaService tareaService;

	@GetMapping()
	public ArrayList<TareaModel> obtenerTareas(){
		return tareaService.obtenerTareas();
	}
        
        @GetMapping(path = "/{id}")
        public Optional<TareaModel> obtenerProyectoPorId(@PathVariable("id") int id){
            return this.tareaService.obtenerPorId(id);
        }
        
	@GetMapping("/query")
	public ArrayList<TareaModel> obtenerTareasPorIdproyecto(@RequestParam("idproyecto") int idproyecto){
		return this.tareaService.obtenerPorIdproyecto(idproyecto);
	}	        
        

	@PostMapping()
	public TareaModel guardarTarea(@RequestBody TareaModel tarea){
		return this.tareaService.guardarTarea(tarea);
	}
  

}