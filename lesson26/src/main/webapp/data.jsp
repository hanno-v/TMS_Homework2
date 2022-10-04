<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<p> Input form:</p>
<p> First name = <%= request.getParameter("fname") %>
</p>
<p> Last name = <%= request.getParameter("lname") %>
</p>
<p> City = <%= request.getParameter("city") %>
</p>
<p> Info = <%= request.getParameter("info") %>
</p>


</body>
</html>
