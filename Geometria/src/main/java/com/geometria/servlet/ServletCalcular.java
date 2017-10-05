package com.geometria.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.geometria.business.ServicesGeometria;
import com.geometria.business.ServicesGeometria.Geo;


/**
 * Servlet implementation class ServletCalcular
 */
@WebServlet("/ServletCalcular")
public class ServletCalcular extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	@EJB
	private ServicesGeometria services;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		
		String figura = request.getParameter("figura");
		String valor; 
//		float volumen=0, area=0;
//		String imagen="";
		Geo data = null; 
		
		
		valor= request.getParameter("arista");
		float arista=(valor!=null)?Float.parseFloat(valor):0;
 
		valor = request.getParameter("radio");
		float radio=(valor!=null)?Float.parseFloat(valor):0;
		
		valor = request.getParameter("generatriz");
		float generatriz=(valor!=null)?Float.parseFloat(valor):0;

		valor = request.getParameter("altura");
		float altura=(valor!=null)?Float.parseFloat(valor):0;
		
		if (figura!=null) {

			if (figura.equals("cubo")) {
				
				data = services.calcularCubo(arista, "/Geometria/img/figCubo.png");
			 	
			} else if (figura.equals("cilindro")) {
			
				data = services.calcularCilindro(altura, radio,"/Geometria/img/figCilindro.png");
				
			}else if (figura.equals("esfera")) {
				
				data = services.calcularEsfera(radio,"/Geometria/img/figEsfera.png");
				
				
			}else if (figura.equals("cono")){ 
				
				 data = services.CalcularCono(altura, radio, generatriz, "/Geometria/img/figCono.png");
			}			
		}else {
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
		out.println("<p><h1>"+figura+"</h1></p>");
		out.println("<p><img src='"+data.imagen+"'></p>");
				 
		out.println("<p><strong>Area:</strong>  "+df.format(data.area)+"</p>");
		out.println("<p><strong>Volumen: </strong> "+df.format(data.volumen)+"</p>");
		out.println("<button onclick=window.location.href='/Geometria/index.html' style=height:30px;width:80px>Menu</button>");
		
		out.println("</body>");
		out.println("</html>");
	
	}

}
