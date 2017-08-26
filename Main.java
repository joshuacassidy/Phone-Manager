public class Main {
    public static void main(String[] args){
        ITelephone myPhone;
        
        myPhone = new DeskPhone(831880578);
        myPhone.power();
        myPhone.callPhone(831880578);
        myPhone.answer();
        myPhone.hangUp();
        myPhone.dial(831880578);
        myPhone.hangUp();

        myPhone = new MobilePhone(24565);
        myPhone.power();
        myPhone.callPhone(24565);
        myPhone.answer();
        myPhone.hangUp();
        myPhone.dial(24565);
        myPhone.hangUp();
        myPhone.power();

    }
}
