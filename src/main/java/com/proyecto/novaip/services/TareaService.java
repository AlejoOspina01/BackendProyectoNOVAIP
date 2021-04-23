/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.novaip.services;

import java.util.ArrayList;

import com.proyecto.novaip.repositories.TareaRepository;
import com.proyecto.novaip.modelos.TareaModel;
import java.util.Optional;

import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class TareaService {
	@Autowired
	TareaRepository tareaRepository;
  
	public ArrayList<TareaModel> obtenerTareas(){
		return (ArrayList<TareaModel>) tareaRepository.findAll();
	}

	public TareaModel guardarTarea(TareaModel tarea){
		return tareaRepository.save(tarea);
	}
        
        public Optional<TareaModel> obtenerPorId(Integer id){
            return tareaRepository.findById(id);
        }
        
        public ArrayList<TareaModel> obtenerPorIdproyecto(Integer idproyecto){
            return tareaRepository.findByIdproyecto(idproyecto);
        }
        
}