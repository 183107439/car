package cn.edu.qdu.car;

public class Coache extends Vehicles {
	//属性
	private int seatNumber;  //座位数
	//静态块
	//初始化块
	//构造方法
	public Coache(String licensePlateNumber){
		super(licensePlateNumber);
	}
	//方法
//	@Override
	//计算租金
//	public double rentFee(int days){
//		if(seatNumber<=16){
//			setDayRates(800);
//		}else{
//			setDayRates(1500);
//		}
//		return super.rentFee(days);
//	}
	
	@Override
	public void show(){
		//System.out.println("品牌\t座位数\t车牌号");
		System.out.print(seatNumber+"\t");
		super.show();
	}
	
	public int getSeatNumber() {
		return seatNumber;
	}
	
	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}
	
}
