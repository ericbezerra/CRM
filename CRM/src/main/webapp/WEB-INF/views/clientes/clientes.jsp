
<!-- Content Header (Page header) -->
<section class="content-header">
	<h1>
		Dashboard <small>Clientes</small>
	</h1>
	<div class="row">
		<div class="col-xs-12">
			<div class="box">

				<div class="box-header">
					<h3 class="box-title">Clientes</h3>
					<div class="box-tools">

						<div class="input-group" style="width: 150px;">
							<input type="text" name="table_search"
								class="form-control input-sm pull-right" placeholder="Buscar">
							<div class="input-group-btn">
								<a href="#"><button class="btn btn-sm btn-default">
										<i class="fa fa-search"></i>
									</button></a>
							</div>
						</div>

					</div>
				</div>
				<!-- /.box-header -->

				<div class="box-body table-responsive no-padding">
					<table class="table table-hover">
						<tr>
							<th>CNPJ</th>
							<th>Razão Social</th>
							<th>Nome Fantasia</th>
							<th>Inscrição Estadual</th>
							<th>Contato</th>
						</tr>
						<c:forEach items="${clientes}" var="cliente">
							<tr>
								<td>${cliente.cnpj}</td>
								<td>${cliente.razaoSocial}</td>
								<td>${cliente.nomeFantasia}</td>
								<td>${cliente.inscricaoEstadual}</td>
								<td>${cliente.idContato}</td>
							</tr>
						</c:forEach>
					</table>

					<div class="box-footer clearfix">
						<ul class="pagination pagination-sm no-margin pull-right">
							<li><a href="#">&laquo;</a></li>
							<li><a href="#">1</a></li>
							<li><a href="#">2</a></li>
							<li><a href="#">3</a></li>
							<li><a href="#">&raquo;</a></li>
						</ul>
					</div>

				</div>
				<!-- /.box-body -->
			</div>
			<!-- /.box -->
		</div>
	</div>
</section>
