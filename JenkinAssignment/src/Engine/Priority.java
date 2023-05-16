package Engine;

import org.testng.annotations.Test;

public class Priority {

	@Test(priority = 1)
	public void startEngine() {

		System.out.println("Engine Started");
	}

	@Test(priority = 2)
	public void putFirstGear() {

		System.out.println("Car is in First Gear");
	}

	@Test(priority = 3)
	public void putSecondGear() {

		System.out.println("Car is in Second Gear");
	}

	@Test(priority = 4)
	public void putThirdGear() {
		System.out.println("Car is in third Gear");
	}

}
