<!DOCTYPE html>
<html>
<head>
    <title>Add Todo Page</title>
</head>
<body>
    <h1>Add Todo Form</h1>
    <form  action="/addTodo"  method="post">     <!-- method should not be get here -->
    <label for="id" >id</label>
    <input type="text" name="id">
    </input>
      <label for="username" >Username</label>
        <input type="text" name="username">
        </input>
        <label for="description" >Description</label>
                <input type="text" name="description">
                </input>

    <button type="submit">submit</button>
    </form>
</body>
</html>
