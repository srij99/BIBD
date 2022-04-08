/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bibd.prac;

/**
 *
 * @author admin
 */
import java.io.*;
import java.util.*;

public class BIBDPRAC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=15;
	String stream[]={"a","b","c","b","d","a","c","d","a","b","d","c","a","a","b"};
	int zero_moment=0,first_moment=0,second_moment=0,count=1,flag=0;
	ArrayList<Integer> arrlist=new ArrayList();;
		
	System.out.println("Arraylist elements are :: ");		 
		
	for(int i=0;i<15;i++)
	{
		System.out.print(stream[i]+" ");
	}
	Arrays.sort(stream);

	for(int i=1;i<n;i++)
	{
		if(stream[i]==stream[i-1])
		{
				count++;
		}
		else
		{				
			arrlist.add(count);
			count=1;
		}
	}
	arrlist.add(count);

	zero_moment=arrlist.size();
	System.out.println("\n\n\nValue of Zeroth moment for given stream ::"+zero_moment);

	for(int i=0;i<arrlist.size();i++)
	{
		first_moment+=arrlist.get(i);
	}
	System.out.println("\n\nValue of First moment for given stream ::"+first_moment);

	for(int i=0;i<arrlist.size();i++)
	{
		int j=arrlist.get(i);
		second_moment+=(j*j);
	}
	System.out.println("\n\nValue of Second moment for given stream ::"+second_moment);
    }
    
}
