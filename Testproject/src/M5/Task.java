package M5;

public class Task {
	String task_name;
	String task_description;
	String date;
	String status;
	
	public Task(String task_name, String task_description, String date, String status) {
		super();
		this.task_name = task_name;
		this.task_description = task_description;
		this.date = date;
		this.status = status;
	}

	public String getTask_name() {
		return task_name;
	}

	public void setTask_name(String task_name) {
		this.task_name = task_name;
	}

	public String getTask_description() {
		return task_description;
	}

	public void setTask_description(String task_description) {
		this.task_description = task_description;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	//@Override
    public String toString() {
    	return "Task{" +
                "task_name='" + task_name + '\'' +
                ", task_description='" + task_description + '\'' +
                ", date='" + date + '\'' +
                 ", status='" +status + '\'' +
                '}';
    }
}
