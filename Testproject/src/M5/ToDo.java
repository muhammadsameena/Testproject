package M5;

public class ToDo {
	 String task_name[];
	    String task_des[];
	    String date[];
	    String stat[];
	    static int count = 0;
	    Task ts[];
	    
	    ToDo() {
	        this.task_name = new String[10];
	        this.task_des = new String[10];
	        this.date = new  String[10];
	        this.stat = new String[10];
	        this.ts = new Task[10];
  }
	    public void addTask(Task l) {
	        task_name[count] = l.task_name;
	        task_des[count] = l.task_description;
	        date[count] = l.date;
	        stat[count] = l.status;
	        ts[count] = l;
	        count++;
	        System.out.println(count);

	    }
	    public void display() {
	        for (int i = 0; i < count; i++) {
	            if (ts[i].getStatus().equals(stat)) {
	                System.out.println(ts[i]);
	            }
	        }
	        public void delete(String l) {
	            for (int i = 0; i < count; i++) {
	                if (ts[i].getTask_name().equals(l) || ts[i].equals(null)) {
	                    ts[i] = null;
	                    count = count - 1;
	                } else
	                    System.out.println(ts[i]);
	            }
	        }
   }
}

