package org.example.topic;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * @author Castle
 * @Date 2021/5/8 15:54
 */
public class Consumer {
    private static String ACTIVEMQ_URL = "tcp://192.168.30.130:61616";
    private static String TOPIC_NAME = "my_topic";

    public static void main(String[] args) {
        ActiveMQConnectionFactory activeMQConnectionFactory = new ActiveMQConnectionFactory(ACTIVEMQ_URL);
        try {
            Connection connection = activeMQConnectionFactory.createConnection();
            connection.start();
            Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            Topic topic = session.createTopic(TOPIC_NAME);
            MessageConsumer consumer = session.createConsumer(topic);
            while (true) {
                TextMessage textMessage = (TextMessage) consumer.receive();
                if (textMessage != null) {
                    System.out.println(textMessage.getText());
                } else {
                    break;
                }
            }
            consumer.close();
            session.close();
            connection.close();
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
