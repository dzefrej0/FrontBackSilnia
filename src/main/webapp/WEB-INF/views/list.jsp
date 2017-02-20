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
<c:if test="${not empty todoList}">
  <ul>
    <c:forEach items="${todoList}" var="todo">
      <li>${todo}</li>
    </c:forEach>
  </ul>
</c:if>
</body>
</html>