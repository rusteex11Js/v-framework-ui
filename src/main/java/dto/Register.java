package dto;

public class Register {

    private String firstName;

    private String lastName;

    public Register(RegisterBuilder registerBuilder){
        this.firstName = registerBuilder.firstName;
        this.lastName = registerBuilder.lastName;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public static class RegisterBuilder{

        private String firstName;
        private String lastName;

        public RegisterBuilder setFirstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public RegisterBuilder setLastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public Register build(){
            return new Register(this);
        }


    }




}
