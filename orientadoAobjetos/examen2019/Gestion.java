package examen2019;

public class Gestion {
	private static Guerra tablaGuerras[];
	private static int nGuerras;

	public static void main(String args[]) {

		// Datos de ejemplo para poder hacer pruebas
		// Creación de varios países.

		Pais francia = new Pais("Francia");
		Pais reinoUnido = new Pais("Reino Unido");
		Pais rusia = new Pais("Rusia");
		Pais usa = new Pais("Estados Unidos");
		Pais austria = new Pais("Austria");
		Pais hungría = new Pais("Hungría");
		Pais turquía = new Pais("Turquía");
		Pais alemania = new Pais("Alemania");
		Pais japón = new Pais("Japón");
		Pais italia = new Pais("Italia");
		Pais polonia = new Pais("Polonia");

		// Creación de Bandos para las distintas guerras

		Bando aliados1 = new Bando("Aliados I");
		Bando centroeuropeo = new Bando("Centro Europeo");
		Bando aliados2 = new Bando("Aliados II");
		Bando eje = new Bando("Eje Berlín-Roma-Tokio");

		// Añadimos a cada bando de las guerras los países que lo componían.

		aliados1.añadePaís(francia);
		aliados1.añadePaís(reinoUnido);
		aliados1.añadePaís(usa);
		aliados1.añadePaís(rusia);

		centroeuropeo.añadePaís(austria);
		centroeuropeo.añadePaís(hungría);
		centroeuropeo.añadePaís(turquía);
		centroeuropeo.añadePaís(alemania);

		aliados2.añadePaís(francia);
		aliados2.añadePaís(polonia);
		aliados2.añadePaís(reinoUnido);
		aliados2.añadePaís(usa);
		aliados2.añadePaís(rusia);

		eje.añadePaís(alemania);
		eje.añadePaís(italia);
		eje.añadePaís(japón);

		// creamos varias batallas

		Batalla tannenberg = new Batalla("Tannenberg", rusia, alemania);
		Batalla verdún = new Batalla("Verdún", francia, alemania);
		Batalla gallipoli = new Batalla("Gallipoli", francia, turquía);
		Batalla elAlamein = new Batalla("El Alamein", reinoUnido, alemania);
		Batalla midway = new Batalla("Midway", usa, japón);
		Batalla stalingrado = new Batalla("Stalingrado", alemania, rusia);
		Batalla normandía = new Batalla("Normandía", usa, alemania);

		// creamos dos guerras, con sus respectivos bandos

		Guerra mundialI = new Guerra("Primera guerra mundial", aliados1, centroeuropeo);
		Guerra mundialII = new Guerra("Segunda guerra mundial", eje, aliados2);

		// colocamos las batallas en las guerras correspondientes

		mundialI.añadeBatalla(tannenberg);
		mundialI.añadeBatalla(verdún);
		mundialI.añadeBatalla(gallipoli);

		mundialII.añadeBatalla(elAlamein);
		mundialII.añadeBatalla(midway);
		mundialII.añadeBatalla(stalingrado);
		mundialII.añadeBatalla(normandía);

		// hacemos que cada país sepa en qué guerras ha participado

		francia.participóEn(mundialI);
		reinoUnido.participóEn(mundialI);
		rusia.participóEn(mundialI);
		usa.participóEn(mundialI);
		austria.participóEn(mundialI);
		hungría.participóEn(mundialI);
		turquía.participóEn(mundialI);
		alemania.participóEn(mundialI);

		japón.participóEn(mundialII);
		italia.participóEn(mundialII);
		alemania.participóEn(mundialII);
		polonia.participóEn(mundialII);
		francia.participóEn(mundialII);
		reinoUnido.participóEn(mundialII);
		rusia.participóEn(mundialII);
		usa.participóEn(mundialII);

		// por último colocamos las guerras en la tabla de Guerras de la gestión

		tablaGuerras = new Guerra[10];
		nGuerras = 0;

		tablaGuerras[nGuerras++] = mundialI;
		tablaGuerras[nGuerras++] = mundialII;

		// mostramos los datos almacenados

		mostrarTablaGuerras();

	}

	private static void mostrarTablaGuerras() {
		for (int i = 0; i < nGuerras; i++)
			System.out.println(tablaGuerras[i]);
	}
}
