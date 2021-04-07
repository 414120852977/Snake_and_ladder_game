package SnakeAndLadder;

public class Snake {
	public static  final int MAX=6;
	public static  final int MIN=1;
	public static  final int START_POSITION=0;
	public void Calculate(){
	
	int die = (int) (Math . random() * ( MAX - MIN + 1 ) + MIN );
	System.out.println(die);
	
	// snake has eat a players die and go in previous position
	
		
	}
	
	public void snake1(){
		int newposition = 0;
		int player = START_POSITION;
		System.out.println("player position :"+player);
		for(newposition = 0; newposition <= 100;newposition++)
		{
		int die = (int) (Math . random() * ( MAX - MIN + 1 ) + MIN );
		System.out.println("after playing die position will be :");
		player = player + die;
		newposition = player;
		System.out.println("new position of a player is :"+newposition);
		System.out.println("die recived" + die);
		newposition = newposition + die;
		System.out.println("next new position of a player is :"+newposition);
		newposition = newposition + die;
		System.out.println("newposition is :" + newposition);
		// this below conditions for snake 
		
		if(newposition == 21)
		{
			newposition = newposition - die;
		}
		
		if(newposition == 42)
		{
			newposition = newposition - die;
		}
		
		if(newposition == 66)
		{
			newposition = newposition - die;
		}
		// this below condition for ladder
		if(newposition == 5)
		{
			newposition = newposition + die;
		}
		if(newposition == 25)
		{
			newposition = newposition + die;
		}
		if(newposition == 78)
		{
			newposition = newposition + die;
		}
		if(newposition > 100)
		{
			int currentposition;
			currentposition = newposition - die;
			System.out.println(currentposition);
			//currentposition = currentposition + die;
			
		}
		if(newposition == 100 )
		{
				System.out.println("player wins a game");
		}
	
	}
}

}


