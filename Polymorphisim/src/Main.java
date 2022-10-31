
public class Main {

	public static void main(String[] args) {
       
		//EmailLogger emailLogger=new EmailLogger();
		//emailLogger.log("Log Message");
		BaseLogger[] loggers=new BaseLogger[]{new DatabaseLogger(),new EmailLogger(),new FileLogger()};
		
			for(BaseLogger logger:loggers)
			{
				logger.log(" log mesaji");
				
			}
			CustomerManager customerManager=new CustomerManager(new DatabaseLogger());
			customerManager.Add();
			
		}
	}


