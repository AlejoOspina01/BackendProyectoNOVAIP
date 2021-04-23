package com.proyecto.novaip.services;

import java.util.ArrayList;

import com.proyecto.novaip.repositories.UsuarioRepository;
import com.proyecto.novaip.modelos.UsuarioModel;
import java.util.Optional;

import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UsuarioService {
	@Autowired
	UsuarioRepository usuarioRepository;
  
	public ArrayList<UsuarioModel> obtenerUsuarios(){
		return (ArrayList<UsuarioModel>) usuarioRepository.findAll();
	}

	public UsuarioModel guardarUsuario(UsuarioModel usuario){
		return usuarioRepository.save(usuario);
	}
        
        public Optional<UsuarioModel> obtenerPorId(Integer id){
            return usuarioRepository.findById(id);
        }
        
        public ArrayList<UsuarioModel> obtenerPorEmail(String email){
            return usuarioRepository.findByEmail(email);
        }
        
}