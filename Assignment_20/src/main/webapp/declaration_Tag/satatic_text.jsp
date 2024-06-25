<%@ page language="java" %>
<%! static String staticMessage = "This is a static message"; %>
<html>
<body>
    <form method="post">
        <input type="text" name="newMessage" />
        <input type="submit" value="Update Message" />
    </form>
    <% 
        if (request.getParameter("newMessage") != null) {
            staticMessage = request.getParameter("newMessage");
        }
    %>
    <p>Message: <%= staticMessage %></p>
</body>
</html>
