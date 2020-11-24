package modeloDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import config.bd.ConectaBd;
import interfaces.DocenteDao;
import modelo.Docente;

public class DocenteDaoImp implements DocenteDao{

	 ConectaBd cn = new ConectaBd();
	    Connection con;
	    PreparedStatement pst;
	    ResultSet rs;
	    Docente e = new Docente();
	
	@Override
	public List listardocente() {
		// TODO Auto-generated method stub
		 ArrayList<Docente> docentes = new ArrayList<>();
	        String consulta = " select * from docente";
	        try {
	            con = cn.getConnection();
	            pst = con.prepareStatement(consulta);
	            rs = pst.executeQuery();
	            while (rs.next()) {
	            	Docente docente = new Docente();
	            	docente.setIddocente(rs.getInt("iddocente"));
	            	docente.setNombre(rs.getString("nombre"));
	            	docente.setGradoacademico(rs.getString("gradoacademico"));
	            	docente.setEstado(rs.getString("estado"));
	            	
	            	docentes.add(docente);
	            }
	        } catch (Exception e) {
	            System.out.println("Error: Problemas con el LISTAR docentes");
	            System.out.println(e.getMessage());
	        }
	        return docentes;
		
	}

}
