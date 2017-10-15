package javawork1;

public class 银行 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   DepositAccount saver = new DepositAccount("ZhangSan","1234567890",5000);    
	        DepositAccount.setextra(0.023);  //设置年利率   
	        System.out.println("用户名:"+saver.getname());//查询用户名  
	        System.out.println("账号:"+saver.getaccountNumber()); // 查询账号 
	        saver.save(2000);  
	        System.out.println("余额:"+saver.getbalance()); //查询余额      
	        System.out.println("年利息是：" + saver. yearextra()); 
	        System.out.println("月利息是：" + saver. monthextra());
	        

	}
	  static class DepositAccount {
	    private String name;//用户名
	    private String accountNumber;//账号
	    private float balance;//余额
	    static double extra;//年利率
	    
		
		public DepositAccount(String name, String Number, float balance) {
			// TODO Auto-generated constructor stub
			this.name=name;
			this.accountNumber=Number;
			this.balance=balance;
		}
		public void save(float m){ //存款
			
	
			
		System.out.println("原有余额"+balance+",存入"+m+"，现有余额"+(balance+m));
		balance= (balance+m);
		}
	    public String getname(){ //查询储户姓名  
	        return name;  
	    }  
	      
	    public String getaccountNumber(){ //查询账号  
	        return accountNumber;  
	    }  
	      
	    public float getbalance(){ //查询余额  
	        return balance;  
	    } 
		 public static void setextra(double d) {  //设置年利率     
		        extra = d;    
		        } 
		 public double yearextra() {  //计算年利息    
		        return balance * extra;    
		        } 
		  public double monthextra() {  //计算月利息    
		        return balance * extra/12;    
		        } 
	}

}
