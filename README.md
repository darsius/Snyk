# Snyk

1. Explain the difference between a stack and a queue. Provide real life examples of
real-life scenarios where each of them are used appropriately

- the stack follows the LIFO priniple: last in, first out (the last element to be inserted would be the first one to be removed, the queue follows the FIFO principle: first in, first out (the first element which was added will be the first one to be remved).
- the stack's insertion and deletion are made to one end known as top, whereas the queue has 2 ends, head and tail; head is for deletion and tail for insertion.
- the stack's operations are push and pop, the queue's are enque and dequeue.
- the queue can be circular or double ended queue, whereas stack doesn't have any types.

- An exeample of a stack can be a few books placed one on top of another;
- An example of a queue is the queue created when waiting in the line for buying movie tickets.

2. What is the difference between an array and a linked list? Provide advantages and
disadvantages of each data structure

Differences:
  - arrays contain elements of a certain data type, linked list is a collection of nodes, where node is made of data and the adress to the next node;
  - the arrays size is fixed and can't be uptdated; the length of linked list can be changed because it works with dynamic memory;
  - the elements from the array are independent of each oter. Linked list elements are dependent on each other beacuse each node contains the address of the next node.
  - memory allocated for array happens at the compile time, while for the linked list, at run time;

Avantages of Arrays:
  - accesing an element is fast when knowing it's index: (O(1)) time complexity;
  - can store a variety of data types, from primitive types to objects
  - simple to implement/ work with
Disadvantages of Arrays:
  - can't change it's size
  - insertion, deletion and searching usualy happen in O(n) time, except when the element do be deleted/inserted is the last one, resulting in O(1) time.

Avantages of Linked lists:
  - we don't need to set the initial size
  - insertion and deletion happen in O(1) time because we don't need to shift the elements.
  - efficient memory utilisation
Disadvantages of Linked lists:
  - searching happens in O(n) time
  - we can't traverse it in reverse order, only when using a double linked list;
    
3. What is HTTP? How is it different from HTTPS?
   - HTTP stands for Hypertext Transfer Protocol
   - it is used for requests and responses from the internet
   - the data is transfered between points over the network
   - it contains a version type, an url, a HTTP method, HTTP request headers and an optional body;
   - the HTTP methods are GET, PUT, POST, DELETE 

  - HTTPS is HTTP Secure, meaning that the data sent and received is encrypted. It is used for passing sensitive information from websites.

4. Can you give some examples of common HTTP response codes?
  - 200: succes or ok - the date that was requested has been fetched.
  - 301: permanent redirect: the page has moved to a new URL 
  - 400: bad request: the server doesn't understand the client request.
  - 404: not found: the server can't find anything for the requested url.
  - 500: internal server error: the server ecounters a problem.

5. What is the difference between authorization and authentication?
   - authentication needs user's login details, authorization needs users's security levels;
   - for authentication, the information is transmited through an ID token, whereas for authorization, through Acces Token.
   - authentication Techniques: password based, two factor authentication; Authorization
  Techniques: role based acces control json web token;
    - the authentication credentials can be changed in part as and when required by the user, while the authorization permissions cannot be changed by the user, because the owner of the system is in charge for that.

6. How would you explain to a 5-year-old how the WWW works?
   - WWW comes from the World Wide Web. Imagine it is a giant city made from lego pieces, connectong a lot of lego houses, shops. Each ship is filled with differend lego sets and models, like animas, space rockets or castles.
   - When you want to see a new lego set or instructions for buliding something, you tell your computer - a special lego builder from your own house.
   - THis builder has a super fast lego car;
   - you give instructions to your lego builder about what you want to see. Then, the builder sends the super fast lego car out on the roads of the giant lego city. The car drives around, looking for the right shop that has the lego set or instructions you want.
   - once the right lego shop is found, it picks up the set or the instructions and races back to your house; when it arrives, your lego builder shows you the instructions or the lego set on the screen and you can start building.















  
