
public class Main {

	public static void main(String[] args) {
		User �nstructor1=new User(1,"Engin","Demiro�","engindemirog@gmail","12345");
		User �nstructor2=new User(2,"Ayla","Demir","aylademir@gmail","1234");
		User �nstructor3=new User(3,"Ali","�ansl�","alisansli@gmail","1245");


		
		
		
		
		
		User student1=new User(4,"Elif","Aslan","elifaslan@gmail","123465");
		User student2=new User(5,"G�l","Akman","g�lakman@gmail","123465");
		User student3=new User(6,"Gizem","Sevin�","gizemsevinc@gmail","123465");

	
		
		User user1=new User(1,"Engin","Demiro�","engindemirog@gmail","12345");
		User user2=new User(7,"Mehmet","Ula�","mehmetulas@gmail","12345");

		
		
		InstructorManager �nstructorManager=new InstructorManager();
		�nstructorManager.Add(�nstructor1);
		�nstructorManager.Delete(�nstructor2);
		�nstructorManager.Update(�nstructor3);
		
		
		StudentManager studentManager=new StudentManager();
		studentManager.Add(student1);
		studentManager.Delete(student2);

		
		
		UserManager userManager=new UserManager();
		userManager.Add(user1);
		
		
	
		
		
		
		
	
		

	}

}
