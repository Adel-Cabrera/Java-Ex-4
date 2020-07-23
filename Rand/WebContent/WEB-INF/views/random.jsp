<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/5.0.0-alpha1/css/bootstrap.min.css" integrity="sha384-r4NyP46KrjDleawBgD5tp8Y7UzmLA05oM1iAEQ17CSuDqnUK2+k9luXQOfXJCJ4I" crossorigin="anonymous">	
<!--     <link rel="stylesheet" href="./css/style.css"> -->
<!--     <script src="./js/script.js"></script>  -->
    
    <title>Rand</title>
</head>
<body>
  	
<%--   	<p> <c:out value="${ count }"></c:out> </p> --%>
<%--   	<p> <c:out value="${ password }"></c:out> </p> --%>
<%--   	<p> <c:out value="${ date }"></c:out> </p> --%>
  	
  	
  	<div class="container text-center mt-5">
  		<h2> You have generated a word <span> <c:out value="${ count }"></c:out> </span> times.</h2>
  		<div class="border border-dark mx-5 mt-5">
  			<p class="font-weight-bold"> <c:out value="${ password }"></c:out> </p>
  		</div>
  	</div>
  	
  	<div class="container text-center my-5">
  	   	<a type="button" href="/Rand/Random" class="btn btn-light">Generate</button> </a>
  	</div>
  	
  	<div class="container text-center">
  		<h2> The last time you generated a word was:</h2>
  		<div class="border border-dark mx-5 mt-5">
  			<p class="font-weight-bold"> <c:out value="${ date }"></c:out> </p>
  		</div>
  	</div>  	
  	
  	
  	

</body>
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/5.0.0-alpha1/js/bootstrap.min.js" integrity="sha384-oesi62hOLfzrys4LxRF63OJCXdXDipiYWBnvTl9Y9/TRlw5xlKIEHpNyvvDShgf/" crossorigin="anonymous"></script>
</html>