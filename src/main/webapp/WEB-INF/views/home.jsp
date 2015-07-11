
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>

<html>
<head>
<title>Home</title>
<link href="${pageContext.request.contextPath}/resources/css/style.css"
	rel="stylesheet">
</head>
<body>
	<h1>User Register</h1>

	<div class="form-style-2">
		<div class="form-style-2-heading">Provide your information</div>
		<form action="" method="post">
			<label for="field1"><span>Name <span class="required">*</span></span><input
				type="text" class="input-field" name="field1" value="" /></label> <label
				for="field2"><span>Email <span class="required">*</span></span><input
				type="text" class="input-field" name="field2" value="" /></label> <label><span>Telephone</span><input
				type="text" class="tel-number-field" name="tel_no_1" value=""
				maxlength="4" />-<input type="text" class="tel-number-field"
				name="tel_no_2" value="" maxlength="4" />-<input type="text"
				class="tel-number-field" name="tel_no_3" value="" maxlength="10" /></label>
			<label for="field4"><span>Regarding</span><select
				name="field4" class="select-field">
					<option value="General Question">General</option>
					<option value="Advertise">Advertisement</option>
					<option value="Partnership">Partnership</option>
			</select></label> <label for="field5"><span>Message <span
					class="required">*</span></span>
			<textarea name="field5" class="textarea-field"></textarea></label> <label><span>&nbsp;</span><input
				type="submit" value="Submit" /></label>
		</form>
	</div>


</body>
</html>
