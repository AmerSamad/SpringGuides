@JsonIgnoreProperties(ignoreUnknown = true) annotation ignores any properties that are not bound
in the Class. If class is modeled after a response from an API endpoint, it will ignore any property names
that are not available in the class

@JsonProperty annoataion can be used to manually bind properties if different names are to be used.

We create two @Bean methods when the application starts so we can interact with the webservice and
get the data. One bean creates a RestTemplate which is (i think) injected into the other bean
with takes in a RestTemplate parameter and interacts with the endpoint.
