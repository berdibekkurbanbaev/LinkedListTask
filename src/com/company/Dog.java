package com.company;

public class Dog extends AbstraktAnimal{


    public Dog(int id, int age) {
        super(id,age);
    }
    @Override
        public String toString() {
            return "Dog id - "+getId()+" age - "+getAge();

    }
}
