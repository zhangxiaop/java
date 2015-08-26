package areaPackage;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class SmArea {
	   public static void main(String[] args)
	   {        
		   double R = 0, S, C, V;                
		   try {            
			   System.out.print("请输入圆的半径：");            
			   R = Double.parseDouble((new BufferedReader(new InputStreamReader(System.in))).readLine());
			   } catch (Exception e) {            
				   System.out.println("你输入的不是一个可计算的圆半径 继续请直接输入一个实数 退出请输入0"); 
				   return;        }        
		   S = R * R * Math.PI;        
		   System.out.println("圆的面积:" + S);        
		   C = 2 * R * Math.PI;        
		   System.out.println("圆的周长:" + C);       
		   V = (4 / 3) * R * R * R * Math.PI;       
		   System.out.println("圆的体积:" + V);   
		   }
	   }



