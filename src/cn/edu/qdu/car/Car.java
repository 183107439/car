package cn.edu.qdu.car;

public class Car extends Vehicles {
	//����
	private String brand;  //����Ʒ��
	//��̬��
	//��ʼ����
	
	//���췽��
	public Car(String lincensePlateNumber){
		super(lincensePlateNumber);
	}
	//����
	@Override
	//�������
	public double rentFee(int days){
		if(brand.equals("���")){
			setDayRates(400);
		}else if(brand.equals("����")){
			setDayRates(500);
		}else{
			setDayRates(600);
		}
		return super.rentFee(days);
	}
	
	@Override
	public void show(){
		//System.out.println("Ʒ��\t�����\t���ƺ�");
		System.out.print(brand+"\t");
		super.show();
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}	
	
}
