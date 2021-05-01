
public class UserManager {
	public void Add(User user) {
		System.out.println("kullanýcý eklendi: "+user.firstName+" "+user.lastName);
	}
	
	public void Delete(User user) {
		System.out.println("kullanýcý silindi: "+user.firstName+" "+user.lastName);
	}
	public void Update(User user) {
		System.out.println("kullanýcý güncellendi: "+user.firstName+" "+user.lastName);
	}
}
