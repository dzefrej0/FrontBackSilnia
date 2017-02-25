
<!DOCTYPE html>
<%@ page isErrorPage="true" errorPage="error.jsp" %>

<meta http-equv="Content-Type" content="text/html; charset=UTF-8"/>

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
  <input type="submit" />
  <input type="reset" value="Wyczysc"/>

</form>


<tr>
    <th:each items="${silniaList}" >
      <th:li>${silniaList}</th:li>
  </th:each>
  </tr>

</body>
</html>
