package builder;

public class Student {
	
	
	private String school;
	private String name;
	private int age;
	private String phone;
	private String grade;
	
	private Student(StudentBuilder builder) {
		this.name = builder.name;
		this.age =builder.age;
		this.phone = builder.phone;
		this.grade = builder.grade;
	}
	
	
	public static StudentBuilder Builder() {
		
		return new StudentBuilder();
		
	}
	
	public static class StudentBuilder {
		
		private String school = "계성여고";
		private String name;
		private int age;
		private String phone;
		private String grade;
		

		
		public StudentBuilder setName(String name) {
			this.name = name;
			
			return this;
			
		}
		
		public StudentBuilder setAge(int age) {
			this.age = age;
			
			return this;
			
		}
		
		public StudentBuilder setPhone(String phone) {
			this.phone = phone;
			
			return this;
			
		}
		
		public StudentBuilder setGrade(String grade) {
			this.grade = grade;
			
			return this;
			
		}
		
		public Student build() {
			
			return new Student(this);
		}

		
		
	}





}
