package com.slenderman.scenes;

import com.slenderman.actors.Item;
import com.slenderman.actors.ItemDirector;
import com.slenderman.actors.Player;
import com.slenderman.actors.SlenderMan;

import java.text.MessageFormat;
import java.util.*;
import java.util.Scanner;

public class LoseGameScene extends Scene {
  private Scanner choice;

  public LoseGameScene() {
    setSceneName("LoseGame");
  }

  public LoseGameScene(Scene sceneToTheNorth, Scene sceneToTheSouth, Scene sceneToTheEast, Scene sceneToTheWest) {
    super(sceneToTheNorth, sceneToTheSouth, sceneToTheEast, sceneToTheWest);
  }


  @Override
  public void enter(Scanner in, Player player) throws InterruptedException {
    player.setCurrentSceneName(this.getSceneName());
    choice = in;
    loseGame();
  }

  public void loseGame() throws InterruptedException {
    System.out.println("---------------------------------------------------------------------------------------------------\n" +
      "The screeching overpowers all of your senses, you become paralyzed... \n" +
      "SlenderMan emerges from the shadows and wraps his long slimy fingers around your neck and... \n" +
      "       __                  __   __   __      \n" +
      " /  | /  | /  |      /    /  | /    /     /  \n" +
      "(___|(   |(   |     (    (   |(___ (___  (   \n" +
      "    )|   )|   )     |   )|   )    )|     |   \n" +
      " __/ |__/ |__/      |__/ |__/  __/ |__   _   \n" +
      "                                             ");
    restartOrQuit();

  }

  public void restartOrQuit() throws InterruptedException {
    Thread.sleep(2000);
    System.out.println("Thanks for playing");
    System.out.println("- Type \"Q\": to quit.");
    String choice = playerChoice().toUpperCase();
   if(choice.equals("Q")){
      System.exit(0);
    }
    else{
      System.out.println("Wrong input, try typing: Q");
      restartOrQuit();
    }
  }

  private String playerChoice(){
    return choice.nextLine();
  }
}
