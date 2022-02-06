package Third;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;
import java.util.Scanner;

public class Third {
    enum Vowel{
        А, Е, У, О, Э, И, Я, Ю, Ы, Ё, а, е, у, о, э, и, я, ю, ы, ё
    }
    int countVowel(String str){
        int summ = 0;
        for(int a = 0; a<str.length(); a++){
            try{
                Vowel.valueOf(Character.toString(str.charAt(a)));
                summ++;
            }
            catch (Exception e){}
        }
        return summ;
    }
    void sortCollection(ArrayList <CollectionForSort> col){
        boolean flag = false;
        CollectionForSort temp;
        while(!flag){
            flag = true;
            for(int a = 0; a<col.size()-1; a++){
                if(col.get(a).count < col.get(a+1).count){
                    temp = col.get(a);
                    col.set(a, col.get(a+1));
                    col.set(a+1, temp);
                    flag = false;
                }
            }
        }
    }
    String setFirstVowelCapitalized(String sentence){
        System.out.println(sentence.length());
        boolean flag = true;
        String temp;
        for(int a = 0; a<sentence.length(); a++){
            if(sentence.charAt(a) == ' '){
                flag = true;
            }
            if(flag){
                try{
                    Vowel.valueOf(Character.toString(sentence.charAt(a)));
                    temp = ((Character.toString(sentence.charAt(a))).toUpperCase(Locale.ROOT));
                    sentence = sentence.substring(0, a) + temp + sentence.substring(a+1);
                    System.out.println(sentence.charAt(a));
                    flag = false;
                }
                catch (Exception e){}
            }
        }
        return sentence;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Third third = new Third();
        String input = scanner.nextLine();
        ArrayList <String> buf = new ArrayList<>();
        ArrayList <Integer> order = new ArrayList<>();
        ArrayList <CollectionForSort> col = new ArrayList<>();
        String tempbuf = "";
        String addable = "";
        buf.add(tempbuf);
        int count = 0;
        //Вывод количества гласных во всех словах
        for(int a = 0; a<input.length(); a++){
            if(input.charAt(a)!= ' ')
                addable += input.charAt(a);
            if(input.charAt(a) == ' ' || a == input.length()-1){
                buf.set(count, addable);
                order.add(third.countVowel(buf.get(count)));
                col.add(new CollectionForSort(buf.get(count), order.get(count)));
                System.out.println("Количество гласных в слове " + buf.get(count) + ": " + Integer.toString(order.get(count)));
                count++;
                buf.add(tempbuf);
                addable = "";
                continue;
            }
        }
        //Сортировка и вывод списка слов по количеству гласных по убыванию
        System.out.println("Отсортированный список: ");
        third.sortCollection(col);
        for(int a = 0; a<col.size(); a++){
            System.out.println(col.get(a).word);
        }
        //Замена всех первых гласных букв на заглавные в каждом из слов предложения
        System.out.println("Предложение с заглавными первыми гласными буквами в словах: " + third.setFirstVowelCapitalized(input));
    }
}
