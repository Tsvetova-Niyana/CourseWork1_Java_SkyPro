public class Employee {
    /*
    1. Создать класс Employee, который содержит информацию о Ф.И.О., отделе и зарплате сотрудника.
        Отделы для простоты должны быть названы от 1 до 5.
    2. Добавить статическую переменную-счетчик, которая будет отвечать за id.
    3. Добавить в класс Employee поле id, которое проставляется из счетчика, а затем счетчик увеличивает свое
       значение.
    4. Добавить возможность получать значения полей из Employee (геттеры) для всех полей.
    5. Добавить возможность устанавливать значения полей отдела и зарплаты (сеттеры).
    6. По умолчанию все поля должны передавать через конструктор (кроме id) и заполняться в нем
       (включая id, который нужно получить из счетчика).
     */
    private static int idEmploy;
    private int id;
    private String fullNameEmploy;
    private int department;
    private double salaryEmploy;


    // Формирование конструктора
    public Employee(String fullNameEmploy, int department, int salaryEmploy) {
        id = ++idEmploy;
        this.fullNameEmploy = fullNameEmploy;
        this.department = department;
        this.salaryEmploy = salaryEmploy;

    }

    // Создание геттеров для всех полей
    public int getIdEmploy() {
        return this.id;
    }

    public String getFullNameEmploy() {
        return this.fullNameEmploy;
    }

    public int getDepartment() {
        return this.department;
    }

    public double getSalaryEmploy() {
        return this.salaryEmploy;
    }

    // Создание сеттеров для полей отдела и зарплаты
    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalaryEmploy(double salaryEmploy) {
        this.salaryEmploy = salaryEmploy;
    }

    // Переопределение метода toString для класса Employee
    @Override
    public String toString() {
        return  "Код сотрудника: " + id +
                ", \nФ.И.О сотрудника: " + fullNameEmploy +
                ", \nОтдел: " + department +
                ", \nЗарплата сотрудника: " + salaryEmploy+"\n";
    }
}


