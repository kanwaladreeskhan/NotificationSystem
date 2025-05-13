 
package notificationsystem;
 
public class Push implements SendNotifications{
     @Override
    public void sendNotification(){
        System.out.println("Notification has sent via Push notifications!");
    }
}
