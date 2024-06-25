<html>
<body>
    <form method="post">
        Enter some text: <input type="text" name="text" />
        <input type="submit" value="Check" />
    </form>
    <% 
        if (request.getParameter("text") != null) {
            String text = request.getParameter("text");
            if (text.isEmpty()) {
    %>
                <p>The text field is empty.</p>
    <% 
            } else {
    %>
                <p>You entered: <%= text %></p>
    <% 
            }
        } 
    %>
</body>
</html>
