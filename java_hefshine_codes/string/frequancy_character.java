package string_repeat_aug25;
public class frequancy_character {
public static void main(String[] args) {
		String s="tetwetrdtddstertrxr";
		char[]a1=s.toCharArray();
		int duplicount=0;
		
		for (int i = 0; i < a1.length; i++) 
		{
		   for (int j = i+1; j < a1.length; j++) 
		   {
			   if(a1[i]==a1[j])
			   {
				   duplicount++;
				   break;
			   }
		   }	
		}
		char[]a2=new char[a1.length-duplicount];
		int []a3=new int[a2.length];
		int index=0;
		for (int i = 0; i < a1.length; i++) 
		{   int count=0;
		   for (int j = 0; j < a2.length; j++) 
		   {
			  if(a1[i]==a2[j])
				  count++;
		   }
		   if(count==0)
			   a2[index++]=a1[i];
		   
		}
		
		for (int i = 0; i < a2.length; i++) 
		{
		    int count=0;
		    for (int j = 0; j < a1.length; j++) 
		    {
				if(a1[j]==a2[i])
					count++;
			}
		    a3[i]=count;
		}
		
		for (int i = 0; i < a3.length; i++)
		{
		     for (int j = 0; j < a3.length; j++) 
		     {
			    if(i<j && a3[i]>a3[j])
			    {
			    	int temp=a3[i];
			    	a3[i]=a3[j];
			    	a3[j]=temp;
			    	
			    	char temp2=a2[i];
			    	a2[i]=a2[j];
			    	a2[j]=temp2;
			    }
			 }	
		}
		
		for (int i = 0; i < a3.length; i++) 
		{
		    System.out.println(a2[i]+" "+a3[i]);	
		}
		System.out.println();
		System.out.println("max: "+a2[a2.length-1]+" "+a3[a3.length-1]);
		System.out.println("min: "+a2[0]+" "+a3[0]);
		
		
		
	}

}
