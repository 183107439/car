package cn.edu.qdu.car;

public class Car extends Vehicles {
	//����
	private String brand;  //����Ʒ��
	//��̬��
	//��ʼ����
	
	//���췽��
	public Car(String lincensePlateNumber,String brand){
		super(lincensePlateNumber);
		this.brand=brand;
	}
	//����
//	@Override
//	//�������
//	public double rentFee(int days){
//		if(brand.equals("���")){
//			setDayRates(400);
//		}else if(brand.equals("����")){
//			setDayRates(500);
//		}else{
//			setDayRates(600);
//		}
//		return super.rentFee(days);
//	}
	
	@Override
	public void show(int ratedDays){
		//System.out.println("Ʒ��\t�����\t���ƺ�");
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
