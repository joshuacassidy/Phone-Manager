public class Main {
    public static void main(String[] args){
        System.out.print("\033[H\033[2J");
        int phoneNumber = 831880578;
        ITelephone[] myPhone = new ITelephone[]  {  new DeskPhone(phoneNumber), new MobilePhone(phoneNumber) };
        for(ITelephone i: myPhone){
            i.power();
            i.callPhone(phoneNumber);
            i.answer();
            i.hangUp();
            i.dial(phoneNumber);
            i.hangUp();
            i.power();
        }

    }
}
