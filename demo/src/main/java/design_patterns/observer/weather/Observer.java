package src.main.java.design_patterns.observer.weather;

public interface Observer {
	public void update(float temp, float humidity, float pressure);
}
