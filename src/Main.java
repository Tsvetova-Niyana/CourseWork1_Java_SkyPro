public class Main {
    /*
    Статический метод, который взаимодействует с массивом и позволяет получить список всех сотрудников
    со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString)).
     */
    public static void getInfoAllEmployee(Employee[] emp) {
        System.out.println("---Вывод информации о сотрудниках---\n");

        for (int i = 0; i < emp.length; i++) {
            System.out.println(emp[i]);
        }
    }

    /*
    Статический метод, который взаимодействует с массивом, позволяет посчитать и получить
    сумму затрат на зарплаты в месяц.
     */
    public static double getTotalSalaryInMonth(Employee[] emp) {

        double totalSalary = 0;

        for (int i = 0; i < emp.length; i++) {
            totalSalary += emp[i].getSalaryEmploy();
        }

        System.out.println("---Подсчет суммы затрат на на зарплаты в месяц---");
        return totalSalary;
    }

    /*
    Статический метод, который взаимодействует с массивом, позволяет посчитать и
    найти сотрудника с минимальной зарплатой.
     */
    public static void getEmployWithMinSalary(Employee[] emp) {

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

    /*
    Статический метод, который взаимодействует с массивом, позволяет посчитать и найти
    сотрудника с максимальной зарплатой.
     */
    public static void getEmployWithMaxSalary(Employee[] emp) {

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

    /*
    Статический метод, который взаимодействует с массивом, позволяет посчитать и получить
    среднее значение зарплат.
     */
    public static double getAvgSalary(Employee[] emp) {

        double totalSalary = 0;

        for (int i = 0; i < emp.length; i++) {
            totalSalary += emp[i].getSalaryEmploy();
        }

        double avgSalary = totalSalary / emp.length;

        System.out.println("---Подсчет среднего значения зарплат---");
        return avgSalary;
    }

    /*
    Статический метод, который взаимодействует с массивом и позволяет получить список всех сотрудников
    со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString)).
     */
    public static void getFullNameAllEmployee(Employee[] emp) {

        System.out.println("\n---Вывод Ф.И.О. всех сотрудников---\n");

        for (int i = 0; i < emp.length; i++) {
            System.out.println(emp[i].getFullNameEmploy());
        }
    }

    /*
    Статический метод, который взаимодействует с массивом и позволяет проиндексировать зарплату
    (вызвать изменение зарплат у всех сотрудников на величину аргумента в %).
     */
    public static void getSalaryIndexing(Employee[] emp, int indexationCoefficient) {
        for (int i = 0; i < emp.length; i++) {
            double newSalary = emp[i].getSalaryEmploy() + emp[i].getSalaryEmploy() * indexationCoefficient / 100;
            emp[i].setSalaryEmploy(newSalary);
            System.out.println("Зарплата сотрудника " + emp[i].getFullNameEmploy()
                    + " после индексирования на " + indexationCoefficient + " % составляет - "
                    + emp[i].getSalaryEmploy());
        }
    }

    /*
    Статический метод, который взаимодействует с массивом и позволяет найти сотрудника с минимальной зарплатой
    по указанному параметру номера отдела (1–5)
     */
    public static void getEmployWithMinSalaryByDept(Employee[] emp, int dept) {

        double minSalary = emp[0].getSalaryEmploy();
        int index = 0;

        for (int i = 1; i < emp.length; i++) {
            if (emp[i].getDepartment() == dept && minSalary > emp[i].getSalaryEmploy()) {
                index = i;
                minSalary = emp[i].getSalaryEmploy();
            }
        }


        System.out.println("---Поиск сотрудника с минимальной зарплатой в отделе № " + dept + "---");
        System.out.println("\nМинимальная зарплата: " + minSalary + "\n\n" + emp[index]);
    }

    /*
    Статический метод, который взаимодействует с массивом и позволяет найти сотрудника с максимальной зарплатой
    по указанному параметру номера отдела (1–5)
     */
    public static void getEmployWithMaxSalaryByDept(Employee[] emp, int dept) {

        double maxSalary = 0;
        int index = 0;


        for (int i = 0; i < emp.length; i++) {

            if (emp[i].getDepartment() == dept && maxSalary < emp[i].getSalaryEmploy()) {
                index = i;
                maxSalary = emp[i].getSalaryEmploy();
            }
        }

        System.out.println("---Поиск сотрудника с максимальной зарплатой в отделе № " + dept + "---");
        System.out.println("\nМаксимальная зарплата: " + maxSalary + "\n\n" + emp[index]);
    }

    /*
    Статический метод, который взаимодействует с массивом, позволяет посчитать и получить
    сумму затрат на зарплаты в месяц по конкретному отделу.
     */
    public static double getTotalSalaryInMonthByDept(Employee[] emp, int dept) {

        double totalSalary = 0;

        for (int i = 0; i < emp.length; i++) {
            if (emp[i].getDepartment() == dept) {
                totalSalary += emp[i].getSalaryEmploy();
            }
        }

        System.out.println("---Подсчет суммы затрат на зарплаты в месяц в отделе № " + dept + "---");
        return totalSalary;
    }

    /*
    Статический метод, который взаимодействует с массивом, позволяет посчитать и получить
    среднюю сумму затрат на зарплаты в месяц по конкретному отделу.
    */
    public static double getAvgSalaryByDept(Employee[] emp, int dept) {

        double totalSalary = 0;
        int countEmpByDept = 0;

        for (int i = 0; i < emp.length; i++) {
            if (emp[i].getDepartment() == dept) {
                countEmpByDept += 1;
                totalSalary += emp[i].getSalaryEmploy();
            }
        }

        double avgSalary = totalSalary / countEmpByDept;

        System.out.println("---Подсчет среднего значения зарплат в отделе № " + dept + "---");
        return avgSalary;
    }

    /*
    Статический метод, который взаимодействует с массивом и позволяет проиндексировать зарплату
    всех сотрудников конкретного отдела на указанный процент.
     */
    public static void getSalaryIndexingByDept(Employee[] emp, int indexationCoefficient, int dept) {
        for (int i = 0; i < emp.length; i++) {
            if (emp[i].getDepartment() == dept) {
                System.out.println("Зарплата сотрудника " + emp[i].getFullNameEmploy()
                        + " до индексирования составляет - " + emp[i].getSalaryEmploy());
                double newSalary = emp[i].getSalaryEmploy() + emp[i].getSalaryEmploy() * indexationCoefficient / 100;
                emp[i].setSalaryEmploy(newSalary);
                System.out.println("Зарплата сотрудника " + emp[i].getFullNameEmploy()
                        + " после индексирования на " + indexationCoefficient + " % составляет - "
                        + emp[i].getSalaryEmploy());
                System.out.println();
            }
        }
    }

    /*
    Статический метод, который взаимодействует с массивом и позволяет напечатать всех сотрудников конкретного отдела
    (все данные, кроме отдела).
     */
    public static void getInfoAllEmployeeByDept(Employee[] emp, int dept) {
        System.out.println("---Вывод информации о сотрудниках отдела № " + dept + "---\n");

        for (int i = 0; i < emp.length; i++) {
            if (emp[i].getDepartment() == dept) {
                System.out.println("Код сотрудника: " + emp[i].getIdEmploy() +
                        ", \nФ.И.О сотрудника: " + emp[i].getFullNameEmploy() +
                        ", \nЗарплата сотрудника: " + emp[i].getSalaryEmploy());
                System.out.println();

            }
        }
    }

    /*
    Статический метод, который взаимодействует с массивом и позволяет получить всех сотрудников
    с зарплатой меньше числа (вывести id, Ф. И. О. и зарплатой в консоль)
     */
    public static void getEmployBySalaryLessNum(Employee[] emp, int number) {
        System.out.println("\nИнформация о сотрудниках, зарплата которых менее " + number);
        System.out.println();

        for (int i = 0; i < emp.length; i++) {
            if (emp[i].getSalaryEmploy() < number) {
                System.out.println("Код сотрудника: " + emp[i].getIdEmploy() +
                        ", \nФ.И.О сотрудника: " + emp[i].getFullNameEmploy() +
                        ", \nЗарплата сотрудника: " + emp[i].getSalaryEmploy());
                System.out.println();
            }
        }
    }

    /*
    Статический метод, который взаимодействует с массивом и позволяет получить всех сотрудников
    с зарплатой меньше числа (вывести id, Ф. И. О. и зарплатой в консоль)
     */
    public static void getEmployBySalaryMoreNum(Employee[] emp, int number) {
        System.out.println("\nИнформация о сотрудниках, зарплата которых более " + number);
        System.out.println();

        for (int i = 0; i < emp.length; i++) {
            if (emp[i].getSalaryEmploy() > number) {
                System.out.println("Код сотрудника: " + emp[i].getIdEmploy() +
                        ", \nФ.И.О сотрудника: " + emp[i].getFullNameEmploy() +
                        ", \nЗарплата сотрудника: " + emp[i].getSalaryEmploy());
                System.out.println();
            }
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

         Создать дополнительные статические методы для решения следующих задач.

        1. Проиндексировать зарплату (вызвать изменение зарплат у всех сотрудников на величину аргумента в %).
        2. Получить в качестве параметра номер отдела (1–5) и найти (всего 6 методов):
            1. Сотрудника с минимальной зарплатой.
            2. Сотрудника с максимальной зарплатой.
            3. Сумму затрат на зарплату по отделу.
            4. Среднюю зарплату по отделу (учесть, что количество людей в отделе отличается от employees.length).
            5. Проиндексировать зарплату всех сотрудников отдела на процент, который приходит в качестве параметра.
            6. Напечатать всех сотрудников отдела (все данные, кроме отдела).
        3. Получить в качестве параметра число и найти:
            1. Всех сотрудников с зарплатой меньше числа (вывести id, Ф. И. О. и зарплатой в консоль).
            2. Всех сотрудников с зарплатой больше (или равно) числа (вывести id, Ф. И. О. и зарплатой в консоль).
         */

        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Иванов Иван Иванович", 1, 60500);
        employees[4] = new Employee("Никонов Владимир Петрович", 1, 26760);
        employees[2] = new Employee("Васильев Василий Васильевич", 2, 33000);
        employees[7] = new Employee("Грачев Яков Артёмович", 2, 36570);
        employees[5] = new Employee("Голованов Аркадий Сергеевич", 3, 25400);
        employees[8] = new Employee("Сухарева Ника Фёдоровна", 3, 57030);
        employees[1] = new Employee("Петров Петр Петрович", 4, 53000);
        employees[3] = new Employee("Сидоров Вениамин Валентинович", 5, 46050);
        employees[6] = new Employee("Соколова Арина Вадимовна", 5, 44500);
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

        // Получение заработной платы сотрудников в соответствии с проведенной индексацией по указанному параметру
        System.out.println("\nЗаработная плата сотрудников после индексации");
        System.out.println("_________________________________________________________________________________________");

        getSalaryIndexing(employees, 36);

        // Данные по минимальной зарплате показываются с учетом проведенной индексации (если она была)
        System.out.println();
        System.out.println("_________________________________________________________________________________________");
        System.out.println("Данные по минимальной зарплате показываются с учетом проведенной индексации " +
                "(если она была проведена)");
        System.out.println("_________________________________________________________________________________________");
        getEmployWithMinSalaryByDept(employees, 1);
        getEmployWithMinSalaryByDept(employees, 2);
        getEmployWithMinSalaryByDept(employees, 3);
        getEmployWithMinSalaryByDept(employees, 4);
        getEmployWithMinSalaryByDept(employees, 5);

        // Данные по максимальной зарплате показываются с учетом проведенной индексации (если она была)
        System.out.println("_________________________________________________________________________________________");
        System.out.println("Данные по минимальной зарплате показываются с учетом проведенной индексации " +
                "(если она была проведена)");
        System.out.println("_________________________________________________________________________________________");
        getEmployWithMaxSalaryByDept(employees, 1);
        getEmployWithMaxSalaryByDept(employees, 2);
        getEmployWithMaxSalaryByDept(employees, 3);
        getEmployWithMaxSalaryByDept(employees, 4);
        getEmployWithMaxSalaryByDept(employees, 5);


        System.out.println();
        System.out.println("_________________________________________________________________________________________");
        System.out.println(getTotalSalaryInMonthByDept(employees, 1));
        System.out.println(getTotalSalaryInMonthByDept(employees, 2));
        System.out.println(getTotalSalaryInMonthByDept(employees, 3));
        System.out.println(getTotalSalaryInMonthByDept(employees, 4));
        System.out.println(getTotalSalaryInMonthByDept(employees, 5));

        System.out.println();
        System.out.println("_________________________________________________________________________________________");
        System.out.println(getAvgSalaryByDept(employees, 1));
        System.out.println(getAvgSalaryByDept(employees, 2));
        System.out.println(getAvgSalaryByDept(employees, 3));
        System.out.println(getAvgSalaryByDept(employees, 4));
        System.out.println(getAvgSalaryByDept(employees, 5));

        System.out.println();
        System.out.println("_________________________________________________________________________________________");
        getSalaryIndexingByDept(employees, 25, 1);
        getSalaryIndexingByDept(employees, 26, 2);
        getSalaryIndexingByDept(employees, 27, 3);
        getSalaryIndexingByDept(employees, 28, 4);
        getSalaryIndexingByDept(employees, 29, 5);

        System.out.println();
        System.out.println("_________________________________________________________________________________________");
        getInfoAllEmployeeByDept(employees, 1);
        getInfoAllEmployeeByDept(employees, 2);
        getInfoAllEmployeeByDept(employees, 3);
        getInfoAllEmployeeByDept(employees, 4);
        getInfoAllEmployeeByDept(employees, 5);

        System.out.println();
        System.out.println("_________________________________________________________________________________________");
        getEmployBySalaryLessNum(employees, 70000);

        System.out.println();
        System.out.println("_________________________________________________________________________________________");
        getEmployBySalaryMoreNum(employees, 85000);
    }
}
