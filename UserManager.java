
public class UserManager {
	public void Add(User user) {
		System.out.println("kullan�c� eklendi: "+user.firstName+" "+user.lastName);
	}
	
	public void Delete(User user) {
		System.out.println("kullan�c� silindi: "+user.firstName+" "+user.lastName);
	}
	public void Update(User user) {
		System.out.println("kullan�c� g�ncellendi: "+user.firstName+" "+user.lastName);
	}
}
