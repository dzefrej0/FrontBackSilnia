
<%@ page import="pl.silnia.eonetworks.SilniaController" %>
<%@ page import="pl.silnia.eonetworks.SilniaService" %>
<!DOCTYPE html>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" errorPage="error.jsp"%>




<%--<meta http-equv="Content-Type" content="text/html; charset=UTF-8"/>--%>

<html>
<head>

  <title>obliczanie silni</title>
  <meta charset="utf-8">

  <script type="text/javascript">
      function mojsubmit(){
          this.document.getElementById("form").action = this.document.getElementById("selectAction").value;
          return true;
      }
  </script>
</head>
<body>



<form id="form" method="POST" accept-charset="utf-8" action="/recursion.s" onsubmit="return mojsubmit()">

  <select id="selectAction">
    <option value="/recursion.s">choose recursion method for counting silnia</option>
    <option value ="/iterating.s">choose iterating method for counting silnia</option>
  </select>


  <input type="number" name="n" />
    <input type="submit" value="wy?lij zapytanie" var="btn1"/>

  <input type="reset" value="Wyczysc"/>
  </form>






  <tr>
    <th:each items="${silniaList}" >
      <th:li>${silniaList}</th:li>
    </th:each>
  </tr>



  <%
    // Throw an exception to invoke the error page

    int x = 1;
    if (x == 2)
    {
      throw new RuntimeException("Error condition!!!");
    }
  %>
</form>



</body>

</html>
