# Learning-Spring

<h1>Spring Learning Examples</h1>


<h3>DEMO *********************************</h3>

<h4>AutowireDemo02_Qualifier</h4>

1. <b>@Qulifier</b>  : Use to search(Autowired) the specific dependency 

2. <b>@PostConstruct</b> : use to do certain things before creating the beans 

2. <b>@PreDestroy</b> : use to do certain things after destroy the beans 



<h3>DEMO 02 *********************************</h3>

1. Use Proxy to get different instance from the Dependency 
   while getting singale instance from the bean. 

<b>@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)</b>

-------------------------------------------------------------------------------------------------------------

2. Component scan to scan beans from a different packages 

<b>@ComponentScan("com.BeanComplex.componentscan")</b>    // package_name = com.BeanComplex.componentscan

-------------------------------------------------------------------------------------------------------------

3. CDI - context and dependency injection ( Alternate for Spring)

<b>@Inject</b> (@Autowired)
<b>@Named</b>   (@Component , @Qualifier)
<b>@Singleton</b> (Defines a scope of songleton)
