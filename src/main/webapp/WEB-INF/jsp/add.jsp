<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<div class="container">
	<div class="row">
		<div class="col-md-6 col-md-offset-3">
			<div class="panel panel-primary">
				<div class="panel-heading">Employee Affectation</div>
				<div class="panel-body">
					<form:form method="post" modelAttribute="employee">
						<fieldset class="form-group">
							<form:label path="employeeName">Employee Name</form:label>
							<form:input path="employeeName" type="text" class="form-control"
										required="required" />
							<form:errors path="employeeName" cssClass="text-warning" />
						</fieldset>

						<fieldset class="form-group">
							<form:label path="projectName">Project Name</form:label>
							<form:input path="projectName" type="text" class="form-control"
										required="required" />
							<form:errors path="projectName" cssClass="text-warning" />
						</fieldset>

						<fieldset class="form-group">
							<form:label path="implication">Implication</form:label>
							<form:select path="implication" class="form-control">
								<option value="low">Low</option>
								<option value="medium">Medium</option>
								<option value="high">High</option>
							</form:select>
							<form:errors path="implication" cssClass="text-warning" />
						</fieldset>

						<button type="submit" class="btn btn-success">Affecter Projet</button>
					</form:form>
					<div class="button-group">
						<a href="../../../resources/templates/employees.html" class="btn btn-primary">Employees</a>
						<a href="welcome.jsp" class="btn btn-secondary">Back to Home</a>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<%@ include file="common/footer.jspf"%>
