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
            void 재료출력() {
            }
        }
        class Water extends Option2 {
        }
        class Milk extends Option2 {
        }
        class CoffeeBean extends Option2 {
        }
        class Cup extends Option2 {
        }
        class Money extends Option2 {
        }


