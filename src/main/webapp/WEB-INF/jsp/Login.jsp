<!DOCTYPE html>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
    <h1>My Login Page ${name}</h1>
    <form  method="post">     <!-- method should not be get here -->
    <label for="Name" >Name</label>
    <input type="text" name="username">
    </input>
      <label for="password" >Password</label>
        <input type="password" name="password">
        </input>
        <label for="nickName" >NickName</label>
                <input type="text" name="nickname">
                </input>
        


    <button type="submit">submit</button>
    </form>
</body>
</html>
