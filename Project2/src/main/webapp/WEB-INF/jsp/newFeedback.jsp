<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<body>
    <h1>Add new feedback</h1>
        
    <form:form modelAttribute="form" action="addNewFeedback">
        <form:errors path="" element="div" />
        <div>
            <form:label path="text">Feedback: </form:label>
            <form:input path="text" />
            <form:errors path="text" />
        </div>
        <div>
            <input type="submit" />
        </div>
    </form:form>
</body>
</html>