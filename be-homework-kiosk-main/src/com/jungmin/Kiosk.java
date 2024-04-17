package com.jungmin;

import java.util.Scanner;
import com.jungmin.MenuItem;


public class Kiosk {
    static Scanner sc = new Scanner(System.in);


    //얘는 클래스 int로 받을 수 없음


    // 주문 안내 메시지를 출력하는 메서드를 정의할 수 있습니다.
    public void input_print() {
        System.out.println("[안내]안녕하세요. 김밥천국에 오신 것을 환영합니다.");

    }


    // 주문할 음식을 선택하는 메서드를 정의 할 수 있습니다.
    public int choice() {
        //기본 김밥
        MenuItem m1 = new MenuItem("김밥",1000,1);

        //계란 김밥
        MenuItem m2 = new MenuItem("계란 김밥",1500,2 );

        //충무 김밥
        MenuItem m3 = new MenuItem("충무 김밥", 1000,3 );

        //떡볶이
        MenuItem m4 = new MenuItem("떡볶이", 2000, 4);

        int id;
        int price = 0;
        while (true) {
            System.out.println("-".repeat(30));
            System.out.println("[안내]원하시는 메뉴의 번호를 입력하여 주세요.");
            //메뉴
            System.out.printf("%d) %s");
            //숫자선택 = 메뉴 id 선택
            id = sc.nextInt();

            //얘를 getId로 객체 선택하게
            //1-4 숫자가 아닌 다른걸 입력했을때 예외처리
            //
                switch (id) {
                    case 1:
                        price = m1.getPrice();
                        break;
                    case 2:
                        price = m2.getPrice();
                        break;
                    case 3:
                        price = m3.getPrice();
                        break;
                    case 4:
                        price = m4.getPrice();
                        break;
                    default:
                        System.out.println("[안내]메뉴에 포함된 번호를 입력하여 주세요.");

                }
            if (id >= 1 && id <= 4) {
                break;
            }

            }


        return price;

    }

    // 주문할 음식의 수량을 입력하는 메서드를 정의할 수 있습니다.
    public int count() {
        int num;
        while (true) { //더 구체적인 조건
            System.out.println("[안내]선택하신 메뉴의 수량을 입력하여 주세요.");
            System.out.println("(※ 최대 주문 가능 수량 : 99)");
            num = sc.nextInt();
            if (num > 0 && num < 100) {
                break;
            } else {
                System.out.println("[경고]100개는 입력하실 수 없습니다.\n");
                System.out.println("[경고]수량 선택 화면으로 돌아갑니다.\n");
            }
            System.out.println();
        }
        return num;
    }

    // 음식 주문을 위한 메서드를 정의할 수 있습니다.
    //주문 입력
    public int getTotalCost(int price, int number) {
        //계산?
        // 메뉴가격 * 갯수
        return price * number;
    }

    // 주문 결과를 출력하는 메서드를 정의할 수 있습니다.
    public void output_print(int cost) {
        System.out.println("-".repeat(30));
        System.out.printf("[안내]주문하신 메뉴의 총 금액은 " + cost + "원 입니다.\n");
        System.out.println("[안내]이용해 주셔서 감사합니다.");
    }
}
