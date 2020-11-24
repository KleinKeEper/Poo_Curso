package index;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import modeloDao.CursoDaoImp;
import utils.leer;

public class Index {
	
	

	private static void salir() {
		// TODO Auto-generated method stub
		
	}

	private static void reporte() {
		
		CursoDaoImp cursoDaoImp = new CursoDaoImp();
        ArrayList<List> reporte = cursoDaoImp.listarReporte();
        leer.saltoLinea(1);
        System.out.println("\t## REPORTE ##");
        System.out.println("\033[0;1mCurso" + "\t\tDocente\tGrado\t\tCiclo\tE.Profesional");
//        for (Object reporte2 : reporte) {
//            System.out.print("\u001B[0m");
//            
//            System.out.println(reporte2.equals(reporte.get(0).equals()));
//            
//            System.out.println(reporte2.getClass());
//            System.out.println(reporte2.toString().equals("curso"));   
//        }
        
        
        for (int i = 0; i < reporte.size(); i++) {
        	
        	System.out.println("\u001B[0m" + reporte.get(i).get(0) + "\t\t" + reporte.get(i).get(1) + "\t" + reporte.get(i).get(2) + "\t"+  reporte.get(i).get(3) +"\t" + reporte.get(i).get(4) );
        	System.out.println(reporte.get(i));
			//System.out.println(new ArrayList<String>(reporte.value()));
		}
        
        
		
		// TODO Auto-generated method stub
		
	}

	private static void listarEp() {
		// TODO Auto-generated method stub
		
	}

	private static void listarCurso() {
		// TODO Auto-generated method stub
		
	}

	private static void listarDocente() {
		// TODO Auto-generated method stub
		
	}

	public static void menu() {
		System.out.println("1. Listar Docente");
		System.out.println("2. Listar Curso");
		System.out.println("3. Listar E. Profesional");
		System.out.println("4. Reporte");
		System.out.println("5. Salir");
	}
	
	public static void main(String[] args) {
		int opcion;
		
		do {
			menu();
			System.out.print("Ingrese una opcion valida: ");
			opcion = leer.entero();
			switch (opcion) {
			case 1: listarDocente();
			break;
			case 2:
				listarCurso();
			case 3:
				listarEp();
			case 4:
				reporte();
			case 5:
				salir();
			default:
				break;
			}
		} while (opcion != 5);
		
	}
}
