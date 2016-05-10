package cn.edu.qdu.car;

import java.util.Scanner;

public class Sys {
	//属性
	Vehicles[] vehicles;

	//静态块
	//初始化块
	//构造方法
	//方法
	//租车
	public void rentVehicle(){
		String[] carBrand={"别克","宝马","奥迪"};  //汽车品牌
		int[] coacheSeatNumber={16,32};		//客车座位数
		Scanner input=new Scanner(System.in);
		System.out.println("请问您想租多少辆车？");
		int count=input.nextInt();
		vehicles=new Vehicles[count];
		int[] rentedDays=new int[count];
		
		int carNo=11111;
		int busNo=55555;
		double totalFee=0;
		String key;	
		
		for (int i = 0; i < count; i++) {
			System.out.println("请问您想租什么车？");
			System.out.println("1.汽车\t2.客车");
			int choice1=input.nextInt();
			if(choice1==1){
				System.out.println("请选择汽车的品牌：");
				System.out.println("1.别克\t2.宝马\t3.奥迪");
				int choice2=input.nextInt();
				String lincensePlateNumber="鲁B"+carNo;		
//				System.out.println(lincensePlateNumber);
//				System.out.println(choice2+carBrand[choice2-1]);
				vehicles[i]=new Car(lincensePlateNumber,carBrand[choice2-1]);
				System.out.println("请问您想租多少天？");
				rentedDays[i]=input.nextInt();
				totalFee=totalFee+rentFee(vehicles[i],rentedDays[i],totalFee);
				carNo++;
			}else{
				System.out.println("请问您想多少座位数的客车：");
				System.out.println("1.<=16座\t2.>16座");
				int choice2=input.nextInt();
				String licensePlateNumber="鲁A"+busNo;
				vehicles[i]=new Coache(licensePlateNumber,coacheSeatNumber[choice2-1]);
				System.out.println("请问您想租多少天？");
				rentedDays[i]=input.nextInt();
				totalFee=totalFee+rentFee(vehicles[i],rentedDays[i],totalFee);
			}
		}		
		//显示所租的所有车辆
		System.out.println("车型\t型号/座位数\t日租金\t租车天数\t车牌号");
		showAllRentedVehicles(vehicles,rentedDays);
		//输出总租金
		System.out.println("租金一共："+totalFee+"元");
	}
	
	//计算租金
	public double rentFee(Vehicles vehicle,int days,double totalFee){
		if(vehicle instanceof Car){
			if(((Car) vehicle).getBrand().equals("别克")){
				vehicle.setDayRates(400);
			}else if(((Car) vehicle).getBrand().equals("宝马")){
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
	
	//显示所租的所有车辆
	public void showAllRentedVehicles(Vehicles[] vehicles,int[] rentedDays){
		for (int i = 0; i < vehicles.length; i++) {
			if (vehicles[i] instanceof Car) {
				System.out.print("汽车\t");
				vehicles[i].show(rentedDays[i]);				
			}else{
				System.out.print("客车\t");
				vehicles[i].show(rentedDays[i]);
			}
		}
	}
}
