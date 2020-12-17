package scanner;

public class Employee {
	
		private int id;
		private int age;
		private String name;
		private long contact;
		private char gender;
		
		public Employee() {
			//constructor
		}
		public Employee(int age, String name, long contact, char gender) {
			super();
			this.age = age;
			this.name = name;
			this.contact = contact;
			this.gender = gender;
		}
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public long getContact() {
			return contact;
		}
		public void setContact(long contact) {
			this.contact = contact;
		}
		public char getGender() {
			return gender;
		}
		public void setGender(char gender) {
			this.gender = gender;
		}
		
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", contact=" + contact + ", age=" + age + ", gender=" + gender
					+ "]";
		}
		

	}


