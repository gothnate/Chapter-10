import java.util.*;
public class DemoSugarSmash
{
   public static void main(String[] args)
   {
       // Complete the demo program here
       Scanner input = new Scanner(System.in);
       int highscore;
       int level;

       System.out.print("Are you a premium player? >> ");
       if (input.nextLine().toLowerCase().equals("yes")) {
            PremiumSugarSmashPlayer pPlayer = new PremiumSugarSmashPlayer();
            System.out.print("Enter ID Number >> ");
            pPlayer.setIdNumber(input.nextInt());
            System.out.print("Enter Name >> ");
            input.nextLine();
            pPlayer.setName(input.nextLine());
            for (int i = 1; i < pPlayer.scores.length; i++) {
                System.out.print("Enter Level >> ");
                level = input.nextInt();
                System.out.print("Enter High Score >> ");
                highscore = input.nextInt();
                pPlayer.setScore(highscore, level);
            }
            display(pPlayer);
        } else if (input.nextLine().toLowerCase().equals("no")) {
            SugarSmashPlayer player = new SugarSmashPlayer();
            System.out.print("Enter ID Number >> ");
            player.setIdNumber(input.nextInt());
            System.out.print("Enter Name >> ");
            input.nextLine();
            player.setName(input.nextLine());
            for (int i = 1; i < player.scores.length; i++) {
                System.out.print("Enter Level >> ");
                level = input.nextInt();
                System.out.print("Enter High Score >> ");
                highscore = input.nextInt();
                player.setScore(highscore, level);
                display(player);
            }
        }
        input.close();
   }

   private static void display(SugarSmashPlayer p) {
       System.out.println("ID #" + p.getIdNumber() + " Name: " + p.getName());
       for (int i = 0; i < p.getLevels(); i++) {
           System.out.print(" " + p.getScore(i));
       }
       System.out.println();
}
}