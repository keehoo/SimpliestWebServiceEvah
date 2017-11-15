<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html lang="en">
<head>

</head>

<body>

  <div>
        <p>${variable}</p>
    </div>

    <div>

 <c:forEach var="list" items="${list}">
     <td>
         <c:out value="${list}" /><br>
     </td>
 </c:forEach>



    </div>


      <div>
            <form action="/" method="POST">
                <div><input name="username" type="text"></div>
                <div><input name="password" type="password"></div>
                <input type="hidden" name="referrer" value="${param.referrer}">

                <input type="submit">
            </form>
        </div>

</body>

</html>