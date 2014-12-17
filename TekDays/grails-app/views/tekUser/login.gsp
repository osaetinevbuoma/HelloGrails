<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
		<meta name="layout" content="main" />
		<title>Login</title>
	</head>
	
	<body>
		<g:if test="${ flash.message }">
		<div class="message">${ flash.message }</div>
		</g:if>
		
		<g:form action="validate">
		<input type="hidden" name="cName" value="${ cName }" />
		<input type="hidden" name="aName" value="${ aName }" />
		<table>
			<tr class="prop">
				<td class="name">
					<label for="username">User Name:</label>
				</td>
				<td class="value">
					<input type="text" name="username" id="username" />
				</td>
			</tr>
			<tr class="prop">
				<td class="name">
					<label for="password">Password:</label>
				</td>
				<td class="value">
					<input type="password" name="password" id="password" />
				</td>
			</tr>
			<tr class="prop">
				<td></td>
				<td>
					<input type="submit" value="Login" />
				</td>
			</tr>
		</table>
		</g:form>
	</body>
</html>