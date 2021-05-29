<#include "security.ftl">
<#import "/spring.ftl" as spring />

<nav class="navbar navbar-light bg-dark">
	<a href="#" class="navbar-brand text-light"><@spring.message "nav.home"/></a>
	
	<form class="form-inline">
	
        <a class="mr-sm-2" href="?lang=uk"><@spring.message "nav.lang.uk"/></a>
        <a class="mr-sm-2" href="?lang=en">Eng</a>
    
    	<#if login!="none">
            <a class="btn btn-dark text-muted mr-sm-2" href="/logout"><@spring.message "nav.sign_out"/></a>
			<a class="btn btn-dark mr-sm-2" href="/profile"><@spring.message "nav.profile"/></a>
        <#else>
	        <a class="btn btn-dark mr-sm-2" data-toggle="modal" data-target="#modalRegister" href="#"><@spring.message "nav.register"/></a>
			<a class="btn btn-success mr-sm-2"  data-toggle="modal" data-target="#modalLogin"><@spring.message "nav.sign_in"/></a>
		</#if>	     
		            
	</form>
</nav>

