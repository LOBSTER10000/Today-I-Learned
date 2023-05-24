public class Solution02 {
	
	
    public static void main(String[] args) {
        int answer = 0;
        int price = 150000;
        if(price >= 100000 && price < 300000){
            answer =  price - (price*5/100);
        }
        else if(price >= 300000 && price <500000){
            answer =  price - (price*10/100);
        }
        else if(price >= 500000){
            answer =  price - (price*20/100);
        }
        System.out.println(answer);
        
    }
}
