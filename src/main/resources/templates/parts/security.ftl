<#assign know = Session.SPRING_SECURITY_CONTEXT??>

<#if know>
    <#assign user = Session.SPRING_SECURITY_CONTEXT.authentication.principal
    login = user.getLogin()
    role = user.getRole()>
<#else>
    <#assign login = "unknown"
    role = "GUEST">
</#if>