public class Function {
    static void main() {
        System.out.println("In main method");
        greeting();
        System.out.println("Method calling complete");
        rightPyramid();
        reverseRightPyramid();
        leftPyramid();

    }

    public static void greeting(){
        System.out.println("welcome to greet  function");
    }
    public static void rightPyramid(){
        System.out.println("Right Pyramid");
        System.out.println("       *");
        System.out.println("     * *");
        System.out.println("   * * *");
        System.out.println(" * * * *");
    }
    public static void reverseRightPyramid() {
        System.out.println("Reverse Right Pyramid");
        System.out.println("* * * * *\n* * * *\n* * *\n* *\n*");
    }
    public static void leftPyramid() {
            System.out.println("left pyramid");
            int rows = 0;
            while (rows < 5) {
                System.out.print("*");
                int i = 0;
                while (i < rows) {
                    System.out.print(" *");
                    i++;
                }
                System.out.println();
                rows++;

            }
    }



    }

