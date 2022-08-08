
public class YuanChino extends Observer {

	private double yuanChino = 6.77;

	public YuanChino(Subject subject) {
		this.subject = subject;
		this.subject.agregarObserver(this);
	}

	@Override
	public void actializar() {
		System.out.println("Yuanes: " + (subject.getEstado() * yuanChino));

	}

}
