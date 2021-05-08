package org.example.topic.persistent;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * @author Castle
 * @Date 2021/5/8 16:42
 */
public class PersistConsumer {
    private static String ACTIVEMQ_URL = "tcp://192.168.30.130:61616";
    private static String TOPIC_NAME = "my_topic";

    public static void main(String[] args) {
        ActiveMQConnectionFactory activeMQConnectionFactory = new ActiveMQConnectionFactory(ACTIVEMQ_URL);
        try {
            Connection connection = activeMQConnectionFactory.createConnection();
            connection.setClientID("client1");
            Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            Topic topic = session.createTopic(TOPIC_NAME);
            TopicSubscriber subscriber = session.createDurableSubscriber(topic, "000001");
            connection.start();
            while (true) {
                TextMessage textMessage = (TextMessage) subscriber.receive();
                if (textMessage != null) {
                    System.out.println(textMessage.getText());
                } else {
                    break;
                }
            }
            subscriber.close();
            session.close();
            connection.close();
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
