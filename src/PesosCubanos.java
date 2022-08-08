
public class PesosCubanos extends Observer {

	private double cambioPC = 24.16;

	public PesosCubanos(Subject subject) {
		this.subject = subject;
		this.subject.agregarObserver(this);
	}

	@Override
	public void actializar() {
		System.out.println("P-Cubanos: " + (subject.getEstado() * cambioPC));

	}

}
