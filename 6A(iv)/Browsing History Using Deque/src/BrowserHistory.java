import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BrowserHistory {
    private Deque<String> backStack;   // Stack for going back
    private Deque<String> forwardStack; // Stack for going forward
    private String currentPage;        // The current page being viewed

    public BrowserHistory() {
        backStack = new ArrayDeque<>();
        forwardStack = new ArrayDeque<>();
        currentPage = null;
    }

    // Method to add a new page to the history
    public void visitPage(String page) {
        if (currentPage != null) {
            backStack.push(currentPage); // Push current page to back stack before navigating to new page
        }
        currentPage = page;
        forwardStack.clear(); // Clear forward stack because we are visiting a new page
        System.out.println("Visited: " + currentPage);
    }

    // Method to go back to the previous page
    public void goBack() {
        if (backStack.isEmpty()) {
            System.out.println("No previous page to go back to.");
        } else {
            forwardStack.push(currentPage); // Push current page to forward stack
            currentPage = backStack.pop();  // Pop the most recent page from back stack
            System.out.println("Went back to: " + currentPage);
        }
    }

    // Method to go forward to the next page
    public void goForward() {
        if (forwardStack.isEmpty()) {
            System.out.println("No next page to go forward to.");
        } else {
            backStack.push(currentPage);   // Push current page to back stack
            currentPage = forwardStack.pop(); // Pop the most recent page from forward stack
            System.out.println("Went forward to: " + currentPage);
        }
    }

    // Method to display the current page
    public void displayCurrentPage() {
        if (currentPage == null) {
            System.out.println("No current page.");
        } else {
            System.out.println("Current page: " + currentPage);
        }
    }

    public static void main(String[] args) {
        BrowserHistory browserHistory = new BrowserHistory();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nBrowser History System");
            System.out.println("1. Visit New Page");
            System.out.println("2. Go Back");
            System.out.println("3. Go Forward");
            System.out.println("4. Display Current Page");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter the page URL: ");
                    String page = scanner.nextLine();
                    browserHistory.visitPage(page);
                    break;
                case 2:
                    browserHistory.goBack();
                    break;
                case 3:
                    browserHistory.goForward();
                    break;
                case 4:
                    browserHistory.displayCurrentPage();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
