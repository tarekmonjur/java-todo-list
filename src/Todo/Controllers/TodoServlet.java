package Todo.Controllers;

import java.io.PrintWriter;
import java.util.*;
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

        int result=0;

        if(request.getParameterMap().containsKey("_method") && request.getParameterMap() !=null){
            String formMethod = request.getParameter("_method");
            if(formMethod.equals("put") || formMethod.equals("PUT")) {
                this.doPut(request, response, TD);
            }
        }else{
            result = TodoModel.save(TD);
            if(result > 0){
                request.setAttribute("success",  "<p>Todo saved successfully!</p>");
            }else{
                request.setAttribute("error", "<p>Todo not saved successfully!</p>");
                request.setAttribute("first_name", firstName);
                request.setAttribute("last_name", lastName);
                request.setAttribute("email", email);
                request.setAttribute("address", address);
                request.setAttribute("city", city);
                request.setAttribute("state", state);
                request.setAttribute("zip_code", zipCode);
            }
        }

        this.doGet(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        this.commonSettings(request);
        String segmentOne = this.segment(1);

        if(this.uri.equals("/todo")){
            List<Todo> todoList = TodoModel.select();
            request.setAttribute("todos", todoList);
            request.setAttribute("pageName", "./../todo.jsp");
        }else if(this.uri.equals("/todo-add")){
            request.setAttribute("pageName", "./../todo_add.jsp");
        }else if(this.uri.equals("/todo-edit") || segmentOne.equals("todo-edit")){
            String sid = this.segment(2);
            int id = Integer.parseInt(sid);
            request.setAttribute("id", id);
            Todo TD = TodoModel.find(id);
            request.setAttribute("todo", TD);
            request.setAttribute("pageName", "./../todo_edit.jsp");
        }

        RequestDispatcher rd=request.getRequestDispatcher("/resources/views/layouts/layout.jsp");
        rd.include(request, response);
    }


    protected void doPut(HttpServletRequest request, HttpServletResponse response, Todo TD) throws ServletException, IOException
    {
        this.commonSettings(request);
        String sid = this.segment(2);
        int id = Integer.parseInt(sid);
        TD.setId(id);

        int result = TodoModel.update(TD);
        if(result > 0){
            request.setAttribute("success",  "<p>Todo updated successfully!</p>");
        }else{
            request.setAttribute("error", "<p>Todo not updated successfully!</p>");
        }
    }


}
