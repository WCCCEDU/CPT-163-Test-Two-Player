/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package player;

/**
 *
 * @author Paul Scarrone
 */
public class Player {
  public static final int MAX_HIT_POINTS = 20;
  public static final int STARTING_AC = 20;
  
  private int hitPoints = Player.MAX_HIT_POINTS;
  private int ac = Player.STARTING_AC;
  private String name;
  private String className;
  private String race;
  
  public Player(String name, String className, String race) {
	this.name = name;
	this.className = className;
	this.race = race;
  }
  
  public int getHitPoints(){ return this.hitPoints; }
  public int getAc() { return ac; }
  public String getName() { return name; }
  public String getClassName() { return className; }
  public String getRace() { return race; }
  
  public void damageTaken(int dmg){
	if(dmg > this.ac){
	  this.hitPoints -= dmg - this.ac;
	}
  }
  
  public void heal(){
	if(this.hitPoints >= 15){
	  this.hitPoints = 20;
	}else{
	  this.hitPoints += 5;
	}
  }
}
