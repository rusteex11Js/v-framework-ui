package dto;

public class BaseDTO {
    public Register getRegister() {
        return register;
    }

    private Register register;

    public BaseDTO(BaseDTOBuilder builder){
        this.register = builder.register;
    }

    public static class BaseDTOBuilder{

        public BaseDTOBuilder(){

        }
        private Register register;

        public BaseDTOBuilder setRegister(Register register){
            this.register = register;
            return this;
        }

        public BaseDTO build(){
            return new BaseDTO(this);
        }

    }

}
