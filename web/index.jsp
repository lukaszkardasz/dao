<%--
  Created by IntelliJ IDEA.
  User: n2god
  Date: 23/12/2019
  Time: 17:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"
         language="java"
         pageEncoding="UTF-8"
%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
    <title>Biblioteka viewer</title>
</head>
<body>
<h1>
    Library viewer
</h1>
  <form action="BookServlet" method="post">
    <input type="text" placeholder="isbn" name="isbn"><br>
    <input type="text" placeholder="tytuł" name="title"><br>
    <input type="text" placeholder="opis" name="description"><br>
      Szukaj: <input type="radio" name="option" value="search"><br>
      Dodaj: <input type="radio" name="option" value="add"><br>
      Modyfikuj: <input type="radio" name="option" value="update"><br>
      Usuń: <input type="radio" name="option" value="delete"><br>
    <input type="submit" value="Wyślij">
  </form>
</body>
</html>
