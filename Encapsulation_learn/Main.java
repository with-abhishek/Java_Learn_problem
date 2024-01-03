package Encapsulation_learn;

class Area {
    int length;
    int breadth;

    // constructor
    public Area(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // method to calculate area
    public void getArea() {
        int area = length * breadth;
        System.out.println("Area: " + area);
    }
}

class Main {
    public static void main(String[] args) {

        // create object of Area
        // pass value of length and breadth
        Area rectangle = new Area(5, 6);
        rectangle.getArea();
    }
}
