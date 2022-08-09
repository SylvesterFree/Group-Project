import java.util.List;

public class Main {
    private static final int maxCol = 5;
    private static File input;
    public static void main(String[] args) {
        try {
            input = new File();
            //input.setFile(args[0]);
            printWords(input.getInput(), getRows(), getColumns());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int getColumns(){
        int numOfColumns = 1;
        int size = input.getSize();
        double cal = (double)size/5;

        if(cal>=0.4 && cal<=4){
            numOfColumns = 2;
        }else if(cal>=4.2 && cal <=6){
            numOfColumns = 3;
        }else if (cal >= 6.2 && cal <= 8){
            numOfColumns = 4;
        } else{
            numOfColumns = maxCol;
        }
        return numOfColumns;
    }

    public static int getRows(){
        return (int)Math.ceil((double)input.getSize() / (double)getColumns());
    }

    public static void printWords(List<String> c, int row, int col){
        int z;

        for(int i = 1; i<=row; i++){
            z=i-1;

            for(int j = 1; j <= col; j++){
                if(z<c.size()){
                    System.out.printf("%-12s", c.get(z));

                    z = z+row;
                }
            }
            System.out.println();
        }
    }
}

