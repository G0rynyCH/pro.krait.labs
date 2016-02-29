package ex1;

import ex1.service.EmployeeActions;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by gss on 29.02.2016.
 */
public class Main {

    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {

        boolean statusMenu = false;


        do {

            System.out.println("Вас приветствует система управления персоналом.");
            System.out.println("-----------------------------------------------");
            System.out.println("Введите соответствующую команду и нажмите Enter");
            System.out.println("1. Список сотрудников предприятия");
            System.out.println("2. Добавить нового сотрудника");
            System.out.println("3. Удалить сотрудника");
            System.out.println("4. Изменить данные сотрудника");
            System.out.println("5. Привязка сотрудника к менеджеру");
            System.out.println("6. Выход");
            System.out.print("> ");

            Scanner sc = new Scanner(System.in);
            int selection = sc.nextInt();


            switch (selection) {

                case 1: {
                    EmployeeActions ea = new EmployeeActions();
                    ea.employeeList();
                    statusMenu = true;
                    break;
                }

                case 2: {
                    statusMenu = true;
                    break;
                }
                case 3: {
                    statusMenu = true;
                    break;
                }
                case 4: {
                    statusMenu = true;
                    break;
                }
                case 5: {
                    statusMenu = true;
                    break;
                }
                case 6: {
                    break;
                }
                default:
                    System.out.println("Неверная команда");
                    break;
            }
        } while (statusMenu == false);
    }
}
