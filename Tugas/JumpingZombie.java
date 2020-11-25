/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author WINDOWS 10
 */
public class JumpingZombie extends Zombie{
    public JumpingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }
    
    public void heal() {
        if(level == 1) {
            health += (health * 3/100);
        } else if(level == 2) {
            health += (health * 4/100);
        } else {
            health += (health * 5/100);
        }
    }
    
    public void destroyed() {
        health -= (health * 10/100);
    }
    
    public String getZombieInfo() {
        String info = "Jumping " +super.getZombieInfo() + "\n";
        info += "Health = " + health + "\n" + "Level = " + level + "\n";
        return info;
    }
}
