package javawork1;

public class ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   DepositAccount saver = new DepositAccount("ZhangSan","1234567890",5000);    
	        DepositAccount.setextra(0.023);  //����������   
	        System.out.println("�û���:"+saver.getname());//��ѯ�û���  
	        System.out.println("�˺�:"+saver.getaccountNumber()); // ��ѯ�˺� 
	        saver.save(2000);  
	        System.out.println("���:"+saver.getbalance()); //��ѯ���      
	        System.out.println("����Ϣ�ǣ�" + saver. yearextra()); 
	        System.out.println("����Ϣ�ǣ�" + saver. monthextra());
	        

	}
	  static class DepositAccount {
	    private String name;//�û���
	    private String accountNumber;//�˺�
	    private float balance;//���
	    static double extra;//������
	    
		
		public DepositAccount(String name, String Number, float balance) {
			// TODO Auto-generated constructor stub
			this.name=name;
			this.accountNumber=Number;
			this.balance=balance;
		}
		public void save(float m){ //���
			
	
			
		System.out.println("ԭ�����"+balance+",����"+m+"���������"+(balance+m));
		balance= (balance+m);
		}
	    public String getname(){ //��ѯ��������  
	        return name;  
	    }  
	      
	    public String getaccountNumber(){ //��ѯ�˺�  
	        return accountNumber;  
	    }  
	      
	    public float getbalance(){ //��ѯ���  
	        return balance;  
	    } 
		 public static void setextra(double d) {  //����������     
		        extra = d;    
		        } 
		 public double yearextra() {  //��������Ϣ    
		        return balance * extra;    
		        } 
		  public double monthextra() {  //��������Ϣ    
		        return balance * extra/12;    
		        } 
	}

}
