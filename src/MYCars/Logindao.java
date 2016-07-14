package MYCars;

public class Logindao {

	public boolean isvaliduser(String email, String password){
		if(email.equals(password)){
			return true;
		}
		else{
			return false;
		}
	}
	
	
}