package random.test;


import java.util.ArrayList;
import java.util.List;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.random.SobolSequenceGenerator;

/*
 * author:合肥工业大学 管院学院 钱洋 
 *1563178220@qq.com
 *博客地址:http://blog.csdn.net/qy20115549/
*/
public class SobolSequenceTest {

	public static void main(String[] args) {
		SobolSequenceGenerator generator = new SobolSequenceGenerator(5);
	    generator.skipTo(999999); 
	    System.out.println("..............................");
	    double[] vector = generator.nextVector();
	    for (int i = 0; i < vector.length; i++) {
	    	System.out.println(vector[i]);
		}
	    System.out.println("..................");
	    System.out.println("............................");
	    List<RealMatrix> points = new ArrayList<RealMatrix>();
	    for (double i = 0; i < 3; i++) {
	        double[] vector1 = generator.nextVector();
	        RealMatrix pointMatrix = new Array2DRowRealMatrix(vector1);
	        points.add(pointMatrix);
	    }
	    for (int i = 0; i < points.size(); i++) {
			System.out.println(points.get(i));
		}
	}
}
