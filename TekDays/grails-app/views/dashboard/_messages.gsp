<h3>Forum Messages</h3>
<table>
	<thead>
		<tr>
			<th>Author</th>
			<th>Subject</th>
			<th>Content</th>
		</tr>
	</thead>
	<tbody>
		<g:each in="${ messages }" var="message">
		<tr>
			<td>
				<g:link controller="tekUser" action="show" id="${ message.author.id }">${ message.author }</g:link>
			</td>
			<td>${ message.subject }</td>
			<td>
				${ message.content[0..Math.min(message.content.size() - 1, 24)] }
				${ message.content.size() > 25 ? "..." : "" }
			</td>
		</tr>
		</g:each>
	</tbody>
</table>
<g:link controller="tekMessage" action="index" id="${ event.id }">
	View threaded messages for this event
</g:link>