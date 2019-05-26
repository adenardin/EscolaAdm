package br.edu.qi.service;

import javax.xml.ws.Endpoint;
import br.edu.qi.service.EscolaAdmWs;

public class EscolaAdmPublisher {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8080/escolaAdmWS?wsdl", new EscolaAdmWs());
	}
}
