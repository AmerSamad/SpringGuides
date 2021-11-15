Modeling data as POJOs
@RestController = To be used on top of the class that will contain api endpoints methods
Each of the methods will have a type of endpoint annotation ex: @GetMapping @PostMapping or @RequestMapping(method=GET) or @RequestMapping(method=POST)

@RequestParam(value = "VARIABLE_NAME", defaultValue = "Default value") String VARIABLE_NAME: Used to accept URL params
