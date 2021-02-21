

@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE,
		proxyMode = ScopedProxyMode.TARGET_CLASS)
		
When trying to get a bean and one of it's dependency is a Protoype, we can use above code	

Output: New instance evrytime from the jdbc Connection dependency	