public class Animals {
   
   //Attributes 
   private String name;
   private String sound;
   private String beg;
   
      //Metoder (verbs)
      
      public Animals(String name, String sound){
      
         this.name = name;
         this.sound = sound;
      
      
      }
      public Animals(){
     
      
      }

      
      public void setName(String name){
      
            this.name = name;
      
         }
         public void getName(){
       
            System.out.println(name);
       
         }
         public void setSound(String sound){
      
            this.sound = sound;
      
         }
         public void getSound(){
      
            System.out.println(sound);
      
         }
         public void setBeg(String beg){
      
            this.beg = beg;
            
      
         }
         public void getBeg(){
      
            System.out.println(beg);
      
         }
         
         //Game algorithm
      public void move(){
         int a = 1;
         while(a <= 20){
            int x = (int) (Math.random() * 9 + 1);
            int y = (int) (Math.random() * 9 + 1);
            int m = (int) (Math.random() * 9 + 1);
            int t = (int) (Math.random() * 9 + 1);
            System.out.println("Im the " + name + " and im standing on: " + x + ", " + m);
            System.out.println("Im the Snake and im standing on: " + y + ", " + t + "\n");
       
            if(((x + 1) == y || (x - 1) == y) && ((m + 1) == t || (m - 1) == t)){
               getSound();
         
            }
            a++;
            if(a > 20){
         
               System.out.println("If you played as the Snake its GAME OVER BITCH!");  
         
            }
            if(x == y && m == t){
         
               getBeg();
               System.out.println("Snake: Ahhrrrr, im going to eat you ha ha!");
               System.out.println("If you played as the " + name + " its GAME OVER BITCH!");
         
               break;
            }
         
         
      
            }
         }


}