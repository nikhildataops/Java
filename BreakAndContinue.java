public class BreakAndContinue {
    static void main(String[] args) {
//        for(int i=1; i<1000;i++) {
//            if(i==101){
//                break;
//            }
//            System.out.println(i);
//        }
//        System.out.println("out of the loop");
//    }
        for (int i = 1; i < 1000; i++) {
            if (i == 101) {
                continue;

            }
            System.out.println(i);
        }
        System.out.println("out of the loop");
    }
}

