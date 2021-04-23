package com.proyecto.novaip.repositories;

import com.proyecto.novaip.modelos.UsuarioModel;
import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Integer>{
    public abstract ArrayList<UsuarioModel> findByEmail(String email);

}