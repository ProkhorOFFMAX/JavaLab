﻿package ru.spbstu.telematics.Prokhorov.lab2;

public class MainExample {

	public static void main(String[] args) {
		MyArrayQueue<String>Q =new MyArrayQueue<String>();// голова
		Q.add("Первый");
		Q.add("Второй"); 
		Q.add("Третий"); 
		Q.add("Четвертый"); 
		
		System.out.println("Вывод очереди итератором");
		int i=1;
		for(String x : Q){
			System.out.println(i++ + " " + x);
		}
		
		System.out.println("Очередь покинул обслуженный Q.get()="+Q.get());
		System.out.println("Очередь покинул обслуженный Q.get()="+Q.get());
		
		System.out.println("Сейчас в очереди стоят");
		i=1;
		for(String x : Q){
			System.out.println(i++ + " " + x);
		}
		
		System.out.println("в очереди сейчас Q.size()=" +Q.size() +"человек ");
		Q.add("Пятый");
		Q.add("Шестой");
		Q.add("Седьмой");
		Q.add("Восьмой");
		System.out.println("В очередь зашли 4 человака общее число людей в очереди Q.size()="+Q.size());
		
		
		
		System.out.println("\n В массиве 8 элементов изначально - сейчас первые два элемента не используются");
		System.out.println("когда прийдет еще три человека (заполнен массив) массив упорядочистся функцией rotate (начало очереди = начало массива)");
		System.out.println("и массив на котором построена очередь увеличится в два раза\n");
		Q.add("Человек один");
		Q.add("Человек два");
		Q.add("бабушка");
		
		System.out.println("в очереди сейчас " +Q.size() +" человек ");
		
		System.out.println("Вывод очереди итератором");
		i=1;
		for(String x : Q){
			System.out.println(i++ + " " + x);
		}
 
		for(int j=1;j<33 ; j++)
			Q.add(j+"й");
		
		System.out.println("Пришло 32 новых человека Вывод очереди итератором");
		i=1;
		for(String x : Q){
			System.out.println(i++ + " " + x);
		}
		
		for(int j=1;j<33 ; j++)
			Q.get( );
		
		System.out.println("Обслужили 32 человека Вывод очереди итератором");
		i=1;
		for(String x : Q){
			System.out.println(i++ + " " + x);
		}
	}
}
