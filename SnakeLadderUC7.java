package com.bl.sandl;

public class SnakeLadderUC7 {
    public static void main(String[] args) {
        int player_position1 = 0;
        int player_position2 = 0;
        int pos = 0;
        int[] ladder = {2, 12, 33, 48, 85};
        int[] ladder_position = {14, 42, 68, 83, 95};
        int[] snake = {15, 38, 53, 69, 97};
        int[] bite_position = {6, 17, 54, 63, 16};
        int count = 0;
        while ((player_position1) <= 100 || (player_position2 <= 100)) {
          if(pos == 0) {
              pos = 1;
              int dice = (int) ((Math.random() * 10) % 6) + 1;
              count++;
              System.out.println("Player 1 dice number  " + " " + dice);
              if (dice != 0) {
                  player_position1 = player_position1 + dice;
                  if (player_position1 > 100) {
                      player_position1 = player_position1 - dice;
                      System.out.println("Player position1" +" " + player_position1);

                  }
                  if (player_position1 == 100) {
                      System.out.println("player 1 won the match" + " " + player_position1);
                      break;
                  }
                  System.out.println("player position1" + " " + player_position1);
                  for (int i = 0; i < 5; i++) {
                      if (ladder[i] == player_position1) {
                          pos = 0;
                          player_position1 = ladder_position[i];
                          System.out.println("ladder position" + " " + player_position1);
                          System.out.println("player_position1 will play again");
                      } else if (snake[i] == player_position1) {
                          player_position1 = bite_position[i];
                          System.out.println("bite position" + " " + player_position1);
                      }

                  }
              }
          }
          else {
              pos = 0;
              int dice = (int) ((Math.random() * 10) % 6) + 1;
              count++;
              System.out.println("Player 2 dice  number " + " " + dice);
                if (dice != 0) {
                  player_position2 = player_position2 + dice;
                  if (player_position2 > 100) {
                      player_position2 = player_position2 - dice;
                      System.out.println("Player position2" +" " +player_position2);

                  }
                  if (player_position2 == 100) {
                      System.out.println("player 2 won the match" + " " + player_position2);
                      break;
                  }
                  System.out.println("player position2" + " " + player_position2);
                  for (int i = 0; i < 5; i++) {
                      if (ladder[i] == player_position2) {
                          pos = 1;
                          player_position2 = ladder_position[i];
                          System.out.println("ladder position" + " " + player_position2);
                          System.out.println("player_position2 will play again");
                      } else if (snake[i] == player_position2) {
                          player_position2 = bite_position[i];
                          System.out.println("bite position" + " " + player_position2);
                      }

                  }
              }
          }
        }
        System.out.println("number of times the dice was played" + " " + count);
    }

}
