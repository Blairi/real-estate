<%@ include file="../common/header.jspf" %>

	<%@ include file="../common/navbar.jspf" %>
		<main class="vh-100 w-100">
			<h1>Dashboard</h1>
			<div class="mt-5 d-flex justify-content-end">
				<a href="/add-property" class="btn btn-primary">Add property</a>
			</div>
			<c:forEach items="${properties}" var="property">
				<p>${property.name}</p>
			</c:forEach>
		</main>
		

<%@ include file="../common/footer.jspf" %>