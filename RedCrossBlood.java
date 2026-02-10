class RedCrossBlood{
	public static void main(String[] args){
		saveDonorAccount("gunj@gmail.com",565,"gunjan","blueshark",577204,"gunjaa","gunjaan");
	}
	static void saveDonorAccount(String emailID, int donorID, String firstName, String userName, int zipCode, String password, String repeatPassword){
		System.out.println("The donor emailID is "+emailID);
		System.out.println("The donor donorID is "+donorID);
		System.out.println("The donor name is "+firstName);
		System.out.println("The donor User name is "+userName);
		System.out.println("The donor zip code is "+zipCode);
		System.out.println("The donor password is "+password);
	}
}