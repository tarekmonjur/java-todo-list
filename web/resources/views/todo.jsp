<%@ page import="java.util.*" %>
<%@ page import="Todo.Models.Todo" %>
<% //List data= (List)request.getAttribute("todos"); %>

<main role="main">

    <table class="table">
        <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col">First Name</th>
            <th scope="col">Last Name</th>
            <th scope="col">Email</th>
            <th scope="col">Address</th>
            <th scope="col">State</th>
            <th scope="col">City</th>
            <th scope="col">Zip Code</th>
            <th scope="col">Action</th>
        </tr>
        </thead>
        <tbody>
        <% for(Todo TD: (List<Todo>) request.getAttribute("todos")){%>
            <tr>
                <th scope="row"><%=TD.getRow()%></th>
                <td><%=TD.getFirstName()%></td>
                <td><%=TD.getLastName()%></td>
                <td><%=TD.getEmail()%></td>
                <td><%=TD.getAddress()%></td>
                <td><%=TD.getState()%></td>
                <td><%=TD.getCity()%></td>
                <td><%=TD.getZip()%></td>
                <td>
                    <div class="btn btn-group">
                        <a href="${baseUrl}/todo-edit/<%=TD.getId()%>" class="btn btn-sm btn-primary">Edit</a>
                        <a href="${baseUrl}/todo-delete/<%=TD.getId()%>" class="btn btn-sm btn-danger">Delete</a>
                    </div>
                </td>
            </tr>
        <% } %>
        </tbody>
    </table>

</main>

