public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);

        System.out.println("Задание 2");
        String fullName_1 = "Ivanov Ivan Ivanovich";
        String upperFullName_1 = fullName_1.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + upperFullName_1);

        System.out.println("Задание 3");
        String fullName_2 = "Иванов Семён Семёнович";

        String fixedFullName_2 = fullName_2.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fixedFullName_2);
    }
}