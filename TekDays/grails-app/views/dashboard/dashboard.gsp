<html>
	<head>
		<title>TekDays - Dashboard</title>
		<meta name="layout" content="main" />
	</head>
	<body>
		<div class="nav" role="navigation">
			<ul>
				<li><a href="${ createLink(uri: "/") }" class="home">Home</a></li>
				<li><g:link controller="task" action="create" class="create">Create Task</g:link></li>
				<li><g:link controller="sponsorship" action="create" class="create">Add Sponsor</g:link></li>
				<li><g:link controller="sponsor" action="index" class="list">All Sponsors</g:link></li>
			</ul>
		</div>
	
		<div id="event" style="margin: 10px 10px 10px 10px">
			<g:render template="event" model="['event': event]" />
		</div>
		
		<div id="tasks" style="margin: 10px 10px 10px 10px">
			<g:render template="tasks" model="['tasks': tasks]" />
		</div>
		
		<div id="volunteers" style="margin: 10px 10px 10px 10px">
			<g:render template="volunteers" model="['volunteers': volunteers]" />
		</div>
		
		<div id="messages" style="margin: 10px 10px 10px 10px">
			<g:render template="messages" model="['messages': messages]" />
		</div>
		
		<div id="sponsors" style="margin: 10px 10px 10px 10px">
			<g:render template="sponsors" model="['sponsorships': sponsorships]" />
		</div>
	</body>
</html>