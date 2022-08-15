import java.io.*;
import java.lang.reflect.Array;
import java.util.*;


public class Homework {
	
//belirli bir deðerin indexsini bulduracak olan komut
	public static int indexFinder(int[] a, int target) {
		
		for (int i = 0; i<a.length;i++) {
			
			if(a[i] == target) {
				
				return i;
			}
		}
		return 0;
	}
	//Arrayleri kendi içinde sýralamak için kullandýðýmýz metot
	static int sortAndFound(int []arr, int n) {
		
		Arrays.sort(arr);
		
		return arr[n-1];
	}
	
	

	public static void main(String[] args) throws IOException   {
	//Tek boyutlu Arrayleri oluþturduðumuz ve Random objesini oluþturduðumuz kýsým
		
	Random random = new Random();
	
	int[] arr1 = new int[100];
	
	int[] arr2 = new int[100];
	
	int[] arr3 = new int[100];
	
	int[] arrSample = new int[100];
	
	//Arraye random sayýlarý atayan döngü
	
	for(int a = 0 ; a < arr1.length ; a++) {
		
		arr1[a] = random.nextInt(1000);

	    }
	//Ýlk array i ikincisine kopyalan döngü
	for(int b = 0 ; b < arr1.length ; b++) {
		
		arr2[b] = arr1[b];
		
	    }
	//Ýkinci arrayi üçüncüsüne kopyalayan döngü
	for(int c = 0 ; c < arr2.length ; c++) {
		
		arr3[c] = arr2[c];
	    }
	
	
	for (int d = 0 ; d < arr3.length ; d++) {
		
		arrSample[d] = arr3[d];
	}
	
	//Ýlk arrayi indexleri ile set ettiði sayýlarý yazdýran döngü
	for(int i = 0; i < arr1.length ; i++) {
		
		
		
		System.out.println( ( i ) +  "-"  + arr1[i]);
		
	    }
	
	//Bulduðumuz en büyük ve en küçük sayýlarý yazdýrdýðýmýz kýsým
	        
	         int n = arr1.length;
	         
	         int ebs = sortAndFound(arr1, n);
	         
	         int eks = sortAndFound(arr1, 1);
	        
	         
	         System .out.println("Dizideki en büyük sayý : ");
	         
	         System.out.println(ebs);
	         
	         System.out.println("Dizideki en büyük sayýnýn indexi : ");
	         
	         System.out.println((indexFinder(arr2, ebs) + 1 ));
	         
	         System.out.println("Dizideki en küçük sayý : ");
	         
	         System.out.println(eks);
	         
	         System.out.println("Dizideki en küçük sayýnýn indexi : ");
	         
	         System.out.println((indexFinder(arr2, eks) + 1));
	         
	         System.out.println("Ýkinici dizinin baþladýðý kýsým : \n");
	         
	 //Ýkinci diziyi sýralayacaðýmýz ve index bulacaðýmýz kýsým
	         Arrays.sort(arr2);
	         
	         for (int i =arr2.length -1; i>=0;i--){
	  
	             System.out.println((arr2.length -(i+1)) +"-"+ arr2[i] +"-Ýlk dizideki indexi-"+ indexFinder(arrSample, arr2[i]));
	           }
	         
	         
	         System.out.println("Üçüncü dizinin baþladýðý kýsým : \n");
	         
	         
	         
     //Üçüncü diziyi sýralayacaðýmýz ve index bulacaðýmýz kýsým
	         Arrays.sort(arr3);
	         
	         for (int h = 0; h < arr3.length;h++) {
	        	 
	        	 System.out.println(h + "-" + arr3[h] + "-Ýlk dizideki indexi-" + indexFinder(arrSample,arr3[h]));
	         }
	         
	         
	    
	         
	       
	         
	       
	         
	         
	         
	      
	         

	         
	        
	         
	 
	         
	 
	 
	         
	         
	        
	         
	
	}
}
