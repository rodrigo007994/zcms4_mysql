package com.zencherry.html;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

@SuppressWarnings("serial")
public class install extends HttpServlet {
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
        request.setAttribute("ztitle", "Install");
        Connection conn=null;
	Statement stmt=null;
        String configUrl=getServletContext().getInitParameter("url");
        String configUser=getServletContext().getInitParameter("user");
        String configPass=getServletContext().getInitParameter("pass");
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn= DriverManager.getConnection("jdbc:mysql://"+configUrl, configUser, configPass);
            stmt = conn.createStatement();
            stmt.executeUpdate("DROP TABLE IF EXISTS zcms CASCADE;");
            stmt.executeUpdate("CREATE TABLE zcms (id INT NOT NULL AUTO_INCREMENT, label character varying(50) NOT NULL, content text, PRIMARY KEY ( id ));");
            stmt.executeUpdate("INSERT INTO zcms (label, content) VALUES ('home', '<p>We are a young company with 6 years in the market but with programmers with up to 10 years experience in java and even with 12 years experience in linux. We currently have our headquarters in Merida, Yucatan, so we are one of the best options for nearshore outsourcing.</p>');");
            stmt.executeUpdate("INSERT INTO zcms (label, content) VALUES ('programming', '<h3>Programming</h3><p>The programming ZenCherry team is extensively trained in the development of systems, databases and applications in the following technologies: Java, PHP5, Python, Ruby, C#, C++, MySQL, PostgreSQL, BASIC, HTML5, CSS, Javascript, AJAX, JQuery and other technologies.</p>');");
            stmt.executeUpdate("INSERT INTO zcms (label, content) VALUES ('staff', '<h3>Staff</h3>\n<ul><li><label>Rodrigo Villanueva</label> - CEO & Java Developer</li>\n<li><label>Mariano Ceballos</label> - Java Developer</li>\n<li><label>Erik Escobedo</label> - Ruby Developer</li>\n<li><label>Huascar Oña</label> - Ruby Developer</li>\n<li><label>Miriam Chan</label> - HR</li>\n<li><label>Hazel Lara</label> - Designer</li>\n</ul>\n');");
            stmt.executeUpdate("INSERT INTO zcms (label, content) VALUES ('about', '<h3>About</h3><p>ZenCherry is a software outsourcing company located in Merida, Yucatan, Mexico with operations in Cancun. Rodrigo Villanueva, is the founder and owner of ZenCherry.<br>Our business model at ZenCherry is nearshore software development and Support. Unlike outsourcing competitors in India and Russia, we are in a U.S. time zone (Central Time), which allows us to maintain very fluid communication with you.</p><p>Our Mexican operations are located in very low cost of living, even compared to major IT labor markets in Mexico, such as Mexico City, Monterrey and Guadalajara. Even a modest wage in dollar terms is a great wage here, and we can pass on those cost savings to you.</p>');");
            stmt.executeUpdate("INSERT INTO zcms (label, content) VALUES ('hosting', '<h3>Hosting</h3><p>The package includes accommodation on our servers guarantee 99.99% of time online, personalized technical support during business hours, last generation servers, the highest accommodation capacity and speed in the market and email service with custom domain. We have support for MySQL, PostgreSQL, PHP5, JSP in Apache and Apache Tomcat LINUX environments. Access via FTP.</p>');");
            stmt.executeUpdate("INSERT INTO zcms (label, content) VALUES ('support', '<h3>Technical Support</h3><p>Our assistance and technical support are included in the products and services we offer; however, you may receive help and support for applications and systems that have not been acquired with us. This service includes optimization and security improvements.<br><br>To access our Support Center go to <a href=\"http://support.zencherry.com/\">http://support.zencherry.com/</a></p>');");
            stmt.executeUpdate("INSERT INTO zcms (label, content) VALUES ('portfolio', '<h3>Portfolio</h3>\n<ul>\n<li><label>Company:</label> Teléfonos de México, S.A.B. de C.V.</li>\n\n<li><label>Company description:</label></li>\n<li>Telmex is a Mexican telecommunications company headquartered in Mexico City that provides telecommunications products and services in Mexico, Argentina, Chile, Colombia, Brazil, Ecuador, Peru, Venezuela and other countries in Latin America.<br>\nTelmex owns 90 percent of the telephone lines in Mexico City and 80 percent of the lines in Mexico.</li><li><label>Projects:</label>Ground workers Tracking, Infrastructure Deployment Tracking, Infrastructure Repairment Tracking.</li>\n\n<hr>\n\n<li><label>Company:</label> Nokia Corporation</li>\n<li><label>Company description:</label></li>\n<li>Nokia is a Finnish multinational communications and information technology company, founded in 1865. Nokia is headquartered in Espoo, Uusimaa, in the greater Helsinki metropolitan area.</li>\n\n<li><label>Projects:</label> Tracking installations and repairs of telecommunications equipment in Mexico.</li>\n</ul>');");
            stmt.executeUpdate("INSERT INTO zcms (label, content) VALUES ('install', '<h3>Instalation complete.</h3>\n');");

        }catch(ClassNotFoundException e1){
            System.out.println( e1.getClass().getName()+": "+ e1.getMessage() );
        }catch(SQLException e2){
            System.out.println( e2.getClass().getName()+": "+ e2.getMessage() );
        }
        
        request.setAttribute("zcontent", GetPage.getContent("install",configUrl, configUser, configPass));
        RequestDispatcher view = request.getRequestDispatcher("WEB-INF/jsp/base.jsp");
        view.forward(request, response);
    }
    @Override
    public void destroy(){
  
    }
}