public class UserManager {
    public void Add(User user){
        System.out.println("Kullanıcı eklendi." +user.firstName);
    }
    public void Remove(User user){
        System.out.println("Kullanıcı silindi"+user.firstName);
    }
    public void Update(User user){
        System.out.println("Kullanıcı güncellendi."+user.firstName);
    }


}
