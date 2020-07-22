import java.util.Scanner;
import java.util.logging.LogManager;
import java.util.logging.Logger; 
public class Build
{
	int standard,totalArea;
	Build(int std,int area)
	{
		standard=std;
		totalArea=area;
	}
	String buildCost()
	{
		if(standard==1)
			return("Building Cost: "+totalArea*24000);
		else if(standard==2)
			return("Construction Cost: "+totalArea*3000);
		else if(standard==3)
			return("Construction Cost:"+totalArea*8000);
		else if(standard==4)
			return("Construction Cost:"+totalArea*5000);
		else
			return("invalid");
	}
}