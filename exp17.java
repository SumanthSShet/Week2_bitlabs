import java.util.Scanner;

public class exp17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter project score: ");
        double project = sc.nextDouble();
        System.out.print("Enter internal score: ");
        double internal = sc.nextDouble();
        System.out.print("Enter external score: ");
        double external = sc.nextDouble();

        boolean passProject = project >= 50;
        boolean passInternal = internal >= 50;
        boolean passExternal = external >= 50;

        if (passProject && passInternal && passExternal) {
            double total = (0.7 * project) + (0.2 * external) + (0.1 * internal);
            System.out.println("Total score: " + total);
            if (total >= 90) {
                System.out.println("Grade: A");
            } else if (total >= 70) {
                System.out.println("Grade: B");
            } else if (total >= 50) {
                System.out.println("Grade: C");
            }
        } else {
            System.out.print("Failed in: ");
            if (!passProject) {
                System.out.print("project " + project + ", ");
            }
            if (!passInternal) {
                System.out.print("internal " + internal + ", ");
            }
            if (!passExternal) {
                System.out.print("external " + external);
            }
        }
    }
}
