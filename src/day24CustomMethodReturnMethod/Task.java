package day24CustomMethodReturnMethod;

import java.util.Locale;

public class Task {

    //create a method that can display the initials of the person
    //create a method that display the domain of the email
    //create a method that can display the name of the moth based on the given number of the method
    //can print the name of the day based on the given number of the method
    //print how many days a month has

    public static void main(String[] args) {
        initials();
        initial("halil", "karabey");
        domain("halilkaabe@gmail.com");
        String[] emails = {"halil@gmail.com", "ibrahim@pau.edu", "karabey@amazon.com"};
        for (String email : emails) {
            domain(email);
        }
        month(3);
        day(3);


    }

    public static void initials() {
        String name = "ali yerebakankaya";
        String a = "" + name.charAt(0) + name.charAt(name.indexOf(" ") + 1);
        System.out.println(a);
    }

    public static void initial(String firstName, String lastName) {
        String initial = firstName.toUpperCase().charAt(0) + "." + lastName.toUpperCase().charAt(0);
        System.out.println("initial is " + initial);

    }

    public static void domain(String email) {
        String domain = email.substring(email.indexOf("@") + 1, email.indexOf("."));
        System.out.println(domain);
    }

    public static void month(int number) {

        switch (number) {
            case 1:
                System.out.println("january");
                break;
            case 2:
                System.out.println("february");
                break;
            case 3:
                System.out.println("march");
                break;
            case 4:
                System.out.println("april");
                break;
            case 5:
                System.out.println("may");
                break;
            case 6:
                System.out.println("jun");
                break;
            case 7:
                System.out.println("july");
                break;
            case 8:
                System.out.println("augst");
                break;
            case 9:
                System.out.println("september");
                break;
            case 10:
                System.out.println("october");
                break;
            case 11:
                System.out.println("november");
                break;
            case 12:
                System.out.println("december");
                break;
            default:
                System.out.println("invalid number");
                break;
        }

    }

    public static void day(int number){
        String name="";
        if (number<=0&&number>7){
             name="invalid";
        }else{
            name=(number==1)?"monday":(number==2)?"tuesday":(number==3)?"wednesday":(number==4)?"thursday":(number==5)?"friday":(number==6)?"saturday":"sunday";
        }
        System.out.println(name);
    }

}



