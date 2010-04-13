package org.gljug;

public class TstEnum
{

	public enum Direction { LEFT , RIGHT , UP, DOWN }
	public enum Movement { FORWARD , BACKWARD }
	
	public static void main(String[] args)
	{
		System.out.println ("We are starting to fly a plane");		
		System.out.println (getDirection (Movement.FORWARD, Direction.UP));
		System.out.println (getDirection (Movement.FORWARD, Direction.LEFT));		
	}

	private static String getDirection(Movement move, Direction direction)
	{		
		String directionStr = direction.toString();
		if (direction.equals(Direction.LEFT) || direction.equals(Direction.RIGHT))
		{
			directionStr = "turn " + direction;
		}
		String str = "Please go " + move+ " and " + directionStr;		
		return str;
	}

}