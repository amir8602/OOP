package Generic;

import com.sun.corba.se.impl.protocol.FullServantCacheLocalCRDImpl;

import java.util.EmptyStackException;

public class Stack<T>  {
    private Integer size;
    private Integer index;
    private T[] elements;

    public Stack(Integer size) {
        this.size = size;
        this.index = -1;
        this.elements = (T[])(new Object[size]);
    }

    public T pop()throws EmptyStackException{
        if(index == -1)
            throw new  EmptyStackException();
        else {
            return elements[index--];
        }

    }
    public void push(T data) throws FullStackException{
        if(this.index==this.size-1){
            throw new FullStackException();
        }else{
            this.elements[++index]=data;
        }
    }

}
