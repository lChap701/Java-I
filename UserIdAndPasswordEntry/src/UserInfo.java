/**
 * Created by Lucas Chapman 1/28/20
 * The purpose of this program is to write loops and create menus and validations for user ids and passwords
 * This class is used to create a default constructor, instance variables, and parameters to be stored inside an object
 * created in the UserEntryProgram class after validation has occurred
 */
public class UserInfo {
    /**
     * Instance variables for user ID and user password
     */
    private static String userId;
    private static String userPassword;

    /**
     * The default constructor
     */
    public UserInfo(){
        userId = "pbnjisgood90";        // ID needs to have 6-10 letters and 2 numbers
        userPassword = "MyBdayis1290";  // password needs at least 1 number, 1 uppercase letter, and 1 lowercase letter
    }

    /**
     * The parameterized/overloaded constructor
     * @param id collects user id information from the other class
     * @param password collects user password information from the other class
     */
    public UserInfo(String id, String password){
        userId = id;
        userPassword = password;
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
}