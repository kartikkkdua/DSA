In Java (and programming in general), functions (also called methods in Java) are blocks of code designed to perform a specific task. You can call a function whenever you need to perform that task, which helps reduce code repetition and increases modularity.
🔹 What is a Function (Method) in Java?
A function:
Has a name
Can accept input values (called parameters)
Can return a value (or not)
Is reusable and can be called multiple times
🔧 Structure of a Java Function
<access_modifier> <return_type> <function_name>(<parameters>) {
    // code block
    return value; // optional
}
✅ Example
public int addNumbers(int a, int b) {
    return a + b;
}
public → Access modifier (visible to other classes)
int → Return type (returns an integer)
addNumbers → Function name
(int a, int b) → Parameters (input values)
return a + b; → Returns the result
🔁 Function Without Return
public void printMessage() {
    System.out.println("Hello, World!");
}
void means it doesn't return any value.
📚 Types of Functions in Java
Type	Description	Example
Standard Method	Defined with return type and parameters	public int add(int a, int b)
Void Method	Performs task but returns nothing	public void showMessage()
Static Method	Can be called without creating an object	public static void main(String[] args)
Instance Method	Requires an object to be called	myObj.showMessage()
Constructor	Special method to initialize objects	public MyClass()
🧠 Why Use Functions?
🧩 Modularity – Breaks code into smaller chunks
🔁 Reusability – Call the same code in different places
🐛 Maintainability – Easier to fix or update one piece of logic
🧪 Testability – Easier to test specific parts of your program