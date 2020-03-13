package patronbuilder;

public class UserBuilder implements IBuilder {
    private String firstName;
    private String lastName;
    private String idType;
    private int idNumber;
    private int age;

    public UserBuilder withFirstName(String firstName){
        this.firstName = firstName;
        return this;
    }

    public UserBuilder withLastName(String lastName){
        this.lastName = lastName;
        return this;
    }

    public UserBuilder withIdType(String idType){
        this.idType = idType;
        return this;
    }

    public UserBuilder withIdNumber(int idNumber){
        this.idNumber = idNumber;
        return this;
    }

    public UserBuilder withAge(int age){
        this.age = age;
        return this;
    }

    @Override
    public User build() {
        User user = new User();
        user.setFirstName(this.firstName);
        user.setLastName(this.lastName);
        user.setIdType(this.idType);
        user.setIdNumber(this.idNumber);
        user.setAge(this.age);
        return user;
    }
}
