package logbeta;
import org.apache.logging.log4j.*;

public class Demo1 {

	private static Logger Log= LogManager.getLogger(Demo1.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Log.debug("i have clicked button");
		Log.info("button is displayed");
		Log.error("button is not displayed");
		Log.fatal("button missing");
				}
		
}
