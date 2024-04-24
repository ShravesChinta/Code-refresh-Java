
class HelloWorld {
    public static void main(String[] args) {
        int m=fibo(3);
        System.out.println(m);
    }
    
    public static int fibo(int m)
    {
        if(m==0)
        return 1;
        
        return m*fibo(m-1);
        
        
    }
    
    
}
