//import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * 1. Реализуйте алгоритм сортировки пузырьком числового массива, результат
 * после каждой итерации запишите в лог-файл.*/

public class zadacha1 {

    public static void main(String[] args) {
    //public static void task1() {
        System.out.print("Введите число, больше нуля: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Random rnd = new Random();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(5 * num);
        }
        System.out.println(Arrays.toString(arr));

        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    System.out.println(Arrays.toString(arr));
                    String text = Arrays.toString(arr);
                    try {
                        FileWriter writer = new FileWriter("/home/eighth/Desktop/JAVA/DZ/DZ_sem2_java/log.txt", true); 
                        writer.write(text + "\n");
                        writer.close();
                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }
                }
            }
        }
        sc.close();
    }
}

//     public static void task2() {
//         System.out.println("Написать метод(ы), который распарсит файл с данными и, используя StringBuilder," +
//                 " создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].");
//         // "фамилия":"Иванов","оценка":"5","предмет":"Математика"
//         String result = read_File("D:/JavaProj/JA_home2/stud.txt");

//         result = result.replaceAll("\"", ""); // Убираем лишние символы
//         result = result.replaceAll(":", " ");
//         result = result.replaceAll(",", " ");

//         String[] arr = result.split(" "); // Сплитим строку в массив
//         StringBuilder show_str = new StringBuilder();

//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i].equals("фамилия")) {
//                 show_str.append("Студент " + arr[i + 1] + " ");
//             } else if (arr[i].equals("оценка")) {
//                 show_str.append("получил " + arr[i + 1] + " ");
//             } else if (arr[i].equals("предмет")) {
//                 show_str.append("по предмету " + arr[i + 1] + "\n");
//             }
//         }

//         System.out.println(show_str);
//     }

//     public static void task3() {
//         System.out.println("Напишите метод, который принимает на вход строку (String) и определяет" +
//                 "\nявляется ли строка палиндромом (возвращает boolean значение)");
//         System.out.print("Введите строку или число: "); // Принимаем строку с клавиатуры
//         Scanner s = new Scanner(System.in);
//         String pal = s.next();
//         isPalindrome(pal);
//     }

//     public static String reverseString(String s){
//         String r = "";
//         for (int i = s.length() - 1; i >= 0; --i)
//             r += s.charAt(i);
//         return r;
//     }

//     public static Boolean isPalindrome(String s) {
//         if(s.equals(reverseString(s))){
//             System.out.println("Полиндром");
//         }else{
//             System.out.println("Не полиндром");
//         }
//         return s.equals(reverseString(s));
//     }

//         // s.close();

//     static String read_File(String file_name) {
//         String string_Result = new String();
//         try (FileReader reader = new FileReader(file_name)) {
//             Scanner scanner = new Scanner(reader);
//             while (scanner.hasNextLine()) {
//                 string_Result += scanner.nextLine() + " ";
//             }
//             scanner.close();
//         } catch (Exception e) {
//             e.printStackTrace();
//             System.out.println("Ошибка! Что-то пошло не так");
//         }
//         return string_Result;
//     }
// }