
<header class="header clearfix">
    <nav>
        <ul class="nav nav-pills float-right">
            <li class="nav-item">
                <a class="nav-link <% if(pageUri.equals("/home")){%> active <%}%>" href="/home">Home <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
                <a class="nav-link <% if(pageUri.equals("/todo-add")){%> active <%}%>" href="/todo-add">Add Todo</a>
            </li>
            <li class="nav-item">
                <a class="nav-link <% if(pageUri.equals("/todo")){%> active <%}%>" href="/todo">Todo List</a>
            </li>
        </ul>
    </nav>
    <h3 class="text-muted">Java Todo List</h3>
</header>

