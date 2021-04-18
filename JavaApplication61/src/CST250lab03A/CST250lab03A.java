
package CST250lab03A;

 //Takes the first and last name of the person and divides it by 2 
class BinarySearchExample{
 public static void binarySearch(int arr[], int first, int last, int key){
   int mid = (first + last)/2;
   while( first <= last ){
      if ( arr[mid] < key ){
        first = mid + 1;   
        // meaning if the components which are middle name and plus then first name can be found
      }else if ( arr[mid] == key ){
        System.out.println("Element is found at index: " + mid);
        break;
        // Therefore if first name componets do not work then last name
      }else{
         last = mid - 1;
      }
      mid = (first + last)/2;
   }
   if ( first > last ){
      System.out.println("Element is not found!");
   }
 }
 
 public static void main(String args[]){
		int arr[] = {10,20,30,40,50};
		int key = 30;
        int last=arr.length-1;
		binarySearch(arr,0,last,key);	
 }
 
}
        

        
    
 
