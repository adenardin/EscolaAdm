package br.edu.qi.service;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.edu.qi.dto.Professor;

@Path("/professor")
@WebService(endpointInterface = "br.edu.qi.service.IEscolaAdmDao")
public class EscolaAdmWs implements IEscolaAdmDao {

	private ArrayList<Professor> professores = new ArrayList<Professor>();
	private Professor professor;
	
	public EscolaAdmWs() {
	};

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String mostrar(String nome) {
		return nome;
	}

	@GET
	@Produces(MediaType.TEXT_XML)
	public ArrayList<Professor> listar() {
		
		this.professor.setId(1);
		this.professor.setNome("Anderson");
		this.professores.add(this.professor);
		
		this.professor.setId(2);
		this.professor.setNome("Alexandra");
		this.professores.add(this.professor);		
		
		return this.professores;
	}

}
