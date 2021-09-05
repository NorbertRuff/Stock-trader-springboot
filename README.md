# Stock-trader-springboot

Assignment: Stock Trader app in Spring Boot
Your task will be to refactor the code of the previous Stock Trader app to use Spring (do this previous assignment first!).

Your task is to rewrite your app to use Spring in a separate branch or repo. The stocks query should be accessible via an HTTP GET endpoint at /buy/<stock>/<price> instead of the console. Note that converting to Spring will break the tests, but it's OK for now we will discuss how to do unit testing in Spring later.

Hints:

Use @Component or its sub-annotations to instruct Spring to create an instance at the beginning (= put it in Spring's DI container), you do not need to instantiate your components. Spring will automatically find the constructor parameters if they are in its DI container.
Put all your code in packages that are under the main @SpringBootApplication class, Spring only scans these classes.
  
Do not put the @SpringBootApplication class in the root package, this will cause Spring to try to DI itself and fail.
