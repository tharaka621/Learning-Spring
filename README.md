# Learning-Spring

<h1>Spring Learning Examples</h1>

<h2>DEMO 02 </h2>

1. Use Proxy to get different instance from the Dependency 
   while getting singale instance from the bean. 

<b>@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)</b>

-------------------------------------------------------------------------------------------------------------

2. Component scan to scan beans from a different packages 

<b>@ComponentScan("com.BeanComplex.componentscan")</b>    // package_name = com.BeanComplex.componentscan
