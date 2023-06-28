# SLM-Test_XXXX
Software Lifecycle Management
Factorial
Your client wants you to write an API that calculates the factorial of a non-negative integer. 
The digit sum is the product of all positive integers less than or equal to the number. E.g., 5!
→ 5 * 4 * 3 * 2 * 1 = 120. The API should also add up all the factorials (since the application 
was (re)started, no need to use a database).
Project
You should implement a REST-based server in Java (use Spring Boot). The service should 
be able to return the desired information using REST.
Requirements
Use GitHub for the project and follow the correct SLM procedure. Use a Kanban board to 
manage your User Stories and use a git branching model to manage your code. Track your 
development process by updating your Kanban board and write at least one unit tests for 
every requirement. A Continuous Integration pipeline that tests the code and produces the 
finished software artifact should be implemented as well. Document
• the whole process
• the user stories
• the repository URL (mandatory)
• the usage of the software
in a file with explanatory text. Submit the code (including the .git folder and .github files) as a 
zip file (please put the Docs inside the zip file).
You can use external resources as long as you mark them: “ // taken from: <URL> ”

References
Route Examples: 
api/factorial/total → 0
api/factorial?number=5 → 120
api/factorial?number=4 → 24
api/factorial/total → 144
