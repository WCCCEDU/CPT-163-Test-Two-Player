/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package player;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author samuraipanzer
 */
public class PlayerTest {
  private Player player = null;
  
  public PlayerTest() {
  }
  
  @BeforeClass
  public static void setUpClass() {
  }
  
  @AfterClass
  public static void tearDownClass() {
  }
  
  @Before
  public void setUp() {
	this.player = new Player("Paul", "Wizard", "White");
  }
  
  @After
  public void tearDown() {
  }

  /**
   * Test of getHitPoints method, of class Player.
   */
  @Test
  public void testGetHitPoints() {
	System.out.println("getHitPoints");
	Player instance = this.player;
	int expResult = 20;
	int result = instance.getHitPoints();
	assertEquals(expResult, result);
  }

  /**
   * Test of getAc method, of class Player.
   */
  @Test
  public void testGetAc() {
	System.out.println("getAc");
	Player instance = this.player;
	int expResult = 20;
	int result = instance.getAc();
	assertEquals(expResult, result);
  }

  /**
   * Test of getName method, of class Player.
   */
  @Test
  public void testGetName() {
	System.out.println("getName");
	Player instance = this.player;
	String expResult = "Paul";
	String result = instance.getName();
	assertEquals(expResult, result);
  }

  /**
   * Test of getClassName method, of class Player.
   */
  @Test
  public void testGetClassName() {
	System.out.println("getClassName");
	Player instance = this.player;
	String expResult = "Wizard";
	String result = instance.getClassName();
	assertEquals(expResult, result);
  }

  /**
   * Test of getRace method, of class Player.
   */
  @Test
  public void testGetRace() {
	System.out.println("getRace");
	Player instance = this.player;
	String expResult = "White";
	String result = instance.getRace();
	assertEquals(expResult, result);
  }

  /**
   * Test of damageTaken method, of class Player.
   */
  @Test
  public void testDamageTakenShouldNotAffectHP() {
	System.out.println("damageTaken");
	int dmg = 10;
	Player instance = this.player;
	instance.damageTaken(dmg);
	assertEquals(instance.getHitPoints(), 20);
  }
  
   /**
   * Test of damageTaken method, of class Player.
   */
  @Test
  public void testDamageTakenShouldAffectHP() {
	System.out.println("damageTaken");
	int dmg = 21;
	Player instance = this.player;
	instance.damageTaken(dmg);
	assertEquals(instance.getHitPoints(), 19);
  }

  /**
   * Test of heal method, of class Player.
   */
  @Test
  public void testHealAt20() {
	System.out.println("heal");
	Player instance = this.player;
	instance.heal();
	assertEquals(instance.getHitPoints(), 20);
  }
  
  /**
   * Test of heal method, of class Player.
   */
  @Test
  public void testHealBelow20Above15() {
	System.out.println("heal");
	Player instance = this.player;
	instance.damageTaken(24);
	instance.heal();
	assertEquals(instance.getHitPoints(), 20);
  }
  
}
