import java.io.*;
import java.lang.reflect.Array;
import java.util.*;


public class Homework {
	
//belirli bir de�erin indexsini bulduracak olan komut
	public static int indexFinder(int[] a, int target) {
		
		for (int i = 0; i<a.length;i++) {
			
			if(a[i] == target) {
				
				return i;
			}
		}
		return 0;
	}
	//Arrayleri kendi i�inde s�ralamak i�in kulland���m�z metot
	static int sortAndFound(int []arr, int n) {
		
		Arrays.sort(arr);
		
		return arr[n-1];
	}
	
	

	public static void main(String[] args) throws IOException   {
	//Tek boyutlu Arrayleri olu�turdu�umuz ve Random objesini olu�turdu�umuz k�s�m
		
	Random random = new Random();
	
	int[] arr1 = new int[100];
	
	int[] arr2 = new int[100];
	
	int[] arr3 = new int[100];
	
	int[] arrSample = new int[100];
	
	//Arraye random say�lar� atayan d�ng�
	
	for(int a = 0 ; a < arr1.length ; a++) {
		
		arr1[a] = random.nextInt(1000);

	    }
	//�lk array i ikincisine kopyalan d�ng�
	for(int b = 0 ; b < arr1.length ; b++) {
		
		arr2[b] = arr1[b];
		
	    }
	//�kinci arrayi ���nc�s�ne kopyalayan d�ng�
	for(int c = 0 ; c < arr2.length ; c++) {
		
		arr3[c] = arr2[c];
	    }
	
	
	for (int d = 0 ; d < arr3.length ; d++) {
		
		arrSample[d] = arr3[d];
	}
	
	//�lk arrayi indexleri ile set etti�i say�lar� yazd�ran d�ng�
	for(int i = 0; i < arr1.length ; i++) {
		
		
		
		System.out.println( ( i ) +  "-"  + arr1[i]);
		
	    }
	
	//Buldu�umuz en b�y�k ve en k���k say�lar� yazd�rd���m�z k�s�m
	        
	         int n = arr1.length;
	         
	         int ebs = sortAndFound(arr1, n);
	         
	         int eks = sortAndFound(arr1, 1);
	        
	         
	         System .out.println("Dizideki en b�y�k say� : ");
	         
	         System.out.println(ebs);
	         
	         System.out.println("Dizideki en b�y�k say�n�n indexi : ");
	         
	         System.out.println((indexFinder(arr2, ebs) + 1 ));
	         
	         System.out.println("Dizideki en k���k say� : ");
	         
	         System.out.println(eks);
	         
	         System.out.println("Dizideki en k���k say�n�n indexi : ");
	         
	         System.out.println((indexFinder(arr2, eks) + 1));
	         
	         System.out.println("�kinici dizinin ba�lad��� k�s�m : \n");
	         
	 //�kinci diziyi s�ralayaca��m�z ve index bulaca��m�z k�s�m
	         Arrays.sort(arr2);
	         
	         for (int i =arr2.length -1; i>=0;i--){
	  
	             System.out.println((arr2.length -(i+1)) +"-"+ arr2[i] +"-�lk dizideki indexi-"+ indexFinder(arrSample, arr2[i]));
	           }
	         
	         
	         System.out.println("���nc� dizinin ba�lad��� k�s�m : \n");
	         
	         
	         
     //���nc� diziyi s�ralayaca��m�z ve index bulaca��m�z k�s�m
	         Arrays.sort(arr3);
	         
	         for (int h = 0; h < arr3.length;h++) {
	        	 
	        	 System.out.println(h + "-" + arr3[h] + "-�lk dizideki indexi-" + indexFinder(arrSample,arr3[h]));
	         }
	         
	         
	    
	         
	       
	         
	       
	         
	         
	         
	      
	         

	         
	        
	         
	 
	         
	 
	 
	         
	         
	        
	         
	
	}
}
