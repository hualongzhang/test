package com.example.demo.util.rabbitmq;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class Send {
	
	/**
	 * 发送消息 不接收应答  一个发送方 一个接收方
	 * @throws Exception
	 */
	public void sendSingleMessage() throws Exception{
		 String QUEUE_NAME = "hello";
		 ConnectionFactory factory = new ConnectionFactory();
		 factory.setHost("192.168.203.131");
		 factory.setUsername("admin");
		 factory.setPassword("admin");
		 Connection connection = factory.newConnection();
		 Channel channel = connection.createChannel();
		 channel.queueDeclare(QUEUE_NAME, false, false, false, null);		 
		 String message = "Hello World!";
		 channel.basicPublish("", QUEUE_NAME, null, message.getBytes());
		 System.out.println(" [x] Sent '" + message + "'");
		 channel.close();
		 connection.close();
	}
	
	
	public static void main(String[] args) throws Exception{
			new Send().sendSingleMessage();
	}
}
