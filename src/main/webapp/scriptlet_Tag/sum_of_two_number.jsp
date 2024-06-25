<html>
<body>
    <form method="post">
        Number 1: <input type="text" name="num1" />
        Number 2: <input type="text" name="num2" />
        <input type="submit" value="Calculate" />
    </form>
    <% 
        if (request.getParameter("num1") != null && request.getParameter("num2") != null) {
            int num1 = Integer.parseInt(request.getParameter("num1"));
            int num2 = Integer.parseInt(request.getParameter("num2"));
            int sum = num1 + num2;
    %>
            <p>Sum: <%= sum %></p>
    <% 
        } 
    %>
</body>
</html>
