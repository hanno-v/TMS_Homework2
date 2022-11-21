package by.tms.lesson29.task1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


// 1. Создать программу для чтения номеров контрактов из файла.
//Неповторяющиеся номера контрактов следует сохранить в структуру
//данных ключ-значение, где ключ - это номер контракта, а значение - это
//объекта класса Document со всей контекстной информацией (номер
//документа, дата создания и другая информация).
//Структуру данных ключ-значение вывести на экран.
public class Task1Main {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(Paths.get("resources", "task1", "contracts.txt").toFile())) {

            Map<String, Document> contractsMap = new HashMap<>();

            while (scanner.hasNext()) {

                String contractNum = scanner.next();

                if (!contractsMap.containsKey(contractNum)) {

                    String documentNumber = scanner.next();
                    String dateCreated = scanner.next();
                    String info = scanner.next();

                    Document document = new Document(documentNumber, dateCreated, info);

                    contractsMap.put(contractNum, document);

                    System.out.println(contractsMap.toString());
                } else {
                    scanner.next();
                    scanner.next();
                    scanner.next();
                }

            }

            System.out.println(contractsMap.toString());
            System.out.println("Map contains of " + contractsMap.size() + " elements");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
