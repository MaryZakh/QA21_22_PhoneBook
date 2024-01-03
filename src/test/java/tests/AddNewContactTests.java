package tests;

import models.Contact;
import models.User;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddNewContactTests extends TestBase {

    @BeforeClass
    public void preCondition() {
        if (!app.getHelperUser().isLogged()) {
            app.getHelperUser().login(new User().withEmail("mara@gmail.com").withPassword("Mmar123456$"));
        }

    }

    @Test
    public void addContactSuccessAllFields() {
        int i = (int) (System.currentTimeMillis() / 1000 % 3600);
        Contact contact = Contact.builder()
                .name("Tony")
                .lastName("Stark")
                .address("NY")
                .phone("356594" + i)
                .email("stark" + i + "@gmail.com")
                .description("The best")

                .build();

    }

    @Test
    public void addContactSuccessRequiredFields() {
        int i = (int) (System.currentTimeMillis() / 1000 % 3600);
        Contact contact = Contact.builder()
                .name("Tony")
                .lastName("Stark")
                .address("NY")
                .phone("356594" + i)
                .email("stark" + i + "@gmail.com")

                .build();

    }

    @Test
    public void addNewContactWrongName(){

    }

    @Test
    public void addNewContactWrongAddress(){

    }

    @Test
    public void addNewContactWrongLastName(){

    }

    @Test
    public void addNewContactWrongPhone(){

    }

    @Test
    public void addNewContactWrongEmail(){

    }

}
