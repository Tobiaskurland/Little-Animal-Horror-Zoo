public class Lahz{

   public static void main(String[] args){
   
      //Make characters
      Animals snake = new Animals("Snake", "Snake: Ahhrrrr im going to eat you ha ha!");
      Animals rabbit = new Animals();
   
      //Snake
      snake.setName("Snake");
      snake.setSound("Snake: Ahhrrr im going to eat you ha ha!");
      //Rabbit
      rabbit.setName("Rabbit");
      rabbit.setSound("Rabbit: The Snake is getting close, get me out away from him!");
      rabbit.setBeg("Rabbit: Noooo, please dont eat me!");
   
      //Here we call the methods the animals perform
      rabbit.move();
      
         
      
      
   
   }
   
}