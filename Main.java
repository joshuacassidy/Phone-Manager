public class Main {
    public static void main(String[] args){
        ITelephone myPhone;
        myPhone = new DeskPhone(831880578);
        myPhone.powerOn();
        myPhone.callPhone(831880578);
        myPhone.answer();

        myPhone = new MobilePhone(24565);
        myPhone.powerOn();
        myPhone.callPhone(24565);
        myPhone.answer();
    }
}
