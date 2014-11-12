package ssh_bots;

public class Blocker {

	public static void main(String [] args){
		
		String ip = "192.168.2.13";
		block_ip(ip,true);
		
	
	}
	
	public static void block_ip(String ip , boolean d){
		String ip_localhost = "127.0.0.1";
			if ( d == true ){
			
				System.out.println("IP Address blocked : " + ip);
				System.out.println("\t\tsudo ufw deny from "+ ip);
				//	Block IP Address in Ubuntu
				//	Process Ubuntu_Block_IP = Runtime.getRuntime().exec("sudo ufw deny from "+ ip);
				//	BufferedReader stdInputp = new BufferedReader(new InputStreamReader(Ubuntu_Block_IP.getInputStream()));	// Get Output
				//	BufferedReader stdErrorp = new BufferedReader(new InputStreamReader(Ubuntu_Block_IP.getErrorStream()));	// Get Error
			}else{
			
				System.out.println("IP Address unblocked : " + ip);
				System.out.println("\t\tsudo ufw allow from "+ ip);
				//	Unblock IP Address in Ubuntu
				//	Process Ubuntu_Unblock_IP = Runtime.getRuntime().exec("sudo ufw allow from "+ ip);
				//	BufferedReader stdInputp = new BufferedReader(new InputStreamReader(Ubuntu_Unblock_IP.getInputStream()));	// Get Output
				//	BufferedReader stdErrorp = new BufferedReader(new InputStreamReader(Ubuntu_Unblock_IP.getErrorStream()));	// Get Error
			}
			/*
			// read the output from the command
			System.out.print("Command executed successfully.\n");
			while ((s = stdInputp.readLine()) != null) {
				System.out.println(s);
			}

			// read any errors from the attempted command
			System.out.print("Error: \n");
			while ((s = stdErrorp.readLine()) != null) {
				System.out.println(s);
			}*/
			System.exit(0);
	}
}
