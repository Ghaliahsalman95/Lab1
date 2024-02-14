import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Lab1");

        System.out.println("Test Data: Exercise 1: ");
        System.out.println("Input First number: ");
        int fnum=input.nextInt();
        System.out.println("Input Second number: ");
        int snum=input.nextInt();
        System.out.println("Output is: "+fnum+" + "+snum+" = "+(fnum+snum));
        System.out.println("Output is: "+fnum+" - "+snum+" = "+(fnum-snum));
        System.out.println("Output is: "+fnum+" * "+snum+" = "+(fnum*snum));
        System.out.println("Output is: "+fnum+" / "+snum+" = "+(fnum/snum));
        System.out.println("Output is: "+fnum+" % "+snum+" = "+(fnum%snum));

//--------------------------Exercise 2---------------------------------
        System.out.println("------------------Exercise 2-------------------------------");
        System.out.println("Input number: ");
        int multiplication=input.nextInt();
        System.out.println("Output: ");
        for (int i = 1; i <= 10; i++){
            System.out.println(multiplication+" * "+i+" = "+(multiplication*i));
        }
        System.out.println("------------------Exercise 3-------------------------------");
//-----------------------------Exercise 3---------------------------------
        System.out.println("Input Radius : ");
        float radius=input.nextFloat();
        System.out.println("Output: ");
        System.out.println("Perimeter is = "+ (3.14*(2*radius)));
        System.out.println("Area is = "+ (3.14*(radius*radius)));


        System.out.println("------------------Exercise 4-------------------------------");
//-----------------------------Exercise 4---------------------------------
        int integer=0;
        float sum=0f;
        System.out.println("Set of Integer: ");
        int set=input.nextInt();
        for(int s=1;s<=set;s++){
            System.out.println("Integer: "+s);
            integer=input.nextInt();
            sum+=integer;}
        System.out.println("The average is:" +(sum/set));

        System.out.println("------------------Exercise 5-------------------------------");
//-----------------------------Exercise 5---------------------------------
        int num2=0,equals=0;
        int [] ar=new int[3];

        System.out.println("Please Enter 3 Integer number: ");
        for(int in3=0;in3<=2;in3++){
            System.out.println("Please Enter Integer number: "+ in3);
            num2=input.nextInt();
            ar[in3]=num2;}
        equals=ar[0]+ar[1];
        if (equals==ar[2]){System.out.println("Two addition are Equals with third number");
        } else {System.out.println("Two addition are Not Equals with third number");}

        System.out.println("------------------Exercise 6-------------------------------");
//-----------------------------Exercise 6---------------------------------
        String reserve="";
        System.out.println("Write integer to reverse it.");
        String word= input.next();
        System.out.println("Word is "+word);
        word=word.replace(" ","");
        for(int w=word.length()-1;w>=0;w--){
            reserve+=""+word.charAt(w);
        }
        System.out.println("Reverse word is."+reserve);


        System.out.println("------------------Exercise 7-------------------------------");
//-----------------------------Exercise 7---------------------------------
        System.out.println("Enter number to check is it eveb or odd");
        int evod=input.nextInt();
        System.out.println("The number is "+ evod);
        if (evod%2==0){System.out.println("The number is Even");}
        else {System.out.println("The number is Odd");}

        System.out.println("------------------Exercise 8-------------------------------");
//-----------------------------Exercise 8---------------------------------
//°F = (9/5) °C+32
        System.out.println("Enter temperature in Centigrade:");
        float centigrade=input.nextFloat();
        System.out.println("Temperature in Fahrenheit is: "+((1.8f*centigrade)+32));

        System.out.println("------------------Exercise 9-------------------------------");
//-----------------------------Exercise 9---------------------------------

        System.out.println("Input a string: ");
        String strchsr=input.next();
        strchsr=strchsr.replace(" ","");
        System.out.println("Input an index: ");
        input.nextLine();
        int index= input.nextInt();
        System.out.println("String is :"+strchsr);
        System.out.println("Index is :"+index);
        if(index<=strchsr.length())
        {System.out.println("Output is: "+strchsr.charAt(index));}
        else{System.out.println("Index greater than length of the String");}

        System.out.println("------------------Exercise 10-------------------------------");
//-----------------------------Exercise 10---------------------------------
        System.out.println("Test Data:");
        System.out.println("Width: ");
        float width=input.nextFloat();
        System.out.println("Height: ");
        float height=input.nextFloat();
        System.out.println("Area is: "+width+"*"+height+"="+(width*height));
        System.out.println("Perimeter is: ("+width+"+"+height+")*2="+(2*(width+height)));

        System.out.println("------------------Exercise 11-------------------------------");
//-----------------------------Exercise 11---------------------------------

        System.out.println("Frist number: ");
        int first = input.nextInt();
        System.out.println("Second number: ");
        int second = input.nextInt();
        if (first == second) {
            System.out.println(first + "=" + second);
        } else if (first > second) {
            System.out.println(first + "!=" + second);
            System.out.println(first + ">" + second);
            System.out.println(first + ">=" + second);
        } else {
            System.out.println(second + "!=" + first);
            System.out.println(second + ">" + first);
            System.out.println(second + ">=" + first);
        }


        System.out.println("------------------Exercise 12-------------------------------");
//-----------------------------Exercise 12---------------------------------
        System.out.println("Enter second: ");
        int seconds = input.nextInt();
        int reminderSecond=seconds%60; //
        int hours=seconds/60; //relation between Second and Hours (Easy)
        int minutes=hours%60;  //relation between Hours and Minutes (Easy)
        hours/=60;
        System.out.print(hours + ":" + minutes + ":" + reminderSecond);

        System.out.println("------------------Exercise 13-------------------------------");
//-----------------------------Exercise 13---------------------------------
        int equNum, check;
        int n4 = 1;
        boolean value = true;
        System.out.println("Enter 4 Integer: ");
        equNum = input.nextInt();
        check = equNum;
        do {
            System.out.println("Enter 4 Integer: ");
            equNum = input.nextInt();
            if (equNum == check ) {
                n4++; continue;
            } else {value = false;break;}
        }
        while (n4 < 4);
        if (value) {System.out.println("The Integers are Equals");}
        else {System.out.println("The Integers are Not Equals");}
//


        System.out.println("------------------Exercise 14-------------------------------");
//-----------------------------Exercise 14---------------------------------
        System.out.println("Enter Integer");
        int readInteger=input.nextInt();
        if(readInteger!=0){
            if (readInteger<0){System.out.println("Number Is Negative");}
            else {System.out.println("Number Is Positive");}
        }        else System.out.println("Number Is Zero");



        System.out.println("------------------Exercise 15-------------------------------");
//-----------------------------Exercise 15----------------------------
        int countP = 0, countN = 0, countZ = 0, convert;
        boolean tillUser = true;
        int exit = 00, reader;

        do {
            System.out.println("Please Enter any Number to count its type ,exit -1 ");
            reader = input.nextInt();
            if (reader != -1) {
                if (reader == 0) {
                    countZ += 1;
                    continue;
                } else if (reader > 0) {
                    countP += 1;
                    continue;
                } else {
                    countN += 1;
                    continue;
                }
            } else {
                countN += 1;
                tillUser = false;
            }
        } while (tillUser);
        System.out.println("Number of zero is " + countZ);
        System.out.println("Number of Positive is " + countP);
        System.out.println("Number of Negative is " + countN);

        System.out.println("------------------Exercise 16-------------------------------");
////-----------------------------Exercise 16----------------------------
        String reserve8 = "";
        System.out.println("Enter Number to reverse it ");
        int resNumber = input.nextInt();
        String word8  = Integer.toString(resNumber);
        //1     stNumber = stNumber.replace(" ", "");
        // String word8 = input.next();
        word8 = word8.replace(" ", "");
        for (int pal = word8.length() - 1; pal >= 0; pal--) {
            reserve8 = reserve8 + word8.charAt(pal);}
        System.out.println("The Number is "+reserve8);

        System.out.println("------------------Exercise 17-------------------------------");
////-----------------------------Exercise 17----------------------------
        int largest=0, smallest=0, readNum;
        boolean tilUser=true;
        do {
            System.out.println("Please Enter any Number to get smallest and largest ,exit -1 ");
            readNum = input.nextInt();
            if(readNum!=-1){
                if(readNum>largest){
                    largest=readNum;}
                else {smallest=readNum;}}
            else {smallest=readNum;tilUser=false;}

        } while (tilUser);
        System.out.println("The Large number is " + largest);
        System.out.println("The Small is " + smallest);

        System.out.println("------------------Exercise 18-------------------------------");
////-----------------------------Exercise 18----------------------------
        System.out.println("Enter String to count a");
        input.nextLine();
        String a=input.nextLine();
        a=a.replace(" ","");
        a=a.toLowerCase();
        int counta=0;
        for(int aa=0;aa<a.length();aa++){
            if(a.charAt(aa)=='a'){counta+=1;}
        }
        System.out.println("Number of a is "+ counta);

    }}