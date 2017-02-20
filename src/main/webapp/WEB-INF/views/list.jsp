<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
  <title>obliczanie silni</title>
  <meta charset="utf-8">
</head>
<body>
<form method="POST" accept-charset="utf-8">

  <input type="number" name="n" />
  <input type="submit" value="Wyslij"/>
  <input type="reset" value="Wyczysc"/>

</form>

  <ul>
    <c:forEach items="${silniaList}" var="silnia">
      <li>${silnia}</li>
    </c:forEach>
  </ul>

</body>
</html>