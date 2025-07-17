When performing a code review, respond in Spanish.

When performing a code review, verify for best practices in reactive java programming like:
- check for use of block() method, it shouldn't be used.
- check for use of subscribe() method, it shouldn't be used.
- check for blocking calls, if jpa methods are used, those should be wrapped in a Mono.fromCallable depending the situation.
- check for the use of @RequiredArgsConstructor for dependency injection instead of @Autowired.
- check that catchs blocks have a log to show the error and with the format of "log.error(message, methodCall, error)".
- check for the use of "SELECT *" in SQL queries, it shouldn't be used.
- check for the use of stored procedures, these shouldn't be used.
- check for deep nesting in the methods, it shouldn't have more than 3 nesting levels.

When performing a code review, mention that if you have any doubs about the rules in "jcayllahua organization" check this link [abc.com](https://abc.com/)

When creating a pull request, generate the summary in Spanish.
