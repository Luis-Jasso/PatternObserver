
public class PesosMexicanos extends Observer {

	private double cambioMX = 20.41;

	public PesosMexicanos(Subject subject) {
		this.subject = subject;
		this.subject.agregarObserver(this);
	}

	@Override
	public void actializar() {
		System.out.println("P-MX: " + (subject.getEstado() * cambioMX));

	}

}
