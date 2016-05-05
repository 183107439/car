package cn.edu.qdu.car;

public class Car extends Vehicles {
	//属性
	private String brand;  //汽车品牌
	//静态块
	//初始化块
	
	//构造方法
	public Car(String lincensePlateNumber,String brand){
		super(lincensePlateNumber);
		this.brand=brand;
	}
	//方法
//	@Override
//	//计算租金
//	public double rentFee(int days){
//		if(brand.equals("别克")){
//			setDayRates(400);
//		}else if(brand.equals("宝马")){
//			setDayRates(500);
//		}else{
//			setDayRates(600);
//		}
//		return super.rentFee(days);
//	}
	
	@Override
	public void show(int ratedDays){
		//System.out.println("品牌\t日租金\t车牌号");
		System.out.print(brand+"\t");
		super.show(ratedDays);
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}	
	
}
