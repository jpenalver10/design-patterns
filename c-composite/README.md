# Design patterns training project

## Composite pattern (Structural)

### Intent
Compose objects into tree structures to represent part-whole hierarchies.
Composite lets clients treat individual objects and compositions of objects
uniformly.

### Structure
![img.png](doc/img.png)

### Example use-case
* Real use-case extracted from Chat project: Chat user provisioning.
* https://portal.wkts.eu/pages/viewpage.action?pageId=88980611
* Develop a flow to provision users into the chat provider following this flow:
![flow.png](doc/flow.png)
  
### Abstracting from the flow: tree structure
![tree.png](doc/tree.png)


### Class diagram
![strategy-use-case.png](doc/strategy-use-case.png)