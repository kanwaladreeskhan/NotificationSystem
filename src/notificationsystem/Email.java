 
package notificationsystem;
 
public class Email implements SendNotifications{
     @Override
    public void sendNotification(){
        System.out.println("Notification has sent via Email!");
    }
}
