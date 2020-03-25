package com.boolsadeideas.springboot.backend.apirest.auth;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.stereotype.Component;

import com.boolsadeideas.springboot.backend.apirest.models.entity.Usuario;
import com.boolsadeideas.springboot.backend.apirest.models.services.IUsuarioService;

@Component
public class InfoAdicionalToken implements TokenEnhancer {
	
	//instancio una clase importada
	@Autowired
	private IUsuarioService usuarioService;

	//informacion que va a ir en el token
	@Override
	public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
		
		Usuario usuario = usuarioService.findByUsername(authentication.getName());
		
		//crea elementos clave valor
		Map<String, Object> info = new HashMap<>();
		info.put("info adicional",usuario.getId() + " : "+usuario.getUsername());
		
		info.put("nombre",usuario.getNombre());
		info.put("apellido",usuario.getApellido());
		info.put("email",usuario.getEmail());
		
		//crea el token armado
		((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(info);
		return accessToken;
	}

}
