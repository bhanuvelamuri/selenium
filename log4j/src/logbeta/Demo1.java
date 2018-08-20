package logbeta;
import org.apache.logging.log4j.*;

public class Demo1 {

	private static Logger Log= LogManager.getLogger(Demo1.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
				// TODO Auto-generated method stub
					Log.debug("i am debug");
					Log.info("object is present");
					Log.error("object is not present");
					Log.fatal("this is fatal");
				}
		
}
