package org.example.queue;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * @author Castle
 * @Date 2021/5/8 14:40
 */
public class Consumer {
    private static final String ACTIVEMQ_URL = "tcp://192.168.175.128:61618";
    private static final String QUEUE_NAME = "my_queue";

    public static void main(String[] args) {
        //1.获得工厂
        ActiveMQConnectionFactory activeMQConnectionFactory = new ActiveMQConnectionFactory(ACTIVEMQ_URL);
        try {
            //2.获得连接,并打开
            Connection connection = activeMQConnectionFactory.createConnection();
            connection.start();
            //3.获得session
            Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            //4.获得目的地（queue或topic）
            Queue queue = session.createQueue(QUEUE_NAME);
            //5.获得消费者
            MessageConsumer consumer = session.createConsumer(queue);
            while (true) {
                //6.消费者收取消息
                TextMessage textMessage = (TextMessage) consumer.receive();
                if (textMessage != null) {
                    System.out.println(textMessage.getText());
                } else {
                    break;
                }
            }
            //7.资源关闭
            consumer.close();
            session.close();
            connection.close();
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
