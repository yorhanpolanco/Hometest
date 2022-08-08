## Brief Explanation  

In the proposed solution for the automation of the Pet Store API, 4 test cases were created:  

1. Find pets using any valid status (pending, available and sold)  
2. Try to search pets using an invalid status  
3. Add new pet to the store  
4. Delete pet from store using pet id  

The automation environment is composed of:
- TestNG
- REST Assured
- Transfer Object pattern
- Fasterxml Jackson
- Maven Project 

Create a base class to configure REST Assured, it is inherited from my main class that contains the methods to perform the tests. The test cases are designed to validate the status code but the design pattern based on POJO is implemented in the environment so that we can develop test cases to validate the Response.

