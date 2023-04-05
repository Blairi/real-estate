<%@ include file="../common/header.jspf" %>

	<%@ include file="../common/navbar.jspf" %>
		<main class="vh-100 w-100">
			<h1>New property</h1>
			<div class="d-flex justify-content-start">
				<a href="/dashboard" class="btn btn-danger">Back</a>
			</div>
			<div class="d-flex justify-content-center">
				<form:form cssClass="w-50" method="POST" modelAttribute="property">
				
  					<fieldset class="mb-3">
    					<form:label path="name">Name:</form:label>
    					<form:input type="text" path="name" required="required" />
  					</fieldset>
  					
  					<fieldset class="mb-3">
    					<form:label path="price">Price:</form:label>
    					<form:input type="number" path="price" required="required" />
  					</fieldset>
  					
  					<fieldset class="mb-3">
						<form:label path="description">Description</form:label>
						<form:input type="text" path="description" required="required" />
					</fieldset>
					
					<fieldset class="mb-3">
    					<form:label path="wc">WC:</form:label>
    					<form:input type="number" path="wc" required="required" />
  					</fieldset>
  					
  					<fieldset class="mb-3">
    					<form:label path="bedrooms">Bedrooms:</form:label>
    					<form:input type="number" path="bedrooms" required="required" />
  					</fieldset>
  					
  					<fieldset class="mb-3">
    					<form:label path="parking">Parking:</form:label>
    					<form:input type="number" path="parking" required="required" />
  					</fieldset>
  					
  					<fieldset class="mb-3">
						<form:label path="created">Created</form:label>
						<form:input type="date" path="created" required="required" />
					</fieldset>
					
					<input type="submit" class="btn btn-success"/>
  					
  				</form:form>
			</div>
			
		</main>
		

<%@ include file="../common/footer.jspf" %>