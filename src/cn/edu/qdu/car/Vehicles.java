package cn.edu.qdu.car;

public class Vehicles {
	//����
	private String licensePlateNumber;	//���ƺ�
	private int dayRates;  //�����
	//private int rentedDays; //��¼��������-----��������
	
	//��̬��
	//��ʼ����
	
	//���췽��
	public Vehicles(String licensePlateNumber){
		this.licensePlateNumber=licensePlateNumber;
	}
	//����
	//�������
//	public double rentFee(int days){
//		return dayRates*days;
//	}
	
	//��ʾ������Ϣ
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
