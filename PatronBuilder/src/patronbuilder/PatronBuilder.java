package patronbuilder;

public class PatronBuilder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        UserBuilder builder = new UserBuilder();

        User userDate = builder.withFirstName("Pepito")
                .withLastName("Perez")
                .withIdType("C.C")
                .withIdNumber(123456)
                .withAge(34)
                .build();


        System.out.println("Date user: \n" + userDate.getUser());
        System.out.print("Informática I");
    }

}
