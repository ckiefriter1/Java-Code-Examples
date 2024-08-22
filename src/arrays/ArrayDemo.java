package arrays;

class ArrayDemo {
    public static void main(String[] args) {
        // declares an array of integers
        int[] anArray;
        
        // allocates memory for 10 integers
        anArray = new int[10];
           
        // initialize first element
        anArray[0] = 100;
        // initialize second element
        anArray[1] = 200;
        // and so forth
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;       // The last element in an array is at an index that's the length of the array -1
        
        int age = 34;
        anArray[4] = age;

        System.out.println("Element at index 0: "
                           + anArray[0]);
        System.out.println("Element at index 1: "
                           + anArray[1]);
        System.out.println("Element at index 2: "
                           + anArray[2]);
        System.out.println("Element at index 3: "
                           + anArray[3]);
        System.out.println("Element at index 4: "
                           + anArray[4]);
        System.out.println("Element at index 5: "
                           + anArray[5]);
        System.out.println("Element at index 6: "
                           + anArray[6]);
        System.out.println("Element at index 7: "
                           + anArray[7]);
        System.out.println("Element at index 8: "
                           + anArray[8]);
        System.out.println("Element at index 9: "
                           + anArray[9]);
        
        
        System.out.println("-------------------------------------------------");
        // Alternative way to declare and instantiate/initialize an array.
        int[] myNumArray = {10, 20, 30, 40};
        
        //Display contents of the array using for loop
        for (int i = 0; i < myNumArray.length; i++) {     // Notice we can get the length of the array vs hard coding it.
        	System.out.println("Element at index " + i + ": " + myNumArray[i]);
        }
        
        System.out.println(myNumArray[myNumArray.length-1]);
        
        System.out.println("-------------------------------------------------");
        // Example with an array of String objects.
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        
        //Display contents of the array using for loop
        for (int i = 0; i < cars.length; i++) {     // Notice we can get the length of the array vs hard coding it.
        	System.out.println("Element at index " + i + ": " + cars[i]);
        }
        
        // Change the value of the 2nd element in the array (index offset is 1) to "Ferrari"  
        cars[1] = "Ferrari";
        
        //Display contents of the array using for loop --> after changing one of the values in the array.
        System.out.println("\n*** List of cars after changing the 2nd element in the array");
        for (int i = 0; i < cars.length; i++) {     
        	System.out.println("Element at index " + i + ": " + cars[i]);
        }
        
        System.out.println("-------------------------------------------------");
        // Using enhanced for loop
        for (String car : cars) {
        	if (car == "Ferrari") {
        		System.out.println(car + " : Super car!!!");
        	} else {
        		System.out.println(car);
        	}
        }
        
        
        
    }
} 