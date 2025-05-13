 
package notificationsystem;
 
public class SMS implements SendNotifications{
    @Override
    public void sendNotification(){
        System.out.println("Notification has sent via SMS!");
    }
}
