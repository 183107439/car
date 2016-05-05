package cn.edu.qdu.car;

import java.util.Scanner;

public class Sys {
	//属性
//	Vehicles[] vehicles;
//	private double totalFee=0;
	//静态块
	//初始化块
	//构造方法
	//方法
	//租车
	public void rentVehicle(){
		String[] carBrand={"别克","宝马","奥迪"};  //汽车品牌
		int[] coacheSeatNumber={16,32};		//客车座位数
		Scanner input=new Scanner(System.in);
		double totalFee=0;
		String key;
		do{
			System.out.println("请问您想租什么车？");
			System.out.println("1.汽车\t2.客车");
			int choice1=input.nextInt();
			if(choice1==1){
				int carNo=11111;
				System.out.println("请问您想租多少辆车？");
				int count=input.nextInt();
				Vehicles[] vehicles=new Car[count];  //多态
				int[] rentedDays=new int[count];
				for (int i = 0; i < vehicles.length; i++) {
					System.out.println("请选择汽车的品牌：");
					System.out.println("1.别克\t2.宝马\t3.奥迪");
					int choice2=input.nextInt();
					//设置汽车品牌、车牌号
					String licensePlateNumber="鲁B"+(carNo+i);
					vehicles[i]=new Car(licensePlateNumber,carBrand[choice2-1]);  //多态   					
//					((Car)vehicles[i]).setBrand(carBrand[choice2-1]); //可行但不建议这么做
					//设置租车天数
					System.out.println("请问您想租多少天？");
					rentedDays[i]=input.nextInt();
					//总租金增加
					//totalFee=totalFee+vehicles[i].rentFee(rentedDays);
					totalFee=totalFee+rentFee(vehicles[i],rentedDays[i],totalFee);
				}
				System.out.println("您所租的汽车有：");
				System.out.println("品牌\t日租金\t租车天数\t车牌号");
				for (int i = 0; i < vehicles.length; i++) {
					vehicles[i].show(rentedDays[i]);
				}
				//System.out.println("租金一共："+totalFee);
			}else{
				int busNo=55555;
				System.out.println("请问您想租多少辆车？");
				int count=input.nextInt();
				Vehicles[] vehicles=new Coache[count];	//多态
				int[] rentedDays=new int[count];
				for (int i = 0; i < vehicles.length; i++) {
					System.out.println("请选择客车类型：");
					System.out.println("1. <=16座\t 2. >16座");
					int choice2=input.nextInt();
					//设置客车类型、车牌号
					String licensePlateNumber="鲁A"+(busNo+i);
					vehicles[i]=new Coache(licensePlateNumber,coacheSeatNumber[choice2-1]);	//多态					
//					((Coache)vehicles[i]).setSeatNumber(coacheSeatNumber[choice2-1]); //可行但不建议这么做
					//设置租车天数
					System.out.println("请问您想租多少天？");
					rentedDays[i]=input.nextInt();
					//总租金增加
					//totalFee=totalFee+vehicles[i].rentFee(rentedDays);
					totalFee=totalFee+rentFee(vehicles[i],rentedDays[i],totalFee);
				}
				System.out.println("您所租的客车有：");
				System.out.println("品牌\t座位数\t租车天数\t车牌号");
				for (int i = 0; i < vehicles.length; i++) {
					vehicles[i].show(rentedDays[i]);
				}
				//System.out.println("租金一共："+totalFee);
			}	
			System.out.println("是否继续租车？(y/n)");
			key=input.next();
		}while(key.equalsIgnoreCase("y"));
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
