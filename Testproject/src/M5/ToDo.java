package M5;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class ToDo {
	Task tasks[];
	Scanner sc=new Scanner(System.in);
	int index=0;
	
	ToDo(int n){
		tasks=new Task[n];
	}
	
	public void addTask() {		
		 	
		try {
			System.out.println("enter task name");
			String name=sc.next();
			System.out.println("enter description");
			sc.next();
			String desc=sc.nextLine();
			System.out.println("enter status");
			String status=sc.next();
			System.out.println("enter due date in dd/mm/yyyy format");
			String sDate1=sc.next();
			Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
			Task t=new Task();
			t.setTaskName(name);
			t.setDescp(desc);
			t.setStatus(status);
			t.setDueDate(sDate1);
			tasks[index]=t;
			index++;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
		
	}
	
	public void displayTasks() {
		
		
		for(int i=0;i<tasks.length;i++)
		{
			if(tasks[i]!=null) {
			System.out.println(tasks[i]);
			}
		}
	}
	
	public boolean updateTaskByName(String tas) {
		
		for(int i=0;i<tasks.length;i++)
		{
			if(tasks[i]!=null) {
				
			
			if(tasks[i].getTaskName().equals(tas)) {
				System.out.println("before update");
				System.out.println(tasks[i]);
				System.out.println("Enter status of "+tasks[i].getTaskName());
				String status=sc.next();
			
				tasks[i].setStatus(status);
				System.out.println("Updated tasks");
				System.out.println(tasks[i]);
				
				return true;
			}
			}
		}
		return false;
	}
	
	
	
	public boolean removeTaskByName(String name) {
		
		for(int i=0;i<tasks.length;i++)
		{
			if(tasks[i]!=null) {
				
			
			if(tasks[i].getTaskName().equals(name)) {
				System.out.println("Removed task");
				System.out.println(tasks[i]);
				tasks[i]=null;
				return true;
			}
			}
		}
		return false;
	}

}
