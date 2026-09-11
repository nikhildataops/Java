public class ForEach {
    static void main() {
        String [] array=new String[]{
          "Ram","Shyam","Mohan","Rohan","Sita","Geeta"

        };
        printArray(array);
        printArrayForEach(array);
    }
    public static void printArray(String[] array){
        for (int i=0;i< array.length;i++){
            System.out.println(array[i]);
        }
    }

    public static void printArrayForEach(String[] array){
        for(String name:array){
            System.out.println(name);
        }
    }
}
