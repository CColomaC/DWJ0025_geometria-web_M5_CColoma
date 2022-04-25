package controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.Circulo;
import java.io.IOException;

public class CirculoControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public CirculoControllerServlet() {
        super();
      }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1) recuperar los valores enviados desde el formulario
			
			String operacion	= request.getParameter("operacion");
			String diametroStr	= request.getParameter("diametro");
			
			// 2) convertir al tipo de dato deseado
			double diametro = Double.parseDouble(diametroStr);// parseDouble() es un miembro de clase (static)
					
			// 3) Utilizar las(s) clase(s) modelo para hacer cálculos o acciones
			Circulo circulo = new Circulo(diametro);
			if(operacion.equalsIgnoreCase("area")) {
				double area = circulo.calcularArea();// calcularArea() es un miembro de instancia 
				request.setAttribute("resultado", area);
				request.setAttribute("operacion", "área");
			}else {
				double perimetro = circulo.calcularPerimetro();
				request.setAttribute("resultado", perimetro);
				request.setAttribute("operacion", "perímetro");
			}
						
			//4 )Delegar a una vista para que muestre el o los resultados
			String rutaJSP = "/WEB-INF/jsp/view/circulo.jsp";
			//pasamos los datos al JSP
			request.getRequestDispatcher(rutaJSP).forward(request, response);
	}

}
