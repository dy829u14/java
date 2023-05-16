package day19.exam05;

public class MethodReferenceExam {

	public static void main(String[] args) {
		Person person = new Person();
		person.ordering(new Comparable() {
			
			@Override
			public int compare(String a, String b) {
				// TODO Auto-generated method stub
				return a.compareToIgnoreCase(b);
			}
		});
		person.ordering((a,b)->{
			return a.compareToIgnoreCase(b);
		});
		person.ordering((a,b)->a.compareToIgnoreCase(b));

	}

}
