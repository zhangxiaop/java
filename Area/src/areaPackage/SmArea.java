package areaPackage;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class SmArea {
	   public static void main(String[] args)
	   {        
		   double R = 0, S, C, V;                
		   try {            
			   System.out.print("������Բ�İ뾶��");            
			   R = Double.parseDouble((new BufferedReader(new InputStreamReader(System.in))).readLine());
			   } catch (Exception e) {            
				   System.out.println("������Ĳ���һ���ɼ����Բ�뾶 ������ֱ������һ��ʵ�� �˳�������0"); 
				   return;        }        
		   S = R * R * Math.PI;        
		   System.out.println("Բ�����:" + S);        
		   C = 2 * R * Math.PI;        
		   System.out.println("Բ���ܳ�:" + C);       
		   V = (4 / 3) * R * R * R * Math.PI;       
		   System.out.println("Բ�����:" + V);   
		   }
	   }



