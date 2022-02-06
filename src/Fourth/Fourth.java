package Fourth;

public class Fourth {
    char[][][] matrix = new char[10][7][7];
    void setRow(int number, String[] strRow, boolean digits){
        for(int a = 0; a<7; a++){
            for(int b = 0; b<7; b++){
                if(strRow[a].charAt(b) == ' '){
                    this.matrix[number][a][b] = ' ';
                }
                else{
                    if(!digits)
                        this.matrix[number][a][b] = '*';
                    else this.matrix[number][a][b] = (char)(number+'0');
                }
            }
        }
    }
    void createMatrix(boolean digits){
        String[] strRow = new String[7];
        strRow[0] = "  ***  ";
        strRow[1] = " *   * ";
        strRow[2] = "*     *";
        strRow[3] = "*     *";
        strRow[4] = "*     *";
        strRow[5] = " *   * ";
        strRow[6] = "  ***  ";
        setRow(0,strRow,digits);
        strRow[0] = "   **  ";
        strRow[1] = "  ***  ";
        strRow[2] = " * **  ";
        strRow[3] = "   **  ";
        strRow[4] = "   **  ";
        strRow[5] = "   **  ";
        strRow[6] = "  **** ";
        setRow(1,strRow,digits);
        strRow[0] = "  **   ";
        strRow[1] = " *  *  ";
        strRow[2] = "    *  ";
        strRow[3] = "  **   ";
        strRow[4] = " *     ";
        strRow[5] = " *     ";
        strRow[6] = " ****  ";
        setRow(2,strRow,digits);
        strRow[0] = "  **   ";
        strRow[1] = " *  *  ";
        strRow[2] = "    *  ";
        strRow[3] = "  **   ";
        strRow[4] = "    *  ";
        strRow[5] = " *  *  ";
        strRow[6] = "  **   ";
        setRow(3,strRow,digits);
        strRow[0] = " *  *  ";
        strRow[1] = " *  *  ";
        strRow[2] = " *  *  ";
        strRow[3] = " ****  ";
        strRow[4] = "    *  ";
        strRow[5] = "    *  ";
        strRow[6] = "    *  ";
        setRow(4,strRow,digits);
        strRow[0] = " ****  ";
        strRow[1] = " *     ";
        strRow[2] = " ***   ";
        strRow[3] = "    *  ";
        strRow[4] = "    *  ";
        strRow[5] = " *  *  ";
        strRow[6] = "  **   ";
        setRow(5,strRow,digits);
        strRow[0] = "  **   ";
        strRow[1] = " *  *  ";
        strRow[2] = " *     ";
        strRow[3] = " ***   ";
        strRow[4] = " *  *  ";
        strRow[5] = " *  *  ";
        strRow[6] = "  **   ";
        setRow(6,strRow,digits);
        strRow[0] = " ***** ";
        strRow[1] = "     * ";
        strRow[2] = "    *  ";
        strRow[3] = "   *   ";
        strRow[4] = "  *    ";
        strRow[5] = " *     ";
        strRow[6] = " *     ";
        setRow(7,strRow,digits);
        strRow[0] = "  ***  ";
        strRow[1] = " *   * ";
        strRow[2] = " *   * ";
        strRow[3] = "  ***  ";
        strRow[4] = " *   * ";
        strRow[5] = " *   * ";
        strRow[6] = "  ***  ";
        setRow(8,strRow,digits);
        strRow[0] = "  **   ";
        strRow[1] = " *  *  ";
        strRow[2] = " *  *  ";
        strRow[3] = "  ***  ";
        strRow[4] = "    *  ";
        strRow[5] = " *  *  ";
        strRow[6] = "  **   ";
        setRow(9,strRow,digits);
    }

    void printNumber(int number, boolean digits){
        String strNum = ""+number;
        //Создание матрицы визуальных чисел
        createMatrix(digits);
        for(int a = 0; a<7; a++){
            for(int b = 0; b<strNum.length(); b++){
                for(int c = 0; c<7; c++){
                    //Вывод ряда символов
                    System.out.print(this.matrix[strNum.charAt(b)-'0'][a][c]);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Fourth fourth = new Fourth();
        //В случае, если digits == false, все цифры выводятся с символами '*', иначе символ в каждой цифре будет заменён на неё же
        fourth.printNumber(1234567890,true);
    }
}
