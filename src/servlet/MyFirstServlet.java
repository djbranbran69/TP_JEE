package servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * Created by djbranbran on 13/05/16.
 */
@WebServlet("/MyFirstServlet")
public class MyFirstServlet extends HttpServlet {


    public MyFirstServlet() {
        super();

    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        //use configuration Parameters
        String dbName=(String)config.getInitParameter("DbName");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String valueParam1=request.getParameter("param1");
        Map<String, String[]> paramMap = request.getParameterMap();
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Définition du type de retour
        response.setContentType("text/html");
        //Flux d'écriture en sortie caractère
        response.getWriter();
        //Flux d'écriture en sortie binaire
        response.getOutputStream();
        //Redirection vers un autre URL
        response.sendRedirect("/redirectUrl");
    }

    @Override
    public void destroy() {
        super.destroy();
    }

}