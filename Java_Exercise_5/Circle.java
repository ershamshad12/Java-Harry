package com.codewithharry.shape;
public class Circle extends Shape {
   Circle(int dim1){
    super(dim1, -1);
   }
   public double area(){
    return Math.PI * this.dim1 * this.dim1; // Area of Circle is = PI*r*r
   }
    
}
