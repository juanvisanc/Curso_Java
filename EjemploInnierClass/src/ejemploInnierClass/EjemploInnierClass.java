package ejemploInnierClass;

import ejemploInnierClass.EjemploInnierClass.InnerEventIterator;

public class EjemploInnierClass {

	private final static int SIZE=15;
	public static int[] arrayOfInt=new int [SIZE];
	
	public EjemploInnierClass() {
		
		for(int i=0;i<SIZE;i++) {
			arrayOfInt[i]=i;
		}
	}
	
	
	
	public void printEvent() {
		
		InnerEventIterator iteractor=new InnerEventIterator();
		while(iteractor.hasNext()) {
			
			System.out.println("Clase inherente "+iteractor.getNext()+" ");
			
		}
	}
	
	public class InnerEventIterator {
	
		private int next=0;
		
		public boolean hasNext() {
			return(next<=SIZE-1);
		}
		
		public int getNext() {
			int retValue=arrayOfInt[next];
			next+=2;
			return retValue;
		}
		
	}
	
	public static void main (String[] args) {
		
		EjemploInnierClass eic=new EjemploInnierClass();
		eic.printEvent();
	}

}
