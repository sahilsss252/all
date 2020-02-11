package practice3;

import java.util.List;

public class App {

	public static void main(String[] args) {
		AdminDao ad =new AdminDao();
		List<Admin> lst=ad.check("chin", "chin");
		for(Admin a:lst){
			System.out.println(a.getAdminId());
		}
	}
}
