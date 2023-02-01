package interfaces;

public interface Estadistica <T>{
	T mayor();
	T menor();
	double media();
	T[] mayoresQue(T obj);
	T[] menoresQue(T obj);

}
