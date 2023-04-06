<%@ include file="common/header.jspf" %>

	<%@ include file="common/navbar.jspf" %>
	<div class="container">
		<h1>Properties</h1>
		<div class="d-flex gap-3 flex-wrap">
			<c:forEach items="${properties}" var="property">
				<div 
					class="bg-secondary rounded text-light p-2 shadow flex-fill"
				>
					<h3>${property.name}</h3>
					<p>${property.description}</p>
					<div class="d-flex justify-content-end">
						Price: 
						<span class="fw-bold">$${property.price}</span>
					</div>
					<div class="bg-light rounded text-black px-1">
						<p>WC:<span class="fw-bold"> ${property.wc}</span></p>
						<p>Parking:<span class="fw-bold"> ${property.parking}</span></p>
						<p>Bedrooms:<span class="fw-bold"> ${property.bedrooms}</span></p>
					</div>
					<div class="d-flex justify-content-end"> 
						<a href="" class="btn btn-primary">More</a>
					</div>
				</div>
			</c:forEach>
		</div>
	</div>

<%@ include file="common/footer.jspf" %>