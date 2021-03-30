package oop13.enum04;

public enum City {
	SEOUL(200), BUSAN(100), JEJU(50);
	
	int population;
	
	City(int population){ //생성자는 무조건 private
		this.population=population;
	}
	
	public int getPopulation() {
		return population;
	}
}
