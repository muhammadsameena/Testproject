package M5;

import java.util.Scanner;
public class ToDoMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter no of tasks");
		n=sc.nextInt();
		ToDo ob=new ToDo(n);
		for(int i=0;i<n;i++) {
			ob.addTask();
		}
		
		ob.displayTasks();
		System.out.println("After remove");
		System.out.println("Enter task name to remove");
		String name=sc.next();
		System.out.println(ob.removeTaskByName(name));
		ob.displayTasks();
		System.out.println("enter name of the task to update");
		name=sc.next();
		ob.updateTaskByName(name);
		
		System.out.println("after update");
		ob.displayTasks();
		

	}

}
