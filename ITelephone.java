public interface ITelephone {
    void power();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
    void hangUp();
}
