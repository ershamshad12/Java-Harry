package com.codewithharry.shape;
public class Square extends Shape{
    Square(int dim1){
        super(dim1, -1);
    }
    public int area(){
        return this.dim1 * this.dim1; // Area of Square is =  side*side
    }
    
}
