package ie.atu.lab3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// UserService with annotation
@Service //or Componet, @Service, or @Respository depending on purpose of class
public class UserService {
    private final EmailService emailservice;

    @Autowired // Constructor injection
    public UserService(EmailService emailservice) {
        this.emailService = emailService; //Loose Coupling
    }

    public void registerUser(String username, String email) {
        //Some  user registration logic

        //Send Confirmation email
        emailService.sendEmail(email, message "Welcome to our Platform")
    }
}
