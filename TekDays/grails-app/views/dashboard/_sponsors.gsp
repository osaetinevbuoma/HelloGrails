<h3>Sponsors</h3> <br />
<table>
	<thead>
		<tr>
			<th>Name</th>
			<th>Website</th>
			<th>Contribution</th>
		</tr>
	</thead>
	<tbody>
		<g:each in="${ sponsorships }" var="s">
		<tr>
			<td>
				<g:link controller="sponsor" action="show" id="${ s.sponsor.id }">${ s.sponsor.name }</g:link>
			</td>
			<td><a href="${ s.sponsor.website }">${ s.sponsor.website }</a></td>
			<td>${ s.contributionType }</td>
		</tr>
		</g:each>
	</tbody>
</table>