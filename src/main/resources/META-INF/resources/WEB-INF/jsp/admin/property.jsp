<%@ include file="../common/header.jspf" %>

	<%@ include file="../common/navbar.jspf" %>
		<main class="vh-100 w-100">
			<h1>New property</h1>
			<div class="d-flex justify-content-start">
				<a href="/dashboard" class="btn btn-danger">Back</a>
			</div>
			<div class="d-flex justify-content-center">
			<form class="w-50" method="POST" action="add-property">
  				<div class="form-group">
    				<label for="name">Name:</label>
    				<input type="text" class="form-control" id="name" name="name" required>
  				</div>
  				<div class="form-group">
    				<label for="price">Price:</label>
    				<input type="number" class="form-control" id="price" name="price" required>
  				</div>
  				<div class="form-group">
    				<label for="description">Description:</label>
    				<textarea class="form-control" id="description" name="description" rows="3" required></textarea>
  				</div>
  				<div class="form-group">
    				<label for="bedrooms">Bedrooms:</label>
    				<input type="number" class="form-control" id="bedrooms" name="bedrooms">
  				</div>
  				<div class="form-group">
    				<label for="wc">WC:</label>
    				<input type="number" class="form-control" id="wc" name="wc">
  				</div>
  				<div class="form-group">
    				<label for="parking">Parking:</label>
    				<input type="number" class="form-control" id="parking" name="parking">
  				</div>
  				<div class="form-group">
    				<label for="created">Created:</label>
    				<input type="date" class="form-control" id="created" name="created" required>
  				</div>
  				<div class="d-flex justify-content-end mt-2">
  					<button type="submit" class="btn btn-success">Publish</button>
  				</div
			</form>
			</div>
			
		</main>
		

<%@ include file="../common/footer.jspf" %>