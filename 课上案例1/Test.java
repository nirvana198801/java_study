package first_java;

import java.util.Scanner;

import net.xiudou.domain.Person;

/**
 * ������ Student User Person
 * @author Administrator
 *
 */
public class Test { 

	/**   
	 *dssdsd 
	 * @param args
	 */
   public static void main(String[] args) {
	  /*System.
	     out
	  .println("Hello World");*/
	   
	   /*
	    * 
	    * sasaasassa
	    * */
	   
	   int a= 1;
	   int A = 1;
	  // int void =2;
	   
	   byte x=127; // -128 ��127
	   System.out.println(x+1);
	   System.out.println((byte)(-128-1));
	   
	   double d1,d2=1000;
	   //d2=d2+1; //d2++
	   double d3 = d2++;
	   System.out.println("d2="+d2);
	   System.out.println("d3="+d3);
	   double d4 = ++d2;
	   System.out.println("d2="+d2);
	   System.out.println("d4="+d4);
	   
	   //�����߼�����
	   int flag = 1 & 3; // 000001
	                     // 000011
	   System.out.println(flag);
	   
	   //if else
	  /* Scanner sc = new Scanner(System.in);
	   int input =sc.nextInt();
	   if(input>0){
		   System.out.println("��������һ������");
	   }else if(input ==0){
		   System.out.println("��������һ��0");
	   }else{
		   System.out.println("��������һ������");
	   }*/
	   
	   //for
	  /* int begin =1;
	   int sum =0;
	   for(int i=1;i<=100; i++){
		    sum = sum + i; //sum += i;
	   }
	   System.out.println(sum);*/
	   
	   //while
	   boolean guessFlag=true;
	   int sz = 55;
	   while(guessFlag){
		   Scanner sc = new Scanner(System.in);
		   int input =sc.nextInt();
		   if(input>sz){
			   System.out.print("����������ֹ������������룺");
		   }else if(input < sz){
			   System.out.print("����������ֹ�С�����������룺");
		   }else{
			   System.out.print("�������������ȷ�������˳�");
			   guessFlag = false;
		   }
	   }
   }
}
