class ProjectTest {
	public static void main(String[] args) {
		Project elevatorPitchTest = new Project();
		elevatorPitchTest.setName("Better Butter Project");
		System.out.println(elevatorPitchTest.getName());
		elevatorPitchTest.setDescription("We can make better butter.");
		System.out.println(elevatorPitchTest.getDescription());
		System.out.println(elevatorPitchTest.elevatorPitch());

		Project elevatorPitchTest2 = new Project("Plastic Knives");
		System.out.println(elevatorPitchTest2.getName());
		
		Project elevatorPitchTest3 = new Project("Red Blocks", "Better than blue.");
		System.out.println(elevatorPitchTest3.getName());
		System.out.println(elevatorPitchTest3.getDescription());
		System.out.println(elevatorPitchTest3.elevatorPitch());

	}
}
