package org.example.queue;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;
import java.io.IOException;

/**
 * @author Castle
 * @Date 2021/5/8 15:15
 */
public class AsyncConsumer {
    private static final String ACTIVEMQ_URL = "tcp://192.168.30.130:61616";
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
            consumer.setMessageListener(new MessageListener() {
                public void onMessage(Message message) {
                    if (message != null && message instanceof TextMessage) {
                        TextMessage textMessage = (TextMessage) message;
                        try {
                            System.out.println(textMessage.getText());
                        } catch (JMSException e) {
                            e.printStackTrace();
                        }
                    }
                }
            });
            //防止主线程快速关闭
            System.in.read();
            //7.资源关闭
            consumer.close();
            session.close();
            connection.close();
        } catch (JMSException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
