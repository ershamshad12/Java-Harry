package com.codewithharry.shape;
public class Sphere extends Shape {
    Sphere(int dim1){
        super(dim1,-1);
    }

    public double area (){
        return 4*Math.PI*this.dim1*this.dim1; // Area of Sphere is = 4*PI*r*r
    }
    
}
