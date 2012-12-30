# play-subproject
Sandbox to test Play Framework's subproject support in version 2.0.4

This is compiled with Play-2.0.4 and SBT 0.11.3

## Limitations
Play 2.0.x has a limitation which regard to routes. 
Subprojects cannot have routes, so all routes must be defined in the main project.
This limits the usefulness of play subprojects, but doesn't limit applications from 
creating subprojects that are sbt libraries such as a DAO or BLL.

2.10 is around the corner and will support subproject routes.



