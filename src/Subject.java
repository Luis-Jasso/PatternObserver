import java.util.ArrayList;
import java.util.List;

public class Subject {

	private List<Observer> observers = new ArrayList<>();
	private int estado;

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
		notificarObservers();
	}

	public void agregarObserver(Observer observer) {
		observers.add(observer);
	}

	public void notificarObservers() {
		observers.forEach(x -> x.actializar());
	}

}
