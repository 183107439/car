package cn.edu.qdu.car;

import java.util.Scanner;

public class Sys {
	//����
//	Vehicles[] vehicles;
//	private double totalFee=0;
	//��̬��
	//��ʼ����
	//���췽��
	//����
	//�⳵
	public void rentVehicle(){
		String[] carBrand={"���","����","�µ�"};  //����Ʒ��
		int[] coacheSeatNumber={16,32};		//�ͳ���λ��
		Scanner input=new Scanner(System.in);
		double totalFee=0;
		String key;
		do{
			System.out.println("����������ʲô����");
			System.out.println("1.����\t2.�ͳ�");
			int choice1=input.nextInt();
			if(choice1==1){
				int carNo=11111;
				System.out.println("�������������������");
				int count=input.nextInt();
				Vehicles[] vehicles=new Car[count];  //��̬
				int[] rentedDays=new int[count];
				for (int i = 0; i < vehicles.length; i++) {
					System.out.println("��ѡ��������Ʒ�ƣ�");
					System.out.println("1.���\t2.����\t3.�µ�");
					int choice2=input.nextInt();
					//��������Ʒ�ơ����ƺ�
					String licensePlateNumber="³B"+(carNo+i);
					vehicles[i]=new Car(licensePlateNumber,carBrand[choice2-1]);  //��̬   					
//					((Car)vehicles[i]).setBrand(carBrand[choice2-1]); //���е���������ô��
					//�����⳵����
					System.out.println("��������������죿");
					rentedDays[i]=input.nextInt();
					//���������
					//totalFee=totalFee+vehicles[i].rentFee(rentedDays);
					totalFee=totalFee+rentFee(vehicles[i],rentedDays[i],totalFee);
				}
				System.out.println("������������У�");
				System.out.println("Ʒ��\t�����\t�⳵����\t���ƺ�");
				for (int i = 0; i < vehicles.length; i++) {
					vehicles[i].show(rentedDays[i]);
				}
				//System.out.println("���һ����"+totalFee);
			}else{
				int busNo=55555;
				System.out.println("�������������������");
				int count=input.nextInt();
				Vehicles[] vehicles=new Coache[count];	//��̬
				int[] rentedDays=new int[count];
				for (int i = 0; i < vehicles.length; i++) {
					System.out.println("��ѡ��ͳ����ͣ�");
					System.out.println("1. <=16��\t 2. >16��");
					int choice2=input.nextInt();
					//���ÿͳ����͡����ƺ�
					String licensePlateNumber="³A"+(busNo+i);
					vehicles[i]=new Coache(licensePlateNumber,coacheSeatNumber[choice2-1]);	//��̬					
//					((Coache)vehicles[i]).setSeatNumber(coacheSeatNumber[choice2-1]); //���е���������ô��
					//�����⳵����
					System.out.println("��������������죿");
					rentedDays[i]=input.nextInt();
					//���������
					//totalFee=totalFee+vehicles[i].rentFee(rentedDays);
					totalFee=totalFee+rentFee(vehicles[i],rentedDays[i],totalFee);
				}
				System.out.println("������Ŀͳ��У�");
				System.out.println("Ʒ��\t��λ��\t�⳵����\t���ƺ�");
				for (int i = 0; i < vehicles.length; i++) {
					vehicles[i].show(rentedDays[i]);
				}
				//System.out.println("���һ����"+totalFee);
			}	
			System.out.println("�Ƿ�����⳵��(y/n)");
			key=input.next();
		}while(key.equalsIgnoreCase("y"));
		//��������
		System.out.println("���һ����"+totalFee+"Ԫ");
	}
	
	//�������
	public double rentFee(Vehicles vehicle,int days,double totalFee){
		if(vehicle instanceof Car){
			if(((Car) vehicle).getBrand().equals("���")){
				vehicle.setDayRates(400);
			}else if(((Car) vehicle).getBrand().equals("����")){
				vehicle.setDayRates(500);
			}else{
				vehicle.setDayRates(600);
			}
			//return vehicle.getDayRates()*days;
		}
		else{
			if(((Coache)vehicle).getSeatNumber()<=16){
				vehicle.setDayRates(800);
			}else{
				vehicle.setDayRates(1500);
			}
			//return 
		}
		return vehicle.getDayRates()*days;
	}
	
}
