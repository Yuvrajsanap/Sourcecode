<html>
<body>
    <form method="post">
        <input type="submit" value="Display Array" />
    </form>
    <ul>
        <% 
            String[] fruits = {"Apple", "Banana", "Cherry", "Date", "Elderberry"};
            for (String fruit : fruits) { 
        %>
            <li><%= fruit %></li>
        <% 
            } 
        %>
    </ul>
</body>
</html>
