<%@ page language="java" %>
<%! 
    public String toUpperCase(String str) {
        return str.toUpperCase();
    }
%>
<html>
<body>
    <form method="post">
        Enter text: <input type="text" name="text" />
        <input type="submit" value="Convert to Uppercase" />
    </form>
    <% 
        if (request.getParameter("text") != null) {
            String text = request.getParameter("text");
            String upperCaseText = toUpperCase(text);
    %>
            <p>Uppercase Text: <%= upperCaseText %></p>
    <% 
        } 
    %>
</body>
</html>
