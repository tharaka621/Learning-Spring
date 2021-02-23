# Learning-Spring

Spring Learning Examples

<h2>DEMO 02 </h2>---------------------------------------------------------------- 

1. Use Proxy to get different instance from the Dependency 
   while getting singale instance from the bean. 

@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)


2. Component scan to scan beans from a different packages 

@ComponentScan("com.BeanComplex.componentscan")    // package_name = com.BeanComplex.componentscan
