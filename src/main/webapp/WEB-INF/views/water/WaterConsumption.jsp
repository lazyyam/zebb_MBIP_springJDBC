<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" isELIgnored="false" %>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    <%@ include file="/WEB-INF/views/common/auth.jsp" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Water Page</title>
    <link rel="stylesheet" type="text/css" href="/static/water/css/water.css">
    <script src="/static/water/js/water.js"></script>
</head>
<body>
    <%@ include file="/WEB-INF/views/common/include-first.jsp" %> 
    <%@ include file="/WEB-INF/views/common/header.jsp" %> 

    <div class="page-wrapper" id="main-wrapper" data-layout="vertical" data-navbarbg="skin6"
                    data-sidebartype="full" data-sidebar-position="fixed" data-header-position="fixed">
                    <main>
                        <div class="main-content">
                            <%@ include file="/WEB-INF/views/common/userSideBar.jsp" %>
                            <div class="right-container">
                                <div class="container-fluid">
                                    <div class="card">
                                        <div class="card-body">
                                            <h1>Water bill</h1>
                                            <p>Please enter the water bill data values</p>
                                            <c:choose>
                    <c:when test="${mode eq 'add'}">
                        <c:set var="action" value="/water/addWaterData" />
                        <div class="form">
                            <form action="${action}" method="post" onsubmit="return validateForm()">
                                <label for="usage">Usage (m³):</label>
                                <input type="text" id="waterusage" name="waterusage" required>
                                
                                <label for="days">Days:</label>
                                <input type="text" id="days" name="days" required>
                                
                                <label for="proportion">Proportion Factor (day):</label>
                                <input type="text" id="proportion_factor" name="proportion_factor"  required>
                                
                                <label for="amount">Amount (RM):</label>
                                <input type="text" id="amount" name="amount" required>
                        
                                <label for="month">Month:</label>
                                <select id="month" name="month" required>
                                    <option value="January">January</option>
                                    <option value="February">February</option>
                                    <option value="March">March</option>
                                    <option value="April">April</option>
                                    <option value="May">May</option>
                                    <option value="June">June</option>
                                    <option value="July">July</option>
                                    <option value="August">August</option>
                                    <option value="September">September</option>
                                    <option value="October">October</option>
                                    <option value="November">November</option>
                                    <option value="December">December</option>
                                </select>
                        
                                <div class="button">
                                    <button type="submit" class="next-button">Next</button>
                                </div>
                            </form>
                        </div>
                    </c:when>
                    <c:otherwise>
                        <c:set var="action" value="/water/editWaterData" />
                        <div class="form">
                            <form action="${action}" method="post" onsubmit="return validateForm()">
                                <label for="usage">Usage (m³):</label>
                                <input type="text" id="waterusage" name="waterusage" value="${param.waterusage}" required>

                                <label for="days">Days:</label>
                                <input type="text" id="days" name="days" value="${param.days}" required>

                                <label for="proportion">Proportion Factor (day):</label>
                                <input type="text" id="proportion_factor" name="proportion_factor" value="${param.proportion_factor}" required>

                                <label for="amount">Amount (RM):</label>
                                <input type="text" id="amount" name="amount" value="${param.amount}" required>

                                <input type="hidden" id="month" name="month" value="${water.getMonth()}" required>
                        
                        
                                <div class="button">
                                    <button type="submit" class="next-button">Next</button>
                                </div>
                            </form>
                        </div>
                    </c:otherwise>
                </c:choose>


</body>
</html>
