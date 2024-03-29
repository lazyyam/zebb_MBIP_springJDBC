<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <link rel="stylesheet" href="static/user/css/home.css">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Home</title>
        
    </head>
    <body>
        <div class="body-container">
            <div class="login-container">
                <div class="logintitle">Register</div>
                <form action="registervalidation" method="post" onsubmit="return validateForm()"><hr>
                    <div class="input-container">
                        <input type="text" id="username" name="username" placeholder="Username" required>
                        <input type="text" id="email" name="email" placeholder="Email" required>
                        <input type="password" id="password" name="password" placeholder="Password" required>
                        <c:if test="${not empty error}">
                        <div class="error">
                            ${error}
                        </div>
                      </c:if>
                  <button id="submitbutton" type="submit">Submit</button>
                  <div class="log-container">Already Have An Account? <a href="editprofile">Log In</a></div>
                </div>
                </form>
              </div>
        </div>
    </body>
</html>
<script>
    function validateForm() {
        var username = document.getElementById("username").value;
        var email = document.getElementById("email").value;
        var password = document.getElementById("password").value;

        if (username.length < 6) {
            alert("Username must be at least 6 characters");
            return false;
        }

        var emailRegex = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,3}$/;
    if (!emailRegex.test(email)) {
        alert("Invalid email format");
        return false;
    }

    if (password.length < 6) {
        alert("Password must be at least 6 characters");
        return false;
    }
        return true;
    }
</script>