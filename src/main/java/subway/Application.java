package subway;

import java.util.Scanner;
import controller.MainController;
import view.InputView;

public class Application {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        // TODO: 프로그램 구현
        InputView.scanner = scanner;
        MainController mainController = new MainController();
        mainController.run();
    }
}
