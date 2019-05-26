package br.edu.qi.dao;

import java.util.ArrayList;

import br.edu.qi.dto.Professor;

public class EscolaAdmDao {

	private static EscolaAdmDao instance = null;

	private ArrayList<Professor> carros = new ArrayList<Professor>();

	private EscolaAdmDao() {}

	public ArrayList<Professor> getCarros() {
		
		return this.carros;
		
	}

	public boolean gravar(Professor obj) throws Exception {

		return carros.add(obj);

	}

	public static EscolaAdmDao getInstante() {

		if (instance == null) {
			instance = new EscolaAdmDao();
		}
		return instance;
	}
}
