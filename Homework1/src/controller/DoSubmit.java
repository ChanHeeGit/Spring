package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.OrderList;
import service.OrderService;

/**
 * Servlet implementation class DoSubmit
 */
@WebServlet("/DoSubmit")
public class DoSubmit extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//private static final OrderList OrderList = null;
       
    public DoSubmit() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String item = request.getParameter("item");
		String dis = request.getParameter("dis");
		String price = request.getParameter("price");
		String fn = request.getParameter("fn");
		String ln = request.getParameter("ln");
		String mi = request.getParameter("mi");
		String address = request.getParameter("address");
		String credit = request.getParameter("credit");
		String creditnum = request.getParameter("creditnum");
		String creditnum2 = request.getParameter("creditnum2");
		
		OrderService orderservice = OrderService.getInstance();
		
		OrderList orderlist = new OrderList(item, dis, price, fn, ln, mi, address, credit, creditnum, creditnum2);
		
		
		orderservice.addOrder(orderlist);
		request.setAttribute("item", orderlist);
		
//		List<OrderList> orderlistlist = orderservice.getAllOrderList();
//		request.setAttribute("items", orderlistlist);
//		
		String page;
		if(item == null)
			page = "/view/error.jsp";
		else
			page = "/view/order.jsp";
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(page); // 포워딩
		dispatcher.forward(request, response);
	}
	


}
