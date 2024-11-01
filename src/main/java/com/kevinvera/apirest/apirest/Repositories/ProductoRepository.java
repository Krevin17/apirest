package com.kevinvera.apirest.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kevinvera.apirest.apirest.Entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long>{

}
