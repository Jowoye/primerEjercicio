import javax.swing.JOptionPane;

public class List {
	private Node first;
	private Node last;
	
	public List() {
		first = null;
		last = null;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public void insert(Person person) {
		Node actual = new Node(person, null);
		
		if (isEmpty()){
			first = actual;
			last = actual;
		}else {
			last.setNext(actual);
			last = actual;
		}
	}
	
	public void delete(int position) {
		Node temp = first, prev = null;
		
		if(isEmpty()) {
			JOptionPane.showMessageDialog(null,"Lista vacía");
			return;
		}else {
			if(position == 0) {
				first = temp.getNext();		
			}else {
				int count = 0;
				while(count < position && temp != null ) {
					prev = temp;
					temp = temp.getNext();
					count++;
				}
				prev.setNext(temp.getNext());
			}
			JOptionPane.showMessageDialog(null,"Eliminado");
			return;
		}
	}
	
	public void showList () {
		Node temp = first;
		if(isEmpty()) {
			JOptionPane.showMessageDialog(null,"Lista vacía");
			return;
		}else {
			while(temp!=null) {
				JOptionPane.showMessageDialog(null, temp.getInfo().toString());
				temp = temp.getNext();
			}
		}
	}
	
	public void sortByAge() {
		Node temp = first;
		if(isEmpty()) {
			JOptionPane.showMessageDialog(null,"Lista vacía");
			return;
		}else {
			if(temp.getNext() != null) {
				while(temp != null) {
					Node second = temp.getNext();
					while(second != null) {
						if(temp.getInfo().getAge() > second.getInfo().getAge()) {
							Person person = temp.getInfo();
							temp.setInfo(second.getInfo());
							second.setInfo(person);
							
						}
						second = second.getNext();
					}
					temp = temp.getNext();
				}
			}
			
			JOptionPane.showMessageDialog(null, "Lista ordenada");
		}
	}
	
	public void getByPosition(int position) {
		if(isEmpty()) {
			JOptionPane.showMessageDialog(null,"Lista vacía");
			return;
		}else {
			Node temp = first;
			int count = 0;
			while(count < position && temp!=null) {
				temp = temp.getNext();
				count++;
			}
			if(count!= position) {
				JOptionPane.showMessageDialog(null,"Posición inválida");
				return;
			}else {
				JOptionPane.showMessageDialog(null,  " Posición: " + position + temp.getInfo().toString());
			}
		}
	}
}
