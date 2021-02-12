class BinarySearchExample{ // makes the class
 public static void binarySearch(int arr[], int first, int last, int key){ //gets application running, while introducing variables
   int mid = (first + last)/2; //int mid equals first plus last, then divide by two
   while( first <= last ){ //creates a loop when true
      if ( arr[mid] < key ){ //if arr[mid] is less than key variable, execute
        first = mid + 1; //first is equal to mid plus one 
      }else if ( arr[mid] == key ){ //executes if arr[mid] equals key
        System.out.println("Element is found at index: " + mid); //if previous stipulation occurs, will display message in quotes
        break; //stops loop
      }else{ // otherwise
         last = mid - 1; // last equals mid minus one
      } //end of initialization
      mid = (first + last)/2; // mid equals first plus last, then divided by two
   } // end of initialization
   if ( first > last ){ //if first is greater than last
      System.out.println("Element is not found!"); //if previous stipulation occurs, will display message in quotes
   } // end of initialization
 } // end of initialization
 public static void main(String args[]){ //application start
		int arr[] = {10,20,30,40,50}; //gives integers in the array
		int key = 30; //gives key integer
        int last=arr.length-1; //gives the last index of the array
		binarySearch(arr,0,last,key); //binary search function implemented	
 } // end of initialization
} // end of initialization
