package modelo;

public class Docente {

	private int iddocente;
	private String nombre;
	private String gradoacademico;
	private String estado;
	public Docente() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Docente(int iddocente, String nombre, String gradoacademico, String estado) {
		super();
		this.iddocente = iddocente;
		this.nombre = nombre;
		this.gradoacademico = gradoacademico;
		this.estado = estado;
	}
	public int getIddocente() {
		return iddocente;
	}
	public void setIddocente(int iddocente) {
		this.iddocente = iddocente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getGradoacademico() {
		return gradoacademico;
	}
	public void setGradoacademico(String gradoacademico) {
		this.gradoacademico = gradoacademico;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
	
}
