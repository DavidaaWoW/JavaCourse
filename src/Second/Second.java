package Second;

import java.util.Scanner;

public class Second {
    boolean isSimple(int input){
        if(input<3){
            return true;
        }
        for(int a = 2; a<input; a++){
            if(input%a == 0){
                return false;
            }
        }
        return true;
    }
    void printSimple(int digit){
        for(int a = 1; a<digit+1; a++){
            if(digit%a == 0 && isSimple(a)){
                System.out.println(a + " ");
            }
        }
    }
    public static void main(String[] args) {
        Second second = new Second();
        Scanner scanner = new Scanner(System.in);
        try {
            //Если вводится целое число, производится вывод всех его простых делителей
            second.printSimple(scanner.nextInt());
        }
        catch (Exception e){
            //Иначе выводится сообщение об ошибке
            System.out.println(e);
        }
    }
}
