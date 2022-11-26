package com.uci.Proyecto_Final.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uci.Proyecto_Final.models.Usuario;

public interface IUsuario_Repository extends JpaRepository<Usuario, String> {

}
