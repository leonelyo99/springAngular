package com.boolsadeideas.springboot.backend.apirest.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.boolsadeideas.springboot.backend.apirest.models.entity.Producto;

public interface IProductoDao extends CrudRepository<Producto, Long>{
	
	@Query("select p from Producto p where p.nombre like %?1%")
	public List<Producto> findByNombre(String term);
	
	//de la pagina de spring son consultas personalizadas (contiene la palabra)
	public List<Producto> findByNombreContainingIgnoreCase(String term);
	
	//(que comienze con esa palabra)
	public List<Producto> findByNombreStartingWithIgnoreCase(String term);
}
