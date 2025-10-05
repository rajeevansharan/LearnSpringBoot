<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<body>
    <h2>Your Todos:</h2>
    <ul>
        <c:forEach var="todo" items="${todos}">
            <li>${todo.description}</li>
        </c:forEach>
    </ul>
</body>
</html>
