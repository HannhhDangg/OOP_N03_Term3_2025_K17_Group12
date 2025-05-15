import TestNumber;
import PassObject;
import ShortCircuitTest;
import StringTest;
import CakeCase;
import randNum;


import CastingTest;
import BreakAndContinue;
import SwitchCake;

public class App {
    public static void main(String[] args){

        //call test number
       
        TestNumber.TestNumber();

        // call test String
        StringTest.test();

        // call Circuit test
   
        ShortCircuitTest.test();

        //call test casting

        CastingTest.testDouble();
        //CastingTest.testFloat();
        CastingTest.testCasting();

        // call Test if-else control
       
        CakeCase.cake(1);
        
        //call test break and continue

        //BreakAndContinue.BreakAndContinue(90);
        BreakAndContinue.WhileTest(10);
        BreakAndContinue.DoWhileTest(10);

        //call test switch
        SwitchCake.switchCase();
        
        //call test random number
        System.out.println(randNum.randNum());

        
<<<<<<< HEAD
        customer customer01 = new customer(01,"Nguyen Manh Hoa","123455@gmail.com",0129374837);
        System.out.println(customer01.ma_kh + customer01.ten_kh + customer01.email + customer01.so_dien_thoai);
=======
        order order_01 = new order("051525","Nguyen Manh Hoa","Ao coc Do MIXI",5000000);
        order_01.displayOrder();
>>>>>>> 36f4d3b (Van loi chua chay duoc)
    }
}