package tomassarmiento.web.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tomassarmiento.web.models.Dog;

/**
 * Servlet implementation class Dogs
 */
@WebServlet("/Dogs")
public class Dogs extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Dogs() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
        int weight = Integer.parseInt(request.getParameter("weight"));
        String breed = request.getParameter("breed");
        // Crear el modelo
        Dog dog = new Dog(name, breed, weight);
        // Establecer el modelo para la vista
        request.setAttribute("dog", dog);
	     RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/dog.jsp");
	        view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
