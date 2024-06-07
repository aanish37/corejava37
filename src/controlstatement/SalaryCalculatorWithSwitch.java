package controlstatement;

public class SalaryCalculatorWithSwitch {

    public static void main(String[] args) {
        String post = "CEO"; 
        double basicSalary = 0;
        double bonusPercentage = 0;

        switch(post) {
            case "MD":
                basicSalary = 230000;
                bonusPercentage = 20;
                break;
            case "CEO":
                basicSalary = 250000;
                bonusPercentage = 25.79;
                break;
            case "MANAGER":
                basicSalary = 176000;
                bonusPercentage = 16;
                break;
            case "HELPER":
                basicSalary = 145900;
                bonusPercentage = 9;
                break;
            default:
                System.out.println("Invalid post");
                return; // Exit the method if the post is invalid
        }

        double totalSalary = basicSalary + (basicSalary * bonusPercentage / 100);
        System.out.printf("Post: %s%nBasic Salary: %.2f%nBonus: %.2f%%%nTotal Salary: %.2f%n", post, basicSalary, bonusPercentage, totalSalary);
    }
}
