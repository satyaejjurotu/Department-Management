import departments.AdminDepartment;
import departments.HrDepartment;
import departments.TechDepartment;

public class App {
    private static String deparmentPrefix = "Welcome to";
    public static void main(String[] args) throws Exception {
        /// Create an object of each department.
        AdminDepartment adminDepartment = new AdminDepartment();
        HrDepartment hrDepartment = new HrDepartment();
        TechDepartment techDepartment = new TechDepartment();
        System.out.println("\n\n");

        /// Admin department
        System.out.println(welcomeDepartmentMessage(adminDepartment.departmentName()));
        System.out.println(adminDepartment.getTodaysWork());
        System.out.println(adminDepartment.getWorkDeadline());
        System.out.println(adminDepartment.isTodayAHoliday());
        System.out.println("\n");

        /// Hr department
        System.out.println(welcomeDepartmentMessage(hrDepartment.departmentName()));
        System.out.println(hrDepartment.doActivity());
        System.out.println(hrDepartment.getTodaysWork());
        System.out.println(hrDepartment.getWorkDeadline());
        System.out.println(hrDepartment.isTodayAHoliday());
        System.out.println("\n");

        /// Tech department
        System.out.println(welcomeDepartmentMessage(techDepartment.departmentName()));
        System.out.println(techDepartment.getTodaysWork());
        System.out.println(techDepartment.getWorkDeadline());
        System.out.println(techDepartment.getTechStackInformation());
        System.out.println(techDepartment.isTodayAHoliday());
        System.out.println("\n\n");
    }

    private static String welcomeDepartmentMessage(String department){
        String format = "%s %s";
        return String.format(format, deparmentPrefix, department);
    }
}
