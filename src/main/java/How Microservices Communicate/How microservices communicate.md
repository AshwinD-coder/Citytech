- Types of microservices communication:
	1. Synchronous communication (Blocking)
	2. Asynchronous communication (Non-Blocking)
1. ***Synchronous communication (Blocking)***:
	 A microservice makes a call to another microservice and blocks operation, while waiting for the response. This communication can be achieved by using a REQUEST RESPONSE communication that can be implemented with the help REST, GraphQL, gRPC over HTTP.
	 **Advantages**:
	 - Fulfill the business logic by requesting data and waiting for response.
	 - Minimizes scope of miscommunication
	 **Disadvantages**:
	- Time complexity can be high if there are multiple services that rely on REQUEST RESPONSE.
![[Synchronous communication using REQUEST RESPONSE.png]]
1. ***Asynchronous communication (Non-Blocking)***:
	 The microservice emitting a call is able to carrying processing whether or not the call is received.
	 There are two types of  asynchronous communication:
		 1.Single Receiver message based communication (one to one queue model)
		 2.Multiple Receiver message based communication (one to many topic model)
		 
	 -**Request Response**: 
	 In asynchronous communication using a request response communication, a service requests data to another service but does not wait for the response. A service requesting data can continue its operation even if it does not receive a response.It is achieved using a asynchronous protocol called AMQP.
	 ![[Async Request Response.png]]
	 -**Event Driven** : 
	 In case of Event driven architectures, we rely on message systems that can be queue based or topic based. Messages are sent through asynchronous protocols like AMQP over message broker systems like Kafka and Rabbitmq.
	 A upstream service publishes an event to a particular topic into a message system then the downstream services subscribing the upstream service uses the event. The advantage of this communication is that the system becomes hugely decoupled. The downside is that this system communication is complex to manage.
	 ![[Queue based async communication.png]]
	 ![[Topic based async cimmunication.png]]
	 -**Shared Databases** : 
	Shared Databases communication must follow constraint of one service to read the data from the database and another service to write into the database. When services perform both read/write operations in database , the implementation of shared database communication is not useful. This type of communication is used for data leak use cases where many services are writing into a database and another service reads data from that database. 
