<!DOCTYPE html>
<html>
<head>
    <title>Learn Model</title>
</head>
<body>
    <h1>My Login Page ${name}</h1>

    <form action="/learnModel" method="post">
        <label for="name">Name</label>
        <input type="text" id="name" name="name" />

        <label for="address">Address</label>
        <input type="text" id="address" name="address" />

        <label for="age">Age</label>
        <input type="number" id="age" name="age" />

        <label for="course">Course</label>
        <input type="text" id="course" name="course" />

        <button type="submit">Submit</button>
    </form>
</body>
</html>
