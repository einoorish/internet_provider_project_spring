<#include "security.ftl">
<#import "/spring.ftl" as spring />

<nav class="navbar navbar-light bg-dark">
	<a href="#" class="navbar-brand text-light"><@spring.message "nav.home"/></a>
	
	<form class="form-inline">
	
        <a class="mr-sm-2" href="?lang=uk"><@spring.message "nav.lang.uk"/></a>
        <a class="mr-sm-2" href="?lang=en">Eng</a>
    
    
		<a class="btn btn-dark mr-sm-2" href="#"><@spring.message "nav.register"/></a>
		<a class="btn btn-success mr-sm-2" href="#"><@spring.message "nav.sign_in"/></a>
		     
		            
	</form>
</nav>

