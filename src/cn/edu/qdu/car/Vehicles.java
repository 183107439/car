package cn.edu.qdu.car;

public class Vehicles {
	//属性
	private String licensePlateNumber;	//车牌号
	private int dayRates;  //日租金
	//private int rentedDays; //记录被租天数-----不是属性
	
	//静态块
	//初始化块
	
	//构造方法
	public Vehicles(String licensePlateNumber){
		this.licensePlateNumber=licensePlateNumber;
	}
	//方法
	//计算租金
//	public double rentFee(int days){
//		return dayRates*days;
//	}
	
	//显示车辆信息
	public void show(int rentedDays){
		System.out.println(dayRates+"\t"+rentedDays+"\t"+licensePlateNumber);
	}
	
	public String getLincensePlateNumber() {
		return licensePlateNumber;
	}
	
	public void setLincensePlateNumber(String licensePlateNumber) {
		this.licensePlateNumber = licensePlateNumber;
	}
	
	public int getDayRates() {
		return dayRates;
	}
	
	public void setDayRates(int dayRates) {
		this.dayRates = dayRates;
	}
	
	public String getLicensePlateNumber() {
		return licensePlateNumber;
	}
	
	public void setLicensePlateNumber(String licensePlateNumber) {
		this.licensePlateNumber = licensePlateNumber;
	}
	
}
