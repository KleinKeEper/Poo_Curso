package modelo;

public class EP {

	private int idep;
	private String nombre;
	private String estado;
	public EP() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EP(int idep, String nombre, String estado) {
		super();
		this.idep = idep;
		this.nombre = nombre;
		this.estado = estado;
	}
	public int getIdep() {
		return idep;
	}
	public void setIdep(int idep) {
		this.idep = idep;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
}
