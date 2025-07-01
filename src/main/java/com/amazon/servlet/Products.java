package com.amazon.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Products
 */
@WebServlet("/Products")
public class Products extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Products() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String x = ""
				+ "<html>\n"
				+ "<head>\n"
				+ "</head>\n"
				+ "<body bgcolor=\"grey\">\n"
				+ "<%\n"
				+ "    String gender = (String)session.getAttribute(\"gender\");\n"
				+ "    String genderTitle = null;\n"
				+ "\n"
				+ "    if (gender != null && gender.equalsIgnoreCase(\"female\")) {\n"
				+ "        genderTitle = \"Ms/Mrs.\";\n"
				+ "    } else {\n"
				+ "        genderTitle = \"Mr.\";\n"
				+ "    }\n"
				+ "    %>\n"
				+ "Welcome <%= genderTitle %> <%=session.getAttribute(\"emailId\") %>\n"
				+ "<br>\n"
				+ "Your Resume has been added under <%= session.getAttribute(\"favoriteLanguage\")  %> POOL\n"
				+ "</body>\n"
				+ "</html>";
		response.getWriter().append(x);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath()).append("POST (to send data to the server).");
	}

}
