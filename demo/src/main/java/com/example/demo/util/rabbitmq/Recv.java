package com.example.demo.util.rabbitmq;
import java.io.IOException;

import com.rabbitmq.client.*;
import com.rabbitmq.client.AMQP.BasicProperties;

public class Recv {
	 
	 /**
	 * 接收消息 不做返回 一个发送方 一个接收方
	 * 在适当的修改下可以实现一个发送方  通过  同一个队列  多个接收方
	 */
	 public void recvSingleMessage() throws Exception {
		 String QUEUE_NAME = "hello";
		 ConnectionFactory factory = new ConnectionFactory();
		 factory.setHost("192.168.203.131");
		 factory.setUsername("admin");
		 factory.setPassword("admin");
		 Connection connection = factory.newConnection();
		 Channel channel = connection.createChannel();
		 channel.queueDeclare(QUEUE_NAME, false, false, false, null);
		 System.out.println(" [*] Waiting for messages. To exit press CTRL+C");
		 
		 //channel.basicQos(1); // accept only one unack-ed message at a time (see below)
		 Consumer consumer=new DefaultConsumer(channel){

			@Override
			public void handleDelivery(String consumerTag, Envelope envelope,
					BasicProperties properties, byte[] body) throws IOException {
				String message = new String(body, "UTF-8");
		        System.out.println(" [x] Received '" + message + "'");
		        //处理消息
		        try{
		        	Thread.sleep(1000*100);
		        }catch(Exception ex){
		        	ex.printStackTrace();
		        }finally{
		        	System.out.println(" [x] Done");
		            channel.basicAck(envelope.getDeliveryTag(), false);
		        }
		        
		        
			}
			 
		 };
		 
		 boolean autoAck = false;
		 channel.basicConsume(QUEUE_NAME, autoAck, consumer);
	 }
	 
	 public static void main(String[] args) throws Exception{
		 new Recv().recvSingleMessage();
	 }
}
