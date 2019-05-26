package br.edu.qi.service;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class EscolaAdmTest {

	public static void main(String[] args) {
		try {

			URL url = new URL("http://localhost:8080/escolaAdmWS?wsdl");
			QName qname = new QName("http://service.qi.edu.br/", "EscolaAdmWsService");
			Service ws = Service.create(url, qname);
			IEscolaAdmDao EscolaAdmWs = ws.getPort(IEscolaAdmDao.class);
			
			System.out.println(EscolaAdmWs.mostrar("Anderson"));
			
			System.out.println(EscolaAdmWs.listar());
						
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
