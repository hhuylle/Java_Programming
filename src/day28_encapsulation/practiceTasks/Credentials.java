package day28_encapsulation.practiceTasks;

public class Credentials {
    /*
    create a class named Credentials
            Variables:
                username, password

            Encapsulate all the fields
                    (password MUST be a strong passwords)

            Add a constructor that allows user to set all the fields when the object is created.
                        (If the arguments not valid it should not be set to the instances)

            Methods:
                isStrongPassWord(): takes an argument of string and verify if the given string is strong password, returns boolean
                            Characteristics of strong passwords are:
                                    1. Password MUST be at least have 8 characters long, and should not contain space
                                    2. PassWord should at least contain one letter
                                    3. Password should at least contain one special characters
                                    4. Password should at least contain a digit
                      toString()
     */
    private String username, password;

    public Credentials(String username, String password) {
        setUsername(username);
        setPassword(password);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isStrongPassword(String password){
        boolean strongPassword = password.length() >= 8 && password.contains(" ");
        boolean hasAtLeast1UpperCase = false;
        boolean hasAtLeast1LowerCase = false;
        boolean hasAtLeast1Letter = false;
        boolean hasAtLeast1Digit = false;
        boolean hasAtLeast1SpecialChars = false;

        for (char each : password.toCharArray()) {
            if (Character.isUpperCase(each)){
                hasAtLeast1UpperCase = true;
            } else if (Character.isLowerCase(each)) {
                hasAtLeast1LowerCase = true;
            } else if (Character.isDigit(each)) {
                hasAtLeast1Digit = true;
            } else if (Character.isLetter(each)) {
                hasAtLeast1Letter = true;
            }else {
                hasAtLeast1SpecialChars = true;
            }

        }
        return strongPassword &&
                hasAtLeast1LowerCase &&
                hasAtLeast1UpperCase &&
                hasAtLeast1Digit &&
                hasAtLeast1Letter &&
                hasAtLeast1SpecialChars;
    }


}
