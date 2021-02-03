package com.idesoft.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.idesoft.entity.Local;
import com.idesoft.entity.Response;
import com.idesoft.services.LocalService;

@Service
public class LocalServiceImpl implements LocalService {

	final static Logger logger = Logger.getLogger(LocalServiceImpl.class);
	
	@Override
	public List<Response> searchLocal(String comuna) {

		
		Gson g = new Gson();

		RestTemplate plantilla = new RestTemplate();
		logger.info("Extrayendo datos");
		String resultado = plantilla.getForObject(
				"https://farmanet.minsal.cl/maps/index.php/ws/getLocalesRegion?id_region=7", String.class);
		Local[] locales = g.fromJson(resultado, Local[].class);
		
		List<Response> listaPorComuna = new ArrayList<>();
		logger.info("recorriendo datos buscando la comuna");
		for (Local local : locales) {

			if (local.getComuna_nombre().equals(comuna)) {
				Response response = new Response();
				response.setLocal_direccion(local.getLocal_direccion());
				response.setLocal_lat(local.getLocal_lat());
				response.setLocal_lng(local.getLocal_lng());
				response.setLocal_nombre(local.getLocal_nombre());
				response.setLocal_telefono(local.getLocal_telefono());
				
				listaPorComuna.add(response);
			}

		}

		return listaPorComuna;

	}

}
