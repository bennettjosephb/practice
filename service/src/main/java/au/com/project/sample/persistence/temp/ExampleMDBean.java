/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence.temp;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.ejb.MessageDrivenBean;
import javax.ejb.MessageDrivenContext;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

@MessageDriven(activationConfig = {
    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
    @ActivationConfigProperty(propertyName = "destination", propertyValue = "queue/MyQueue"),
    @ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge")},
messageListenerInterface = MessageListener.class)
public class ExampleMDBean implements MessageListener, MessageDrivenBean {

    private static final long serialVersionUID = 1L;

    public ExampleMDBean() {
        // TODO Auto-generated constructor stub
    }

    public void ejbRemove() {
        // TODO Auto-generated method stub
    }

    public void setMessageDrivenContext(MessageDrivenContext arg0) {
        this.setMessageDrivenContext(arg0);
    }

    public void onMessage(Message mess) {
        TextMessage message = (TextMessage) mess;
        try {
            System.out.println("Message Received" + message.getText());
        } catch (Exception e) {
 //           e.printStackTrace();
        }
    }
}