public class LambdaEx {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable(){
            public void run(){
                System.out.println("전통적인 방식의 일회용 스레드 생성");
            }
        });
        t1.start();

        Thread t2 = new Thread(()->{
            System.out.println("람다 표현식을 이용한 일회용 스레드 사용");
        });
        t2.start();
    }
}


