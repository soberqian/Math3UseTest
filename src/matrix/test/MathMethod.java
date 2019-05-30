package matrix.test;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.LUDecomposition;
import org.apache.commons.math3.linear.RealMatrix;
/*
 * author:合肥工业大学 管院学院 钱洋 
 *1563178220@qq.com
 *博客地址:http://blog.csdn.net/qy20115549/
*/
public class MathMethod {
	public static void main(String args[]){
		/*double v=2.0;
		double d [][]=new double[][]{{1,2,3},{2,3,4}};
		RealMatrix mat = new Array2DRowRealMatrix(d);
		System.out.println("row"+mat.getRowVector(0).toArray()[0]);
		double e[][]=new double[][]{{1,2,3},{2,3,5}};
		RealMatrix mat1 = new Array2DRowRealMatrix(e);
		List<RealMatrix> listRealMatrix=new ArrayList<RealMatrix>(); 
		listRealMatrix.add(mat);
		listRealMatrix.add(mat1);
		for (int i = 0; i < listRealMatrix.size(); i++) {
			RealMatrix realMatrix=listRealMatrix.get(i);
			System.out.println(realMatrix);
			
		}
		System.out.println(mat.preMultiply(mat.transpose()));*/
//		double a1[]=new double[]{1,2};
//		RealMatrix mat1 = new Array2DRowRealMatrix(a1);
//		System.out.println(mat.multiply(mat));
		/*double a[]=new double[]{1,2,3,4};
		RealMatrix matrix_1 = new Array2DRowRealMatrix(a);
		System.out.println(matrix_1);*/
		double a[]=new double[]{1,2,3,4};
		double b[]=new double[]{2,3,4,5};
		
		RealMatrix matrix_2 = new Array2DRowRealMatrix(b);
		//转置
		RealMatrix matrix_1 = new Array2DRowRealMatrix(a);
		RealMatrix matrix1=matrix_1.transpose();
		System.out.println(matrix_1.multiply(matrix1));
		
		RealMatrix matrix2=matrix_1.multiply(matrix1);
		
		RealMatrix matrix11=matrix_2.transpose();
		RealMatrix matrix22=matrix_2.multiply(matrix11);
		System.out.println(matrix2.add(matrix22));
		double d [][]=new double[][]{{1,2,3,4},{2,3,4,5}};
		RealMatrix m1 = new Array2DRowRealMatrix(d);
		System.out.println(m1);
		RealMatrix m2=m1.transpose();
		System.out.println(m2);
		System.out.println(m2.multiply(m1));
		
		/*double b [][] = new double[5][5];
		for(int i = 0; i < b.length; i++) {
			b[i][i] = 1;  
		}
		//将数组转化为矩阵
		RealMatrix matrix = new Array2DRowRealMatrix(b);
		System.out.println("创建的数组为：\t"+matrix);
		//获取矩阵的列数 getColumnDimension() 
		System.out.println("矩阵的列数为:\t"+matrix.getColumnDimension());
		//获取矩阵的行数
		System.out.println("矩阵的行数为:\t"+matrix.getRowDimension());
		//获取矩阵的某一行,返回,仍然为矩阵
		System.out.println("矩阵的第一行为:\t"+ matrix.getRowMatrix(0));
		//获取矩阵的某一行,返回,转化为向量
		System.out.println("矩阵的第一行向量表示为:\t"+ matrix.getRowVector(1) );
		//矩阵的乘法
		double testmatrix[][] = new double[2][2];
		testmatrix[0][0] = 1;
		testmatrix[0][1] = 2;
		testmatrix[1][0] = 3;
		testmatrix[1][1] = 4;
		RealMatrix testmatrix1 = new Array2DRowRealMatrix(testmatrix);
		System.out.println("两个矩阵相乘后的结果为：\t"+testmatrix1.multiply(testmatrix1) );
		//矩阵的转置
		System.out.println("转置后的矩阵为：\t"+testmatrix1.transpose());
		//矩阵求逆
		RealMatrix inversetestMatrix = inverseMatrix(testmatrix1);
		System.out.println("逆矩阵为：\t"+inversetestMatrix);
		//矩阵转化为数组 getdata
		double matrixtoarray[][]=inversetestMatrix.getData();
		System.out.println("数组中的某一个数字为：\t"+matrixtoarray[0][1]);*/
	}
	//求逆函数
	public static RealMatrix inverseMatrix(RealMatrix A) {
		RealMatrix result = new LUDecomposition(A).getSolver().getInverse();
		return result; 
	}
}
