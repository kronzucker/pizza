import org.junit.Test;



public class PizzaTest {
    
    @Test
    public void canCreatePizze(){
        
        Pizza p = new Pizza(10, 5);
        
        p.setTopping(2, 3, 'T');
        
    }
}
