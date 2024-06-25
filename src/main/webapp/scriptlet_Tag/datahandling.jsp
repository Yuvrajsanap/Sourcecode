<html>
<body>
    <%
        String username = (String) session.getAttribute("username");
    %>
    <form method="post">
        Username: <input type="text" name="username" value="<%= username != null ? username : "" %>" />
        <input type="submit" value="Submit" />
    </form>
    <%
        if (request.getParameter("username") != null) {
            session.setAttribute("username", request.getParameter("username"));
    %>
            <p>Username saved in session: <%= request.getParameter("username") %></p>
    <%
        }
    %>
</body>
</html>
