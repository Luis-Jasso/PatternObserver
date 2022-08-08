
public class RubloRuso extends Observer {

	private double cambioRR = 60.53;

	public RubloRuso(Subject subject) {
		this.subject = subject;
		this.subject.agregarObserver(this);
	}

	@Override
	public void actializar() {
		System.out.println("Rublo-Ruso: " + (subject.getEstado() * cambioRR));

	}

}
