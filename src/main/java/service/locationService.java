package service;


import entity.Film;
import entity.location;
import entity.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.DataUtils;

import java.util.Date;

import static utils.DataUtils.adicionarDias;


public class locationService {
	
	public location rentMovie(User user, Film film) {
		location location = new location();
		location.setFilm(film);
		location.setUser(user);
		location.setDataLocacao(new Date());
		location.setValor(film.getValueLocation());

		//Entrega no dia seguinte
		Date deadLine = new Date();
		deadLine = adicionarDias(deadLine, 1);
		location.setDataRetorno(deadLine);
		return location;
	}
}