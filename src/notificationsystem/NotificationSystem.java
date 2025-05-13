 package notificationsystem;
 public class NotificationSystem {
     public static void main(String[] args) {
        System.out.println("===SMS===");
         SendNotifications notification1=new SMS();
         notification1.sendNotification();
         System.out.println("===Email===");
         SendNotifications notification2=new Email();
         notification2.sendNotification();
         System.out.println("===Push Notifications===");
         SendNotifications notification3=new Push();
         notification3.sendNotification();
    }
    
}
