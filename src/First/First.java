package First;

import java.util.Scanner;

public class First {
    int getSumm(String str){
        int summ = 0;
        for(int a = 0; a<str.length(); a++){
            if(Character.isDigit(str.charAt(a))){
                summ += Integer.valueOf(str.charAt(a))-48;
            }
        }
        return summ;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Распознаётся любая строка содержащая цифры и/или буквы, возвращается сумма цифр во всей строке
        String input = scanner.nextLine();
        First first = new First();
        System.out.println(first.getSumm(input));

    }
}
