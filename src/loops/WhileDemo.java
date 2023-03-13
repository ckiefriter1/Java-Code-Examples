package loops;

class WhileDemo {
    public static void main(String[] args){
        int count = 1;
        while (count < 11) {
            System.out.println("Count is: " + count);
            count++;
        }
        
        System.out.println("-------------------");
        
        do {
            System.out.println("Count is: " + count);    // Notice that this code runs once even though the count is not <  11
            count++;
        } while (count < 11);
    }
}