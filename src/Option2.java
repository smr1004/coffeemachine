import java.util.Scanner;

public class Option2 extends CoffeeMachine {
// 2023.8.1(화)
// 재료(Ingredient) 채우기
// H2O ,milk ,coffeeBean, cup, money
//초기값 돈 50000원,H2O 400ml,우유 540ml, 원두 120g, 컵 9개
//필드
    Water water;
    Milk milk;
    CoffeeBean coffeeBean;
    Cup cup;
    Money money;
    Ingredient ingredient;
    // 생성자
    public Option2 (Water water, Milk milk, CoffeeBean coffeeBean, Cup cup, Money money) {
        this.water = water;
        this.milk = milk;
        this.coffeeBean = coffeeBean;
        this.cup = cup;
        this.money = money;
        this.ingredients = new Ingredient[]{this.water,this.milk,this.coffeeBean,this.cup,this.money};
    }
    public Option2(int amount) {
        super();
    }
    // 메소드
    void 구매() {};
    void 채우기() {};
    void 가져가기() {};
    void 작동() {
        System.out.println("커피머신이 작동했습니다!");
    재료출력();
        while (isRun) {
            int answer = 사용자입력받기("1.구매 2.채우기 3.가져가기>");
            switch (answer) {
case 1 -> buy();
case 2 -> fill();
case 3 -> take();

                사용자입력받기();
            }
        }
    }
    void int 사용자입력받기() {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println(message);
        int input
    };

//
    private void buy(){
        int coffeeNumber = 사용자입력받기("어떤 커피를 사시겠어요?1.에스프레소 2. 라떼 3.카푸치노");
        switch (coffeeNumber){
            case 1 -> makeCoffee(new cappuccino());
            case 2 -> break;
            case 3 -> break;
        }
    }

private void makeCoffee(Coffee coffee){

}







    private void take(){
        int 꺼낼돈=사용자입력받기("얼마를 꺼내시겠습니까?>");
        try{
            this.money.remove
        }
    }




//실행 메소드
    public static void main(String[] args) {

        int amount;
        CoffeeMachine coffeeMachine = new CoffeeMachine(new Water(amount:400), new Milk(amount:540),
        new CoffeeBean(amount:120),new Cup(amount:9),new Money(amount:50000));
        coffeeMachine01.작동();
    }
}
    abstract class Option2 {
            private int amount;
            public Option2(int amount) {
                this.amount = amount;
            }
            public int getAmount() {
                return amount;
            }
        }
        class Water extends Option2 {
            public Water(int amount) {
                super(amount);
            }
        }
        class Milk extends Option2 {
            public Milk(int amount) {
                super(amount);
            }
        }
        class CoffeeBean extends Option2 {
            public CoffeeBean(int amount) {
                super(amount);
            }
        }
        class Cup extends Option2 {
            public Cup(int amount) {
                super(amount);
            }
        }
        class Money extends Option2 {
            public Money(int amount) {
                super(amount);
            }
        }
abstract class Coffee {
    Water needWater;
    Milk needMilk;
    CoffeeBean needCoffeeBean;
    Money price;
}



