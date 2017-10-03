package com.geometria.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.geometria.business.Cilindro;
import com.geometria.business.Cono;
import com.geometria.business.Cubo;
import com.geometria.business.Esfera;
import com.geometria.business.Figura;

/**
 * Servlet implementation class ServletCalcular
 */
@WebServlet("/ServletCalcular")
public class ServletCalcular extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		
		String figura = request.getParameter("figura");
		String valor; 
		float volumen=0, area=0;
		String imagen="";
	 
		valor= request.getParameter("arista");
		float arista=(valor!="")?Float.parseFloat(valor):0;
 
		valor = request.getParameter("radio");
		float radio=(valor!="")?Float.parseFloat(valor):0;
		
		valor = request.getParameter("generatriz");
		float generatriz=(valor!="")?Float.parseFloat(valor):0;

		valor = request.getParameter("altura");
		float altura=(valor!="")?Float.parseFloat(valor):0;
		
		if (figura!=null) {
			
			 
			
			if (figura.equals("cubo")) {
				
				
				Cubo cubo = new Cubo();
				
				cubo.setArista(arista);
				area = 	cubo.calculaArea();
				volumen= 	cubo.calculaVolumen();
				imagen= "/Geometria/img/figCubo.png";
				
				
				
			} else if (figura.equals("cilindro")) {
				
				Cilindro cilindro = new Cilindro();
				
				cilindro.setAltura(altura);
				cilindro.setRadio(radio);
				
				area = cilindro.calculaArea();
				volumen= cilindro.calculaVolumen();
				imagen= "/Geometria/img/figCilindro.png";
				
				
				
			}else if (figura =="esfera") {
				Esfera esfera = new Esfera();
				
				esfera.setAltura(altura);
				esfera.setRadio(radio);
				
				area =	esfera.calculaArea();
				volumen= esfera.calculaVolumen();
				imagen= "/Geometria/img/figEsfera.png";
				
				
			}else{ //cono
				
				Cono cono = new Cono();
				
				cono.setGeneratriz(generatriz);
				cono.setRadio(radio);
				cono.setAltura(altura);
				
				area =	cono.calculaArea();
			volumen=	cono.calculaVolumen();
			imagen= "/Geometria/img/figCono.png";

			}
			
			
		} else {
			System.out.println("valor nulo en figura");

		}
		
		
		DecimalFormat df = new DecimalFormat("#.##");
		
		response.setContentType("Text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Resultado</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>"+figura+"</p>");
		out.println("<p><img src='"+imagen+"'></p>");
				 
		out.println("<p>Area"+df.format(area)+"</p>");
		out.println("<p>Volumen"+df.format(volumen)+"</p>");
		out.println("<p><button onclick='window.location.href= ./index.html'style='height:30px;width:80px'>Menu</button>  </p>");
		
		out.println("</body>");
		out.println("</html>");
	
	}

}
