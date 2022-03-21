/* Create a class Area that prints the area of 
circle, square, rectangle, triangle by passing value of sides*/
class Area {

	// Overloaded CalcArea() function to
	// calculate the area of circle
	void CalcArea(double r)
	{
		System.out.println("Area of the circle is: "	+ 3.14 * r*r);
	}



   // calculate the area of square
	void CalcArea(int S)
	{
	System.out.println("Area of the square: "	+ S * S);
	}
   // calculate the area of  rectangle
	void CalcArea(double L, double B)
	{
	System.out.println("Area of the rectangle: "+ L * B);
	}
   // calculate the area of the triangle
	void CalcArea(double b, int h)
	{
       double area=(b*h)/2;
	System.out.println("Area of the triangle: "	+ area);
	}

}




/*Create a class “Animal” with 3 variables as private and 
assign values to declared variables then print them.*/
class Animals{
    private String animal1 ="cat";
    private String animal2 ="cow";
    private String animal3 ="dog";

    //Getter Methods
    public String getAnimal1(){
        return(animal1);

    }
    public String getAnimal2(){
        return(animal2);

    }
    public String getAnimal3(){
        return(animal3);

    }
    //Setter Methods
     public void setAnimal1(String a){
         animal1=a;

     }
     public void setAnimal2(String a){
        animal2=a;

    }
    public void setAnimal3(String a){
        animal3=a;

    }
    
    }
//Driver Class
    public class Oops_Assignment
{
	public static void main(String[] args) {
		
		// Driver code for 1st problem 
		// Creating object of Area class
        System.out.println("Area begins........");
		Area obj = new Area();

		// Calling function
		obj.CalcArea(5.5);//Calling CalcArea for computing area of circle
		obj.CalcArea(5);//Calling CalcArea for computing area of circle
       obj.CalcArea(5.5,3.5);//Calling CalcArea for computing area of rectangle
       obj.CalcArea(5.5,3);//Calling CalcArea for computing area of triangle
       System.out.println("Area ends........");
    
       // Driver code for 2nd problem 
       System.out.println("Animals begins........");
       Animals ob =new Animals();
       ob.setAnimal1("TIGER");
       ob.setAnimal2("LION");
       ob.setAnimal3("LEOPARD");
       System.out.println(ob.getAnimal1());
       System.out.println(ob.getAnimal2());
       System.out.println(ob.getAnimal3());
       System.out.println("Animals ends........");
       

       




	}
	}