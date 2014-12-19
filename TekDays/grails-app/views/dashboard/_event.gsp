<span style="text-align:center;">
	<h1>${ event }</h1>
</span>

<table>
	<tr>
		<td>Start Date: <g:formatDate format="MM/dd/yyyy" date="${ event.startDate }" /></td>
		<td>
			<g:if test="${ event.EndDate }">
			End Date: <g:formatDate format="MM/dd/yyyy" date="${ event.EndDate }" />
			</g:if>
		</td>
	</tr>
	<tr>
		<td>Venue: ${ event.venue }</td>
		<td>Number of potential attendees: ${ event.respondents.count() }</td>	
	</tr>
</table>