package br.edu.qi.service;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import br.edu.qi.dto.Professor;

@WebService
@SOAPBinding(style = Style.RPC)
public interface IEscolaAdmDao {

	@WebMethod
	public String mostrar(
		String 	nome
	);
	
	@WebMethod
	public ArrayList<Professor> listar();
}
