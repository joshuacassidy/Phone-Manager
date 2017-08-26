public class MobilePhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;




    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void power() {
        isOn = !isOn;
        System.out.println(isOn ? "Mobile phone is now on." : "Mobile phone is now off.");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.printf( isOn ? "Now ringing %s on mobile.\n" : "Phone is switched off.\n",phoneNumber );


    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering the mobile phone.");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber && isOn){
            isRinging = true;
            System.out.println("Phone is ringing.");

        }
        else{
            isRinging = false;
            System.out.println("Mobile phone is off or number is different.");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }

    @Override
    public void hangUp() {
        System.out.println("Now hanging up phone");
    }
}
