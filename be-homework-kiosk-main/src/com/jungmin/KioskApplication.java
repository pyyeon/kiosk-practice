package com.jungmin;

public class KioskApplication {
    public static void main(String[] args) {
        // Kiosk 클래스의 기능을 구현 및 활용해서 프로그래밍 요구 사항에 맞는 키오스크 프로그램을 구현하세요.
        // MenuItem 클래스는 음식 정보를 표현하고 있으며 MenuItem 클래스를 이용해 주문할 음식 정보를 출력할 수 있습니다.
        // 이 외의 필요한 클래스가 있다면 자유롭게 추가해서 여러분들만의 키오스크 프로그램을 만들면 됩니다.
        Kiosk kiosk = new Kiosk();
        //안내문구 출력
        kiosk.input_print();
        //사용자 음식 선택, 주문 정보 입력
        int price = kiosk.choice();
        //선택된 음식 수량 입력
        int count = kiosk.count();
        //주문 총 금액 안내 및 프로그램 종료
        kiosk.getTotalCost(price, count);//금액,수량
        kiosk.output_print(kiosk.getTotalCost(price, count));
    }


}
