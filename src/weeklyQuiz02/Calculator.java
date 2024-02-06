package weeklyQuiz02;

public class Calculator {
    //getDeliveryCharge메서드의 지역 변수 baseDeliveryCharge
    public static int getDeliverCharge(double weight, int price){
        //기본배송비 baseDeliveryCharge의 가격은 메서드 getBaseDeliveryCharge에 매개변수 weight 넣은 int 값
        int baseDeliveryCharge = getBaseDeliveryCharge(weight);

        if(price < 30000){
            return baseDeliveryCharge;
        } else if (price < 100000) {
            return baseDeliveryCharge - 1000;
        }
        return 0;
    }

    private static int getBaseDeliveryCharge(double weight){
        int deliveryCharge;
        if(weight < 3.0) {
            deliveryCharge = 1000;
        } else if (weight < 10) {
            deliveryCharge = 500;
        } else {
            deliveryCharge = 10000;
        }
        return deliveryCharge;
    }
}
