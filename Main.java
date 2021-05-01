
public class Main {

	public static void main(String[] args) {
		User ınstructor1=new User(1,"Engin","Demiroğ","engindemirog@gmail","12345");
		User ınstructor2=new User(2,"Ayla","Demir","aylademir@gmail","1234");
		User ınstructor3=new User(3,"Ali","Şanslı","alisansli@gmail","1245");


		
		
		
		
		
		User student1=new User(4,"Elif","Aslan","elifaslan@gmail","123465");
		User student2=new User(5,"Gül","Akman","gülakman@gmail","123465");
		User student3=new User(6,"Gizem","Sevinç","gizemsevinc@gmail","123465");

	
		
		User user1=new User(1,"Engin","Demiroğ","engindemirog@gmail","12345");
		User user2=new User(7,"Mehmet","Ulaş","mehmetulas@gmail","12345");

		
		
		InstructorManager ınstructorManager=new InstructorManager();
		ınstructorManager.Add(ınstructor1);
		ınstructorManager.Delete(ınstructor2);
		ınstructorManager.Update(ınstructor3);
		
		
		StudentManager studentManager=new StudentManager();
		studentManager.Add(student1);
		studentManager.Delete(student2);

		
		
		UserManager userManager=new UserManager();
		userManager.Add(user1);
		
		
	
		
		
		
		
	
		

	}

}
