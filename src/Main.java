import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new List();
		int option = 0;
		int position = 0;
		
		try {
			do {
				 option = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dígito de la opción \n 1-Agregar \n 2-Eliminar por posición \n 3-Mostrar lista \n 4-Ordenar por edad \n 5-Buscar por posición \n 0-Salir" ));
				switch (option) {
				case 1:
					String name = JOptionPane.showInputDialog("Ingrese nombre");
					int age = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad"));
					list.insert(new Person(name, age));
					break;
				case 2:
					position = Integer.parseInt(JOptionPane.showInputDialog("Ingrese posición a eliminar"));
					list.delete(position);
					break;	
				case 3:
					list.showList();
					break;
				case 4:
					list.sortByAge();
					break;
				case 5:
					position = Integer.parseInt(JOptionPane.showInputDialog("Ingrese posición a buscar"));
					list.getByPosition(position);
					break;
				}
			}while(option!=0);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
