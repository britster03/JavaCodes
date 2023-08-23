package org.example;

public class scope {
    // scope means where we can access our variables
    // function scope means the values will be accessible on in those function
    public static void main(String[] args) {
//INITIALIZING

        int a = 10;
        int b = 20;
        String name ="Rohan";
        {
            //UPDATING
 //           int a=67; already initialse outside the block in the same method so cannot initialize again
            a=99; //reassgin the origin ref variable to a new variable
            System.out.println(a);
            int c=34;
            name ="Ronit";
            System.out.println(name);
            //vlaues initialised in this block will remiain in this block

            //anything that you initialize inside cannot be initialized outside
        }
        //values initialized inside the block can initialised outside the block too
        System.out.println(a);
        System.out.println(name);
  //      System.out.println(c); //cannot be declared outside the scope
    }

    static void random(int marks){
        int  num=34;
        System.out.println(num);
        // now you cannot access the a and b values in this function because it is not valid here
        System.out.println(marks);
        // same goes for arguments too

    }
}
