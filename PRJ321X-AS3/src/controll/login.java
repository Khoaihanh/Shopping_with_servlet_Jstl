package controll;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.User;
import dao.DAO;

/**
 * Servlet implementation class login
 */
@WebServlet("/logincontrol")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user=request.getParameter("user");
		String pass=request.getParameter("pass");
		DAO dao=new DAO();
		User u =dao.login(user, pass);
		if(u == null) {
			request.setAttribute("error", "Ten dang nhap hoac mat khau sai");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}else {
			HttpSession session= request.getSession();
			session.setAttribute("acc", u);
			response.sendRedirect("Homecontroller");
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
