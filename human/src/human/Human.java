/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package human;



public class Human {
  
   private String skin_color = "Light Brown";
   private String eye_color = "Blue Green";
   private String gender = "Male";
   private int height = 150;
   private int weight = 55;
   private int age = 22;
   private String race = "Asian";
   private String name = "Cyril";
   
  
   
           
   public static void main(String[] args) 
   {
     
       Human b = new Human ();
       
       System.out.println(b.skin_color);
       System.out.println(b.eye_color);
       System.out.println(b.gender);
       System.out.println(b.height);
       System.out.println(b.weight);
       System.out.println(b.age);
       System.out.println(b.race);
       System.out.println(b.name);
       //run child
       Child a = new Child();
       System.out.println(a.intellegience_rating);
       System.out.println(a.mood_rating);
       System.out.println(a.genetic_diseases[0]);
       System.out.println(a.wealth_rating);
       
       
   }
   
}
