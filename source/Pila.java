package source;

public class Pila {

    String arr[];
    int maxSize;
    int top; 

    public Pila(int n){
        maxSize = n;
        arr = new String[maxSize];
        top = 0;
    }
    public boolean empty(){
        if(top == 0){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void push(String str){
        if(top < maxSize){    
            arr[top] = str;
            top++;
        }
    }

    public String peek(){
        if(top > 0)
            return arr[top-1];
        else
            return null;
    }

    public String pop(){
        String temp = null;
        if (top > 0)
    {
        temp = arr[top-1];
        arr[top-1] = null;
        top --;
    }
    return temp;
    }
}