package system;

import javax.swing.Icon;

/**
 * @web http://www.jc-mouse.net/
 * @author Mouse
 */
public class User {
    
    private String name;
    private String mail;
    private String password;
    private Icon photo;
    
    /** Constructor */
    public User(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Icon getPhoto() {
        return photo;
    }

    public void setPhoto(Icon photo) {
        this.photo = photo;
    }    
    
}//User:end
