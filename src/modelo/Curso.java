package modelo;

public class Curso {

	private int idcurso;
	private int ciclo;
	private String nombre;
	private int horas;
	private int creditos;
	private String estado;
	private int iddocente;
	private int idep;
	public Curso() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Curso(int idcurso, int ciclo, String nombre, int horas, int creditos, String estado, int iddocente,
			int idep) {
		super();
		this.idcurso = idcurso;
		this.ciclo = ciclo;
		this.nombre = nombre;
		this.horas = horas;
		this.creditos = creditos;
		this.estado = estado;
		this.iddocente = iddocente;
		this.idep = idep;
	}
	public int getIdcurso() {
		return idcurso;
	}
	public void setIdcurso(int idcurso) {
		this.idcurso = idcurso;
	}
	public int getCiclo() {
		return ciclo;
	}
	public void setCiclo(int ciclo) {
		this.ciclo = ciclo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public int getCreditos() {
		return creditos;
	}
	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public int getIddocente() {
		return iddocente;
	}
	public void setIddocente(int iddocente) {
		this.iddocente = iddocente;
	}
	public int getIdep() {
		return idep;
	}
	public void setIdep(int idep) {
		this.idep = idep;
	} 
	
	
	
	
}
