package org.example.topic.persistent;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * @author Castle
 * @Date 2021/5/8 16:42
 */
public class PersistProducer {
    private static String ACTIVEMQ_URL = "tcp://192.168.30.130:61616";
    private static String TOPIC_NAME = "my_topic";

    public static void main(String[] args) {
        //1. 获取activemq连接工厂
        ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory(ACTIVEMQ_URL);
        try {
            //2.创建连接
            Connection connection = connectionFactory.createConnection();
            //3.获取session
            Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            //4.创建目的地-topic
            Topic topic = session.createTopic(TOPIC_NAME);
            //5.创建消息发布者
            MessageProducer producer = session.createProducer(topic);
            //设置持久化
            producer.setDeliveryMode(DeliveryMode.PERSISTENT);
            //启动连接
            connection.start();
            for (int i = 0; i < 3; i++) {
                //6. 创建消息
                TextMessage textMessage = session.createTextMessage("这是来自生产者的持久化topic信息" + i);
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
