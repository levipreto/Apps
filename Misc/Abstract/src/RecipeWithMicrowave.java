package Misc.Abstract.src;

public class RecipeWithMicrowave extends AbstractRecipe {

    @Override
    void getReady() {
        System.out.println("Get the raw materials");
        System.out.println("Get the utensils");
        System.out.println("Switch on the microwave");
    }

    @Override
    void doTheDish() {
        System.out.println("Prepare the dish");
        System.out.println("Put the dish in microwave");
    }

    @Override
    void cleanUp() {
        System.out.println("Turn off the microwave");
        System.out.println("Clean up the utensils");

    }

}