package Todo.Controllers;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import Common.CommonClass;

/**
 * Created by Tarek Monjur on 11/20/2017.
 */
@WebServlet(name = "HomeServlet", urlPatterns = {"/home", "/index"})
public class HomeServlet extends CommonClass {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        this.commonSettings(request);
        request.setAttribute("pageName", "./../home.jsp");
        RequestDispatcher rd=request.getRequestDispatcher("./resources/views/layouts/layout.jsp");
        rd.include(request, response);
    }
}
