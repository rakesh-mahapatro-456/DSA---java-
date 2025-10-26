import java.util.*;

public class StockSpan {
    
    public static void stockSpan(int stocks[],int span[]){
        // stack to store prev high index
        Stack<Integer> s = new Stack<>();

        //default value for 1st price will be 1 and the same index is also stored in stack 
        span[0] = 1;
        s.push(0);

        for(int i=1;i<stocks.length;i++){
            //calculating span for all prices
            int currPrice = stocks[i];
            
            // removing smaller price indices from stack i.e(top of the stack) by comparing it with currprice and till stack is empty
            // it stops when top of the stack is greater than curr price
            while (currPrice>stocks[s.peek()] && (!s.isEmpty())) {
                s.pop();
            }
            
            // when whole stack is empty i.e curr price doesnt have any other prices which are lesser than or equal to it 
            if (s.isEmpty()) {
                span[i] = i+1; // so , it will always be i+1
            }
            else{
                // knowing the prevHigh for curr price
                int prevHigh = s.peek();
                span[i] = i-prevHigh; // calculatig span for currPrice
            }
            

            // adding currPrice index to stack as we will compare it with next curr price
            s.push(i);
        }

    }


    public static void main(String[] args) {
        int stocks[] = {100,80,60,70,60,85,100};
        int span[] = new int[stocks.length];

        stockSpan(stocks,span);

        for(int i=0;i<span.length;i++){
            System.out.print(span[i]+" ");
        }
    }
}
