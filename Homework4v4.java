
public class Homework4v4 {


	public static void main(String[] args) {
		
		double n = 7.5 ;
	    double m = 10.45 ;
	    int a = 9 ;
	    double b = Math.abs(a-n);
	    double c = Math.abs(a-m);
	    if(b==c) {
	    	System.out.println("�����" + n + "�" + m + "���������" + a );
	    	}
	    if(b>c) {
	    	System.out.println("�����" + m + "������ ��" + a);
	    }
        if(b<c) {
        	System.out.println("�����" + n + "������ ��" + a);
        }
	    //�������� ��������, �� �������� �� ����� ��������� �� 10 � ���� �����, ��������� �
        // ���� m � n. ���������, ����� ����� 8,5 � 11,45 ��������� �� ������ 11,45.
	}

}
