<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<meta http-equv="Content-Type" content="text/html; charset=UTF-8"/>
<html>
<head>
  <title>obliczanie silni</title>
  <meta charset="utf-8">
</head>
<body>

<select>
    <option>choose iterating method for counting silnia</option>
    <option>choose recursion method for counting silnia</option>

</select>
<form method="POST" accept-charset="utf-8">

  <input type="number" name="n" />
  <input type="submit" value="Wyslij"/>
  <input type="reset" value="Wyczysc"/>

</form>

  <tr>
    <th:each items="${silniaList}" >
      <th:li>${silniaList}</th:li>
  </th:each>
  </tr>

</body>
</html>