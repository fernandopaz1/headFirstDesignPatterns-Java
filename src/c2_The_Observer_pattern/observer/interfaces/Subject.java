package c2_The_Observer_pattern.observer.interfaces;

public interface Subject {
	void registerObserver(Observer o);
	void unregisterObserver(Observer o);
	void notifyObservers();
}
