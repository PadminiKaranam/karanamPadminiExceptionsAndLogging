package logger;
import java.util.Scanner;
import java.util.logging.LogManager;
import java.util.logging.Logger; 
public class BuildCostLogger {
	static
	{
		Logger logger=Logger.getLogger(BuildCostLogger.class.getName());
		Scanner sc=new Scanner(System.in);
		int standard,area;
		String message;
		logger.info("Enter Material Standard\n1.standard\n2.above standard\n3.high standard\n4.high standard and fully automated home");
		standard=sc.nextInt();
		if(standard==1||standard==2||standard==3||standard==4)
		{
			logger.info("Enter total area of the house in sq.ft");
			area=sc.nextInt();
			Build ob1=new Build(standard,area);
			msg=ob1.buildCost();
			logger.info(message);
		}
		else
		{
			logger.info("invalid selection");
			java.lang.System.exit(0); 
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}