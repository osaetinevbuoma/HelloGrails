<h3>Things to do</h3> <br />
<table>
	<thead>
		<tr>
			<th>Task Title</th>
			<th>Due Date</th>
			<th>Assigned To</th>
		</tr>
	</thead>
	<tbody>
	<g:each in="${ tasks }" var="task">
		<tr>
			<td>${ task.title }</td>
			<td><g:formatDate format="MM/dd/yyyy" date="${ task.dueDate }" /></td>
			<td>${ task.assignedTo }</td>
		</tr>
	</g:each>
	</tbody>
</table>

<g:link controller="task" action="index" id="${ event.id }">
	View all ${ event.tasks.size() } tasks for this event
</g:link>