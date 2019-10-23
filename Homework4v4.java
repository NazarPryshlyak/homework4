
public class Homework4v4 {


	public static void main(String[] args) {
		
		double n = 7.5 ;
	    double m = 10.45 ;
	    int a = 9 ;
	    double b = Math.abs(a-n);
	    double c = Math.abs(a-m);
	    if(b==c) {
	    	System.out.println("Числа" + n + "і" + m + "найближче" + a );
	    	}
	    if(b>c) {
	    	System.out.println("Число" + m + "ближче до" + a);
	    }
        if(b<c) {
        	System.out.println("Число" + n + "ближче до" + a);
        }
	    //Створити програму, що виводить на екран найближче до 10 з двох чисел, записаних в
        // змінні m і n. Наприклад, серед чисел 8,5 і 11,45 найближче до десяти 11,45.
	}

}
