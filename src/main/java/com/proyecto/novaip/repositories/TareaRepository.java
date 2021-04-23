/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.novaip.repositories;

import com.proyecto.novaip.modelos.TareaModel;
import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TareaRepository extends CrudRepository<TareaModel, Integer>{
    public abstract ArrayList<TareaModel> findByIdproyecto(Integer idproyecto);

}
