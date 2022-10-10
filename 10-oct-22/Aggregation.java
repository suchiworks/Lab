package oct10;

class Aggregation {
	int Square(int r) {
		return r*r;
	}
	}

class circle{
	Aggregation ag;
	double pi=3.14;
	double area(int radius) {
		ag=new Aggregation();
		int psquare=ag.Square(radius);
		return pi* psquare;
		
	}

	public static void main(String[] args) {
		// area of circle "has a" entity
		circle c=new circle();
		double  result=c.area(5);
		System.out.println(result);

	}

}
