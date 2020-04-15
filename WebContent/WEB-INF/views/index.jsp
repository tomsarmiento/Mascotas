<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Make a Pet!</title>
	</head>
	<body>
		<form action="Dogs" method="get" >
			<fieldset>
    			<legend class="dog">Make a Dog!: </legend>
        		Name: <input type="text" name="name">
        		Breed: <input type="text" name="breed">
        		Weight(lb): <input type="number" name="weight">
				<input type="submit" value="Enviar" class="enviar">
			</fieldset>
    	</form>
    	<form action="Cats" method="get">
    		<fieldset>
				<legend class="cat">Make a Cat!</legend>
				Name: <input type="text" name="name">
        		Breed: <input type="text" name="breed">
        		Weight(lb): <input type="number" name="weight">
				<input type="submit" value="Enviar" class="enviar">
			</fieldset>
    	</form>
	</body>
</html>