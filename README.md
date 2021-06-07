# Spring Boot Message Broker Using ActiveMQ
Trying to send message through POST localhost:8080/produce/message <br>
![screenshot3](screenshot/Screenshot_3.png)
As you can see the message will be save in the ActiveMQ queue <br>
![screenshot4](screenshot/Screenshot_4.png)
We going to get the message by accessing GET localhost:8080/consume/message <br>
![screenshot5](screenshot/Screenshot_5.png)
And then the value number of pending messages in ActiveMQ will be change to zero <br>
![screenshot6](screenshot/Screenshot_6.png)