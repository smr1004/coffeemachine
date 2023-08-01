public class  Option2 extends CoffeeMachine {
 // 재료(Ingredient) 채우기
// H2O ,milk ,coffeeBean, cup, money
//초기값 돈 50000원,H2O 400ml,우유 540ml, 원두 120g, 컵 9개
//
    public static void main(String[] args) {

        CoffeeMachine coffeeMachine = new CoffeeMachine(new Water(amount:400),new Milk(amount:540),
        new CoffeeBean(amount:120),new Cup(amount:9),new Money(amount:50000));
        coffeeMachine01.작동();
    }
}
        abstract class Option2 {
            private int amount;

            public Ingredient(int amount) {
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

