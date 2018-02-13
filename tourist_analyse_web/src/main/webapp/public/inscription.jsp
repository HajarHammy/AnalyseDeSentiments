<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="d"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Application Analyse de sentiments</title>
</head>
<body>
	<h2>Inscription</h2>

		<s:form action="addUser" method="post">

			<div class="type-text">
				<s:textfield label="Nom:" name="user.nomUser" />
				<s:textfield label="Email:" name="user.mail" />
				<s:textfield label="Mot de passe:" name="user.motPasse" />
			</div>

			<sj:submit value="Enregistrer" />

		</s:form>
	
</body>
</html>