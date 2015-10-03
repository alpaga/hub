package fr.ozedev.hub;

import org.bukkit.Location;

public class HubPlayer {
	private float	lastTimeSpawn;
	private float	lastTimeJump;
	private boolean inJump;
	private int 	life			=0;
	private Location lastPlatform;
	
	public float getLastTimeJump(){return lastTimeJump;}
	public float getLastTimeSpawn(){return lastTimeSpawn;}
	public boolean getInJump(){return inJump;}
	public int getLife(){return life;}
	public Location getLastPlatform(){return lastPlatform;}
	
	public void setLastPlatform(Location lastPlatform){this.lastPlatform = lastPlatform;}
	public void setLife(int life){this.life = life;}
	public void setInJump(boolean inJump){this.inJump = inJump;}
	public void setLastTimeJump(float lastTimeJump){this.lastTimeJump = lastTimeJump;}
	public void setLastTimeSpawn(float lastTimeSpawn){this.lastTimeSpawn = lastTimeSpawn;}
}
