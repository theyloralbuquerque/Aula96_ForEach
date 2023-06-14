
public class Program {

	public static void main(String[] args) {

		String[] vect = new String[]{"Maria", "Bob", "Ana"};

		for (int i=0; i<vect.length; i++) { //for normal
			System.out.println(vect[i]);
		}
		
		System.out.println("-------------------------------------------");
		
		for (String obj : vect) { //for each
			System.out.println(obj); // Para cada objeto "obj" contido no vetor "vect", faça:
		}
	}

}
