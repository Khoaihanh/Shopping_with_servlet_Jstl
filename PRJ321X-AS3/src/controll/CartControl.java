package controll;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.org.apache.bcel.internal.generic.NEW;

import Model.Cart;
import Model.product;
import dao.DAO;

/**
 * Servlet implementation class CartControl
 */
@WebServlet("/CartControl")
public class CartControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CartControl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html);charset=UTF-8");
		try {
			HttpSession session=request.getSession(true);
			String idd= request.getParameter("id");
			String action =request.getParameter("action");
			if(action!=null && action.equalsIgnoreCase("add")) {
				if(session.getAttribute("cart"==null)) {
					session.setAttribute("cart", new Cart());
				}
				int id= Integer.parseInt(idd);
				DAO dao =new DAO();
				product p=dao.getProductc(""+id);
				Cart c=(Cart) session.getAttribute("cart");
				c.add(new product(p.getProduct_id(),p.getProduct_name(),p.getProduct_des(),p.getProduct_price(),p.getProduct_img_source(),p.getProduct_type(),p.getProduct_brand(),1));
			}else if (action!=null && action.equalsIgnoreCase("delete")) {
				int id=Integer.parseInt(idd);
				Cart cart=(Cart) session.getAttribute("cart");
				cart.remove(id);
			}
			response.sendRedirect("cart.jsp");
			
			
		} catch (Exception e) {
			// TODO: handle exception
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
