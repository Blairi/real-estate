<%@ include file="../common/header.jspf" %>

	<%@ include file="../common/navbar.jspf" %>
		<main class="vh-100 w-100">
			<h1>Dashboard</h1>
			<div class="mt-5 d-flex justify-content-end">
				<a href="/add-property" class="btn btn-primary">Add property</a>
			</div>
			<div class="d-flex gap-3">
				<c:forEach items="${properties}" var="property">
					<div 
						class="bg-secondary rounded text-light p-2 shadow w-25"
					>
						<h5>${property.name}</h5>
						<p>Price: <span class="fw-bold">$${property.price}</span></p>
						<p>Created: <span class="fw-bold">${property.created}</span></p>
						<div class="d-flex gap-3 justify-content-end">
							<a href="/update-property?id=${property.id}" class="btn btn-warning">Edit</a>
							<a href="/delete-property?id=${property.id}" class="btn btn-danger">Delete</a>
						</div>
					</div>
				</c:forEach>
			</div>
		</main>
		

<%@ include file="../common/footer.jspf" %>