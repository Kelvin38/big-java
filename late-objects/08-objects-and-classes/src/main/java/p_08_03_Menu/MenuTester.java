package p_08_03_Menu;

/**
 * {@code Menu} test.
 */
public class MenuTester
{
    public static void main(String[] args)
    {
        Menu mainMenu = new Menu();
        mainMenu.addOption("Open new account");
        mainMenu.addOption("Log into existing account");
        mainMenu.addOption("Help");
        mainMenu.addOption("Quit");

        int input = mainMenu.getInput();
        System.out.println("Input: " + input);
    }
}