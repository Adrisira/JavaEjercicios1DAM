package herencias;

public class InstrumentoMain {

	public static void main(String[] args) {
		Piano p = new Piano(new NotaMusical[] { NotaMusical.RE, NotaMusical.FA, NotaMusical.MI });
		Campana c = new Campana(new NotaMusical[] { NotaMusical.DO, NotaMusical.RE, NotaMusical.MI });
		p.add(NotaMusical.DO);
		p.interpretar();
		c.interpretar();
	}

}
