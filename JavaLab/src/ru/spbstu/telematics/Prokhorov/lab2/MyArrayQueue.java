package ru.spbstu.telematics.Prokhorov.lab2;

import java.util.Iterator;

public class MyArrayQueue<T> 
				implements IArrayQueue, Iterable<T>
{
	int CAPACITI_QUEUE_ARRAY; 	//размер массива
	T[] QuArData; 				//массив
	int QuArEnd;				
	int QuArBegin;
	int size_;
	
	
	public  MyArrayQueue(){
		CAPACITI_QUEUE_ARRAY=8;
		QuArData = (T[]) new Object[CAPACITI_QUEUE_ARRAY];
		QuArEnd=0;
		QuArBegin=0;
		size_=0;
	}


	@Override
	public void add(Object o) {
		if(size_==CAPACITI_QUEUE_ARRAY)
			expansionQuAr();
		QuArData[QuArEnd]= (T) o;
		QuArEnd=(QuArEnd+1)%CAPACITI_QUEUE_ARRAY;
		size_++;
	}


	@Override
	public Object get() {
		if(size_==0)
			return null;
		else
		{
		T temp=QuArData[QuArBegin];
		QuArBegin=(QuArBegin+1)%CAPACITI_QUEUE_ARRAY;
		size_--;
		return temp;
		}
	}


	@Override
	public int size() {
		return size_;
	}

	public void expansionQuAr(){
		rotate(CAPACITI_QUEUE_ARRAY-QuArBegin); //сдвиг начала очереди к началу массива
		int newCapaciti=CAPACITI_QUEUE_ARRAY*2;
		T[] Temp = (T[]) new Object[newCapaciti];
		for (int i=0; i<CAPACITI_QUEUE_ARRAY; i++){
			Temp[i]=QuArData[i];
		}
		QuArEnd=CAPACITI_QUEUE_ARRAY;
		QuArBegin=0;
		CAPACITI_QUEUE_ARRAY=newCapaciti;
		QuArData = Temp;
	}

	@Override
	public void rotate(int posNum) {
		posNum=posNum % CAPACITI_QUEUE_ARRAY; //Устранение лишних прогонов
		for (int i=0; i<posNum; i++){
			T temp=QuArData[CAPACITI_QUEUE_ARRAY-1];
			for (int j=CAPACITI_QUEUE_ARRAY-1; j > 0; --j)
				QuArData[j]=QuArData[j-1];
			QuArData[0]=temp;
			}
		QuArBegin=(QuArBegin+posNum)% CAPACITI_QUEUE_ARRAY;
		QuArEnd=(QuArEnd+posNum)% CAPACITI_QUEUE_ARRAY;
	}
	
	private class MyIterator implements Iterator<T> {

		T current;
		int position;
		
		public MyIterator(){
			current=QuArData[QuArBegin];
			position=QuArBegin-1;
			}
		
		@Override
		public boolean hasNext() {
			if((position%CAPACITI_QUEUE_ARRAY)==(QuArEnd-1))
			return false;
			else
			return true;
		}

		@Override
		public T next() {
			T nex=QuArData[(position+1)%CAPACITI_QUEUE_ARRAY];
			current=QuArData[(position+1)%CAPACITI_QUEUE_ARRAY];
			position=(position+1)%CAPACITI_QUEUE_ARRAY;
			return nex;
		}
		
	}
	
	@Override
	public Iterator<T> iterator() {
		return new MyIterator();
	}
}
