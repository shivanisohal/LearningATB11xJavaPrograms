package Wrapper_Class;

import javax.swing.*;

class  Box<T> {

    T Value;

    public void Box(T Value) {
        this.Value = Value;
    }

    T get() {
        return Value;
    }


}
public class GenericClass {
    public static void main(String[] args) {
        Box<String> obj=new Box<>();
        obj.Box("ABCD");
        System.out.println(obj.get());
        Box<Integer> obj2=new Box<>();
        obj2.Box(122);
        System.out.println(obj2.get());


    }
}
