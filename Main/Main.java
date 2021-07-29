package Main;



public class Main {

    public static String multiTable(int num) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 10; i++) {
            int result = i * num;
            sb.append(i + " * " + num + " = " + result + "\n");
        }
        return sb.toString().trim();
    }
}

        //код не мой, я пытался, оно работало, но codewars'у не нравилось(

        //мой код
        /*

         for (int i = 1; i < 11; i++) {
            System.out.println(num + " * " + i + " = " + num * i);
        }

        return "";
        }

        */


