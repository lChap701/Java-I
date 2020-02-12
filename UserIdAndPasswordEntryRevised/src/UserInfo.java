/**
 * Created by Lucas Chapman 2/5/20
 * Insatiable class with getters and setters, parameterized constructor, and a default constructor
 */
public class UserInfo {
    /**
     * Instance variables for user ID and user password
     */
    private static String userId;
    private static String userPassword;
    private static int userStatus;
    private  static char userProgram;

    /**
     * The default constructor
     */
    public UserInfo(){
        userId = "pbnjisgood90";        // ID needs to have 6-10 letters and 2 numbers
        userPassword = "MyBdayis1290";  // password needs at least 1 number, 1 uppercase letter, and 1 lowercase letter
        userStatus = 1;  // status needs to be either 1, 2, or 3
        userProgram = 'B';  // program needs to be either B, L, N, P, R, or S
    }

    /**
     * The parameterized/overloaded constructor
     * @param id collects user id information from the other class
     * @param password collects user password information from the other class
     * @param status collects the user's status from the other class
     * @param program collects the program the user is in from the other class
     */
    public UserInfo(String id, String password, int status, char program){
        userId = id;
        userPassword = password;
        userStatus = status;
        userProgram = program;
    }

    /**
     * Getters and setters for user id and user password, also creates parameters for the user id and user password
     * @return returns the variable the getters are trying to retrieve
     */
    public String getUserId(){
        return userId;
    }

    public void setUserId(String id) {
        this.userId = id;
    }

    public String getUserPassword(){
        return userPassword;
    }

    public void setUserPassword(String p) {
        this.userPassword = p;
    }

    public int getUserStatus(){
        return userStatus;
    }

    public void setUserStatus(int st) {
        this.userStatus = st;
    }

    public char getUserProgram(){
        return Character.toUpperCase(userProgram);
    }

    public void setUserProgram(char pr){
        this.userProgram = pr;
    }
}