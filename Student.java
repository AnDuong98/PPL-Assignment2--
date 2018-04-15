package a2_1601040040;

import utils.AttrRef;
import utils.DOpt;
import utils.DomainConstraint;
import utils.OptType;
import utils.TextIO;


/**
 * 
 * @overview <p>This class contains student data in a university</p>
 * @attribute <pre>
 *		id				Integer
 *		firstName		String
 *		givenName		String
 *		lastName		String
 *		email			String
 *		address 		String 
 *		phone       	String
 *		dob 			String
 *		gender			Gender
 * </pre>
 * 
 * @Objects <pre>
 * 		a typical student object is student={id, firstName, givenName, lastName, email,  address, phone, dob, gender} 
 * </pre>
 * 
 * @abstract_properties 
 * <pre>
 * 		mutable(id) = false /\ optional(id) = false /\ min(id) = 1 /\
 * 		mutable(firstName) = true /\ optional(firstName) = false /\ length(firstName) = 50 /\
 * 		mutable(lastName) = true /\ optional(lastName) = false /\ length(lastName) = 30 /\
 * 		mutable(givenName) = true /\ optional(givenName) = false /\ length(givenName) = 50 /\
 * 		mutable(email) = true /\ optional(email) = true /\ length(email) = 255 /\
 * 		mutable(address) = true /\ optional(address) = false /\ length(address) = 2000 /\
 * 		mutable(phone) = true /\ optional(phone) = false /\ length(phone) = 20 /\
 * 		mutable(dob) = false /\ optional(dob) = false /\ length(dob) = 20 /\
 * 		mutable(gender) = false /\ optional(gender) = false /\
 * </pre>
 * 
 * @author anduong
 * 
 * */
public class Student {
	
	//variables
	
	@DomainConstraint(type = "Integer", mutable = false, optional = false, min = 1)
	private int id;
	
	@DomainConstraint(type = "Integer", mutable = true, optional = false, length = 50)
	private String firstName;
	
	@DomainConstraint(type = "Integer", mutable = true, optional = false, length = 30)
	private String lastName;
	
	@DomainConstraint(type = "Integer", mutable = true, optional = false, length = 50)
	private String givenName;
	
	@DomainConstraint(type = "Integer", mutable = true, optional = true, length = 255)
	private String email;
	
	@DomainConstraint(type = "Integer", mutable = true, optional = false, length = 2000)
	private String address;
	
	@DomainConstraint(type = "Integer", mutable = true, optional = false, length = 20)
	private String phone;
	
	@DomainConstraint(type = "Integer", mutable = false, optional = false, length = 20)
	private String dob;
	
	@DomainConstraint(type = "Integer", mutable = false, optional = false)
	private Gender gender;
	
	private final Integer MIN_ID = 1;
	private final int LENGTH_FIRSTNAME = 50;
	private final int LENGTH_LASTNAME = 30;
	private final int LENGTH_GIVENNAME = 50;
	private final int LENGTH_EMAIL = 255;
	private final int LENGTH_ADDRESS = 2000;
	private final int LENGTH_PHONE = 20;
	private final int LENGTH_DOB = 20;
	
	//constructor
	
	/**
	 * @effects 
	 * <pre>
	 * 		if id, firstName, lastName, givenName, email, address, phone, dob, gender are valid
	 * 			initialise this as <id, firstName, lastName, givenName, email, address, phone, dob, gender>
	 * 		else 
	 * 			initialise this as <> and print error	 
	 * </pre>
	 * @param id
	 * @param firstName
	 * @param lastName
	 * @param givenName
	 * @param email
	 * @param address
	 * @param phone
	 * @param dob
	 * @param gender
	 */
	public Student(@AttrRef("id")int id,@AttrRef("firstName") String firstName,@AttrRef("lastName") String lastName,
			@AttrRef("givenName") String givenName,@AttrRef("email")String email,@AttrRef("address")String address,
			@AttrRef("phone")String phone,@AttrRef("dob")String dob,@AttrRef("gender")Gender gender  ) {
		
		this.id = id;
		this.firstName = firstName;
		this.givenName = givenName;
		this.lastName = lastName;
		this.address = address;
		this.email = email;
		this.dob = dob;
		this.phone = phone;
		this.gender = gender;
	}
	
	/**
	 * @effects 
	 * <pre>
	 * 		if id, firstName, lastName, givenName, address, phone, dob, gender are valid
	 * 			initialise this as <id, firstName, lastName, givenName, address, phone, dob, gender>
	 * 		else 
	 * 			initialise this as <> and print error	 
	 * </pre>
	 * @param id
	 * @param firstName
	 * @param lastName
	 * @param givenName
	 * @param address
	 * @param phone
	 * @param dob
	 * @param gender
	 */
	public Student(@AttrRef("id")int id,@AttrRef("firstName") String firstName,@AttrRef("lastName") String lastName,
			@AttrRef("givenName") String givenName,@AttrRef("address")String address,
			@AttrRef("phone")String phone,@AttrRef("dob")String dob,@AttrRef("gender")Gender gender  ) {
		
		this(id, firstName, lastName, givenName,null, address, phone, dob, gender);
	} 

	//observer
	/**
	 * 
	 * @effects return <tt>id</tt>
	 */
	@DOpt(type=OptType.Observer) 
	@AttrRef("id")
	public int getId() {
		return id;
	}
	/**
	* @effects return <tt>firstName</tt>
	*/
	@DOpt(type=OptType.Observer) 
	@AttrRef("firstName")
	public String getFirstName() {
		return firstName;
	}
	/**
	* @effects return <tt>lastName</tt>
	*/
	@DOpt(type=OptType.Observer) 
	@AttrRef("lastName")
	public String getLastname() {
		return lastName;
	}
	/**
	* @effects return <tt>givenName</tt>
	*/
	@DOpt(type=OptType.Observer) 
	@AttrRef("givenName")
	public String getGivenName() {
		return givenName;
	}
	/**
	* @effects return <tt>email</tt>
	*/
	@DOpt(type=OptType.Observer) 
	@AttrRef("email")
	public String getEmail() {
		return email;
	}
	/**
	* @effects return <tt>address</tt>
	*/
	@DOpt(type=OptType.Observer) 
	@AttrRef("address")
	public String getAddress() {
		return address;
	}
	/**
	* @effects return <tt>phone</tt>
	*/
	@DOpt(type=OptType.Observer) 
	@AttrRef("phone")
	public String getPhone() {
		return phone;
	}
	/**
	* @effects return <tt>dob</tt>
	*/
	@DOpt(type=OptType.Observer) 
	@AttrRef("dob")
	public String getDob() {
		return dob;
	}
	/**
	* @effects return <tt>gender</tt>
	*/
	@DOpt(type=OptType.Observer) 
	@AttrRef("gender")
	public Gender getGender() {
		return gender;
	}
	
	//mutator
	/**
	 * @modifies <tt>this</tt>
	 * @effects <pre>
	 * 		if firstName is valid
	 * 			set this.firstName to firstName
	 * 		else 
	 * 			do nothing
	 * </pre> 
	 * @param firstName
	 */
	@DOpt(type=OptType.Mutator) 
	@AttrRef("firstName")
	public void setFirstName(String firstName) {
		if(validFisrtName(firstName)) {
				this.firstName = firstName;
		}
	}
	/**
	 * @modifies <tt>this</tt>
	 * @effects <pre>
	 * 		if lastName is valid
	 * 			set this.lastName to lastName
	 * 		else 
	 * 			do nothing
	 * </pre> 
	 * @param lastName
	 */
	@DOpt(type=OptType.Mutator) 
	@AttrRef("lastName")
	public void setLastname(String lastName) {
		if(validLastName(lastName)) {
			this.lastName = lastName;
		}
	}
	/**
	 * @modifies <tt>this</tt>
	 * @effects <pre>
	 * 		if lastName is valid
	 * 			set this.givenName to givenName
	 * 		else 
	 * 			do nothing
	 * </pre>
	 * @param givenName
	 */
	@DOpt(type=OptType.Mutator) 
	@AttrRef("givenName")
	public void setGivenName(String givenName) {
		if(validGivenName(givenName)) {
			this.givenName = givenName;
	    }
	}
	/**
	 * @modifies <tt>this</tt>
	 * @effects <pre>
	 * 		if email is valid
	 * 			set this.email to email
	 * 		else 
	 * 			do nothing
	 * </pre>
	 * @param email
	 */
	@DOpt(type=OptType.Mutator) 
	@AttrRef("email")
	public void setEmail(String email) {
		if(validEmail(email)) {
			this.email = email;
		}	
	}
	/**
	 * @modifies <tt>this</tt>
	 * @effects <pre>
	 * 		if address is valid
	 * 			set this.address to address
	 * 		else 
	 * 			do nothing
	 * </pre>
	 * @param address
	 */
	@DOpt(type=OptType.Mutator) 
	@AttrRef("address")
	public void setAddress(String address) {
		if(validAddress(address)) {
			this.address = address;
	}
	}
	/**
	 * @modifies <tt>this</tt>
	 * @effects <pre>
	 * 		if phone is valid
	 * 			set this.phone to phone
	 * 		else 
	 * 			do nothing
	 * </pre>
	 * @param phone
	 */
	@DOpt(type=OptType.Mutator) 
	@AttrRef("phone")
	public void setPhone(String phone) {
		if(validPhone(phone)) {
			this.phone = phone;
	}
	}

	// Data Validation
	
	/**
	* @effects 
	* <pre>
	* if id is not valid
	* 	return false
	* else
	* 	return true
	* </pre>
	*/
	public boolean validID(int id) {
		if(id == 0 || id > MIN_ID) {
			TextIO.putln("OOps!!! Invalid ID");
			return false;
		} return true;
	}
	/**
	* @effects 
	* <pre>
	* if firstName is not valid
	* 	return false
	* else
	* 	return true
	* </pre>
	*/
	public boolean validFisrtName(String firstName) {
		if(firstName.isEmpty() || firstName.length() > LENGTH_FIRSTNAME) {
			TextIO.putln("Oops!! Invalid First Name");
			return false;
		} return true;
	}
	/**
	* @effects 
	* <pre>
	* if lastName is not valid
	* 	return false
	* else
	* 	return true
	* </pre>
	*/
	public boolean validLastName(String lastName) {
		if(lastName.isEmpty() || lastName.length() > LENGTH_LASTNAME) {
			TextIO.putln("Oops!! Invalid Last Name");
			return false;
		} return true;
	}
	/**
	* @effects 
	* <pre>
	* if givenName is not valid
	* 	return false
	* else
	* 	return true
	* </pre>
	*/
	public boolean validGivenName(String givenName) {
		if(givenName.isEmpty() || givenName.length() > LENGTH_GIVENNAME) {
			TextIO.putln("Oops!! Invalid Given Name");
			return false;
		} return true;
	}
	/**
	* @effects 
	* <pre>
	* if email is not valid
	* 	return false
	* else
	* 	return true
	* </pre>
	*/
	public boolean validEmail(String email) {
		if(email.isEmpty() || email.length() > LENGTH_EMAIL) {
			TextIO.putln("Oops!! Invalid email");
			return false;
		} return true;
	}
	/**
	* @effects 
	* <pre>
	* if address is not valid
	* 	return false
	* else
	* 	return true
	* </pre>
	*/
	public boolean validAddress(String address) {
		if(address.isEmpty() || address.length() > LENGTH_ADDRESS) {
			TextIO.putln("Oops!! Invalid Address");
			return false;
		} return true;
	}
	/**
	* @effects 
	* <pre>
	* if phone is not valid
	* 	return false
	* else
	* 	return true
	* </pre>
	*/
	public boolean validPhone(String phone) {
		if(phone.isEmpty() || phone.length() > LENGTH_PHONE) {
			TextIO.putln("Oops!! Invalid phone number");
			return false;
		} return true;
	}
	/**
	* @effects 
	* <pre>
	* if dob is not valid
	* 	return false
	* else
	* 	return true
	* </pre>
	*/
	public boolean validDoB(String dob) {
		if(dob.isEmpty() || dob.length() > LENGTH_DOB) {
			TextIO.putln("Oops!! Invalid date of birth");
			return false;
		} return true;
	}
	/**
	* @effects 
	* <pre>
	* if gender is not valid
	* 	return false
	* else
	* 	return true
	* </pre>
	*/
	public boolean validGender(Gender gender) {
		if(gender == null) {
			TextIO.putln("Oops!! Invalid gender");
			return false;
		} return true;
	}
	
	/**
	* @effects 
	* <pre>
	* if this satisfies abstract properties
	* 	return true
	* else
	* 	return false
	* </pre>
	*/
	
	public boolean repOK() {
		return this.validID(id) && this.validFisrtName(firstName) && this.validLastName(lastName) 
				&& this.validGivenName(givenName) && this.validEmail(email) && this.validAddress(address)
				   && this.validPhone(phone) && this.validDoB(dob) && this.validGender(gender);
	}
	
	@Override
	public String toString() {
		return "Student: " + id + " " + firstName + " " + givenName + " " + lastName + " " + email + " "
	               + address + " " + phone + " " + dob + " " + gender;  
	}
	
}
