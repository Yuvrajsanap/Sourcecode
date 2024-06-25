<%@ page language="java" %>
<%! int counter = 0; %>
<html>
<body>
    <form method="post">
        <input type="submit" value="Increment Counter" />
    </form>
    <% 
        counter++;
    %>
    <p>Counter: <%= counter %></p>
</body>
</html>
