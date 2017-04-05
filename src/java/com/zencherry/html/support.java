package com.zencherry.html;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@SuppressWarnings("serial")
public class support extends HttpServlet {
    /**
	 * 
	 */

    @Override
    public void init() throws ServletException{
        
    }
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    	response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");
        request.setAttribute("ztitle", "Support");
        String configUrl=getServletContext().getInitParameter("url");
        String configUser=getServletContext().getInitParameter("user");
        String configPass=getServletContext().getInitParameter("pass");
        request.setAttribute("zcontent", GetPage.getContent("support",configUrl, configUser, configPass));
        RequestDispatcher view = request.getRequestDispatcher("WEB-INF/jsp/base.jsp");
        view.forward(request, response);
    }
    @Override
    public void destroy(){
  
    }
}