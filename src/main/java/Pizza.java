
public class Pizza {
    
    private final int columns;
    private final int rows;
    
    private final char topping[][];
    
    Pizza(int columns, int rows){
        this.columns = rows;
        this.rows = rows;
        
        this.topping = new char[columns][rows];
    }
    
    public void setTopping(int colNum, int rowNum, char c){
        topping[colNum][rowNum] = c;
    }
    
    
}
