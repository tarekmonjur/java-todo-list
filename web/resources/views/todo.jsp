<%@ page import="java.util.*" %>
<% //List data= (List)request.getAttribute("todos"); %>

<main role="main">

    <table class="table">
        <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col">First Name</th>
            <th scope="col">Last Name</th>
            <th scope="col">Username</th>
        </tr>
        </thead>
        <tbody>
        <% for(Object td: (List)request.getAttribute("todos")){%>
            <tr>
                <th scope="row">1</th>
                <td>${td.}</td>
                <td>Otto</td>
                <td>@mdo</td>
            </tr>
        <% } %>
        </tbody>
    </table>

</main>

