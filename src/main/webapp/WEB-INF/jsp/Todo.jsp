<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="/webjars/bootstrap/5.3.3/css/bootstrap.min.css">
</head>
<body>
    <div class="container mt-4">
        <h2>Hii ${name}</h2>
        <h2>Your Todos:</h2>

        <!-- Unordered List -->
        <ul>
            <c:forEach var="todo" items="${todos}">
                <li>${todo.description}</li>
            </c:forEach>
        </ul>

        <!-- Table -->
        <table class="table table-striped table-bordered">
            <thead class="table-dark">
                <tr>
                    <th>Id</th>
                    <th>Description</th>
                    <th>TargetDate</th>
                    <th>IsDone</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="todo" items="${todos}">
                    <tr>
                        <td>${todo.id}</td>
                        <td>${todo.description}</td>
                        <td>${todo.targetDate}</td>
                        <td>${todo.done}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <a href="/addTodoForm" class="btn btn-success" >Add Todo</a>
    </div>
    <script src="/webjars/jquery/3.7.1/jquery.min.js"></script>
    <script src="/webjars/bootstrap/5.3.3/js/bootstrap.bundle.min.js"></script>
</body>
</html>