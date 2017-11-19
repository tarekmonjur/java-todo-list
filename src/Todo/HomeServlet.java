package Todo;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Tarek Monjur on 11/20/2017.
 */
@WebServlet(name = "HomeServlet", urlPatterns = {"/home", "/index"})
public class HomeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        response.sendRedirect("./resources/views/layouts/layout.jsp");
//        PrintWriter out = response.getWriter();
//        out.print(request.getRequestURI());
//        out.print(request.getParts());
//        out.print(request.getQueryString());
//        out.print(request.getRequestURL());
//        out.close();

        request.setAttribute("page", "./../home.jsp");
        RequestDispatcher rd=request.getRequestDispatcher("./resources/views/layouts/layout.jsp");
        rd.include(request, response);
    }
}
