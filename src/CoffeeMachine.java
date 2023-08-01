import java.util.Scanner;

public class CoffeeMachine {
//2023.8.1(화)
 /*   커피 머신 초기 상태 : H2O 400ml , 우유 540ml , 원두 120g , 컵 9개 , 돈 50000원
    옵션  선택시 : 1.구매  2. 채우기 3. 가져가기 4.종료
옵션 1.구매 선택 : => 커피 선택 : 1.에스프레소 4000원 ,2.라떼 7000원, 3.카푸치노 6000원
           => 돈 계산 , 재료 차감 (상속, 캡슐화)
    재료 부족 상황 발생 : "물이 부족하다." ( 남은 H2O 150ml,우유 540ml, 원두 104g, 컵 8개,돈 54000원  )
      ( 에스프레소 1잔 :차감 재료 H2O 250ml,원두 16g,컵 1개, +돈 4000원 )
옵션 2 선택 : => 2.채우기  : H2O 1000ml,우유 500ml, 원두 300g ,컵 20개
         => 남은 재료와 돈 상태: H2O 1150ml, 우유 1040ml, 원두 404g, 컵 28개, 돈 54000원
옵션 3 선택 : => 3.가져가기 .돈 꺼내기 : 54000원
         => 남은 재료와 돈 상태 : H2O 1150ml,우유 1040ml,원두 404g, 컵 28개,돈 0원 >
옵션 1 선택 : => 1.구매  => 커피 선택 : 2.라떼 와 3.카푸치노 구매 =>가격 13000원
     "커피 구매 하였습니다.감사합니다.카푸치노가 준비되었습니다.맛있게 드세요!"
     남은 재료와 돈 상태 : H2O 600ml(-550ml후),우유 865ml(-175ml후),
                      :원두 372g (-32g후) ,컵 26개 (-2 개),돈 13000원(+)
옵션 4 선택 : => 4.종료
      " 커피 머신이 종료 되었습니다.종료 코드 0으로 완료된 프로세스 "
*/
//    필드 :  money;  water;  milk;   coffeeBean;  cup;
//    생성자
//  메소드  : void 구매(){}; void 채우기(){}; void 가져가기(){}; void 작동(){};  void 재료 출력(){};
//    실행 메소드
    public static void main(String[] args, int cancelNum) {
        System.out.println("실행");

        Scanner sc = new Scanner(System.in);
        int count = 0;

        String[] orderList = new String[5];

        int total = 0;

        while (true) {
            System.out.println("1.구매 하기");
            System.out.println("2.재료 채우기");
            System.out.println("3.가져오기");
            System.out.println("4.종료");
            System.out.print("입력: ");

            int num = sc.nextInt();

            if (num == 1) {
                String menuName = "";
                int menuPrice = 0;
                System.out.println("1. 에스프레소\t4000원");
                System.out.println("2. 라떼\t7000원");
                System.out.println("3. 카푸치노\t6000원");

                int menuNum = sc.nextInt();
                if (menuNum == 1) {
                    menuName = "에스프레소";
                    menuPrice = 4000;
                } else if (menuNum == 2) {
                    menuName = "라떼";
                    menuPrice = 7000;
                } else if (menuNum == 3) {
                    menuName = "카푸치노";
                    menuPrice = 6000;
                } else {
                    System.out.println("잘못 입력하셨습니다.");
                    continue;
                }
                total += menuPrice;
                orderList[count] = menuName;
                count++;

                System.out.println("커피 구매하였습니다.감사합니다." + menuName + " 가 준비되었습니다.맛있게 드세요!");

            } else if (num == 2) {
                System.out.println("재료가 부족합니다.");
                for (int i = 0; i < count; i++) {
                    System.out.println(i + 1 + "." + orderList[i]);
                }

                if (!(1 > cancelNum || cancelNum > count)) {
                    String delMenu = orderList[cancelNum - 1];
                    System.out.println(delMenu + " 재료 삭제 ");
                    for (int i = cancelNum - 1; i < count; i++) {
                        orderList[i] = orderList[i + 1];
                    }

                    if (delMenu.equals("물 :")) {

                        boolean b = total <= 250;
                        System.out.println("물이 부족합니다. ");
                    } else if (delMenu.equals("우유 :")) {

                        boolean b = total <= 90;

                    } else if (delMenu.equals("원두 :")) {
                        total -=16 ;
                        boolean b = total <= 16;

                    } else if (delMenu.equals("컵 :")) {
                        total -=1 ;
                        boolean b = total <= 1;

                    } else {
                        System.out.println("재료가 충분합니다.");
                        continue;
                    }
                    count--;
                }

            } else if (num == 3) {
                System.out.println("결제할 금액:" + total + "원");
                System.out.print("지불할 금액:");
                int money = sc.nextInt();
                if (money < total) {
                    System.out.println("잔돈이 부족합니다.");
                    continue;
                } else {
                    System.out.println("잔돈은 " + (money - total) + "원 입니다.");
                    total = 0;
                    for (int i = 0; i < 5; i++)
                        orderList[i] = "";
                }
                count = 0;

            } else if (num == 4) {
                System.out.println("커피 머신이 종료 되었습니다.종료 코드 0");
                break;
            }

            }
        }
    }













