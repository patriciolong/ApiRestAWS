/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.apiRestCompleto.repository;

import com.example.apiRestCompleto.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author patri
 */
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
    
}
