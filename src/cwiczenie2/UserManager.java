package cwiczenie2;

class UserManager {
    public static void main(String[] args) {
        UserCreator creator = new UserCreator();
        User user1 = creator.create();
        System.out.println(user1);
//        User user2 = creator.create();
//        System.out.println(user2);

//      System.out.println(user1.getFullInfo());
//      System.out.println(user2.getFullInfo());
    }
}

