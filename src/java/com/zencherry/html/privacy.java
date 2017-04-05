package com.zencherry.html;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@SuppressWarnings("serial")
public class privacy extends HttpServlet {
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
        request.setAttribute("ztitle", "Notice of privacy");
        request.setAttribute("zcontent", "<h3>NOTICE OF PRIVACY</h3>\n<div>In accordance with the 'Federal Law on the protection of personal data held by private individuals' and its current regulations, Zencherry makes aware that, in accordance with the privacy policy and the management of personal data, at all times it will seek that the treatment of the personal data is legitimate and controlled, in order to guarantee the privacy and the right to self-determination of your information.</div>\n<div>The company does not sell, exchange or share the information of its clients, suppliers, employees and contacts with any company or entity, unless it is required by order of some judicial or administrative authority.</div>\n<div>The person responsible for the handling of your personal data will be the person who holds the position of Legal Representative of Zencherry, who has its address located at: Calle 47 # 965, Fraccionamiento Las Am&eacute;ricas II, Zip Code 97302, Merida, Yucatan, Mexico.</div>\n<div>Zencherry, obtains the personal data of its contacts and clients only through our partners, managers and professional staff, or because the same contacts and clients enter their information on or through the website <a href='www.zencherry.mx.'>www.zencherry.mx.</a> Such information will only be used for statistical purposes, as well as to make invitations to events or offer of Zencherry services, and to send you newsletters as a way to provide Zencherry services, clients may exercise the rights of access, rectification, Cancellation and / or opposition (ARCO Rights) by sending an email to&nbsp;<img src='img/e_mail.png' alt='zencherry e-mail'/></div>\n<div>In order to be processed, your request must include each and every one of the requirements on article 29 of the Federal Law on the Protection of Personal Data held by the Individuals.</div>\n<div>In case you wish to unsubscribe from our mailing list and database, as well as avoid any communication from us, we kindly request clients to send us an email to&nbsp;<img src='img/e_mail.png' alt='zencherry e-mail'/></div>\n<div>&nbsp;</div>\n<div>The English version of this document has no legal value in M&eacute;xico, it is provided solely as a means to facilitate the reading and understanding of the Spanish version, it is not a substitute to the legal validity of the Spanish version. In case of any controversy, the text in the Spanish version shall in all cases apply.</div>\n<div>&nbsp;</div>\n<div>The Spanish version:</div>\n<div>&nbsp;</div>\n<h3>AVISO DE PRIVACIDAD</h3>\n<div>De acuerdo a lo establecido por la 'Ley federal de protecci&oacute;n de datos personales en posesi&oacute;n de particulares' y su reglamento vigentes, Zencherry hace de su conocimiento que, de acuerdo con la pol&iacute;tica de privacidad y manejo de datos personales, en todo momento buscar&aacute; que el tratamiento de los mismo sea leg&iacute;timo y controlado, a efecto de garantizar la privacidad y el derecho a la autodeterminaci&oacute;n informativa de sus datos.</div>\n<div>La empresa no vende, intercambia o comparte la informaci&oacute;n de sus clientes, proveedores, empleados y contactos con ninguna empresa o entidad, salvo que esta fuera requerida por mandato de alguna autoridad judicial o administrativa.</div>\n<div>La persona responsable del manejo de sus datos personales, ser&aacute; quien ostente el cargo de Representante Legal de Zencherry, que tiene como domicilio el ubicado en: Calle 47 #965, Fraccionamiento Las Am&eacute;ricas II, C&oacute;digo Postal 97302, M&eacute;rida, Yucat&aacute;n, M&eacute;xico.</div>\n<div>Zencherry, obtiene los datos personales de sus contactos y clientes solo por medio de nuestros socios, gerentes, personal profesional y administrativo, o bien, porque los mismos contactos y clientes ingresan su informaci&oacute;n en o por medio de la p&aacute;gina web <a href='www.zencherry.mx.'>www.zencherry.mx.</a> Dicha informaci&oacute;n solamente ser&aacute; utilizada con fines estad&iacute;sticos, as&iacute; como para realizar invitaciones a eventos u ofrecimiento de servicios de Zencherry, y para hacerle llegar boletines informativos como una forma de brindar en los servicios que ofrece Zencherry, podr&aacute;n ejercer los derechos de accesos, rectificaci&oacute;n, cancelaci&oacute;n y/u oposici&oacute;n (Derechos de ARCO) mediante el env&iacute;o de un correo electr&oacute;nico a&nbsp;<img src='img/e_mail.png' alt='zencherry e-mail'/></div>\n<div>Para ser procesada su petici&oacute;n, esta deber&aacute; incluir todos y cada uno de los requisitos previstos en el art&iacute;culo 29 de la Ley Federal de Protecci&oacute;n de Datos Personales en Posesi&oacute;n de los Particulares.</div>\n<div>En caso de que deseen darse de baja en nuestra lista de correos y base de datos, as&iacute; como no recibir m&aacute;s comunicaci&oacute;n de nosotros, le solicitamos amablemente nos envi&eacute; un correo&nbsp;<img src='img/e_mail.png' alt='zencherry e-mail'/></div>");
        RequestDispatcher view = request.getRequestDispatcher("WEB-INF/jsp/base.jsp");
        view.forward(request, response);
    }
    @Override
    public void destroy(){
  
    }
}