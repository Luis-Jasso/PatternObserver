
public class PesosColombianos extends Observer {

	private double cambioPC = 4345.10;

	public PesosColombianos(Subject subject) {
		this.subject = subject;
		this.subject.agregarObserver(this);
	}

	@Override
	public void actializar() {
		System.out.println("P-C: " + (subject.getEstado() * cambioPC));

	}

}
