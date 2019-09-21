package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Customer;
import service.CustomerService;

/**
 * Servlet implementation class DoLogin
 */
@WebServlet("/dologin")
public class DoLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String customerId = request.getParameter("customerId");
		
		// Perform business logic, Return a bean as a result
		CustomerService service = new CustomerService();
		Customer customer = service.findCustomer(customerId);
		
		request.setAttribute("customer", customer); //뷰에 전달하기 위함(포워딩), 앞에는 키값, 뒤에는 밸류값
		
		List<Customer> customerList = service.getAllCustomer();
		request.setAttribute("customers", customerList);
		
		String page;
		if(customer == null)
			page = "/view/error.jsp";
		else
			page = "/view/success.jsp";
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(page); // 포워딩
		dispatcher.forward(request, response);
	}

}
