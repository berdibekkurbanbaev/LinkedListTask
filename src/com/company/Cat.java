package com.company;

public class Cat extends AbstraktAnimal {

    public Cat(int id,int age) {
        super(id, age);
    }

    @Override
    public String toString() {
        return "Cat: id - "+getId()+" age - "+getAge() ;
    }
}
