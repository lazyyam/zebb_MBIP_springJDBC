<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" isELIgnored="false" %>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<%@ include file="/WEB-INF/views/common/auth.jsp" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Upload Water Bill Page</title>
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
                                            <p>Please enter your water bill as proof</p>
                                            <div class="example">
                                                <img src="/static/water/asset/waterbill.png" alt="Example Picture">
                                                <p></p>
                                                <p></p>
                                            </div>
                            
                                            <c:choose>
                                                <c:when test="${mode eq 'add'}">
                                                    <c:set var="action" value="/water/uploadWaterImage" />
                                                </c:when>
                                                <c:otherwise>
                                                    <c:set var="action" value="/water/editWaterImage" />
                                                </c:otherwise>
                                            </c:choose>
                            
                                            <div class="upload">
                                                <form action="${action}" method="post" enctype="multipart/form-data" id="uploadForm" onsubmit="return validateUpload()">
                                                    <input type="file" style="width: 50em;" name="file" id="file" accept=".pdf, .png, .jpg, .jpeg" value="${water.getImageName()}"required>
                                                    <input type="submit" style="width: 50em;" name="submit" value="Upload">
                                                    <p class="upload-info"><span class="exclamation-sign">! </span>  Filetype should be pdf. File size should not exceed 2 MB <span class="exclamation-sign">!</span></p>
                            
                                                </form>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </main>
                </div>
</body>
</html>
