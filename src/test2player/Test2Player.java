/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2player;

import player.Player;

/**
 *
 * @author Paul Scarrone
 */
public class Test2Player {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
	Player player = new Player("Paul", "Wizard", "White");
	player.damageTaken(10);
	if(player.getHitPoints() == 20){
	  System.out.println("Damage Soaked");
	}
	
	player.damageTaken(21);
	if(player.getHitPoints() == 19){
	  System.out.println("Took 1 Dmg");
	}
	
	player.heal();
	if(player.getHitPoints() == 20){
	  System.out.println("Healed to Max");
	}
	
	player.damageTaken(30);
	player.heal();
	if(player.getHitPoints() == 15){
	  System.out.println("Healed 5");
	}
  }
  
}
