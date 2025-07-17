When performing a code review, respond in Spanish.

When performing a code review, verify for best practices in reactive java programming like:
- check for use of block() method, it shouldn't be used.
- check for use of subscribe() method, it shouldn't be used.
- check for blocking calls, if jpa methods are used, those should be wrapped in a Mono.fromCallable depending the situation.

When performing a code review, mention that if you have any doubs about the rules in "jcayllahua organization" check this link [abc.com](https://abc.com/)

When creating a pull request, generate the summary in Spanish.
