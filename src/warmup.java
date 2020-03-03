
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Student
 */
public class warmup {

    public static void main(String[] args) {
//        System.out.println(" hello world! ");
        boolean a = false;
        Random rand = new Random();

        double s;
        s = rand.nextInt();

        if (s >= 0) {
            a = true;
        } else if (s <   0) {
            a = false;
        }

        if (a == true) {
            System.out.println(s);
            System.out.println("hello world");
        } else if (a == false) {
            System.out.println(s);
            System.out.println("hello omanji");
        }
        
        int array[][] = {
            {1,1,1,1,1},
            {2,1,3,12,4},
            {4,2,5,5,8},
        };
        
        System.out.println(array[2][4]);
    }
}
