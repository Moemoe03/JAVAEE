package io.github.Moemoe03.SOLID.engine;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		PetrolEngine engine1 = new PetrolEngine();
    	//GasEngine engine2 = new GasEngine();
		engine1.start();
    	
    	Car car = new Car(engine1);
    	car.startEngine();
	}

}
