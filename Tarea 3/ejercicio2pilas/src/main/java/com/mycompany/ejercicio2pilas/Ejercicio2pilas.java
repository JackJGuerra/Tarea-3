package com.mycompany.ejercicio2pilas;
import java.util.Stack;

public class Ejercicio2pilas {

    
    public static void main(String[] args) {
       
        System.out.println(estaBalanceado("(){}[]"));  // true
        System.out.println(estaBalanceado("([{}])"));  // true
        System.out.println(estaBalanceado("(]"));      // false
        System.out.println(estaBalanceado("({[)]}"));  // false
        
    }
    
        
    public static boolean estaBalanceado(String s) {
        Stack<Character> pila = new Stack<>();
        for (char caracter : s.toCharArray()) {
            if (caracter == '(' || caracter == '{' || caracter == '[') {
                pila.push(caracter);
            } else {
                if (pila.isEmpty()) {
                    return false;
                }
                char top = pila.pop();
                if ((caracter == ')' && top != '(') ||
                    (caracter == '}' && top != '{') ||
                    (caracter == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return pila.isEmpty();
    }
}
