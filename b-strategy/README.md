# Design patterns training project

## Strategy pattern (Behavioural)

### Intent
Define a family of algorithms, encapsulate each one, and make them interchangeable.
Strategy lets the algorithm vary independently of clients that use it.

### Structurs
![img.png](doc/img.png)

### Example use-case
* Same example use-case used for Template pattern:
  
* Our system offers the functionality to register users.
* We've two kind of users: standard and admin.
* We use a single class to represent both types, as we've a field that indicates the user type.
* The algorithm to create user has the following common steps but with some variants:
    * Validate user existence:
        * Same for both types.
    * Validate call authorization:
        * A standard user could be created for any user with grants to ADD_USERS.
        * An admin user could be created only by admin users.
    * Persist the user:
        * Same for both types.
    * Notify the creation of the user:
        * A standard user creation should be notified by email to the system.
        * An admin user creation should be notified by email and also to an external Admin application.

### Class diagram
![strategy-use-case.png](doc/strategy-use-case.png)