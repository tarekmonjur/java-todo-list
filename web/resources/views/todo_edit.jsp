<%@ page import="Todo.Models.Todo" %>
<% Todo data= (Todo)request.getAttribute("todo"); %>

<main role="main">
    ${success}
    <form action="/todo-edit/<%=data.getId()%>" method="post">
        <input type="hidden" value="put" name="_method">
        <div class="form-row">
            <div class="form-group col-md-6">
                <label for="first_name">First Name</label>
                <input type="text" class="form-control" id="first_name" name="first_name" value="<%=data.getFirstName()%>" placeholder="Enter first name...">
            </div>
            <div class="form-group col-md-6">
                <label for="last_name">Last Name</label>
                <input type="text" class="form-control" id="last_name" name="last_name" value="<%=data.getLastName()%>" placeholder="Enter last name...">
            </div>
        </div>
        <div class="form-row">
            <div class="form-group col-md-6">
                <label for="email">Email</label>
                <input type="email" class="form-control" id="email" name="email" value="<%=data.getEmail()%>" placeholder="Enter email address...">
            </div>
            <div class="form-group col-md-6">
                <label for="inputPassword4">Password</label>
                <input type="password" class="form-control" id="inputPassword4" name="password" placeholder="Password">
            </div>
        </div>
        <div class="form-group">
            <label for="inputAddress">Address</label>
            <input type="text" class="form-control" id="inputAddress" name="address" value="<%=data.getAddress()%>" placeholder="Enter address...">
        </div>
        <div class="form-row">
            <div class="form-group col-md-6">
                <label for="inputCity">City</label>
                <input type="text" class="form-control" id="inputCity" name="city" value="<%=data.getCity()%>" placeholder="Enter your city...">
            </div>
            <div class="form-group col-md-4">
                <label for="inputState">State</label>
                <select id="inputState" name="state" class="form-control">
                    <option value="">...Select State...</option>
                    <option <% if(data.getState().equals("Dhaka")){ out.print("selected"); }%> >Dhaka</option>
                    <option <% if(data.getState().equals("Chittagong")){ out.print("selected"); }%> >Chittagong</option>
                    <option <% if(data.getState().equals("Sylhet")){ out.print("selected"); }%> >Sylhet</option>
                    <option <% if(data.getState().equals("Khulna")){ out.print("selected"); }%> >Khulna</option>
                    <option <% if(data.getState().equals("Rajshahi")){ out.print("selected"); }%> >Rajshahi</option>
                    <option <% if(data.getState().equals("Barisal")){ out.print("selected"); }%> >Barisal</option>
                </select>
            </div>
            <div class="form-group col-md-2">
                <label for="inputZip">Zip</label>
                <input type="text" class="form-control" id="inputZip" name="zip_code" value="<%=data.getZip()%>">
            </div>
        </div>
        <br>
        <button type="submit" class="btn btn-primary">Sign in</button>
        <br>
    </form>

</main>

