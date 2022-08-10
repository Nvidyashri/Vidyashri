class GymRunner
{
	public static void main(String[] args)
	{
		String[] items={"Chest Press","Weightlifter","Plates","Bench Press"};
		Gym gym=new Gym("Taj",1000d,items);
		
		Trainer trainer=new Trainer("Raj",9876543210l,3,Gender.MALE,30);
		gym.setTrainer(trainer);
		
		gym.details();
	}
}