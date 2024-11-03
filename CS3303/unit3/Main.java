import jeliot.io.*;

// Stack data structure implemented with an array
class ArrayStack {
  private int[] stack;
  private int top;
  private int size;

  // Constructor
  public ArrayStack(int size) {
    this.size = size;
    this.stack = new int[size];
    this.top = -1; // Stack is initially empty
  }

  // Push values onto the stack in descending order based on the stack's current
  // state
  public void push() {
    if (top < size - 1) {
      // Push values in descending order (2, 1, 0)
      int value = size - top - 2;
      stack[++top] = value;
      // System.out.println("Pushed: " + value);
    } else {
      System.out.println("Stack is full");
    }
  }

  // Pop values from the stack
  public int pop() {
    if (!isEmpty()) {
      int value = stack[top--];
      System.out.println("Popped: " + value);
      return value;
    } else {
      System.out.println("Stack is empty");
      return -1;
    }
  }

  // Check if the stack is empty
  public boolean isEmpty() {
    return top == -1;
  }
}

public class Main {
  public static void main(String[] args) {
    // Create a stack for vehicle inspections
    ArrayStack vehicleStack = new ArrayStack(3);

    // Push values onto the stack in descending order based on inspection stations
    vehicleStack.push(); // Third Station : Push 2
    vehicleStack.push(); // Second Station: Push 1
    vehicleStack.push(); // First Station : Push 0

    // Pop and display values after each inspection
    vehicleStack.pop(); // End of First Station : Pop 0
    vehicleStack.pop(); // End of Second Station: Pop 1
    vehicleStack.pop(); // End of Third Station : Pop 2

    // Stack error checks
    ArrayStack testVehicleStack = new ArrayStack(3);
    testVehicleStack.push();
    testVehicleStack.push();
    testVehicleStack.push();
    testVehicleStack.push(); // Attempt to push after stack is full
    testVehicleStack.pop();
    testVehicleStack.pop();
    testVehicleStack.pop();
    testVehicleStack.pop(); // Attempt to pop after stack is empty
  }
}
