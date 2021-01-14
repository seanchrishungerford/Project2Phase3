<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>

<h1>Feedback page</h1>
<ul>
<c:forEach items="${feedback}" var="feedback">
   <li>${feedback.id}</li>
   <li>${feedback.text}</li>
</c:forEach>
</ul>
</body>
</html>