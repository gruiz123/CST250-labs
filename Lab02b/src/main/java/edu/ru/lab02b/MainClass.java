
package edu.ru.lab02b;

public class MainClass {
 
  int arraySize = inputArray.length;
for (int i = 0; i < arraySize - 1; i++) {
int index = i;
for (int j = i + 1; j < arraySize; j++) {
if (inputArray[j] < inputArray[index]){
index = j;
}
}
int temp = inputArray[i];
inputArray[i] = inputArray[index];
inputArray[index] = temp;
}  
    
}
