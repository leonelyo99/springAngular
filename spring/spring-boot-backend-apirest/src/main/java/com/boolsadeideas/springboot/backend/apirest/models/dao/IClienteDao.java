package com.boolsadeideas.springboot.backend.apirest.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.boolsadeideas.springboot.backend.apirest.models.entity.Cliente;
import com.boolsadeideas.springboot.backend.apirest.models.entity.Region;

//JpaRepository tiene todos los metodos del crud mas la paginacion
public interface IClienteDao extends JpaRepository<Cliente,Long > {
	
	@Query("from Region")
	public List<Region> findAllRegiones();
}
