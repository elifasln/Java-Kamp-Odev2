
public class UserManager {
	public void Add(User user) {
		System.out.println("kullanıcı eklendi: "+user.firstName+" "+user.lastName);
	}
	
	public void Delete(User user) {
		System.out.println("kullanıcı silindi: "+user.firstName+" "+user.lastName);
	}
	public void Update(User user) {
		System.out.println("kullanıcı güncellendi: "+user.firstName+" "+user.lastName);
	}
}
