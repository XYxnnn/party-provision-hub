<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<%@page import="java.sql.*"%>
<html lang="en" xmlns:th="http://www.thymeleaf.org">

	<head>
		<meta charset="UTF-8">
		<meta name="viewport"
	content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
		<meta http-equiv="X-UA-Compatible" content="ie=edge">
		
		<title> Admin Inventory Management System </title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" 
			  rel="stylesheet" 
			  integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" 
			  crossorigin="anonymous">
		<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.7.0/css/all.css"
	integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ"
	crossorigin="anonymous">
	</head>
	
	
	<body>
		<div class="container">
			<div class="row">
				<div class="col-lg-6 col-md-6 col-sm-6 container justify-content-center card">
					<h1 class="text-center"> Add New Product </h1>
					<div class="card-body">
					
						<form th:action="@{/admin}" th:object="${product}" method="POST">
							<div class="form-group">
								<label> Product Name </label>
								<input
									type="text"
									name="name"
									th:field="*{name}"
									class="form-control"
									placeholder="Enter Product Name" />
							</div>
							
							<br>
							
							<div class="form-group">
								<label for="category"> Product Category </label>
								<select
									name="category_id"
									th:field="*{category_id}"
									class="form-control"
									required/>
								<option selected> Select Product Category </option>
									<forEach var="category" items="${category}">
									<option value="${category.category_id}">${category.category_name}</option>
									</forEach>
							</div>
							
							<br>
							
							<div class="form-group">
								<label> Product Price </label>
								<input
									type="text"
									name="price"
									th:field="*{price}"
									class="form-control"
									placeholder="Enter Product Price" />
							</div>
							
							<br>
							
							<div class="form-group">
								<label> Product Inventory </label>
								<input
									type="text"
									name="inventory_amount"
									th:field="*{inventory_amount}"
									class="form-control"
									placeholder="Enter Product Inventory" />
							</div>
							
							<br>
							
							<div class="form-group">
								<label> Product Rating </label>
								<input
									type="text"
									name="rating"
									th:field="*{rating}"
									class="form-control"
									placeholder="Enter Product Rating" />
							</div>
							
							<br>
							
							<div class="form-group">
								<label> Product Image </label>
								<input
									type="text"
									name="image"
									th:field="*{image}"
									class="form-control"
									placeholder="Enter Product image" />
							</div>
							
							<br>
							
							<div class="form-group">
								<label> Product Description </label>
								<input
									type="text"
									name="description"
									th:field="*{description}"
									class="form-control"
									placeholder="Enter Product description" />
							</div>
							
							<br>
							
							<div class="box-footer">
								<button type="submit" class="btn btn-primary"> Submit </button>
							</div>
							
						</form>
					</div>
				</div>
			</div>
		</div>
	</body>
</html>