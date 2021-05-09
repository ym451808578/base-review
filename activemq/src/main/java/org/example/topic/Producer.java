package org.example.topic;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * @author Castle
 * @Date 2021/5/8 15:44
 */
public class Producer {
    private static String ACTIVEMQ_URL = "tcp://192.168.175.128:61618";
    private static String TOPIC_NAME = "my_topic";

    public static void main(String[] args) {
        //1. 获取activemq连接工厂
        ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory(ACTIVEMQ_URL);
        try {
            //2.创建连接并启动
            Connection connection = connectionFactory.createConnection();
            connection.start();
            //3.获取session
            Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            //4.创建目的地-topic
            Topic topic = session.createTopic(TOPIC_NAME);
            //5.创建消息发布者
            MessageProducer producer = session.createProducer(topic);
            for (int i = 0; i < 3; i++) {
                //6. 创建消息
                TextMessage textMessage = session.createTextMessage("这是来自生产者的topic信息" + i);
                //7.发布消息
                producer.send(textMessage);
            }
            producer.close();
            session.close();
            connection.close();
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
