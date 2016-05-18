package Interfete;

public interface Subiect {
	public void add(Observer o);
	public void remove(Observer o);
	public void notifica(String mesaj);
}
