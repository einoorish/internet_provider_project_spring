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
    	<a class="col-2 btn btn-dark btn-block m-0 fixed-bottom text-white"><@spring.message "menu.download"/></a>  
    
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







</@c.page>
 