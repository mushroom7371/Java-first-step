package AlgorithmStudy;

import java.util.Scanner;

public class TriangleLB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //Ű����� ���� �Է¹ޱ����� Scanner �ν��Ͻ��� �����ϰ�  Scanner Ÿ���� �������� sc�� �ּҰ��� �����Ѵ�.
		int n; //int Ÿ���� ���� n�� �����Ѵ� �ʱ�ȭ�� ���� �ʾ� 0���� �ʱⰪ�� ������
		
		System.out.println("���ʾƷ��� ������ �̵ �ﰢ���� ����մϴ�.");
		
		do {	//do while �ݺ��� do{}���� ������ ������ �ѹ� �ݺ��ȴ�.
			System.out.println("�� ���� �Է��� �ּ���.");
			n = sc.nextInt();	//�ռ� �ʵ忡�� ������ ���� n�� Ű����� �Է¹��� ���� nextInt()�޼��带 ȣ���Ͽ� int ������ ������ �� �����Ѵ�.
		}while(n <= 0);	//while ���� ������ ���� �Ǹ�, �� �Է¹��� ���ڰ� 0���� �̸� �ٽ� do{}�� �ö󰡼� �ݺ��� �ǽ��Ѵ�. ������ �����̸� �Ʒ��� ��������.
		
		for(int i = 1; i <= n; i++) {	//int Ÿ���� ���� i�� �����ϰ� 1�� �ʱ�ȭ ����, Ű����� �Է¹��� n ���� ���� 1�� �������� �ݺ��Ѵ�.
			for(int j = 1; j <= i; j++) {	//i�� �ݺ��Ҷ����� �ٽ� �ݺ��� ��Ű�µ�  i�������� �ݺ��� �ǽ��Ѵ�.
				System.out.print("*");	//���� i�� 2��� �����ϸ�, j�� 1�� *�� �ѹ� ����ϰ� �ٶ�⸦ �������� ���¿��� j�� 2���Ǹ� �ٽ� �Ѻ� *�� ��´� �̷��� �������� j�� i�� �ɶ����� *�� ����Ѵ�.
			}
			System.out.println();	//i�� �����Ҷ����� �ٶ�⸦ �����Ѵ�.
		}

	}

}