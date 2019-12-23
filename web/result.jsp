<%@ page import="pl.n2god.dao.model.Book" %><%--
  Created by IntelliJ IDEA.
  User: n2god
  Date: 23/12/2019
  Time: 18:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"
         language="java"
         pageEncoding="UTF-8"
%>
<% Book book = (Book)request.getAttribute("book"); %>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Wynik operacji</title>
</head>
<body>
<h1>
    Wynik zapytania: <%=request.getAttribute("option") %>
</h1>
<p>W wyniku Twojego zapytania otrzymano następujący wynik:</p>
<p>
    Tytuł: <%= book.getTitle() %> <br>
    ISBN: <%= book.getIsbn() %> <br>
    Opis: <%= book.getDescription() %>
</p>

</body>
</html>
