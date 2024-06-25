<html>
<body>
    <form method="post">
        Enter a number: <input type="text" name="number" />
        <input type="submit" value="Calculate Factorial" />
    </form>
    <% 
        if (request.getParameter("number") != null) {
            int number = Integer.parseInt(request.getParameter("number"));
            int factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
    %>
            <p>Factorial: <%= factorial %></p>
    <% 
        } 
    %>
</body>
</html>
