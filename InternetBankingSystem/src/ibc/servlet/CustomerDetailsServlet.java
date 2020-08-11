package ibc.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ibc.model.CustomerDetailsModel;
import ibc.service.CustomerDetailsServiceImplementation;




@WebServlet("/CustomerDetailsServlet")
public class CustomerDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("UserName");
		String pwd = request.getParameter("PassWord");
		//if(pwd.matches("(?=.*[0-9])"))
			//	return;
		String accountType = request.getParameter("accountType");
		String age = request.getParameter("age");
		String mobileNo = request.getParameter("mobileNo");
		String branch = request.getParameter("branch");
		//long customerID = System.c
		System.out.println(accountType);
		CustomerDetailsModel customerDetails = new CustomerDetailsModel();
		customerDetails.setUsername(uname);
		customerDetails.setPassword(pwd);
		customerDetails.setAccountType(accountType);
		customerDetails.setAge(age);
		customerDetails.setMobileNo(mobileNo);
		customerDetails.setBranch(branch);
		
		CustomerDetailsServiceImplementation cs = new CustomerDetailsServiceImplementation();
		boolean result = cs.storeCredentials(customerDetails);
		System.out.println(result);
		
		if(result==false) {
			//request.getRequestDispatcher("displayService.jsp").forward(request, response);

		} else {
			request.getRequestDispatcher("index.jsp").forward(request, response);

		}
		
		
		
		
		
		
		
		
		
		
	}

}
