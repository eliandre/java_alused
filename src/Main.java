public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();

        menu.addMeal("Hamburger");
        menu.addMeal("Pitsa");
        menu.addMeal("Supp");
        menu.addMeal("Hamburger");

        menu.printMeals();

        menu.clearMenu();
        menu.printMeals();

    }
}