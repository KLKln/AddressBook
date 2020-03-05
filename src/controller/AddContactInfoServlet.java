package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ContactInfo;

/**
 * Servlet implementation class AddContactInfoServlet
 */
@WebServlet("/addContactInfoServlet")
public class AddContactInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddContactInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    String phoneNumber = request.getParameter("phoneNumber");
	    String phoneType = request.getParameter("phoneType");
	    String email = request.getParameter("email");
	    String emailType = request.getParameter("emailType");
	    
	    ContactInfo ci = new ContactInfo(phoneNumber, phoneType, email, emailType);
	    ContactInfoHelper cih = new ContactInfoHelper();
	    cih.insertContactInfo(ci);
	    
		getServletContext().getRequestDispatcher("/index.html").forward(request, response);
	}

}
