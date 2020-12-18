package custom;

public class CustomMain {

	public static void main(String[] args) {
		Validation v = new Validation();
		try{
			if(v.isValidAge(-1)) {
				System.out.println(" Age avliable");
			}
			
		}catch(InvalidAgeException e) {
			System.out.println("Invalidate age ");
		}
		
		try {
			if(v.isValidMobileNumber("+1-912344555")) {
				System.out.println("Mobile Number Validated");
			}
		}catch(BusinessException e) {
			System.out.println(e.getMessage());
		}
		
		try{
			if(v.isValidDL("-19892387")) {
				System.out.println(" DL is not valible");
			}
			
		}catch(InvalidDLException e) {
			System.out.println("Invalidate DL ");
		}
		
		try {
			if(v.isValidPassport("+1-912344555")) {
				System.out.println("Passport Number is not Validated");
			}
		}catch(InvalidPassportException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
//create a Custom check exception check if the entered DL is valid or not
//create a custom unchecked exception for checking if the entered passport number is valid or not
