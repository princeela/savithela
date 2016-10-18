/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prince6;

import java.util.Scanner;

/**
 *
 * @author KSRIET
 */
public class Prince6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int n,p,t;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int ar1[]=new int[n];
for(int i=0;i<n;i++)
ar1[i]=sc.nextInt();
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if(ar1[i]>ar1[j])
{
t=ar1[i];
ar1[i]=ar1[j];
ar1[j]=t;
}
}
}
for(int i=0;i<n-1;i++)
{
if(ar1[i]==ar1[i+1])
{
    System.out.println(ar1[i]);
}
}   // TODO code application logic here
    }
    
}
