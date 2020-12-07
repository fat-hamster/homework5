public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Иван Иванов", "Инженер", "ivivan@mailbox.com", "892312312", 30000L, 30);
        employees[1] = new Employee("Петр Петров", "Кладовщик", "ppetrov@mailbox.com", "892312313", 15000L, 41);
        employees[2] = new Employee("Сидор Сидоров", "Директор", "ssidorov@mailbox.com", "892312314", 60000L, 52);
        employees[3] = new Employee("Михаил Михайлов", "Разработчик", "mmihajlov@mailbox.com", "892312315", 90000L, 23);
        employees[4] = new Employee("Николай Николаев", "Бухгалтер", "nnikolaev@mailbox.com", "892312316", 45000L, 29);

        for (Employee employee : employees) {
            if(employee.getAge() > 40) {
                System.out.println(employee.getInfo());
            }
        }
    }
}
