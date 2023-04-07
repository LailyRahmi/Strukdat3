/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan1;

/**
 *
 * @author GF63
 */
public class Latihan1 {
    private int top;
    private int maxSize;
    private Object[] stackArray;
    
    public Latihan1(int size) {
        top = -1;
        maxSize = size;
        stackArray = new Object[maxSize];
    }
    
    public void push(Object item) {
        stackArray[++top] = item;
    }
    
    public Object pop() {
        return stackArray[top--];
    }
    
    public Object peek() {
        return stackArray[top];
    }
    
    public boolean isEmpty() {
        return (top == -1);
    }
    
    public boolean isFull() {
        return (top == maxSize-1);
    }
    
    public int search(Object item) {
        int index = -1;
        for (int i = 0; i <= top; i++) {
            if (stackArray[i].equals(item)) {
                index = top - i + 1;
                break;
            }
        }
        return index;
    }
    
    public static void main(String[] args) {
        Latihan1 lt = new Latihan1(5);
        
        lt.push("Aku");
        lt.push("Anak");
        lt.push("Indonesia");
        
        System.out.println("Next : " +lt.peek());
        lt.push("Raya");
        System.out.println(lt.pop());
        lt.push("!");
        
        int count = lt.search("Aku");
        while (count != -1 && count > 1){
            lt.pop();
            count--;
        }
        
        System.out.println(lt.pop());
        System.out.println(lt.isEmpty());
    }
    
}

