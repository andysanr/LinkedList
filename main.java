class main {
public static void main(String[] args) {
    LinkedList intList = new LinkedList();

    System.out.print("List of numbers before list creation: ");

    for (int i = 0 ; i < 10; i++)
    {
        int info = (int) (Math.random()*10);
        System.out.print(info + " ");

        intList.add(info);
        }
    System.out.print("\nList of numbers after creation:  ");

    intList.display();
    }
}