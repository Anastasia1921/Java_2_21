import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Random;
import java.util.HashMap;
public class Main {

    public static void main(String[] args) throws ParseException {
        //1
        System.out.println("введите строку");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println("введите подстроку");
        String subStr = in.nextLine();
        int num = 0;
        int k = 0;
        if (!str.isEmpty() && !subStr.isEmpty()) {
            while (str.indexOf(subStr, num) != -1) {
                k++;
                num = str.indexOf(subStr, num) + 1;
            }
            System.out.println(k);
        } else {
            System.out.println("строка пуста");
        }

        //2
        System.out.println("введите строку для цензуры");
        String nonCensored = in.nextLine();

        if (!nonCensored.isEmpty()) {
            String Censored = nonCensored.replace("кака", "вырезано цензурой");
            String Censored2 = Censored.replace("бяка", "вырезано цензурой");
            System.out.println(Censored2);
        } else {
            System.out.println("строка пуста");
        }
        //3
        System.out.println("введите строку с датой формата 31.12.2020");
        String date = in.nextLine();
        if (!date.isEmpty()) {
            String[] arrDate = date.split("\\.");
            for (int i = arrDate.length - 1; i > 0; i--) {
                System.out.printf("%s-", arrDate[i]);
            }
            System.out.printf("%s\n", arrDate[0]);
        } else {
            System.out.println("строка пуста");
        }
        //4
        System.out.println("введите новую строку с датой формата 31.12.2020");
        String strNewDate = in.nextLine();
        try {
            if (!strNewDate.isEmpty()) {
                SimpleDateFormat fmtDate = new SimpleDateFormat("dd.MM.yyyy");
                Date parsingDate = fmtDate.parse(strNewDate);
                SimpleDateFormat fmtDate2 = new SimpleDateFormat("yyyy-MM-dd");
                System.out.println(fmtDate2.format(parsingDate));
            } else {
                System.out.println("строка пуста");
            }
        } catch (ParseException e) {
            System.out.println("строка осталась в старом формате " + strNewDate);
        }

    }
}

