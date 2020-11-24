package modeloDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import config.bd.ConectaBd;
import interfaces.CursoDao;
import modelo.Curso;
import modelo.Docente;

public class CursoDaoImp implements CursoDao {

	
	 ConectaBd cn = new ConectaBd();
	    Connection con;
	    PreparedStatement pst;
	    ResultSet rs;
	    Curso e = new Curso();
	
	@Override
	public List listarCurso() {
		// TODO Auto-generated method stub
		 ArrayList<Curso> cursos = new ArrayList<>();
	        String consulta = " select * from curso";
	        try {
	            con = cn.getConnection();
	            pst = con.prepareStatement(consulta);
	            rs = pst.executeQuery();
	            while (rs.next()) {
	            	Curso curso = new Curso();
	            	curso.setIdcurso(rs.getInt("idcurso"));
	            	curso.setCiclo(rs.getInt("ciclo"));
	            	curso.setNombre(rs.getString("nombre"));
	            	curso.setHoras(rs.getInt("horas"));
	            	curso.setCreditos(rs.getInt("creditos"));
	            	curso.setEstado(rs.getString("estado"));
	            	curso.setIddocente(rs.getInt("iddocente"));
	            	curso.setIdep(rs.getInt("idep"));
	            	
	            	cursos.add(curso);
	            }
	        } catch (Exception e) {
	            System.out.println("Error: Problemas con el LISTAR");
	            System.out.println(e.getMessage());
	        }
	        return cursos;		
	}

	@Override
	public ArrayList<List> listarReporte() {
		// TODO Auto-generated method stub
		ArrayList<List> cursos = new ArrayList<>();
        String consulta = "select  c.nombre as \"curso\", d.nombre as \"docente\", d.gradoacademico as \"grado\", c.ciclo as \"ciclo\", e.nombre as \"escuela\"\r\n" + 
        		"from curso c, docente d, ep e\r\n" + 
        		"where\r\n" + 
        		"e.idep = c.idep and\r\n" + 
        		"d.iddocente = c.iddocente\r\n" + 
        		"order by e.nombre, d.nombre, c.nombre";
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            rs = pst.executeQuery();
            while (rs.next()) {
            	List reporte = new ArrayList<>();
            
            	reporte.add(rs.getString("curso"));
            	reporte.add(rs.getString("docente"));
            	reporte.add(rs.getString("grado"));
            	reporte.add(rs.getInt("ciclo"));
            	reporte.add(rs.getString("escuela"));
            	
//            	reporte.put("Grado Academmico", rs.getString("grado"));
//            	reporte.put("Ciclo", rs.getInt("ciclo"));
//            	reporte.put("E. Profesional", rs.getString("escuela"));

            	cursos.add(reporte);
            }
        } catch (Exception e) {
            System.out.println("Error: Problemas con el Reporte");
            System.out.println(e.getMessage());
        }
        return cursos;	
	}

}
