package M5;

import java.util.Scanner;
public class ToDoMain {
    public static void main(String args[]) { 

	Scanner in = new Scanner(System.in);
    ToDoMain card = new ToDoMain();
    
   while (true) {
        System.out.println("Enter your choice\n 1 for add task\n 2 remove task \n 3 Update task\n 4 Display incomplete or pending tasks\n 5 Dispaly particular date task\n 6 task based on name \n 7 Over due Tasks \n 8 Catalog \n 9.for exit");
        int choice = in.nextInt();
        switch (choice) {
        case 1:
        	System.out.println("Enter Task name");
            String task_name = in.next();
            System.out.println("Enter task desc");
            String task_des = in.next();
            System.out.println("Enter Status");
            String stat = in.next();
            System.out.println("Enter date");
            String date = in.next();
            Task l = new Task(task_name, task_des, stat, date);
            card.addTask(l);
            break;
        case 2:
        	 System.out.println("Enter due date status");
             stat=in.next();
             card.display(stat);
             break;
        case 3:
        	System.out.println("Enter task name to remove a task");
            task_name=in.next();
            card.remove(task_name);
            
       }
      }
    }
}
