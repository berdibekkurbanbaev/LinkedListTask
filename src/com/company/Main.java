package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int num = 1;
        int count = 0;
        int count1 = 0;
        int sumAgeMouse = 0;
        int sumAgeCat = 0;
        int sumAgeDog = 0;
        int counterOfMouse = 0;
        int counterOfCats = 0;
        int counterOfDogs = 0;
        LinkedList<AbstraktAnimal> animals = new LinkedList<>();
        LinkedList<AbstraktAnimal> cats = new LinkedList<>();
        ArrayList<AbstraktAnimal> anima = new ArrayList<>(cats);
        LinkedList<AbstraktAnimal> animalsOrder = new LinkedList<>();

        for (int i = 0; i < 50; i++) {
            animals.add((new Cat(num, random.nextInt(1, 10))));
            animals.add(new Dog(num, random.nextInt(1, 15)));
            num++;
            counterOfCats++;
            counterOfDogs++;

        }
        num = 1;

        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i) instanceof Cat) {
                count++;
            }
            if (count == 5) {
                animals.remove(animals.get(i));
                count = 0;
            }
        }

        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i) instanceof Dog) {
                count1++;
                if (count1 == 3) {
                    animals.add(i + 1, new Mouse(num, random.nextInt(1, 5)));
                    num++;
                    count1 = 0;
                    counterOfMouse++;
                }
            }
        }

        for (int i = 1; i < animals.size(); i++) {
            if (animals.get(i) instanceof Cat) {
                if (animals.get(i - 1) instanceof Mouse || animals.get(i + 1) instanceof Mouse) {
                    cats.add(animals.get(i));
                    animals.remove(animals.get(i));

                }

            }
        }
        for (int i = 0; i < animals.size(); i++) {
            if(animals.get(i)instanceof Cat){
                sumAgeCat+=animals.get(i).getAge();
            }else if(animals.get(i)instanceof Dog){
                sumAgeDog+=animals.get(i).getAge();
            }else {
                sumAgeMouse+=animals.get(i).getAge();
            }
        }
        for (int i = 0; i < animals.size() ; i++) {
            if (animals.get(i) instanceof Cat) {
                animalsOrder.addFirst(animals.get(i));

            } else if (animals.get(i)instanceof Dog){
                animalsOrder.add(animals.get(i));
            }
        }
            for (int i = 0; i < animals.size(); i++) {
                if (animals.get(i) instanceof Mouse) {
                    animalsOrder.addLast(animals.get(i));
                }
            }

        for (AbstraktAnimal a:animals) {
//            System.out.println(a);

        }
        for (AbstraktAnimal an:animalsOrder) {
            System.out.println(an);

        }
        System.out.println();
        System.out.println(counterOfMouse+" mice");
        System.out.println(counterOfCats+" cats");
        System.out.println(counterOfDogs+" dogs");
        System.out.println();
        System.out.print("summa age of cats: "+ sumAgeCat+" ");
        System.out.println();
        System.out.print("summa age of dogs: "+ sumAgeDog+" ");
        System.out.println();
        System.out.print("summa age of mice: "+ sumAgeMouse+" ");

            }



    }

