<#import "parts/common.ftl" as c>
<#import "/spring.ftl" as spring />


<@c.page "Main">
<div class="container-fluid">
	
    <div class="row">
        <div class="col-2 p-0 bg-secondary position-fixed">
          <a class="btn btn-dark btn-block m-0" href="?type=PHONE"><@spring.message "menu.type.phone"/></a>  
		  <a class="btn btn-dark btn-block m-0" href="?type=INTERNET"><@spring.message "menu.type.internet"/></a>
		  <a class="btn btn-dark btn-block m-0" href="?type=CABLE"><@spring.message "menu.type.cable"/></a>
		  <a class="btn btn-dark btn-block m-0" href="?type=IP_TV"><@spring.message "menu.type.ip_tv"/></a>
    	</div>
    	<a class="col-2 btn btn-dark btn-block m-0 fixed-bottom text-white" data-toggle="modal" data-target="#modalDownload"><@spring.message "menu.download"/></a>  

   <div class="col-10 px-0 min-vh-100 offset-2 bg-light ">
   		<div class="content">
    		<div class="container">
        		<div class="row py-4">
		            <#list tariffs as tariff>
				        <div class="col-md-3">
		                <div class="card py-2 px-2">
		                    <div class="card-block">
								<#if .locale == "uk">
			                    		<h5 class="card-title d-flex justify-content-center align-items-center">${tariff.title_uk}</h5>
						        <#else>
			                    		<h5 class="card-title d-flex justify-content-center align-items-center">${tariff.title}</h5>
						        </#if>		                    
		                    
		                    	<small class="card-subtitle text-muted align-items-top d-flex justify-content-center">${tariff.price} uah</small> 
                    			<div class="card-block">
                    			
									
									<#if .locale == "uk">
			                       			<div class="card-text my-2">${tariff.description_uk}</div>
							        <#else>
			                        		<div class="card-text my-2">${tariff.description}</div>
						            </#if>
	                    			
		                		</div>
                			</div>
            			</div>
             			<div class="mt-4"> </div>
             		</div>
     				</#list>       			
           		</div>
			</div>
		</div>
	</div>
 </div>



<!-- Modals -->
<div class="modal fade login" id="modalLogin" tabindex="-1" role="dialog" aria-hidden="true">
  <div class="modal-dialog modal-dialog-centered" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title"><@spring.message "nav.sign_in"/></h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
			<form class="form-horizontal" action="/login" method="post">
				<div class="form-group">
					<i class="fa fa-user"></i>
					<input name="login" type="text" class="form-control" placeholder="Username" required="required">
				</div>
				<div class="form-group">
					<i class="fa fa-lock"></i>
					<input name="password" type="password" class="form-control" placeholder="Password" required="required">					
				</div>
	            <button type="submit" class="btn btn-success"><@spring.message "action.continue"/></button>
				<input type="hidden" name="${_csrf.parameterName}"  value="${_csrf.token}" />
			</form>								
		</div>
    </div>
  </div>
</div>

<div class="modal fade" id="modalRegister" tabindex="-1" role="dialog" aria-hidden="true">
  <div class="modal-dialog modal-dialog-centered" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title"><@spring.message "nav.register"/></h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
			<form class="form-horizontal" action="/registration" method="post">
				<div class="form-group">
					<div class="form-group-inline">
						<i class="fa fa-user"></i>
						<small class="text-secondary"><@spring.message "regex.info.login"/></small>
					</div>
					<input name="login" type="text" class="form-control" placeholder="Username" required="required">
				</div>
				<div class="form-group">
					<div class="form-group-inline">
						<i class="fa fa-lock"></i>
						<small class="text-secondary"><@spring.message "regex.info.password"/></small>
					</div>
					
					<input name="password" type="password" class="form-control" placeholder="Password" required="required">					
				</div>
				
	            <button type="submit" "btn btn-success"><@spring.message "action.continue"/></button>
				<input type="hidden" name="${_csrf.parameterName}"  value="${_csrf.token}" />
			</form>							
	  </div>
    </div>
  </div>
</div>

<div class="modal fade" id="modalDownload" tabindex="-1" role="dialog" aria-hidden="true">
  <div class="modal-dialog modal-dialog-centered" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title">Download</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
			<form class="form-horizontal" action="/download" method="post">
				<h2>Sort by</h2>
				<div class="form-group radio">
				  <label><input type="radio" name="sort" value="title" checked>Title</label>
				  <br>
			 	  <label><input type="radio" name="sort" value="price">Price</label>
				</div>
			
	            <button class="btn btn-success">Download</button>
			</form>								
	  </div>
    </div>
  </div>
</div>


</@c.page>
 