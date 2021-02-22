# Learning-Spring

Spring Learning Examples

DEMO 02----------------------------------------------------------------

1. Use Proxy to get different instance from the Dependency 
   while getting singale instance from the bean. 

@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)