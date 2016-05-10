package cn.edu.qdu.car;

import java.util.Scanner;

public class Sys {
	//����
	Vehicles[] vehicles;

	//��̬��
	//��ʼ����
	//���췽��
	//����
	//�⳵
	public void rentVehicle(){
		String[] carBrand={"���","����","�µ�"};  //����Ʒ��
		int[] coacheSeatNumber={16,32};		//�ͳ���λ��
		Scanner input=new Scanner(System.in);
		System.out.println("�������������������");
		int count=input.nextInt();
		vehicles=new Vehicles[count];
		int[] rentedDays=new int[count];
		
		int carNo=11111;
		int busNo=55555;
		double totalFee=0;
		String key;	
		
		for (int i = 0; i < count; i++) {
			System.out.println("����������ʲô����");
			System.out.println("1.����\t2.�ͳ�");
			int choice1=input.nextInt();
			if(choice1==1){
				System.out.println("��ѡ��������Ʒ�ƣ�");
				System.out.println("1.���\t2.����\t3.�µ�");
				int choice2=input.nextInt();
				String lincensePlateNumber="³B"+carNo;		
//				System.out.println(lincensePlateNumber);
//				System.out.println(choice2+carBrand[choice2-1]);
				vehicles[i]=new Car(lincensePlateNumber,carBrand[choice2-1]);
				System.out.println("��������������죿");
				rentedDays[i]=input.nextInt();
				totalFee=totalFee+rentFee(vehicles[i],rentedDays[i],totalFee);
				carNo++;
			}else{
				System.out.println("�������������λ���Ŀͳ���");
				System.out.println("1.<=16��\t2.>16��");
				int choice2=input.nextInt();
				String licensePlateNumber="³A"+busNo;
				vehicles[i]=new Coache(licensePlateNumber,coacheSeatNumber[choice2-1]);
				System.out.println("��������������죿");
				rentedDays[i]=input.nextInt();
				totalFee=totalFee+rentFee(vehicles[i],rentedDays[i],totalFee);
			}
		}		
		//��ʾ��������г���
		System.out.println("����\t�ͺ�/��λ��\t�����\t�⳵����\t���ƺ�");
		showAllRentedVehicles(vehicles,rentedDays);
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
			
		}
		else{
			if(((Coache)vehicle).getSeatNumber()<=16){
				vehicle.setDayRates(800);
			}else{
				vehicle.setDayRates(1500);
			}
			 
		}
		return vehicle.getDayRates()*days;
	}
	
	//��ʾ��������г���
	public void showAllRentedVehicles(Vehicles[] vehicles,int[] rentedDays){
		for (int i = 0; i < vehicles.length; i++) {
			if (vehicles[i] instanceof Car) {
				System.out.print("����\t");
				vehicles[i].show(rentedDays[i]);				
			}else{
				System.out.print("�ͳ�\t");
				vehicles[i].show(rentedDays[i]);
			}
		}
	}
}
