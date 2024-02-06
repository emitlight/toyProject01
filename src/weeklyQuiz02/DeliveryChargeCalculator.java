package weeklyQuiz02;

//인터페이스
public interface DeliveryChargeCalculator {
    //추상메서드
    public abstract int getDeliveryCharge(double weight, int price);
}
