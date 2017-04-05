package com.zencherry.html;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@SuppressWarnings("serial")
public class sendcontact extends HttpServlet {
    /**
	 * 
	 */

    @Override
    public void init() throws ServletException{
        
    }
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    	response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");
        String fname=request.getParameter("fname");
        String lname=request.getParameter("lname");
        String company=request.getParameter("company");
        String email=request.getParameter("email");
        String phone=request.getParameter("phone");
        String regarding=request.getParameter("regarding");
        String message=request.getParameter("message");
        
        String configemail = getServletContext().getInitParameter("email");
	String configemailpass = getServletContext().getInitParameter("emailpass");
	String configsmtp = getServletContext().getInitParameter("smtp");
	String configstarttls = getServletContext().getInitParameter("starttls");
	String confighost = getServletContext().getInitParameter("host");
	String configport = getServletContext().getInitParameter("port");
        
        request.setAttribute("ztitle", "Information sent");
        SendEmail.Send("First Name: "+fname+"\n"+
		"Last Name: "+lname+"\n"+
		"Company: "+company+"\n"+
		"Email: "+email+"\n"+
		"Phone: "+phone+"\n"+
		"Regarding: "+regarding+"\n"+
		"Message: "+message+"\n",configemail,configemailpass,configsmtp,configstarttls,confighost,configport);
        request.setAttribute("zcontent", "<h3>Information sent!</h3><p>We will reach you as soon as possible<br><br>Greetings<br><br>ZenCherry Team</p>");
        RequestDispatcher view = request.getRequestDispatcher("WEB-INF/jsp/base.jsp");
        view.forward(request, response);
    }
    @Override
    public void destroy(){
  
    }
}