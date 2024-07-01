<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Add User Form</title>
<style>
    body {
        font-family: Arial, sans-serif;
    }
    form {
        max-width: 400px;
        margin: 0 auto;
        padding: 1em;
        border: 1px solid #ccc;
        border-radius: 1em;
    }
    label {
        margin-bottom: .5em;
        color: #333333;
        display: block;
    }
    input, select {
        border: 1px solid #ccc;
        padding: .5em;
        font-size: 1em;
        width: 100%;
        box-sizing: border-box;
        margin-bottom: 1em;
    }
    input[type="submit"] {
        width: auto;
        padding: 0.7em;
        color: #fff;
        background-color: #007BFF;
        border: none;
        border-radius: 1em;
        cursor: pointer;
    }
    input[type="submit"]:hover {
        background-color: #0056b3;
    }
</style>
</head>
<body>

    <form action="adduser.jsp" method="post">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required><br>

        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required><br>

        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required><br>

        <label>Sex:</label>
        <input type="radio" id="male" name="sex" value="male" required>
        <label for="male" style="display:inline;">Male</label>
        <input type="radio" id="female" name="sex" value="female" required>
        <label for="female" style="display:inline;">Female</label><br>

        <label for="country">Country:</label>
        <select id="country" name="country" required>
            <option value="India">India</option>
            <option value="Pakistan">Pakistan</option>
            <option value="Afghanistan">Afghanistan</option>
            <option value="Burma">Burma</option>
            <option value="Other">Other</option>
        </select><br>

        <input type="submit" value="Add User">
    </form>

</body>
</html>
