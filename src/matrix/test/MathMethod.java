package matrix.test;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.LUDecomposition;
import org.apache.commons.math3.linear.RealMatrix;
/*
 * author:�Ϸʹ�ҵ��ѧ ��ԺѧԺ Ǯ�� 
 *1563178220@qq.com
 *���͵�ַ:http://blog.csdn.net/qy20115549/
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
		//ת��
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
		//������ת��Ϊ����
		RealMatrix matrix = new Array2DRowRealMatrix(b);
		System.out.println("����������Ϊ��\t"+matrix);
		//��ȡ��������� getColumnDimension() 
		System.out.println("���������Ϊ:\t"+matrix.getColumnDimension());
		//��ȡ���������
		System.out.println("���������Ϊ:\t"+matrix.getRowDimension());
		//��ȡ�����ĳһ��,����,��ȻΪ����
		System.out.println("����ĵ�һ��Ϊ:\t"+ matrix.getRowMatrix(0));
		//��ȡ�����ĳһ��,����,ת��Ϊ����
		System.out.println("����ĵ�һ��������ʾΪ:\t"+ matrix.getRowVector(1) );
		//����ĳ˷�
		double testmatrix[][] = new double[2][2];
		testmatrix[0][0] = 1;
		testmatrix[0][1] = 2;
		testmatrix[1][0] = 3;
		testmatrix[1][1] = 4;
		RealMatrix testmatrix1 = new Array2DRowRealMatrix(testmatrix);
		System.out.println("����������˺�Ľ��Ϊ��\t"+testmatrix1.multiply(testmatrix1) );
		//�����ת��
		System.out.println("ת�ú�ľ���Ϊ��\t"+testmatrix1.transpose());
		//��������
		RealMatrix inversetestMatrix = inverseMatrix(testmatrix1);
		System.out.println("�����Ϊ��\t"+inversetestMatrix);
		//����ת��Ϊ���� getdata
		double matrixtoarray[][]=inversetestMatrix.getData();
		System.out.println("�����е�ĳһ������Ϊ��\t"+matrixtoarray[0][1]);*/
	}
	//���溯��
	public static RealMatrix inverseMatrix(RealMatrix A) {
		RealMatrix result = new LUDecomposition(A).getSolver().getInverse();
		return result; 
	}
}
