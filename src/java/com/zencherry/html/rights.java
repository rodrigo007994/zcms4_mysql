package com.zencherry.html;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@SuppressWarnings("serial")
public class rights extends HttpServlet {
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
        request.setAttribute("ztitle", "Hosting");
        request.setAttribute("zcontent", "<h3>Legal Notice</h3>\n<div>All materials contented in this site (including, but not limited, to text, logos, content, [animated and static] images, icons and pictures, among others) are protected by the Copyright and Industrial Property Laws, as domestic as internationals.</div>\n<div>&nbsp;</div>\n<div>About the whole site content, it is prohibited the total or partial reproduction, usage, copy, print, distribution, publication, translation, adaptation, reclassification or any other usage or modification of data and written works content in this page, by any means or by any way.</div>\n<div>&nbsp;</div>\n<div>The copy prohibition, mentioned into the preceding paragraph, is not valid exclusive nor limited, according to the content information in 'Download logo' from the Press Room, into the site, which could be reproduced exclusively to accomplish the following requirements:</div>\n<div>&nbsp;</div>\n<div>i) the material could be used only for personal or educative usage, neither profitable, nor commercial;</div>\n<div>&nbsp;</div>\n<div>ii) the copyright, trademarks or all rights reserved scripts should be included referring to Zencherry, namely 'Copyright&copy; 2017 Zencherry All rights reserved';</div>\n<div>&nbsp;</div>\n<div>iii) send an email to&nbsp;<img src='img/e_mail.png' alt='zencherry e-mail'/>&nbsp;providing notice about the information to use it, as well as its purpose.</div>\n<div>&nbsp;</div>\n<div>The aforementioned does not grant any license, or any type of right for such information.</div>\n<div>&nbsp;</div>\n<div>For any matter related to this notice, contact&nbsp;<img src='img/e_mail.png' alt='zencherry e-mail'/>.</div>");
        RequestDispatcher view = request.getRequestDispatcher("WEB-INF/jsp/base.jsp");
        view.forward(request, response);
    }
    @Override
    public void destroy(){
  
    }
}