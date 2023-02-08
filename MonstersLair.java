/*    This is a program  MonstersLair that simulates a hero battling monsters. The
    hero must defeat the monster by choosing the correct attack (magical, agile, or strong). 
 */
 
import java.util.Scanner;
public class MonstersLair{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int lives = 3;  // total lives of hero
        int monstersCount = 0;  //  to count the number of monsters killed 
        int  magicalMonster = 0;  // it means 0 assign to magical monster
        int agileMonster = 1;   // 1 assign to agile monster
        int strongMonster = 2;  // 2 assign to strong monster
        int randomNumber = (int)(Math.random() * 3); // to generate any random number between 0-2.
    
        System.out.println("Welcome to the Monster's Lair");
        System.out.println("The room is deep within a cave, hidden away from the light of day. ");
        System.out.println("It is dimly lit by flickering torches that cast eerie shadows on the rough stone walls.");
        System.out.println("In the center of the room stands a towering figure, a monster unlike any you have ever seen before.");
        System.out.println("Its appearance is a mystery, with features that were both familiar and strange.");
        System.out.println("It is unclear whether the monster is magical, agile, or strong.");
        System.out.println("The monster is a formidable opponent, and you don't know if you are ready to face it.");
        System.out.println("But you know that you cannot leave the room without defeating it.");
        
        System.out.println("\nYou have 3 lives left and have defeated 0 monsters.");
        
        System.out.println("\nThe monster is ready to attack. How will you proceed?");
        System.out.println("Enter 0 to perform a magical attack.");
        System.out.println("Enter 1 to perform an agile attack.");
        System.out.println("Enter 2 to perform a strong attack.");
        
        int attack = sc.nextInt(); // to ask user what type of attack you want to do!
        while(!(lives == 0 || monstersCount == 3)){ // using the while loop to run the specific condition untill either lives becomes zero or may monsterCount become 3 
            
            if(randomNumber == 0 && attack == magicalMonster ){
                
                System.out.println("[magic]With a flick of the wrist,you cast a powerful spell that envelops the monster in a barrage of fire and ice.");
                System.out.println("[magic]The monster's eyes glow with an otherwordly light as it casts a spell, creating a shimmering barrier of energy that deflects your attack.");
                System.out.println("It is a draw! Try again.");
                
                if(!(lives == 0 || monstersCount == 3)){
                System.out.println("\n\nA new monster appeat in the lair.");
                System.out.println("\nYou have " + lives + " lives left and have defeated " + monstersCount + " monsters.");
                System.out.println("\nThe monster is ready to attak. How will you Proceed?");
                System.out.println("Enter 0 to perform a magical attack.");
                System.out.println("Enter 1 to perform an agile attack.");
                System.out.println("Enter 2 to perform a strong attack.");
                
                randomNumber = (int)(Math.random() * 3);
                attack = sc.nextInt();
                }
            } else if(randomNumber == 0 && attack == agileMonster){
                
            System.out.println("[agile]You dart forward, weaving in and out of the monster's defenses with lightning-fast strikes, delivering a devastating flurry of blows.");
            System.out.println("[magic]The monster's spell fails, leaving it vulnerable as your attack slams into it, piercing its magical barrier.");
            System.out.println("You defeated the monster!");
             
            monstersCount++;
                if(!(lives == 0 || monstersCount == 3)){
                System.out.println("\n\nA new monster appears in the lair.");
                System.out.println("\nYou have " + lives + " lives left and have defeated " + monstersCount + " monsters.");
                System.out.println("\nThe monster is ready to attak. How will you Proceed?");
                System.out.println("Enter 0 to perform a magical attack.");
                System.out.println("Enter 1 to perform an agile attack.");
                System.out.println("Enter 2 to perform a strong attack.");
             
                randomNumber = (int)(Math.random()) * 3;
                attack = sc.nextInt();
               }
            } else if( randomNumber == 0 && attack == strongMonster){
                 
            System.out.println("[strong]You bellow a battle cry and charge forward, pummeling the monster with devastating blows.");
            System.out.println("[magic]The monster casts a spell that disorients you, causing you to stumble and fall, leaving you vulnerable to its next attack."); 
            System.out.println("You were defeated by monster! Try again.");
                 
            lives--;
                if(!(lives == 0 || monstersCount == 3)){
                System.out.println("\n\nA new monster appears in the lair.");
                System.out.println("\nYou have " + lives + " lives left and have defeated " + monstersCount + " monsters.");
                System.out.println("\nThe monster is ready to attak. How will you Proceed?");
                System.out.println("Enter 0 to perform a magical attack.");
                System.out.println("Enter 1 to perform an agile attack.");
                System.out.println("Enter 2 to perform a strong attack.");
             
                randomNumber = (int)(Math.random() * 3);
                attack = sc.nextInt();
            }
            }
             
         if(randomNumber == 1 && attack == agileMonster ){
                
                System.out.println("[agile]You dart forward, weaving in and out of the monster's defenses with lightning-fast strikes, delivering a devastating flurry of blows.");
                System.out.println("[agile]The monster dances around you, avoiding your magical spells and counterattacking with swift and deadly strikes.");
                System.out.println("It is a draw! Try again.");
                
                if(!(lives == 0 || monstersCount == 3)){
                System.out.println("\n\nA new monster appeat in the lair.");
                System.out.println("\nYou have " + lives + " lives left and have defeated " + monstersCount + " monsters.");
                System.out.println("\nThe monster is ready to attak. How will you Proceed?");
                System.out.println("Enter 0 to perform a magical attack.");
                System.out.println("Enter 1 to perform an agile attack.");
                System.out.println("Enter 2 to perform a strong attack.");
                
                randomNumber = (int)(Math.random() * 3);
                attack = sc.nextInt();
            } 
        } else if(randomNumber == 1 && attack == strongMonster){
                
            System.out.println("[strong]You bellow a battle cry and charge forward, pummeling the monster with devastating blows.");
            System.out.println("[agile]The monster's speed and grace are no match for your relentless attack, and it stumbles, succumbing to a deadly blow.");
            System.out.println("You defeated the monster!");
             
            monstersCount++;
             if(!(lives == 0 || monstersCount == 3)){
             System.out.println("\n\nA new monster appears in the lair.");
             System.out.println("\nYou have "+ lives + " lives left and have defeated " + monstersCount + " monsters.");
             System.out.println("\nThe monster is ready to attak. How will you Proceed?");
             System.out.println("Enter 0 to perform a magical attack.");
             System.out.println("Enter 1 to perform an agile attack.");
             System.out.println("Enter 2 to perform a strong attack.");
             
             randomNumber = (int)(Math.random() * 3);
             attack = sc.nextInt();
            }
        } else if( randomNumber == 1 && attack == magicalMonster){
                 
            System.out.println("[magic]With a flick of the wrist, you cast a powerful spell that envelops the monster in a barrage of fire and ice.");
            System.out.println("[agile]The monster moves with incredible speed and grace, dodging your blows and weaving around your attacks with ease.");
            System.out.println("You were defeated by monster! Try again.");
                 
            lives--;
            if(!(lives == 0 || monstersCount == 3)){
             System.out.println("\n\nA new monster appears in the lair.");
             System.out.println("\nYou have " + lives + " lives left and have defeated " + monstersCount + " monsters.");
             System.out.println("\nThe monster is ready to attak. How will you Proceed?");
             System.out.println("Enter 0 to perform a magical attack.");
             System.out.println("Enter 1 to perform an agile attack.");
             System.out.println("Enter 2 to perform a strong attack.");
             
             randomNumber = (int)(Math.random() * 3);
             attack = sc.nextInt();
             }
        }
        
         if(randomNumber == 2 && attack == strongMonster ){
                
                System.out.println("[strong]You bellow a battle cry and charge forward, pummeling the monster with devastating blows.");
                System.out.println("[strong]The monster's thick hide and massive bulk make it nearly impossible to harm. Your attacks ricochet off its tough skin, unable to penetrate the monster's tough exterior.");
                System.out.println("It is a draw! Try again.");
                
            if(!(lives == 0 || monstersCount == 3)){
                System.out.println("\n\nA new monster appeat in the lair.");
                System.out.println("\nYou have " + lives + " lives left and have defeated " + monstersCount + " monsters.");
                System.out.println("\nThe monster is ready to attak. How will you Proceed?");
                System.out.println("Enter 0 to perform a magical attack.");
                System.out.println("Enter 1 to perform an agile attack.");
                System.out.println("Enter 2 to perform a strong attack.");
                
                randomNumber = (int)(Math.random() * 3);
                attack = sc.nextInt();
             }
        } else if(randomNumber == 2 && attack == magicalMonster){
                
            System.out.println("[magic]With a flick of the wrist, you cast a powerful spell that envelops the monster in a barrage of fire and ice.");
            System.out.println("[strong]Despite its tough hide and massive bulk, your magic finds a weakness in the monster's defenses, penetrating its thick skin and striking deep into its flesh.");
            System.out.println("You defeated the monster!");
             
            monstersCount++;
             if(!(lives == 0 || monstersCount == 3)){
             System.out.println("\n\nA new monster appears in the lair.");
             System.out.println("\nYou have " + lives + " lives left and have defeated " + monstersCount + " monsters.");
             System.out.println("\nThe monster is ready to attak. How will you Proceed?");
             System.out.println("Enter 0 to perform a magical attack.");
             System.out.println("Enter 1 to perform an agile attack.");
             System.out.println("Enter 2 to perform a strong attack.");
             
             randomNumber = (int)(Math.random() * 3);
             attack = sc.nextInt();
             }
        }else if( randomNumber == 2 && attack == agileMonster){
                 
            System.out.println("[agile]You dart forward, weaving in and out of the monster's defenses with lightning-fast strikes, delivering a devastating flurry of blows.");
            System.out.println("[strong]The monster's massive size and strength overpower you, forcing you back and leaving you unable to defend yourself against its relentless barrage of attacks.");
            System.out.println("You were defeated by monster! Try again.");
                 
            lives--;
            if(!(lives == 0 || monstersCount == 3)){
             System.out.println("\n\nA new monster appears in the lair.");
             System.out.println("\nYou have " + lives + " lives left and have defeated " + monstersCount + " monsters.");
             System.out.println("\nThe monster is ready to attak. How will you Proceed?");
             System.out.println("Enter 0 to perform a magical attack.");
             System.out.println("Enter 1 to perform an agile attack.");
             System.out.println("Enter 2 to perform a strong attack.");
             
             randomNumber = (int)(Math.random() * 3);
             attack = sc.nextInt();
             }
        }
     }
          
          if(lives == 0){
                System.out.println("\nYou lost the game! Better Luck next time!");
            
          } else if(monstersCount == 3){
                System.out.println("\nCongratulation! You defeated the monsters and live to fight another day!");
               } 
    }
    
}
