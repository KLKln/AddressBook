package controller;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ContactInfo;
import model.Person;

/**
 * Servlet implementation class EditPersonServlet
 */
@WebServlet("/editPersonServlet")
public class EditPersonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditPersonServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	//I once again am not sure how to implement the date
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PersonHelper dao = new PersonHelper();
		ContactInfoHelper cih = new ContactInfoHelper();
		
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String birthDateString = request.getParameter("birthDate");
		Integer tempId = Integer.parseInt(request.getParameter("id"));
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		
		LocalDate birthDate = LocalDate.parse(birthDateString);
		
		Person personToUpdate = dao.searchForPersonById(tempId);
		ContactInfo contactInfoToAdd = new ContactInfo();

		personToUpdate.setFirstName(firstName);
		personToUpdate.setLastName(lastName);
		personToUpdate.setBirthDate(birthDate);
		contactInfoToAdd.setPhoneNumber(phone);
		contactInfoToAdd.setEmail(email);
		contactInfoToAdd.setContactId(tempId);
		
		dao.updatePerson(personToUpdate);
		cih.insertContactInfo(contactInfoToAdd);
		
		
		
		getServletContext().getRequestDispatcher("/viewAllPeopleServlet").forward(request, response);
		
		
	}

}
