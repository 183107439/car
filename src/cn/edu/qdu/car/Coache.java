package cn.edu.qdu.car;

public class Coache extends Vehicles {
	//����
	private int seatNumber;  //��λ��
	//��̬��
	//��ʼ����
	//���췽��
	public Coache(String licensePlateNumber){
		super(licensePlateNumber);
	}
	//����
//	@Override
	//�������
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
		//System.out.println("Ʒ��\t��λ��\t���ƺ�");
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
