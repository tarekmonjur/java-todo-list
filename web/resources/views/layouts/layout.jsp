<%--
  Created by IntelliJ IDEA.
  User: Tarek
  Date: 11/18/2017
  Time: 11:42 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String baseUrl = (String) request.getAttribute("baseUrl");%>
<% String pageUri =(String) request.getAttribute("pageUri");%>

<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../../../favicon.ico">

    <title>Java Todo List</title>

    <!-- Bootstrap core CSS -->
    <link href="${assets}css/bootstrap.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="${assets}css/narrow-jumbotron.css" rel="stylesheet">
</head>
<body>
    <div class="container">

        <% String pageName = (String) request.getAttribute("pageName"); %>

        <%@ include file= "common/header.jsp"%>
    
        <%
            if(pageName !=null){
                if(!pageName.isEmpty()){
        %>
            <jsp:include page="<%= pageName %>" flush="true"></jsp:include>
        <%
                }
            }else{
        %>
            <jsp:include page="../home.jsp" />
        <% } %>
        <%@ include file="common/footer.jsp"%>

    </div>
</body>
</html>
