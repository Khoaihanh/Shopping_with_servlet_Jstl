package controll;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAO;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email= request.getParameter("email");
		String user=request.getParameter("user");
		String pass= request.getParameter("pass");
		String rpass=request.getParameter("rpass");
		DAO dao= new DAO();
		if(!pass.equals(rpass)) {
			request.setAttribute("error", "Mat khau nhap lai khong trung khop");
			request.getRequestDispatcher("register.jsp").forward(request, response);
		} else {
			if(dao.check(email)!=null) {
				request.setAttribute("error", "Email da ton tai");
				request.getRequestDispatcher("register.jsp").forward(request, response);
			}
			else {
			dao.adduser(email,pass, user);
			response.sendRedirect("Homecontroller");
			}
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
