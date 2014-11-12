package ssh_bots;
import java.util.regex.*;

public class FileRead {
	
	public static IPdet readLine(String line) {

		Pattern pIP = Pattern.compile("(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)");
		Pattern pIU = Pattern.compile("error");
		Pattern pDt = Pattern.compile("[A-Z][a-z]{1,2} ([0-9]| )[0-9] ([0-9]){1,3}:([0-9]){1,3}:([0-9]){1,3}");
			
		Matcher mIP = pIP.matcher(line);
		Matcher mIU = pIU.matcher(line);
		Matcher mDt = pDt.matcher(line);
		
		
		if(mIU.find()) {
			if(mIP.find()) {
				mDt.find();
					
					IPdet Obj = new IPdet(mIP.group(0), mDt.group(0));
					
					return Obj;
					
					//System.out.printf("%s\t\t%s\n", mIP.group(0), mDt.group(0));
			}
		}
		
		return null;
	}
}
