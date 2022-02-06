package Fifth;

import java.util.ArrayList;

public class Fifth {
    Item[] items = new Item[10];
    ArrayList <Item> safe = new ArrayList<>();
    int safeSize = 50;
    public Fifth(){
        for(int a = 0; a<10; a++){
            this.items[a] = new Item((int)(Math.random() * ((30 - 5) + 1) + 5), (int)((Math.random() * ((100 - 1) + 1)) + 1));
        }
    }
    void printItems(){
        for(int a = 0; a<10; a++){
            System.out.println("Цена: " + items[a].price + ", размер: " + items[a].size + ", коэффициент: " + items[a].coefficient);
        }
    }
    void sortItems(){
        boolean flag = false;
        Item temp;
        while(!flag){
            flag = true;
            for(int a = 0; a<items.length-1; a++){
                if(items[a].coefficient < items[a+1].coefficient){
                    temp = items[a];
                    items[a] = items[a+1];
                    items[a+1] = temp;
                    flag = false;
                }
            }
        }
    }
    void fillSafe(){
        boolean flag = false;
        while(!flag){
            flag = true;
            for(int a = 0; a<10; a++){
                if(safeSize-items[a].size >= 0){
                    safeSize -= items[a].size;;
                    safe.add(items[a]);
                    flag = false;
                    break;
                }
            }
        }
    }

    void outSafe(){
        for (Item safeItem: safe) {
            System.out.println(safeItem.toString());
        }
    }
    public static void main(String[] args) {
        Fifth fifth = new Fifth();
        //Вывод первоначального списка предметов
        fifth.printItems();
        //Сортировка предметов пузырьком по убыванию по полю коэффициента
        fifth.sortItems();
        //Заполнение сейфа предметами
        fifth.fillSafe();
        //Вывод всех элементов сейфа
        fifth.outSafe();
    }
}
