package ru.spbstu.telematics.Prokhorov.lab2;

public class MainExample {

	public static void main(String[] args) {
		MyArrayQueue<String>Q =new MyArrayQueue<String>();//��������
		Q.add("������");
		Q.add("������"); 
		Q.add("������"); 
		Q.add("���������"); 
		
		System.out.println("����� ������� ����������");
		int i=1;
		for(String x : Q){
			System.out.println(i++ + " " + x);
		}
		
		System.out.println("������� ������� ����������� Q.get()="+Q.get());
		System.out.println("������� ������� ����������� Q.get()="+Q.get());
		
		System.out.println("������ � ������� �����");
		i=1;
		for(String x : Q){
			System.out.println(i++ + " " + x);
		}
		
		System.out.println("� ������� ������ Q.size()=" +Q.size() +"������� ");
		Q.add("�����");
		Q.add("������");
		Q.add("�������");
		Q.add("�������");
		System.out.println("� ������� ����� 4 �������� ����� ����� ����� � ������� Q.size()="+Q.size());
		
		
		
		System.out.println("\n � ������� 8 ��������� ���������� - ������ ������ ��� �������� �� ������������");
		System.out.println("����� ������� ��� ��� �������� (�������� ������) ������ ������������� �������� rotate (������ ������� = ������ �������)");
		System.out.println("� ������ �� ������� ��������� ������� ���������� � ��� ����\n");
		Q.add("������� ����");
		Q.add("������� ���");
		Q.add("�������");
		
		System.out.println("� ������� ������ " +Q.size() +" ������� ");
		
		System.out.println("����� ������� ����������");
		i=1;
		for(String x : Q){
			System.out.println(i++ + " " + x);
		}
 
		for(int j=1;j<33 ; j++)
			Q.add(j+"�");
		
		System.out.println("������ 32 ����� �������� ����� ������� ����������");
		i=1;
		for(String x : Q){
			System.out.println(i++ + " " + x);
		}
		
		for(int j=1;j<33 ; j++)
			Q.get( );
		
		System.out.println("��������� 32 �������� ����� ������� ����������");
		i=1;
		for(String x : Q){
			System.out.println(i++ + " " + x);
		}
	}
}