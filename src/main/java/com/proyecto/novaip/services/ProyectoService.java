/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.novaip.services;

import com.proyecto.novaip.modelos.ProyectoModel;
import com.proyecto.novaip.repositories.ProyectoRepository;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Alejandro
 */
@Service
public class ProyectoService {
	@Autowired
	ProyectoRepository proyectoRepository;
  
	public ArrayList<ProyectoModel> obtenerProyectos(){
		return (ArrayList<ProyectoModel>) proyectoRepository.findAll();
	}

	public ProyectoModel guardarProyecto(ProyectoModel usuario){
		return proyectoRepository.save(usuario);
	}
        
        public Optional<ProyectoModel> obtenerPorId(Integer id){
            return proyectoRepository.findById(id);
        }
        
        public ArrayList<ProyectoModel> obtenerPorNombre(String nombre){
            return proyectoRepository.findByNombre(nombre);
        }
        
}
