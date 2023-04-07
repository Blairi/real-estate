<%@ include file="common/header.jspf" %>

	<%@ include file="common/navbar.jspf" %>
		<main class="vh-100">
			<h1>${property.name}</h1>
			<div class="d-md-flex">
				<div class="g-col-4">
					<p>
						${property.description}
					</p>
					<p>
						WC: ${property.wc}
					</p>
					<p>
						Parking: ${property.parking}
					</p>
					<p>
						Bedrooms: ${property.bedrooms}
					</p>
					<p>
						Price: $${property.price}
					</p>
				</div>
				<div class="g-col-4">
					<img 
						class="img-fluid"
						src="/img/sa-rapita-g22768c266_1280.jpg" 
					>
				</div>
			</div>
			
		</main>
		

<%@ include file="common/footer.jspf" %>