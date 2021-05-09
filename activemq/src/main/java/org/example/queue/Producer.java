package org.example.queue;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * @author Castle
 * @Date 2021/5/8 11:10
 */
public class Producer {
    private static final String ACTIVEMQ_URL = "tcp://192.168.175.128:61618";
    private static final String QUEUE_NAME = "my_queue";

    public static void main(String[] args) {
        //1.创建连接工厂
        ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory(ACTIVEMQ_URL);

        try {
            //2.获得连接并启动
            Connection connection = connectionFactory.createConnection();
            connection.start();
            //3.获得session,第一个参数是否开启事务，第二个参数是确认方式
            Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            //4. 创建消息目的地（queue或topic）
            Queue queue = session.createQueue(QUEUE_NAME);
            //5.创建消息生产者
            MessageProducer messageProducer = session.createProducer(queue);
            //6.消息生产者发送消息到队列中
            for (int i = 0; i < 3; i++) {
                //7. 生产消息
                TextMessage textMessage = session.createTextMessage("来自生产者的消息" + i);
                //8.发送消息
                messageProducer.send(textMessage);
            }
            //9.关闭资源
            messageProducer.close();
            session.close();
            connection.close();
            System.out.println("消息已经成功发送！");
        } catch (JMSException e) {
            e.printStackTrace();
        }

    }
}
