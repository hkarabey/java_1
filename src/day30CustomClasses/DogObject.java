package day30CustomClasses;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObject {

    public static void main(String[] args) {

        Dog dog1 = new Dog();

        dog1.name = "lucy";
        dog1.breed = "husky";
        dog1.age = 11;
        dog1.color = "white";
        dog1.gender = 'F';
        dog1.size = "small";

        Dog dog2 = new Dog();

        dog2.name = "assly";
        dog2.breed = "guly";
        dog2.age = 3;
        dog2.color = "black";
        dog2.gender = 'M';
        dog2.size = "large";

        Dog dog3 = new Dog();

        dog3.setInfo("cıko", "german sheper", 10, 'F', "small", "white");

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        dog1.eat();
        dog2.bark();

        Dog dog4 = new Dog();
        Dog dog5 = new Dog();

        System.out.println("-------------------");

        Dog[] dogs = {dog1, dog2, dog3, dog4, dog5};

        System.out.println(Arrays.toString(dogs));

        ArrayList<Dog> femaleDogs=new ArrayList<>();

        int count1=0;
        for (Dog each1 : dogs) {
            if(each1.gender=='F'){
                count1++;
                femaleDogs.add(each1);
            }
        }
        System.out.println(femaleDogs);
        System.out.println("female dogs count is : "+count1);

        ArrayList<Dog> maleDogs=new ArrayList<>();

        maleDogs.addAll(Arrays.asList(dogs));
        maleDogs.removeIf(each2-> !(each2.gender=='M'));
        System.out.println(maleDogs);

    }


}
