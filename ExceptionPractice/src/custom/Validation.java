package custom;

public class Validation {
	public boolean isValidAge(int age) throws InvalidAgeException {
		
		if(age<=0) {
			throw new InvalidAgeException("Age cannot be 0 or negative");
		}
		if(age < 18||age > 40 ) {
			throw new InvalidAgeException("only user between age 10 and 40 are acceptable");
		}
		
		return true;
	}
		public boolean isValidMobileNumber(String mobileNum) throws BusinessException{
			if( !mobileNum.matches("\\+1-[0-9]{10}")){
				throw new BusinessException("Enter Number "+mobileNum+" is Invalid");
			}
				return true;
		}
		
		public boolean isValidDL(String dl) throws InvalidDLException {
			
			if(dl.contains("-")) {
				throw new InvalidDLException("DL cannot contain any other sign but numbers");
			}
			if(dl.length() < 8|| dl.length()>8 ) {
				throw new InvalidDLException("Driver license number must be 8 digits");
			}
			
			return true;
		}
		
		public boolean isValidPassport(String passport) throws InvalidPassportException{
			if( !passport.matches("\\+1-[0-9]{8}")){
				throw new InvalidPassportException("Enter Number "+passport+" is Invalid");
			}
				return true;
		}
		
	
}
