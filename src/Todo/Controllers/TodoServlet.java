package Todo.Controllers;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import Common.CommonClass;
import Todo.Models.Todo;
import Todo.Models.TodoModel;


/**
 * Created by Tarek on 11/18/2017.
 */
public class TodoServlet extends CommonClass{

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String firstName = request.getParameter("first_name");
        String lastName = request.getParameter("last_name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String address = request.getParameter("address");
        String city = request.getParameter("city");
        String state = request.getParameter("state");
        String zipCode = request.getParameter("zip_code");

        Todo TD = new Todo();
        TD.setFirstName(firstName);
        TD.setLastName(lastName);
        TD.setEmail(email);
        TD.setPassword(password);
        TD.setAddress(address);
        TD.setCity(city);
        TD.setState(state);
        TD.setZip(zipCode);

        int result = TodoModel.save(TD);
        if(result > 0){
            request.setAttribute("success", "<p>Record saved successfully!</p>");
        }else {
            request.setAttribute("first_name", firstName);
            request.setAttribute("last_name", lastName);
            request.setAttribute("email", email);
            request.setAttribute("address", address);
            request.setAttribute("city", city);
            request.setAttribute("state", state);
            request.setAttribute("zip_code", zipCode);
        }

        this.doGet(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        this.commonSettings(request);
        if(this.uri.equals("/todo")){
            request.setAttribute("pageName", "./../todo.jsp");
        }else if(this.uri.equals("/todo-add")){
            request.setAttribute("pageName", "./../todo_add.jsp");
        }

        RequestDispatcher rd=request.getRequestDispatcher("/resources/views/layouts/layout.jsp");
        rd.include(request, response);
    }


}
