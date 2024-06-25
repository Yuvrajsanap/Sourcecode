<html>
<body>
    <form method="post">
        Enter your name: <input type="text" name="name" />
        <input type="submit" value="Submit" />
    </form>
    <% 
        String name = request.getParameter("name");
    %>
    <p>Your name is: <%= name != null ? name : "unknown" %></p>
</body>
</html>
