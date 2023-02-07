public class Main {

    public static void getInfoAllEmployee(Employee[] emp) {
        /*
        Статический метод, который взаимодействует с массивом и позволяет получить список всех сотрудников
        со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString)).
         */
        System.out.println("---Вывод информации о сотрудниках---\n");

        for (int i = 0; i < emp.length; i++) {
            System.out.println(emp[i]);
        }
    }

    public static double getTotalSalaryInMonth(Employee[] emp) {
        /*
        Статический метод, который взаимодействует с массивом, позволяет посчитать и получить
        сумму затрат на зарплаты в месяц.
         */
        double totalSalary = 0;

        for (int i = 0; i < emp.length; i++) {
            totalSalary += emp[i].getSalaryEmploy();
        }

        System.out.println("---Подсчет суммы затрат на на зарплаты в месяц---");
        return totalSalary;
    }

    public static void getEmployWithMinSalary(Employee[] emp) {
        /*
        Статический метод, который взаимодействует с массивом, позволяет посчитать и
        найти сотрудника с минимальной зарплатой.
         */
        double minSalary = emp[0].getSalaryEmploy();
        int index = 0;

        for (int i = 1; i < emp.length; i++) {
            if (minSalary > emp[i].getSalaryEmploy()) {
                index = i;
                minSalary = emp[i].getSalaryEmploy();
            }
        }

        System.out.println("---Поиск сотрудника с минимальной зарплатой---");
        System.out.println("\nМинимальная зарплата: " + minSalary + "\n\n" + emp[index]);
    }

    public static void getEmployWithMaxSalary(Employee[] emp) {
        /*
        Статический метод, который взаимодействует с массивом, позволяет посчитать и найти
        сотрудника с максимальной зарплатой.
         */
        double maxSalary = emp[0].getSalaryEmploy();
        int index = 0;

        for (int i = 1; i < emp.length; i++) {
            if (maxSalary < emp[i].getSalaryEmploy()) {
                index = i;
                maxSalary = emp[i].getSalaryEmploy();
            }
        }

        System.out.println("---Поиск сотрудника с максимальной зарплатой---");
        System.out.println("\nМаксимальная зарплата: " + maxSalary + "\n\n" + emp[index]);
    }

    public static double getAvgSalary(Employee[] emp) {
        /*
        Статический метод, который взаимодействует с массивом, позволяет посчитать и получить
        среднее значение зарплат.
         */
        double totalSalary = 0;

        for (int i = 0; i < emp.length; i++) {
            totalSalary += emp[i].getSalaryEmploy();
        }

        double avgSalary = totalSalary / emp.length;

        System.out.println("---Подсчет среднего значения зарплат---");
        return avgSalary;
    }

    public static void getFullNameAllEmployee(Employee[] emp) {
        /*
        Статический метод, который взаимодействует с массивом и позволяет получить список всех сотрудников
        со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString)).
         */
        System.out.println("\n---Вывод Ф.И.О. всех сотрудников---\n");

        for (int i = 0; i < emp.length; i++) {
            System.out.println(emp[i].getFullNameEmploy());
        }
    }

    public static void main(String[] args) {
        /*
        7. Создать внутри класса с методом main поле типа Employee[10], которое будет выполнять роль
        «хранилища» для записей о сотрудниках.
        8. Создать статические методы, которые будут взаимодействовать с массивом и предоставлять результат:
            1. Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения
            всех полей (toString)).
            2. Посчитать сумму затрат на зарплаты в месяц.
            3. Найти сотрудника с минимальной зарплатой.
            4. Найти сотрудника с максимальной зарплатой.
            5. Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b).
            6. Получить Ф. И. О. всех сотрудников (вывести в консоль).
         */

        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Иванов Иван Иванович", 1, 60500);
        employees[1] = new Employee("Петров Петр Петрович", 4, 53000);
        employees[2] = new Employee("Васильев Василий Васильевич", 2, 33000);
        employees[3] = new Employee("Сидоров Вениамин Валентинович", 5, 46050);
        employees[4] = new Employee("Никонов Владимир Петрович", 1, 26760);
        employees[5] = new Employee("Голованов Аркадий Сергеевич", 3, 25400);
        employees[6] = new Employee("Соколова Арина Вадимовна", 5, 46500);
        employees[7] = new Employee("Грачев Яков Артёмович", 2, 36570);
        employees[8] = new Employee("Сухарева Ника Фёдоровна", 3, 57030);
        employees[9] = new Employee("Семин Андрей Ильич", 5, 62188);

        // Получение списка всех сотрудников со всеми имеющимися по ним данными
        getInfoAllEmployee(employees);

        // Получение суммы затрат на зарплаты в месяц

        System.out.println("Сумма затрат на на зарплаты в месяц: " + getTotalSalaryInMonth(employees));
        System.out.println();

        // Поиск сотрудника с минимальной зарплатой
        getEmployWithMinSalary(employees);

        // Поиск сотрудника с максимальной зарплатой
        getEmployWithMaxSalary(employees);

        // Получение среднего значения зарплат
        System.out.println("Среднее значение зарплат: " + getAvgSalary(employees));

        // Получение Ф.И.О. всех сотрудников
        getFullNameAllEmployee(employees);
    }
}
