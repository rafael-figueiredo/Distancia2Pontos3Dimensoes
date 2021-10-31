import java.text.DecimalFormat;
import java.util.Scanner;

public class Distancia2Pontos {
	public double r1, r2, r3, d, x1, x2, y1,y2, z1,z2;
	Scanner sc = new Scanner (System.in);
	
	public void calcular() {
		System.out.println("Informe o valor de X1:");
		x1 = sc.nextDouble();
		
		System.out.println("Informe o valor de X2:");
		x2 = sc.nextDouble();
		
		System.out.println("Informe o valor de Y1:");
		y1 = sc.nextDouble();
		
		System.out.println("Informe o valor de Y2:");
		y2 = sc.nextDouble();
		
		System.out.println("Informe o valor de Z1:");
		z1 = sc.nextDouble();
		
		System.out.println("Informe o valor de Z2:");
		z2 = sc.nextDouble();
		
		r1 = x2 - x1;
		r2 = y2 - y1;
		r3 = z2 - z1;
		
		d = Math.sqrt((Math.pow(r1, 2) + Math.pow(r2, 2) + Math.pow(r3, 2)));
		
		DecimalFormat df = new DecimalFormat("#,##0.00");
		
		System.out.println("A distância entre os 2 pontos em 3 dimensões é de: " + df.format(d));
	}
}
